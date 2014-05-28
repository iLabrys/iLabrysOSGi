/*******************************************************************************
 * Copyright 2014 Indra
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package es.itecban.deployment.environment.runner.pvm.impl;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.jbpm.pvm.client.ClientProcessDefinition;
import org.jbpm.pvm.client.ClientProcessInstance;
import org.jbpm.pvm.internal.model.NodeImpl;
import org.jbpm.pvm.model.OpenProcessDefinition;
import org.osgi.framework.BundleContext;

import es.itecban.deployment.environment.runner.pvm.PlanParser;
import es.itecban.deployment.environment.runner.pvm.parser.ActivityCompensator;
import es.itecban.deployment.environment.runner.pvm.parser.ActivityProcessor;
import es.itecban.deployment.environment.runner.pvm.parser.ActivitySorter;
import es.itecban.deployment.environment.runner.pvm.parser.PlanParserImpl;
import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.environmentmanager.services.EnvironmentManager;
import es.itecban.deployment.environmentmanager.services.ExecutionEventListener;
import es.itecban.deployment.environmentmanager.services.ExecutorService;
import es.itecban.deployment.environmentmanager.services.InterceptorManager;
import es.itecban.deployment.environmentmanager.services.PlanExecutionEndEvent;
import es.itecban.deployment.environmentmanager.services.PlanExecutionStartEvent;
import es.itecban.deployment.environmentmanager.services.PlanExecutionValidator;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.PlanResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.validation.result.PlanValidationResult;
import es.itecban.deployment.model.validation.result.ResultKind;
import es.itecban.deployment.model.validation.result.ResultFactory;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;
import es.itecban.deployment.repository.services.core.UnitLocatorCore;

public class PvmExecutorService implements ExecutorService {
	
	private List<PlanExecutionValidator> validators;
	private List<ExecutionEventListener> listeners;
	private EnvironmentManager env;
	private RepositoryManagerCore rep;
	private UnitLocatorCore ul;
	private ConfigurationProvider conf;
	private InterceptorManager intercept;
	private BundleContext ctx;
	
	private Hashtable<String, ClientProcessInstance> executions = new Hashtable<String, ClientProcessInstance>();
	
	public void setValidators(List<PlanExecutionValidator> validators) {
		this.validators = validators;
	}
	
	public void setListeners(List<ExecutionEventListener> listeners) {
		this.listeners = listeners;
	}
	
	public void setEnv(EnvironmentManager env) {
		this.env = env;
	}
	
	public void setRep(RepositoryManagerCore rep) {
		this.rep = rep;
	}
	
	public void setUl(UnitLocatorCore ul) {
		this.ul = ul;
	}
	
	public void setConf(ConfigurationProvider conf) {
		this.conf = conf;
	}
	
	public void setIntercept(InterceptorManager intercept) {
		this.intercept = intercept;
	}
	
	public void setCtx(BundleContext ctx) {
		this.ctx = ctx;
	}
	
	private String preparePlan(DeploymentPlanType plan, EList<ActivityType> activities, DeploymentTargetType deploymentTarget) {
		
		ExecutionReportType report = ReportFactory.eINSTANCE.createExecutionReportType();
//		DeploymentTargetType deploymentTarget = null;
//		try {
//			deploymentTarget = env.getDeploymentTargetInfo(plan.getEnvironment());
//		} catch (Exception e) {}
		ActivityProcessor nodeFactory = new ActivityProcessor(ctx, deploymentTarget, rep, ul, conf, intercept);
		PlanParser parser = new PlanParserImpl(nodeFactory);
		Integer lastExecuted = 0;
		Boolean finished = false;
		Boolean reportCompleted = false;
		Boolean compensated = false;
		ClientProcessDefinition planProcess = parser.getProcessDefinition(activities);
		ClientProcessInstance execution = planProcess.createProcessInstance();
		
		execution.createVariable("plan", plan);
		execution.createVariable("report", report);
		execution.createVariable("activities", activities);
		execution.createVariable("listeners", listeners);
		execution.createVariable("deploymentTarget", deploymentTarget);
		execution.createVariable("parser", parser);
		execution.createVariable("nodeFactory", nodeFactory);
		execution.createVariable("lastExecuted", lastExecuted);
		execution.createVariable("finished", finished);
		execution.createVariable("reportCompleted", reportCompleted);
		execution.createVariable("compensated", compensated);
		
		String executionId = plan.getName() + "|" + (new GregorianCalendar()).toString();
		executions.put(executionId, execution);
		return executionId;
		
	}
	
	private void planStartNotification(String executionId) throws Exception {
		
		ClientProcessInstance execution = executions.get(executionId);
		DeploymentPlanType plan = (DeploymentPlanType) execution.getVariable("plan");
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		report.setResult(PlanResultKindType.OK);
		report.setPlanId(plan.getName());
		report.setEnvironment(plan.getEnvironment());
		report.setMessage("Plan " + plan.getName() + " starting...");
		report.setTechnicalExecutionReport("");
		ActivitiesExecutionReportType aert = ReportFactory.eINSTANCE.createActivitiesExecutionReportType();
		report.setActivitiesExecutionReport(aert);
		GregorianCalendar planStartDate = new GregorianCalendar();
		XMLGregorianCalendar planStartTime = null;
		try {
			planStartTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(planStartDate);
		} catch (DatatypeConfigurationException e) {}
		report.setStartTime(planStartTime);
		report.setEndTime(planStartTime);
		report.setCreationUserId("creator");
		report.setLauncherUserId("launcher");
		String planStartId = "Plan " + plan.getName() + " start";
		PlanExecutionStartEvent planStart = new PlanExecutionStartEvent(this, planStartId, report);
		for (ExecutionEventListener listener : listeners) {
			listener.captureExecutionEvent(planStart);
		}
		
	}
	
	private void planEndNotification(String executionId) throws Exception {
		
		ClientProcessInstance execution = executions.get(executionId);
		DeploymentPlanType plan = (DeploymentPlanType) execution.getVariable("plan");
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		String planEndId = "Plan " + plan.getName() + " end";
		PlanExecutionEndEvent planEnd = new PlanExecutionEndEvent(this, planEndId, report);
		for (ExecutionEventListener listener : listeners) {
			listener.captureExecutionEvent(planEnd);
		}
		
	}
	
	private void launchPlanProcess(String executionId) {
		ClientProcessInstance execution = executions.get(executionId);
		execution.start();
	}
		
	//JLRUIZ: Added synchronization in order to avoid concurrent plan execution
	public synchronized ExecutionReportType launchPlan(DeploymentPlanType plan) throws Exception {
		return launchPlan(plan, ExecutorService.ROLLBACK_CONTINUE);
//		return launchPlan(plan, ExecutorService.NORMAL_CANCEL);
	}
	
	public synchronized ExecutionReportType launchPlan(DeploymentPlanType plan, String mode) throws Exception {
		return launchPlan(plan, mode, getDefaultOrder(plan));
	}
	
	//JLRUIZ: Added synchronization in order to avoid concurrent plan execution
	public synchronized ExecutionReportType launchPlan(DeploymentPlanType plan, String mode, List<Integer> order) throws Exception {
		// Get the environment info here in order to avoid getting it twice in two different moments
		DeploymentTargetType environmentInfo = null; 
		try {
			environmentInfo = env.getDeploymentTargetInfo(plan.getEnvironment());
		} catch (Exception e) {e.printStackTrace();}
		
		List<PlanValidationResult> results = validatePlan(plan, environmentInfo);
//		boolean severeError = false;
//		for (PlanValidationResult result : ppr){
//			if (result.getResult().compareTo(ResultKind.ABORT)==0){
//				severeError = true;
//				break;
//			}
//		}
		String reportString = "No report set";
//		if (severeError == false){
		for (PlanValidationResult result : results) {
			if (result.getResult().equals(ResultKind.ABORT)) throw new Exception("Plan is not valid: execution aborted");
		}
		EList<ActivityType> activities = ActivitySorter.setOrder(plan.getActivities().getActivity(), order);
		String executionId = preparePlan(plan, activities, environmentInfo);
		ClientProcessInstance execution = executions.get(executionId);
		execution.createVariable("mode", mode);
		planStartNotification(executionId);
		launchPlanProcess(executionId);
		planEndNotification(executionId);
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		return report;
	}
	
	public synchronized ExecutionReportType launchPlan(DeploymentPlanType plan, String mode, List<Integer> order, DeploymentTargetType environmentInfo) throws Exception {
		
		List<PlanValidationResult> results = validatePlan(plan, environmentInfo);
		String reportString = "No report set";
		for (PlanValidationResult result : results) {
			if (result.getResult().equals(ResultKind.ABORT)) throw new Exception("Plan is not valid: execution aborted");
		}
		EList<ActivityType> activities = ActivitySorter.setOrder(plan.getActivities().getActivity(), order);
		String executionId = preparePlan(plan, activities, environmentInfo);
		ClientProcessInstance execution = executions.get(executionId);
		execution.createVariable("mode", mode);
		planStartNotification(executionId);
		launchPlanProcess(executionId);
		planEndNotification(executionId);
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		return report;
	}
	
	public String launchPlanStepByStep(DeploymentPlanType plan) throws Exception {
		return launchPlanStepByStep(plan, getDefaultOrder(plan));
	}
	
	public String launchPlanStepByStep(DeploymentPlanType plan, List<Integer> order) throws Exception {
		
		// Get the environment info here in order to avoid getting it twice in two different moments
		DeploymentTargetType environmentInfo = null; 
		try {
			environmentInfo = env.getDeploymentTargetInfo(plan.getEnvironment());
		} catch (Exception e) {e.printStackTrace();}
		List<PlanValidationResult> results = validatePlan(plan, environmentInfo);
		for (PlanValidationResult result : results) {
			if (result.getResult().equals(ResultKind.ABORT)) throw new Exception("Plan is not valid: execution aborted");
		}
		EList<ActivityType> activities = ActivitySorter.setOrder(plan.getActivities().getActivity(), order);
		String executionId = preparePlan(plan, activities, environmentInfo);
		ClientProcessInstance execution = executions.get(executionId);
		execution.createVariable("mode", ExecutorService.STEP_BY_STEP);
		planStartNotification(executionId);
		launchPlanProcess(executionId);
		return executionId;
	}
	
	
	public List<Integer> getDefaultOrder(DeploymentPlanType plan) {
		EList<ActivityType> ordered = ActivitySorter.sort(plan.getActivities().getActivity());
		List<Integer> order = new ArrayList<Integer>();
		for (ActivityType activity : ordered) {
			order.add(activity.getActivityId());
		}
		return order;
	}
	
	@SuppressWarnings("unchecked")
	public List<ActivityType> getRemainingActivities(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		EList<ActivityType> activities = (EList<ActivityType>) execution.getVariable("activities");
		Integer lastExecuted = (Integer) execution.getVariable("lastExecuted");
		int index = 0;
		for (int i = 0; i < activities.size(); i++) {
			ActivityType activity = activities.get(i);
			if (lastExecuted == activity.getActivityId()) {
				index = i + 1;
			}
		}
		return activities.subList(index, activities.size());
	}
	
	@SuppressWarnings("unchecked")
	public ActivityType lastExecuted(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		EList<ActivityType> activities = (EList<ActivityType>) execution.getVariable("activities");
		Integer lastExecuted = (Integer) execution.getVariable("lastExecuted");
		for (ActivityType activity : activities) {
			if (lastExecuted == activity.getActivityId()) {
				return activity;
			}
		}
		return null;
	}
	
	public boolean lastExecutedOK(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		Integer lastExecuted = (Integer) execution.getVariable("lastExecuted");
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		EList<ActivityExecReportType> actReports = report.getActivitiesExecutionReport().getActivityExecutionReport();
		for (ActivityExecReportType actReport : actReports) {
			if (lastExecuted == Integer.parseInt(actReport.getActivityId())) {
				return actReport.getResult().equals(ActivityResultKindType.OK);
			}
		}
		return true;
	}
	
	public boolean hasFinished(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		Boolean finished = (Boolean) execution.getVariable("finished");
		return finished;
	}
	
	public boolean nextActivity(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		execution.signal("proceed");
		return lastExecutedOK(executionId);
	}
	
	public boolean cancelPlanExecution(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		Boolean finished = new Boolean(true);
		execution.setVariable("finished", finished);
		GregorianCalendar planEndDate = new GregorianCalendar();
		XMLGregorianCalendar planEndTime = null;
		try {
			planEndTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(planEndDate);
		} catch (DatatypeConfigurationException e) {}
		report.setEndTime(planEndTime);
		report.setMessage("Plan execution was aborted by user.");
		planEndNotification(executionId);
		execution.cancel();
		return lastExecutedOK(executionId);
	}
	
	public ExecutionReportType getExecutionReport(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		return report;
	}
	
	@SuppressWarnings("unchecked")
	public boolean compensate(String executionId) throws Exception {
		if (!executions.containsKey(executionId)) throw new Exception("Non-existent execution: " + executionId);
		ClientProcessInstance execution = executions.get(executionId);
		boolean lastExecutedOK = lastExecutedOK(executionId);
		EList<ActivityType> activities = (EList<ActivityType>) execution.getVariable("activities");
		Boolean compensated = (Boolean) execution.getVariable("compensated");
		if (compensated) throw new Exception("Already compensated");
		compensated = true;
		NodeImpl currentNode = (NodeImpl) execution.getNode();
		String nName = currentNode.getName();
		int currentIndex = Integer.parseInt(nName);
		OpenProcessDefinition processDefinition = execution.getProcessDefinition();
		// Get activities which need compensation
		if (lastExecutedOK) currentIndex++;
		EList<ActivityType> acts = new BasicEList<ActivityType>();
		for (int i = 1; i < currentIndex; i++) {
			NodeImpl someNode = (NodeImpl) processDefinition.getNode("" + i);
			ActivityNode someBehaviour = (ActivityNode) someNode.getBehaviour();
			ActivityType someActivity = someBehaviour.getActivity();
			acts.add(someActivity);
		}
		// Create compensation activities for those
		DeploymentTargetType deploymentTarget = (DeploymentTargetType) execution.getVariable("deploymentTarget");
		EList<ActivityType> compActivities = ActivityCompensator.compensations(acts, deploymentTarget);
		// And their nodes
		PlanParser parser = (PlanParser) execution.getVariable("parser");
		parser.createCompensationNodes(compActivities, processDefinition, currentNode);
		// Remove their formerly following activities
		if (lastExecutedOK) currentIndex--;
		for (int i = currentIndex; i < activities.size(); i++) {
			activities.remove(i);
		}
		// And add the compensation ones
		for (int i = compActivities.size(); i > 0; i--) {
			activities.add(compActivities.get(i - 1));
		}
		// Take the rollback route
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		Boolean finished = new Boolean(false);
		execution.setVariable("finished", finished);
		report.setResult(PlanResultKindType.ROLLBACKED);
		execution.signal("rollback");
		return lastExecutedOK(executionId);
	}
	
	//JLRUIZ: Added synchronization in order to avoid concurrent plan execution
	public synchronized ExecutionReportType compensatePlan(DeploymentPlanType plan, ExecutionReportType report) throws Exception {
		PlanResultKindType result = report.getResult();
		if (!result.equals(PlanResultKindType.OK)) throw new Exception("Original plan wasn't executed successfully");
		DeploymentTargetType deploymentTarget = null;
		try {
			deploymentTarget = env.getDeploymentTargetInfo(plan.getEnvironment());
		} catch (Exception e) {e.printStackTrace();}
		DeploymentPlanType antiPlan = ActivityCompensator.antiPlan(plan, report, deploymentTarget);
		return launchPlan(antiPlan, ExecutorService.NORMAL_CANCEL);
	}
	
	public List<PlanValidationResult> validatePlan(DeploymentPlanType plan, DeploymentTargetType deploymentTarget) {
		List<PlanValidationResult> results = new ArrayList<PlanValidationResult>();
		for (PlanExecutionValidator validator : validators) {
			results.addAll(validator.validate(plan, deploymentTarget));
		}
		if (results.isEmpty()) {
			PlanValidationResult okResult = ResultFactory.eINSTANCE.createPlanValidationResult();
			okResult.setResult(ResultKind.OK);
			okResult.setMessage("No problems encountered.");
			results.add(okResult);
		}
		return results;
	}

	@Override
	public List<PlanValidationResult> validatePlan(DeploymentPlanType plan)
			throws Exception {
		
		List<PlanValidationResult> results = new ArrayList<PlanValidationResult>();
		DeploymentTargetType deploymentTarget = null;
		try {
			deploymentTarget = env.getDeploymentTargetInfo(plan.getEnvironment());
		} catch (Exception e) {e.printStackTrace();}
		for (PlanExecutionValidator validator : validators) {
			results.addAll(validator.validate(plan, deploymentTarget));
		}
		if (results.isEmpty()) {
			PlanValidationResult okResult = ResultFactory.eINSTANCE.createPlanValidationResult();
			okResult.setResult(ResultKind.OK);
			okResult.setMessage("No problems encountered.");
			results.add(okResult);
		}
		return results;
	}

	@Override
	public ExecutionReportType launchPlan(DeploymentPlanType plan, String mode,
			DeploymentTargetType environmentInfo) throws Exception {
		return launchPlan(plan, mode, getDefaultOrder(plan), environmentInfo);
	}
	
}

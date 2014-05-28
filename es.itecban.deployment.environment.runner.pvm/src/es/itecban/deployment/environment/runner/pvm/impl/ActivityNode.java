package es.itecban.deployment.environment.runner.pvm.impl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.jbpm.pvm.activity.ActivityExecution;
import org.jbpm.pvm.activity.ExternalActivity;
import org.jbpm.pvm.internal.model.NodeImpl;
import org.jbpm.pvm.model.OpenProcessDefinition;

import es.itecban.deployment.environment.runner.pvm.PlanParser;
import es.itecban.deployment.environment.runner.pvm.executor.ActivityExecutor;
import es.itecban.deployment.environment.runner.pvm.executor.DeploymentExecutor;
import es.itecban.deployment.environment.runner.pvm.parser.ActivityCompensator;
import es.itecban.deployment.environmentmanager.services.ActivityExecutionEndEvent;
import es.itecban.deployment.environmentmanager.services.ActivityExecutionStartEvent;
import es.itecban.deployment.environmentmanager.services.ExecutionEventListener;
import es.itecban.deployment.environmentmanager.services.ExecutorService;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.PlanResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;

public class ActivityNode implements ExternalActivity {
	
	private Logger logger = Logger.getLogger(ActivityNode.class.getName());
	private static final long serialVersionUID = 1L;
	private ActivityType activity;
	private ActivityExecutor executor;
	
	public ActivityNode(ActivityType activity, ActivityExecutor executor) {
		
		// Create a Handler to send the batch loggers to a file
		try {
			ClassLoader classLoader = this.getClass().getClassLoader();
			URL url = classLoader.getResource("batchLogger.properties");
			Properties batchLoggerProperties = new Properties();
			batchLoggerProperties.load(url.openStream());
			Calendar cal = Calendar.getInstance();
			String month = "" + cal.get(Calendar.MONTH);
			// the months begin with 0 - January
			String realMonth = "" + (Integer.parseInt(month) + 1);
			if (realMonth.length() == 1)
				month = "0" + (realMonth);
			else
				month = realMonth;
			String day = "" + cal.get(Calendar.DAY_OF_MONTH);
			if (day.length() == 1)
				day = "0" + day;
			String date = "" + cal.get(Calendar.YEAR) + month + day;
			Handler handler = new FileHandler(batchLoggerProperties
					.getProperty("path")
					+ File.separator
					+ date
					+ "-"
					+ batchLoggerProperties.getProperty("file.name"), 50000, 1,
					true);
			handler.setLevel(Level.INFO);
			handler.setFormatter(new Formatter() {
				public String format(LogRecord record) {
					return record.getMessage() + "\n";
				}
			});
			logger.addHandler(handler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.activity = activity;
		this.executor = executor;
	}
	
	public ActivityType getActivity() {
		return activity;
	}
	
	@SuppressWarnings("unchecked")
	public void execute(ActivityExecution execution) {
		
		ActivityExecReportType actReport = ReportFactory.eINSTANCE.createActivityExecReportType();
		ExecutionReportType report = (ExecutionReportType) execution.getVariable("report");
		EList<ActivityExecReportType> actReports = report.getActivitiesExecutionReport().getActivityExecutionReport();
		EList<ActivityType> activities = (EList<ActivityType>) execution.getVariable("activities");
		List<ExecutionEventListener> listeners = (List<ExecutionEventListener>) execution.getVariable("listeners");
		DeploymentTargetType deploymentTarget = (DeploymentTargetType) execution.getVariable("deploymentTarget");
		PlanParser parser = (PlanParser) execution.getVariable("parser");
		String mode = (String) execution.getVariable("mode");
		int activityId = activity.getActivityId();
		
		// Activity start notification
		actReport.setActivityId("" + activityId);
		actReport.setDescription("Activity " + activityId + " starting...");
		actReport.setResult(ActivityResultKindType.UNKNOWN);
		actReport.setResultCode("");
		actReport.setTechnicalActivityExecReport("");
		GregorianCalendar startDate = new GregorianCalendar();
		XMLGregorianCalendar startTime = null;
		try {
			startTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(startDate);
		} catch (DatatypeConfigurationException e) {}
		actReport.setStartTime(startTime);
		actReport.setEndTime(startTime);
		actReports.add(actReport);
		String actStartId = "Activity " + activityId + " start";
		ActivityExecutionStartEvent actStart = new ActivityExecutionStartEvent(this, actStartId, report);
		for (ExecutionEventListener listener : listeners) {
			try {
				listener.captureExecutionEvent(actStart);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		actReports.remove(actReport);
		// Run activity
		actReport = executor.runActivity();
		
		// Activity end notification
		GregorianCalendar endDate = new GregorianCalendar();
		XMLGregorianCalendar endTime = null;
		try {
			endTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(endDate);
		} catch (DatatypeConfigurationException e) {}
		actReport.setStartTime(startTime);
		actReport.setEndTime(endTime);
		actReport.setActivityId("" + activityId);
		actReport.setDescription(executor.writeDescription(actReport));
		if (executor instanceof DeploymentExecutor){
			String environment = ((DeploymentExecutor) executor).getProps().getProperty("es.itecban.deployment.environment.name");
			logger.info(environment + ";" + Calendar.getInstance().getTime() + ";" + actReport.getResult() + ";" + actReport.getDescription());
		}else
			logger.info(Calendar.getInstance().getTime() + ";" + actReport.getResult() + ";" + actReport.getDescription());
//		logger.info(Calendar.getInstance().getTime() + ";" + actReport.getResult() + ";" + actReport.getDescription());
		ActivityResultKindType actResult = actReport.getResult();
		actReports.add(actReport);
		if (!actResult.equals(ActivityResultKindType.OK) && !report.getResult().equals(PlanResultKindType.ROLLBACKED)) {
			report.setResult(PlanResultKindType.FAILED);
		}
		String actEndId = "Activity " + activityId + " end";
		ActivityExecutionEndEvent actEnd = new ActivityExecutionEndEvent(this, actEndId, report);
		for (ExecutionEventListener listener : listeners) {
			try {
				listener.captureExecutionEvent(actEnd);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Integer lastExecuted = new Integer(activityId);
		execution.setVariable("lastExecuted", lastExecuted);
		logger.fine("End of node");
		
		// Execution control
		boolean cancelled = false;
		if (mode.equals(ExecutorService.NORMAL_CANCEL) && !actResult.equals(ActivityResultKindType.OK)) {
			cancelled = true;
		}
		if ((mode.equals(ExecutorService.ROLLBACK_CONTINUE) || mode.equals(ExecutorService.ROLLBACK_CANCEL)) 
				&& !actResult.equals(ActivityResultKindType.OK)) {
			
			NodeImpl currentNode = (NodeImpl) execution.getNode();
			String nName = currentNode.getName();
			int currentIndex = Integer.parseInt(nName);
			if (currentIndex == 1 || report.getResult().equals(PlanResultKindType.ROLLBACKED)) {
				report.setResult(PlanResultKindType.FAILED);
				if (currentIndex == 1 || mode.equals(ExecutorService.ROLLBACK_CANCEL)) cancelled = true;
			}
			else {
				// --- Rollback nodes creation starts here ---
				OpenProcessDefinition processDefinition = execution.getProcessDefinition();
				// Get activities which need compensation
				EList<ActivityType> acts = new BasicEList<ActivityType>();
				for (int i = 1; i < currentIndex; i++) {
					NodeImpl someNode = (NodeImpl) processDefinition.getNode("" + i);
					ActivityNode someBehaviour = (ActivityNode) someNode.getBehaviour();
					ActivityType someActivity = someBehaviour.getActivity();
					acts.add(someActivity);
				}
				// Create compensation activities for those
				EList<ActivityType> compActivities = ActivityCompensator.compensations(acts, deploymentTarget);
				// And their nodes
				parser.createCompensationNodes(compActivities, processDefinition, currentNode);
				// Remove their formerly following activities
				for (int i = currentIndex; i < activities.size(); i++) {
					activities.remove(i);
				}
				// And add the compensation ones
				for (int i = compActivities.size(); i > 0; i--) {
					activities.add(compActivities.get(i - 1));
				}
				// Take the rollback route
				Boolean finished = new Boolean(false);
				execution.setVariable("finished", finished);
				report.setResult(PlanResultKindType.ROLLBACKED);
				execution.take("rollback");
				return;
			}
			
		}
		if (!cancelled && execution.getNode().hasOutgoingTransitions()) {
			if (mode.equals(ExecutorService.STEP_BY_STEP)) execution.waitForSignal();
			else execution.take("proceed");
		}
		else {
			Boolean finished = new Boolean(true);
			execution.setVariable("finished", finished);
			GregorianCalendar planEndDate = new GregorianCalendar();
			XMLGregorianCalendar planEndTime = null;
			try {
				planEndTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(planEndDate);
			} catch (DatatypeConfigurationException e) {}
			report.setEndTime(planEndTime);
			report.setMessage(writeMessage(report));
			if (mode.equals(ExecutorService.STEP_BY_STEP)) {
				execution.waitForSignal();
			}
			if (cancelled) {
				//report.setResult(PlanResultKindType.FAILED);
				execution.cancel();
			}
		}
	}
	
	public void signal(ActivityExecution execution, String signalName, Map<String, Object> parameters) {
		execution.take(signalName);
	}
	
	private String writeMessage(ExecutionReportType report) {
		StringBuilder message = new StringBuilder();
		message.append("The plan with name ");
		message.append(report.getPlanId());
		PlanResultKindType planResult = report.getResult();
		if (planResult.equals(PlanResultKindType.OK)) message.append(" was executed successfully.");
		if (planResult.equals(PlanResultKindType.ROLLBACKED)) message.append(" was rollbacked.");
		if (planResult.equals(PlanResultKindType.FAILED)) {
			message.append(" could not finish successfully. Activities ");
			EList<ActivityExecReportType> actReports = report.getActivitiesExecutionReport().getActivityExecutionReport();
			for (ActivityExecReportType actReport : actReports) {
				ActivityResultKindType actResult = actReport.getResult();
				if (!actResult.equals(ActivityResultKindType.OK)) message.append(actReport.getActivityId() + ", ");
			}
			message.append("were executed obtaining failure as result.");
		}
		return message.toString();
	}
}

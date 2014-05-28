package es.itecban.deployment.executionmanager.gui.swf.service;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.binding.message.Message;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.webflow.execution.RequestContext;

import es.itecban.deployment.environmentmanager.services.ReportManager;
import es.itecban.deployment.executionmanager.MessageException;
import es.itecban.deployment.executionmanager.services.PlanExecutor;
import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.PlanResultKindType;
import es.itecban.deployment.model.deployment.plan.report.marshaller.ReportMarshaller;
import es.itecban.deployment.model.validation.result.PlanValidationResult;
import es.itecban.deployment.model.validation.result.ResultKind;

public class PlanLaunchManager {

	private PlanManager planManager;
	private PlanExecutor planExecutor;
	private ReportManager reportManager;
	
	public ReportManager getReportManager() {
		return reportManager;
	}

	public void setReportManager(ReportManager reportManager) {
		this.reportManager = reportManager;
	}

	private static Lock lock = new ReentrantLock();

	private static Logger logger = Logger.getLogger(PlanCreationManager.class
			.getName());

	static {
		logger.setLevel(Level.FINE);
	}

	public String initialize(RequestContext context) {
		logger.fine("Running initialize at PlanlaunchManager.");
		return "Ok";
	}

	public PlanManager getPlanManager() {
		return planManager;
	}

	public void setPlanManager(PlanManager planManager) {
		this.planManager = planManager;
	}

	public PlanExecutor getPlanExecutor() {
		return planExecutor;
	}

	public void setPlanExecutor(PlanExecutor planExecutor) {
		this.planExecutor = planExecutor;
	}

	public String launchPlan(RequestContext context, String planNameUniq)
			throws Exception {
		
		if (this.lock.tryLock()){
			try {
				logger.fine("********* LAUNCHING PLAN");
				DeploymentPlanType dp = this.planManager.findPlanByName(planNameUniq);
				if (dp==null)
					return "The plan name in the user session is not stored at the database";
				String reportString = "No report set";
					ExecutionReportType er=planExecutor.launchPlan(dp);
					reportString = ReportMarshaller.getXMLFromReport(er);
					logger.fine("********* PLAN LAUNCHED");
					if (logger.isLoggable(Level.FINE))
						logger.fine(reportString);
				boolean isExecutedOK = this.isExecutedOK(reportString);
				context.getFlowScope().put("isExecutedOK", isExecutedOK);
				return reportString;
			} catch (Exception e) {
				if (e instanceof MessageException){
					String[] args = ((MessageException)e).getArgs();
					String errorCode = e.getMessage();
					ErrorUtils.createMessageError(context, errorCode, args);
				}else{
					ErrorUtils.createMessageError(context, e.getMessage(), null);
				}
				throw new Exception ();
			} finally{
				this.lock.unlock();
			}
		}else{
			ErrorUtils.createMessageError(context, "running.error.concurrentLaunchNonPermited", null);
			throw new Exception();
		}
	}

	
	public boolean isExecutedOK(String executionReport) {
		
		if (executionReport.contains("Exception:")
				|| executionReport.contains("Error while executing the operation")) {
			return false;
		}
		else if (executionReport.contains("Operation succesfully executed")) {
			return true;
		}else{
			return false;
		}
	}
	
	public String launchAntiPlan(RequestContext context)
	throws Exception {
		
		if (this.lock.tryLock()){
			try {
				logger.fine("********* LAUNCHING ANTIPLAN");
				String planID = (String) context.getFlowScope().get("planID");
				if (planID == null){
					planID = (String) context.getFlowScope().get("selectedReport");
				}
				System.out.println(" ===> planID = "+planID);
				String planNameUniq = getPlanIdFromCodifiedPlanId(planID);//hace falta?
				DeploymentPlanType dp=this.planManager.findPlanByName(planNameUniq);
				if (planNameUniq.startsWith("COMPENSATION")){
//					throw new Exception("running.error.noCompensationOfCompensation");
					ErrorUtils.createMessageError(context, "running.error.noCompensationOfCompensation", null);
					throw new Exception();
				}
				if (dp==null){
//					throw new Exception("running.error.noExistingPlan");
					ErrorUtils.createMessageError(context, "running.error.noExistingPlan", null);
					throw new Exception();
				}
				ExecutionReportType originalreport = getReportFromCodifiedPlanId(planID);
				if (!(originalreport.getResult().equals(PlanResultKindType.OK))){
//					throw new Exception("running.error.noCompensationOfFailureReport");
					ErrorUtils.createMessageError(context, "running.error.noCompensationOfFailureReport", null);
					throw new Exception();
				}
				
				List<PlanValidationResult> ppr= this.planExecutor.validatePlan(dp);
				boolean severeError = false;
				for (PlanValidationResult result : ppr){
					if (result.getResult().compareTo(ResultKind.ABORT)==0){
						severeError = true;
						break;
					}
				}
				String reportString = "No report set";
				ExecutionReportType er = null;
				if (severeError == false){
					er = planExecutor.compensatePlan(dp, getReportFromCodifiedPlanId(planID));
					reportString =  ReportMarshaller.getXMLFromReport(er);
					logger.fine("********* PLAN LAUNCHED");
					if (logger.isLoggable(Level.FINE))
						logger.fine(reportString);
				}else
					logger.severe("There exist at least one error so the plan cannot be launched");
				//puts the plan id from execution report in the flow variable
				context.getFlowScope().put("planNameUniq", er.getPlanId());
				return reportString;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				context.getFlowScope().put("error",
				e.getMessage());
				throw new Exception();
			}finally{
				this.lock.unlock();
			}
		}else{
//			context.getFlowScope().put("error",
//					"running.error.concurrentLaunchNonPermited");
			ErrorUtils.createMessageError(context, "running.error.concurrentLaunchNonPermited", null);
			throw new Exception();
		}
	}
	
	public ExecutionReportType getReportFromCodifiedPlanId(String planId) throws DatatypeConfigurationException{
		ExecutionReportType planReport = null;
		// the planId given is a concatenation of the name of the plan and the
		// startTime of the plan of the report
		String reportName = planId.substring(0, planId.lastIndexOf('|'));
		String calendarString = planId.substring(planId.lastIndexOf('|')+1);
		long calendarMiliSecs = Long.decode(calendarString);
		GregorianCalendar gregCalendar = new GregorianCalendar();
		gregCalendar.setTimeInMillis(calendarMiliSecs);
		XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCalendar);
		planReport = reportManager.findExecutionReportByPlanId(reportName, xmlCalendar);
		return planReport;
	}
	
	public String getPlanIdFromCodifiedPlanId(String planId) throws DatatypeConfigurationException{
	
		// the planId given is a concatenation of the name of the plan and the
		// startTime of the plan of the report
		String reportName = planId.substring(0, planId.lastIndexOf('|'));
		return reportName;
	}
	
	//not tested
	//TODO
	public void cleanErrorVariables(RequestContext context){
		
		context.getMessageContext().clearMessages();
		context.getFlowScope().put("error", null);
		System.out.println("cleaning....");
	}
}

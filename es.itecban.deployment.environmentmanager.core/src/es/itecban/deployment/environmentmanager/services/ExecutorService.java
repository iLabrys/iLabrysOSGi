package es.itecban.deployment.environmentmanager.services;

import java.util.List;

import es.itecban.deployment.environmentmanager.services.core.ExecutorServiceCore;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;

public interface ExecutorService extends ExecutorServiceCore {
	
	public static final String NORMAL_CONTINUE = "normal-continue";
	public static final String NORMAL_CANCEL = "normal-cancel";
	public static final String ROLLBACK_CONTINUE = "rollback-continue";
	public static final String ROLLBACK_CANCEL = "rollback-cancel";
	public static final String STEP_BY_STEP = "step-by-step";
	
	
	public ExecutionReportType launchPlan(DeploymentPlanType plan, String mode, List<Integer> order) throws Exception;
	public ExecutionReportType launchPlan(DeploymentPlanType plan, String mode) throws Exception;
	public ExecutionReportType launchPlan(DeploymentPlanType plan, String mode, DeploymentTargetType environmentInfo) throws Exception;
	public String launchPlanStepByStep(DeploymentPlanType plan) throws Exception;
	public String launchPlanStepByStep(DeploymentPlanType plan, List<Integer> order) throws Exception;
	public List<Integer> getDefaultOrder(DeploymentPlanType plan);
	public List<ActivityType> getRemainingActivities(String executionId) throws Exception;
	public ActivityType lastExecuted(String executionId) throws Exception;
	public boolean lastExecutedOK(String executionId) throws Exception;
	public boolean hasFinished(String executionId) throws Exception;
	public boolean nextActivity(String executionId) throws Exception;
	public boolean cancelPlanExecution(String executionId) throws Exception;
	public boolean compensate(String executionId) throws Exception;
	public ExecutionReportType getExecutionReport(String executionId) throws Exception;
	
}

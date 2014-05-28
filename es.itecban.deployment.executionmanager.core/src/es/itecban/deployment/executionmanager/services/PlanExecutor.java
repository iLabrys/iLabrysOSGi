package es.itecban.deployment.executionmanager.services;

import java.util.List;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.validation.result.PlanValidationResult;


/**
 * This component is responsible for scheduling and launching deployment plans
 * It needs connection to the Environment Manager
 * @author jlrrevuelta
 *
 */
public interface PlanExecutor {
	/**
	 * Update execution registry
	 * @param plan
	 */
	public List<PlanValidationResult> validatePlan(DeploymentPlanType plan) throws Exception;
	public ExecutionReportType launchPlan(DeploymentPlanType plan) throws Exception;
	public ExecutionReportType compensatePlan(DeploymentPlanType plan, ExecutionReportType report) throws Exception;
}

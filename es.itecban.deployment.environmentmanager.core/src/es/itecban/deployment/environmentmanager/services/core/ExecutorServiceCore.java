package es.itecban.deployment.environmentmanager.services.core;

import java.util.List;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.validation.result.PlanValidationResult;

public interface ExecutorServiceCore {
	
	public List<PlanValidationResult> validatePlan(DeploymentPlanType plan) throws Exception;
	public ExecutionReportType launchPlan(DeploymentPlanType plan) throws Exception;
	public ExecutionReportType compensatePlan(DeploymentPlanType plan, ExecutionReportType report) throws Exception;			
}

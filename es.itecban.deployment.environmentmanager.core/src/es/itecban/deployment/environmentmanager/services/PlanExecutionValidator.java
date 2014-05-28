package es.itecban.deployment.environmentmanager.services;

import java.util.List;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.validation.result.PlanValidationResult;

public interface PlanExecutionValidator {
	
	public List<PlanValidationResult> validate(DeploymentPlanType plan, DeploymentTargetType deploymentTarget);
	
}

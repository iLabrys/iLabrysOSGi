package es.itecban.deployment.executionmanager.ws.services;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;



public interface ExecutionManagerService {

		// Service Interface
		public String launchPlan(String planID) throws Exception;
		public String addPlan(DeploymentPlanType plan) throws Exception;
		public String deletePlan(DeploymentPlanType plan) throws Exception;
		public String updatePlan(DeploymentPlanType plan) throws Exception;
		public DeploymentPlanType getPlan(String planID) throws Exception;
		public DeploymentPlanType[] findPlans(String target, ScheduleType schedule) throws Exception;
}

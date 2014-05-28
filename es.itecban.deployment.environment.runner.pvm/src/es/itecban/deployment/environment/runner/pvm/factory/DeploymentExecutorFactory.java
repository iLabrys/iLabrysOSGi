package es.itecban.deployment.environment.runner.pvm.factory;

import java.util.Properties;

import es.itecban.deployment.environment.runner.pvm.executor.DeploymentActivityExecutor;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface DeploymentExecutorFactory extends ActivityExecutorFactory {
	
	public DeploymentActivityExecutor createExecutor(int activityId, DeploymentActivityKindType activityKind, 
			Properties props, DeploymentUnitType unit);
	
}

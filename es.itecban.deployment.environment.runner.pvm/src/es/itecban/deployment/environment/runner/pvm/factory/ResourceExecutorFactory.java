package es.itecban.deployment.environment.runner.pvm.factory;

import java.util.Properties;

import es.itecban.deployment.environment.runner.pvm.executor.ResourceActivityExecutor;
import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.unit.ResourceType;

public interface ResourceExecutorFactory extends ActivityExecutorFactory {
	
	public ResourceActivityExecutor createExecutor(int activityId, ResourceActivityKindType activityKind, 
			Properties props, ResourceType resource);
	
}

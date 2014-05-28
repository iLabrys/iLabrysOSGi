package es.itecban.deployment.environment.runner.pvm.factory;

import java.util.Properties;

import es.itecban.deployment.environment.runner.pvm.executor.ConfigurationActivityExecutor;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationType;

public interface ConfigurationExecutorFactory extends ActivityExecutorFactory {
	
	public ConfigurationActivityExecutor createExecutor(int activityId, ConfigurationActivityKindType activityKind, 
			Properties props, ConfigurationType configuration);
	
}

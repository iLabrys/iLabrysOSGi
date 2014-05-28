package es.itecban.deployment.executionmanager.services;

import java.util.List;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface EnvironmentGraphBuilderFactory {

	public EnvironmentGraphBuilder createEnvironmentGraphBuilder(DeploymentTargetType environment, DeploymentUnitType unit, List<String> containerList) throws Exception;
	
	public EnvironmentGraphBuilder createSingleUnitEnvironmentGraphBuilder(DeploymentTargetType environment, DeploymentUnitType unit, ContainerType container) throws Exception;
}

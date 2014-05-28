package es.itecban.deployment.repository.services.core;

import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface ResolverCore {

	/**
	 * 
	 * @param unit reference to a deployment unit that is to be installed
	 * @return a graph with the required deployment units
	 * to successfully install the unit
	 * @throws Exception
	 */
	public DependencyGraph resolveDeploymentUnit(DeploymentUnitType unit) throws Exception;
	
	/**
	 * 
	 * @param unit reference to a deployment unit that is to be installed
	 * @param environmentName, to check the units already deployed in the environment
	 * @return a graph with the required deployment units
	 * to successfully install the unit
	 * @throws Exception
	 */
	public DependencyGraph resolveDeploymentUnit(DeploymentUnitType unit,
			String environmentName) throws Exception;	
}

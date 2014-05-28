package es.itecban.deployment.executionmanager.services;

import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

/**
 * Factory for creating different types of PlanBuilders
 * 
 * @author rodrigo
 * 
 */
public interface PlanBuilderFactory {

	/**
	 * Creates a new instance of an installation plan builder.
	 * 
	 * @param name
	 *            The name of the plan. Its unique identifier. If no name is
	 *            provided an automatically generated one composed by the
	 *            environment name and the timestamp will be set.
	 * @param environment
	 *            The environment in which the plan works.
	 * @param graph
	 *            The graph with the elements to be installed and its
	 *            dependencies.
	 * @return The InstallationPlanBuilder instance.
	 */
	public InstallationPlanBuilder createInstallationPlanBuilder(String name,
			DeploymentTargetType environment, DependencyGraph graph,
			boolean preConfigure);

	/**
	 * Creates a new instance of an update plan builder
	 */
	public UpdatePlanBuilder createUpdatePlanBuilder(String name,
			DeploymentTargetType environment, DependencyGraph graph,
			boolean preConfigure);

	/**
	 * Creates a new instance of an update plan builder
	 */
	public DeletePlanBuilder createDeletePlanBuilder(String name,
			DeploymentTargetType environment, DependencyGraph graph,
			boolean preConfigure);

	/**
	 * Creates a new instance of an add data source plan builder
	 * 
	 * @param name
	 *            The name of the plan. Its unique identifier. If no name is
	 *            provided an automatically generated one composed by the
	 *            environment name and the timestamp will be set.
	 * @param environment
	 *            The environment in which the plan works.
	 * @param datasourceContainer
	 *            The container in which the new datasource will be created.
	 * @param confProvider
	 *            The configuration provider needed for the private properties
	 * @return
	 */
	public AddDataSourcePlanBuilder createAddDataSourcePlanBuilder(String name,
			DeploymentTargetType environment,
			ContainerType datasourceContainer,
			ConfigurationProvider confProvider);

}

package es.itecban.deployment.executionmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import es.itecban.deployment.executionmanager.services.EnvironmentGraphBuilder;
import es.itecban.deployment.executionmanager.utils.EnvironmentGraphUtils;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphFactory;
import es.itecban.deployment.model.environment.graph.Node;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;

public class SingleUnitEnvironmentGraphBuilderImpl implements EnvironmentGraphBuilder {

	private EnvironmentGraph graph;
	
	private static Logger logger = Logger.getLogger("es.itecban.deployment.executionmanager");
	static {
			logger.setLevel(Level.ALL);
	}
	
	public SingleUnitEnvironmentGraphBuilderImpl(DeploymentUnitType unit, ContainerType container, RepositoryManagerCore repoManager, EnvironmentGraphUtils utils) throws Exception {
		// Create the graph
		graph = GraphFactory.eINSTANCE.createEnvironmentGraph();
		// Check if the unit is really in the container
		if (!utils.isUnitInContainer(container.getName(), unit.getName(), unit.getVersion()))
			return;
		// Create the origin node
		Node origin = utils.createNode(unit, container.getName());
		graph.addNode(origin);		
		graph.getOrigins().add(origin);
		// Get the dependencies
		List<Node> dependencies = utils.getDependencies(origin, unit, container.getName(), graph);
		// Repeat for every dependency recursively
		while (dependencies!= null && dependencies.size()!=0) {
			// Temporal list for the new dependencies
			List<Node> newDependencies = new ArrayList<Node>();
			// Iterate the dependencies
			for (Node currentNode : dependencies) {
				// Get their respective dependencies
				DeploymentUnitType currentUnit = repoManager.getDeploymentUnit(currentNode.getUnitName(), currentNode.getUnitVersion());
				List<Node> currentDependencies = utils.getDependencies(currentNode, currentUnit, utils.getContainerType(currentNode.getContainerName()).getName(), graph);
				// Add all this dependencies to the new Dependencies
				newDependencies.addAll(currentDependencies);
			}
			dependencies = newDependencies;
		}
	}
	
	
	public EnvironmentGraph getGraph() {
		return graph;
	}
	
}

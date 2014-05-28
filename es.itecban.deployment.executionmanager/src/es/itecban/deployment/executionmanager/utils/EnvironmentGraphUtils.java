package es.itecban.deployment.executionmanager.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.utils.checkers.VersionChecker;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitsType;
import es.itecban.deployment.model.deployment.unit.DependencyType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.LocalityConstraintType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.environment.graph.Cause;
import es.itecban.deployment.model.environment.graph.Dependency;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphFactory;
import es.itecban.deployment.model.environment.graph.Node;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;

public class EnvironmentGraphUtils {

	private RepositoryManagerCore repoManager;
	private EnvironmentManagerCore envManager;
	private DeploymentTargetType environment;
	
	private DeploymentUnitType[] allDeploymentUnits;
	
	private static Logger logger = Logger.getLogger("es.itecban.deployment.executionmanager");
	static {
			logger.setLevel(Level.ALL);
	}
	
	public EnvironmentGraphUtils(RepositoryManagerCore repoManager, EnvironmentManagerCore envManager, DeploymentTargetType environment) throws Exception {
		this.repoManager = repoManager;
		this.envManager = envManager;
		this.environment = environment;
		// Get all the deployment units in the repository
		this.allDeploymentUnits = this.repoManager.getAllDeploymentUnits();
	}
	
	public Node createNode(DeploymentUnitType unit, String container) {
		Node graphNode = GraphFactory.eINSTANCE.createNode();
		// Set unit info
		graphNode.setUnitName(unit.getName());
		graphNode.setUnitVersion(unit.getVersion());
		// Set container and node info
		graphNode.setContainerName(container);
		graphNode.setNodeName(this.getContainerNode(container).getName());
		// Set id
		// mjb: the name of the containers use to be too large. If a / exist, we will try to short them
		if (container.contains("/"))
			container = container.substring(container.lastIndexOf("/") + 1);
		graphNode.setId(unit.getName() + "_" + unit.getVersion() + "_" + container);
		return graphNode;
	}
	
	public Dependency createDependency(Node source, Node destination, String locality, ResourceType resource) {
		Dependency dep = GraphFactory.eINSTANCE.createDependency();
		// Set source and destination
		dep.setSource(source);
		dep.setDestination(destination);
		// Set ID
		dep.setId(source.getUnitName() + "_" + source.getUnitVersion() + "-->" + destination.getUnitName() + "_" + destination.getUnitVersion());
		// Set locality
		dep.setLocality(locality);
		// Add the causes
		dep.addCause(this.createCause(resource));
		return dep;
	}
	
	public Cause createCause(ResourceType resource) {
		Cause cause = GraphFactory.eINSTANCE.createCause();
		// Set name, version and type
		cause.setName(resource.getName());
		cause.setVersion(resource.getVersion());
		cause.setType(resource.getTypes().getType().get(0));
		return cause;
	}
	
	public ContainerType getContainerType(String name) {
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator.hasNext();) {
			NodeType node = (NodeType) nodeIterator.next();
			// Iterate the containers
			List<ContainerType> containers = node.getNodeContainers().getNodeContainer();
			for (Iterator<ContainerType> containerIterator = containers.iterator(); containerIterator.hasNext();) {
				ContainerType currentContainer = (ContainerType) containerIterator.next();
				// If matches the variable, return true
				if (currentContainer.getName().equals(name)) {
					return currentContainer;
				}
			}
		}
		// Else, return null
		return null;
	}
	
	public List<Node> getDependencies(Node node, DeploymentUnitType unit, String container, EnvironmentGraph graph) throws Exception {
		logger.info("Looking for units that require: " + unit.getName() + " " + unit.getVersion());
		List<Node> dependencies = new ArrayList<Node>();
		// Get the exported resources
		List<ResourceType> resources = unit.getExportedResources().getExportedResource();
		// Iterate them
		for (ResourceType resource : resources) {
			// Get the units that use those resources from the repository
			String name = resource.getName();
			String version = resource.getVersion();
			String type = resource.getTypes().getType().get(0); //TODO: y si es buscada por el segundo tipo de recurso??
			if (version== null) {
				version = "";
			}
			if (type==null) {
				type = "";
			}
			logger.info("Finding deployment unit that require resource: " + name + " " + version + " " + type);
			List<DeploymentUnitType> dependentUnits = new ArrayList<DeploymentUnitType>();
			List<DeploymentUnitType> localDependentUnits = new ArrayList<DeploymentUnitType>();
			for (DeploymentUnitType depUnit : allDeploymentUnits) {
				if (depUnit.getDependencies()!= null && depUnit.getDependencies().getDependency().size()!= 0) {
					List<DependencyType> deps = depUnit.getDependencies().getDependency();
					for (DependencyType dep : deps) {
						// Check resource
						if (dep.getRequiredResource().getName().equals(resource.getName()) &&
								// Check if the exported resource version satisfies the required resource version
								VersionChecker.compareVersions(dep.getRequiredResource().getVersion(), resource.getVersion())) {
							// Check if its a local or remote dependency
							if (dep.getLocality().equals(LocalityConstraintType.ANYNODE)) {
								logger.info("Deployment unit found: " + depUnit.getName() + " " + depUnit.getVersion() + " Remote dependency");
								dependentUnits.add(depUnit);
							}
							else {
								logger.info("Deployment unit found: " + depUnit.getName() + " " + depUnit.getVersion() + " Local dependency");
								localDependentUnits.add(depUnit);
							}
						}
					}
				}
			}
			// Check if the remote units are null
			if (dependentUnits!= null && dependentUnits.size()!=0) {
				// Check if those units are in the environment
				// Iterate the units
				for (DeploymentUnitType dependentUnit : dependentUnits) {
					// Get all the containers that have the unit
					logger.info("Finding runtime unit: " + dependentUnit.getName() + " " + dependentUnit.getVersion());
					ContainerType[] containers = envManager.findRuntimeUnit(environment.getName(), dependentUnit.getName(), dependentUnit.getVersion(), true);
					for (ContainerType containerType : containers) {
						logger.info("Container found: " + containerType.getName());
					}
					// Iterate the containers
					for (ContainerType currentContainer : containers) {
						// Add the info to the graph
						Node currentNode = this.createNode(dependentUnit, currentContainer.getName());
						// Add the dependency to the graph and the node
						Dependency dep = this.createDependency(currentNode, node, "remote", resource);
						// Iterate the existing dependencies
						List<Dependency> graphDependencies = graph.getDependencies();
						// If the dependency already exists, add new cause to it
						boolean dependencyFound = false;
						for (Dependency dependency : graphDependencies) {
							if (dependency.equals(dep)) {
								dependency.addCause(this.createCause(resource));
								dependencyFound = true;
							}
						}
						// If not, add it to the graph
						if (!dependencyFound) {
							graph.addDependency(dep);
							node.getIsRequiredBy().add(dep);
							currentNode.getDependencies().add(dep);
						}
						// Add the node
						graph.addNode(currentNode);
						// Add the node to the dependencies list
						dependencies.add(currentNode);
					}
				}
			}
			// Check if the local units are null
			if (localDependentUnits!= null && localDependentUnits.size()!=0) {
				// Check if those units are in the environment
				// Iterate the units
				for (DeploymentUnitType dependentUnit : localDependentUnits) {
					// Get all the containers that have the unit
					logger.info("Finding runtime unit: " + dependentUnit.getName() + " " + dependentUnit.getVersion());
					ContainerType[] containers = envManager.findRuntimeUnit(environment.getName(), dependentUnit.getName(), dependentUnit.getVersion(), true); 
					for (ContainerType containerType : containers) {
						logger.info("Container found: " + containerType.getName());
					}
					// Iterate the containers
					for (ContainerType currentContainer : containers) {
						// Check if its the same container
						if (currentContainer.getName().equals(container)) {
							// Add the info to the graph
							Node currentNode = this.createNode(dependentUnit, currentContainer.getName());
							// Add the dependency to the graph and the node
							Dependency dep = this.createDependency(currentNode, node, "local", resource);
							// Iterate the existing dependencies
							List<Dependency> graphDependencies = graph.getDependencies();
							// If the dependency already exists, add new cause to it
							boolean dependencyFound = false;
							for (Dependency dependency : graphDependencies) {
								if (dependency.equals(dep)) {
									dependency.addCause(this.createCause(resource));
									dependencyFound = true;
								}
							}
							// If not, add it to the graph
							if (!dependencyFound) {
								graph.addDependency(dep);
								node.getIsRequiredBy().add(dep);
								currentNode.getDependencies().add(dep);
							}
							// Add the node
							graph.addNode(currentNode);
							// Add the node to the dependencies list
							dependencies.add(currentNode);
						}
					}
				}
			}
		}
		// Return the list
		return dependencies;
	}
	
	private NodeType getContainerNode(String container) {
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator.hasNext();) {
			NodeType node = (NodeType) nodeIterator.next();
			// Iterate the containers
			List<ContainerType> containers = node.getNodeContainers().getNodeContainer();
			for (Iterator<ContainerType> containerIterator = containers.iterator(); containerIterator.hasNext();) {
				ContainerType currentContainer = (ContainerType) containerIterator.next();
				// If matches the variable, return true
				if (currentContainer.getName().equals(container)) {
					return node;
				}
			}
		}
		// Else, return null
		return null;
	}
	
	public boolean isUnitInContainer(String containerName, String unitName, String unitVersion) {
		logger.info("Checking if unit " + unitName + " is in container " + containerName);
		ContainerType container = null;
		// Get the container from the environment
		List<NodeType> nodes = environment.getNodes().getNode();
		for (NodeType node : nodes) {
			List<ContainerType> containers = node.getNodeContainers().getNodeContainer();
			for (ContainerType tempContainer : containers) {
				if (tempContainer.getName().equals(containerName)) 
					container = tempContainer;
			}
		}
		// Check if the unit is in the container
		RuntimeUnitsType runtimeUnits = container.getRuntimeUnits();
		EList<RuntimeUnitType> runtimeUnitsList = runtimeUnits.getUnit();
		for (RuntimeUnitType runtimeUnit : runtimeUnitsList) {
			// Check the name
			if (runtimeUnit.getName().equalsIgnoreCase(unitName)) {
				// Check the version
				if (unitVersion == null
						|| unitVersion.equalsIgnoreCase("")
						|| runtimeUnit.getVersion().equalsIgnoreCase(
								unitVersion)) {
					logger.info("Checking if unit " + unitName
							+ " is in container " + container.getName()
							+ " : SUCCESS");
					return true;
				}
			}
		}
		logger.info("Checking if unit " + unitName + " is in container "
				+ container.getName() + " : FALSE");
		return false;
	}
}

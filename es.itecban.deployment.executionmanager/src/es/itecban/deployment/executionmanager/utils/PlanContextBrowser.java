/*******************************************************************************
 * Copyright 2014 Indra
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package es.itecban.deployment.executionmanager.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.executionmanager.elements.Constraint;
import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.elements.DeploymentUnit;
import es.itecban.deployment.executionmanager.utils.checkers.ResourceChecker;
import es.itecban.deployment.executionmanager.utils.checkers.VersionChecker;
import es.itecban.deployment.model.dependency.graph.Dependency;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.dependency.graph.Node;
import es.itecban.deployment.model.deployment.target.ContainerPropertiesType;
import es.itecban.deployment.model.deployment.target.ContainerResourcesType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.ContainerTypesType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeContainersType;
import es.itecban.deployment.model.deployment.target.NodeResourcesType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.NodesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitsType;
import es.itecban.deployment.model.deployment.target.SupportedPackageType;
import es.itecban.deployment.model.deployment.target.SupportedPackagesType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.PackageType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourceType;

public class PlanContextBrowser {

	private DeploymentTargetType environment;
	private DependencyGraph graph;

	private static Logger logger = Logger
			.getLogger("es.itecban.deployment.executionmanager");

	static {
		logger.setLevel(Level.ALL);
	}

	public PlanContextBrowser(DeploymentTargetType environment,
			DependencyGraph graph) {
		this.environment = environment;
		this.graph = graph;
	}

	public String findResourceProperty(String resourceName,
			String propertyName, String targetUnit) {
		// Get the dependencies of the target unit
		DeploymentUnitType unit = null;
		List<Dependency> dependencies = new ArrayList<Dependency>(0);
		// Iterate the graph nodes
		List<Node> nodes = graph.getNode();
		for (Iterator<Node> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			Node node = (Node) nodeIterator.next();
			// Check if the unit of the node is the target one
			DeploymentUnitType tempUnit = node.getUnit();
			if (tempUnit.getName().equalsIgnoreCase(targetUnit)) {
				unit = tempUnit;
			}
		}
		// Check if the unit is null
		if (unit == null) {
			logger.severe("The target unit is not in the deployment graph");
			return "";
		}
		// Iterate the dependencies of the graph
		List<Dependency> tempDependencies = graph.getDependency();
		for (Iterator<Dependency> dependencyIterator = tempDependencies
				.iterator(); dependencyIterator.hasNext();) {
			Dependency tempDependency = (Dependency) dependencyIterator.next();
			// Check if the dependency is the desired one
			DeploymentUnitType sourceUnit = tempDependency.getSource()
					.getUnit();
			if (sourceUnit.getName().equals(unit.getName())
					&& sourceUnit.getVersion().equals(unit.getVersion())) {
				dependencies.add(tempDependency);
			}
		}
		// Check if the unit is null
		if (dependencies.size() == 0) {
			logger
					.severe("The dependency is not in the deployment graph or the unit has no dependencies");
			return "";
		}
		// Iterate the dependencies
		for (Iterator<Dependency> dependencyIterator = tempDependencies
				.iterator(); dependencyIterator.hasNext();) {
			Dependency dependency = (Dependency) dependencyIterator.next();
			// Check if the dependency destination resolves the property
			DeploymentUnitType tempUnit = dependency.getDestination().getUnit();
			// Iterate unit resources
			List<ResourceType> resources = tempUnit.getExportedResources()
					.getExportedResource();
			for (Iterator<ResourceType> resourceIterator = resources.iterator(); resourceIterator
					.hasNext();) {
				ResourceType resource = (ResourceType) resourceIterator.next();
				// Check if its the desired resource
				if (resource.getName().equals(resourceName)) {
					// If it is, get the property
					List<PropertyType> properties = resource
							.getResourceProperties().getResourceProperty();
					// Iterate the properties
					for (Iterator<PropertyType> propertyIterator = properties
							.iterator(); propertyIterator.hasNext();) {
						PropertyType property = (PropertyType) propertyIterator
								.next();
						// Check if its the desired property
						if (property.getName().equals(propertyName)) {
							// If it is, return the value
							return property.getValue();
						}
					}
				}
			}
		}
		// Else... something horrible happended
		return null;
	}

	public String findUnitResourceProperty(String unitName,
			String resourceName, String propertyName) {
		// Get the desired unit
		DeploymentUnitType unit = null;
		// Iterate the graph nodes
		List<Node> nodes = graph.getNode();
		for (Iterator<Node> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			Node node = (Node) nodeIterator.next();
			// Check if the unit of the node is the target one
			DeploymentUnitType tempUnit = node.getUnit();
			if (tempUnit.getName().equals(unitName)) {
				unit = tempUnit;
			}
		}
		// Check if the unit is null
		if (unit == null) {
			logger.severe("The target unit is not in the deployment graph");
			return "";
		}
		// Iterate unit resources
		List<ResourceType> resources = unit.getExportedResources()
				.getExportedResource();
		for (Iterator<ResourceType> resourceIterator = resources.iterator(); resourceIterator
				.hasNext();) {
			ResourceType resource = (ResourceType) resourceIterator.next();
			// Check if its the desired resource
			if (resource.getName().equals(resourceName)) {
				// If it is, get the property
				List<PropertyType> properties = resource
						.getResourceProperties().getResourceProperty();
				// Iterate the properties
				for (Iterator<PropertyType> propertyIterator = properties
						.iterator(); propertyIterator.hasNext();) {
					PropertyType property = (PropertyType) propertyIterator
							.next();
					// Check if its the desired property
					if (property.getName().equals(propertyName)) {
						// If it is, return the value
						return property.getValue();
					}
				}
			}
		}
		// Else... something horrible happended
		return null;
	}

	public String findNodeProperty(String nodeName, String propertyName) {
		// Get the desired node from the environment
		NodeType node = null;
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			NodeType tempNode = (NodeType) nodeIterator.next();
			// If matches the variable, get the container
			if (tempNode.getName().equals(nodeName)) {
				node = tempNode;
				break;
			}
		}
		if (node == null) {
			logger.severe("The especified node " + nodeName + " doesn't exist");
			return null;
		}
		// Get the desired property from the node
		// Iterate the properties
		List<PropertyType> properties = node.getNodeProperties()
				.getNodeProperty();
		for (Iterator<PropertyType> propertyIterator = properties.iterator(); propertyIterator
				.hasNext();) {
			PropertyType tempProperty = (PropertyType) propertyIterator.next();
			// If matches the variable, get the property
			if (tempProperty.getName().equals(propertyName)) {
				// TODO can container properties be configured? If so, modify
				// this
				return tempProperty.getValue();
			}
		}
		logger.severe("The especified property " + propertyName
				+ " doesn't exist in node " + nodeName);
		return "";
	}

	public String findNodeResourceProperty(String nodeName,
			String resourceName, String propertyName) {
		// Get the desired node from the environment
		NodeType node = null;
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			NodeType tempNode = (NodeType) nodeIterator.next();
			// If matches the variable, get the container
			if (tempNode.getName().equals(nodeName)) {
				node = tempNode;
				break;
			}
		}
		if (node == null) {
			logger.severe("The especified node " + nodeName + " doesn't exist");
			return "";
		}
		// Get the desired resource from the node
		ResourceType resource = null;
		// Iterate the resources
		List<ResourceType> resources = node.getNodeResources()
				.getNodeResource();
		for (Iterator<ResourceType> resourceIterator = resources.iterator(); resourceIterator
				.hasNext();) {
			ResourceType tempResource = (ResourceType) resourceIterator.next();
			// If matches the variable, get the resource
			if (tempResource.getName().equals(resourceName)) {
				// TODO can node resources be configured? If so, modify this
				resource = tempResource;
			}
		}
		if (resource == null) {
			logger.severe("The especified resource " + resourceName
					+ " doesn't exist in node " + nodeName);
			return "";
		}
		// Get the desired property from the node
		// Iterate the properties
		List<PropertyType> properties = node.getNodeProperties()
				.getNodeProperty();
		for (Iterator<PropertyType> propertyIterator = properties.iterator(); propertyIterator
				.hasNext();) {
			PropertyType tempProperty = (PropertyType) propertyIterator.next();
			// If matches the variable, get the property
			if (tempProperty.getName().equals(propertyName)) {
				// TODO can container properties be configured? If so, modify
				// this
				return tempProperty.getValue();
			}
		}
		logger.severe("The especified property " + propertyName
				+ " doesn't exist in node " + nodeName);
		return "";
	}

	public String findContainerProperty(String containerName,
			String propertyName) {
		// Get the desired container from the environment
		ContainerType container = null;
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			NodeType node = (NodeType) nodeIterator.next();
			// Iterate the containers
			List<ContainerType> containers = node.getNodeContainers()
					.getNodeContainer();
			for (Iterator<ContainerType> containerIterator = containers
					.iterator(); containerIterator.hasNext();) {
				ContainerType tempContainer = (ContainerType) containerIterator
						.next();
				// If matches the variable, get the container
				if (tempContainer.getName().equals(containerName)) {
					container = tempContainer;
					break;
				}
			}
		}
		if (container == null) {
			logger.severe("The especified container " + containerName
					+ " doesn't exist");
			return "";
		}
		// Get the desired property from the container
		// Iterate the properties
		ContainerPropertiesType containerProperties = container
				.getContainerProperties();
		if (containerProperties != null) {
			List<PropertyType> properties = containerProperties.getContainerProperty();
			for (Iterator<PropertyType> propertyIterator = properties
					.iterator(); propertyIterator.hasNext();) {
				PropertyType tempProperty = (PropertyType) propertyIterator
						.next();
				// If matches the variable, get the property
				if (tempProperty.getName().equals(propertyName)) {
					// TODO can container properties be configured? If so,
					// modify
					// this
					return tempProperty.getValue();
				}
			}
		}
		logger.severe("The especified property " + propertyName
				+ " doesn't exist in container " + containerName);
		return "";
	}

	public String findContainerResourceProperty(String containerName,
			String resourceName, String propertyName) {
		// Get the desired container from the environment
		ContainerType container = null;
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			NodeType node = (NodeType) nodeIterator.next();
			// Iterate the containers
			List<ContainerType> containers = node.getNodeContainers()
					.getNodeContainer();
			for (Iterator<ContainerType> containerIterator = containers
					.iterator(); containerIterator.hasNext();) {
				ContainerType tempContainer = (ContainerType) containerIterator
						.next();
				// If matches the variable, get the container
				if (tempContainer.getName().equals(containerName)) {
					container = tempContainer;
					break;
				}
			}
		}
		if (container == null) {
			logger.severe("The especified container " + containerName
					+ " doesn't exist");
			return "";
		}
		// Get the desired resource from the container
		RuntimeResourceType resource = null;
		// Iterate the resources
		ContainerResourcesType containerResources = container
				.getContainerResources();
		if (containerResources != null) {
			List<RuntimeResourceType> resources = containerResources
					.getContainerResource();
			for (Iterator<RuntimeResourceType> resourceIterator = resources
					.iterator(); resourceIterator.hasNext();) {
				RuntimeResourceType tempResource = (RuntimeResourceType) resourceIterator
						.next();
				// If matches the variable, get the resource
				if (tempResource.getName().equals(resourceName)) {
					// TODO can container resources be configured? If so, modify
					// this
					resource = tempResource;
				}
			}
		}

		if (resource == null) {
			logger.severe("The especified resource " + resourceName
					+ " doesn't exist in container " + containerName);
			return "";
		}
		// Get the desired property from the container
		// Iterate the properties
		ContainerPropertiesType containerProperties = container
				.getContainerProperties();
		if (containerProperties != null) {
			List<PropertyType> properties = containerProperties
					.getContainerProperty();
			for (Iterator<PropertyType> propertyIterator = properties
					.iterator(); propertyIterator.hasNext();) {
				PropertyType tempProperty = (PropertyType) propertyIterator
						.next();
				// If matches the variable, get the property
				if (tempProperty.getName().equals(propertyName)) {
					// TODO can container properties be configured? If so,
					// modify
					// this
					return tempProperty.getValue();
				}
			}
		}
		logger.severe("The especified property " + propertyName
				+ " doesn't exist in resource " + resourceName);
		return "";
	}

	public boolean isConstraintInNode(Constraint constraint, NodeType node) {
		logger.info("Checking constraint " + constraint.getName()
				+ " against node " + node.getName());
		// Checks if the specified constraint is satisfied by the node
		NodeResourcesType nodeResources = node.getNodeResources();
		EList<ResourceType> nodeResourcesList = nodeResources.getNodeResource();
		for (ResourceType resource : nodeResourcesList) {
			logger.info("Checking constraint " + constraint.getName()
					+ " against resource " + resource.getName());
			if (ResourceChecker.compareConstraint(constraint, resource)) {
				logger.info("Checking constraint " + constraint.getName()
						+ " against resource " + resource.getName()
						+ " : SUCCESS");
				return true;
			}
		}
		logger.info("Checking constraint " + constraint.getName()
				+ " against node " + node.getName() + " : FAIL");
		return false;
	}

	public boolean isConstraintInContainer(Constraint constraint,
			ContainerType container) {
		logger.info("Checking constraint " + constraint.getName()
				+ " against container " + container.getName());
		// Check if the constraint is the type of the container
		if (constraint.getType().equals("es.itecban.deployment.container")) {
			ContainerTypesType containerTypes = container.getContainerTypes();
			EList<ContainerTypeType> containerTypesList = containerTypes
					.getContainerType();
			for (ContainerTypeType containerType : containerTypesList) {
				logger.info("Checking container type " + constraint.getName()
						+ " against container " + containerType.getName());
				if (containerType.getName().equals(constraint.getName())) {
					logger.info("Checking container type "
							+ constraint.getName() + " against container "
							+ containerType.getName() + " : SUCCESS");
					return true;
				}
			}
		}
		// Else checks if the specified constraint is satisfied by the container
		ContainerResourcesType containerResources = container
				.getContainerResources();
		if (containerResources != null) {
			EList<RuntimeResourceType> runtimeResourcesList = containerResources
					.getContainerResource();
			for (RuntimeResourceType resource : runtimeResourcesList) {
				logger.info("Checking constraint " + constraint.getName()
						+ " against resource " + resource.getName());
				if (ResourceChecker.compareConstraint(constraint, resource)) {
					logger.info("Checking constraint " + constraint.getName()
							+ " against resource " + resource.getName()
							+ " : SUCCESS");
					return true;
				}
			}
		}
		logger.info("Checking constraint " + constraint.getName()
				+ " against container " + container.getName() + " : FAIL");
		return false;
	}

	public boolean isUnitInEnvironment(String unitName, String unitVersion) {
		logger.info("Checking if unit " + unitName + " is in environment "
				+ environment.getName());
		NodesType nodes = environment.getNodes();
		EList<NodeType> nodesList = nodes.getNode();
		for (NodeType node : nodesList) {
			// Check if the unit is in any of the containers
			NodeContainersType containers = node.getNodeContainers();
			EList<ContainerType> containersList = containers.getNodeContainer();
			for (ContainerType container : containersList) {
				// If the unit is already in a container of the node, returns
				// true
				if (isUnitInContainer(container, unitName, unitVersion))
					logger.info("Checking if unit " + unitName
							+ " is in environment " + environment.getName()
							+ " : SUCCESS");
				return true;
			}
		}
		// Else returns false
		logger.info("Checking if unit " + unitName + " is in environment "
				+ environment.getName() + " : FAIL");
		return false;
	}

	public boolean isUnitInContainer(ContainerType container, String unitName,
			String unitVersion) {
		logger.info("Checking if unit " + unitName + " is in container "
				+ container.getName());
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
	
	public boolean isNodeOfEnvironment(String nodeName) {
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			NodeType node = (NodeType) nodeIterator.next();
			// If matches the variable, return true
			if (node.getName().equals(nodeName)) {
				return true;
			}
		}
		// Else, return false
		return false;
	}

	public boolean isContainerOfEnvironment(String containerName) {
		// Iterate the nodes
		List<NodeType> nodes = environment.getNodes().getNode();
		for (Iterator<NodeType> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			NodeType node = (NodeType) nodeIterator.next();
			// Iterate the containers
			List<ContainerType> containers = node.getNodeContainers()
					.getNodeContainer();
			for (Iterator<ContainerType> containerIterator = containers
					.iterator(); containerIterator.hasNext();) {
				ContainerType container = (ContainerType) containerIterator
						.next();
				// If matches the variable, return true
				if (container.getName().equals(containerName)) {
					return true;
				}
			}
		}
		// Else, return false
		return false;
	}

	public boolean isPackageSupportedByContainer(PackageType packageType,
			ContainerType container) {
		logger.info("Cheking if container " + container.getName()
				+ " supports the package " + packageType.getName());
		String type = packageType.getType();
		String version = packageType.getVersion();
		SupportedPackagesType supportedPackages = container
				.getSupportedPackages();
		EList<SupportedPackageType> containerPackages = supportedPackages
				.getContainerPackage();
		for (Iterator<SupportedPackageType> iterator = containerPackages
				.iterator(); iterator.hasNext();) {
			SupportedPackageType supportedPackage = (SupportedPackageType) iterator
					.next();
			// If any of the supported packages is the searched one, return true
			String supportedType = supportedPackage.getType();
			String supportedVersion = supportedPackage.getVersion();
			logger.info("Cheking container " + container.getName()
					+ " against package type " + type);
			// Check the type
			if (supportedType.equals(type)) {
				// Check the version
				if ((version == null || version.equals(""))
						|| (supportedVersion.equals("default") || supportedVersion
								.equals(""))
						|| VersionChecker.compareVersions(version,
								supportedVersion)) {
					logger.info("Cheking if container " + container.getName()
							+ " supports the package " + packageType.getName()
							+ " : SUCCESS");
					return true;
				}
			}

		}
		// Else return false
		logger.info("Cheking if container " + container.getName()
				+ " supports the package " + packageType.getName() + " : FAIL");
		return false;
	}

	private ContainerType[] getSuitableContainersFromNode(NodeType node,
			DeploymentGroup group) {
		logger.info("Searching suitable container for a group in node "
				+ node.getName());
		NodeContainersType nodeContainers = node.getNodeContainers();
		EList<ContainerType> nodeContainersList = nodeContainers
				.getNodeContainer();
		ArrayList<ContainerType> containersList = new ArrayList<ContainerType>();
		List<DeploymentUnit> units = group.getUnits();
		List<Constraint> groupConstraints = group.getConstraints();
		// Check if constraints are already in node
		for (Iterator<Constraint> constraintsIterator3 = groupConstraints
				.iterator(); constraintsIterator3.hasNext();) {
			Constraint constraint = (Constraint) constraintsIterator3.next();
			// If a constraint is satisfied by the node remove it from the list
			if (isConstraintInNode(constraint, node))
				groupConstraints.remove(constraint);
		}
		// Check if there is a suitable container in this node
		for (int i = 0; i < nodeContainersList.size(); i++) {
			ContainerType container = nodeContainersList.get(i);
			containersList.add(container);
			for (int j = 0; j < groupConstraints.size(); j++) {
				Constraint constraint = groupConstraints.get(j);
				// If the container doesn't satisfy a constraint remove it from
				// the list
				logger
						.info("Searching if container " + container.getName()
								+ " in node " + node.getName()
								+ " is suitable for constraint "
								+ constraint.getName());
				if (!isConstraintInContainer(constraint, container)) {
					if (containersList.contains(container)) {
						containersList.remove(container);
						logger.info("Searching if container "
								+ container.getName() + " in node "
								+ node.getName()
								+ " is suitable for constraint "
								+ constraint.getName() + " : FAIL");
					}
				}
			}
			// If the container doesn't support the package type of all units
			// remove it from the list
			for (Iterator<DeploymentUnit> iterator = units.iterator(); iterator
					.hasNext();) {
				DeploymentUnit deploymentUnit = (DeploymentUnit) iterator
						.next();
				// Get the DeploymentUnitType from the graph
				DeploymentUnitType deploymentUnitType = null;
				List<Node> graphNodes = graph.getNode();
				for (Node graphNode : graphNodes) {
					DeploymentUnitType dunit = graphNode.getUnit();
					if (dunit.getName().equals(deploymentUnit.getName())
							&& dunit.getVersion().equals(
									deploymentUnit.getVersion())) {
						deploymentUnitType = dunit;
					}
				}
				// Check if the package is supported by the container
				if (!isPackageSupportedByContainer(deploymentUnitType
						.getPackage(), container)) {
					if (containersList.contains(container)) {
						containersList.remove(container);
					}
				}
			}
		}
		// Returns the first suitable container
		if (containersList.size() == 0) {
			logger.info("Searching suitable container for a group in node "
					+ node.getName() + " : FAIL");
			return null;
		} else {
			// Convert the ArrayList into an array
			ContainerType[] containersArray = new ContainerType[containersList
					.size()];
			int i = 0;
			for (Iterator<ContainerType> it = containersList.iterator(); it
					.hasNext();) {
				containersArray[i++] = (ContainerType) it.next();
			}
			logger.info("Searching suitable container for a group in node "
					+ node.getName() + " : SUCCESS");
			return containersArray;
		}
	}

	public String[] getSuitableContainers(DeploymentGroup group) {
		NodesType nodes = environment.getNodes();
		ArrayList<String> suitableContainers = new ArrayList<String>();
		// Iterate over possible nodes
		List<NodeType> nodesList = nodes.getNode();
		for (NodeType node : nodesList) {
			// Check if a container in the node is suitable
			ContainerType[] containers;
			containers = getSuitableContainersFromNode(node, group);
			if (containers != null && containers.length != 0) {
				// If there is suitable containers add them to the list
				for (int i = 0; i < containers.length; i++) {
					suitableContainers.add(containers[i].getName());
				}
			}
		}
		// Convert the ArrayList into an array
		String[] containersArray = new String[suitableContainers.size()];
		int i = 0;
		for (Iterator<String> it = suitableContainers.iterator(); it.hasNext();) {
			containersArray[i++] = (String) it.next();
		}
		return containersArray;
	}

	public DeploymentTargetType getEnvironment() {
		return environment;
	}

	public DependencyGraph getGraph() {
		return graph;
	}
}

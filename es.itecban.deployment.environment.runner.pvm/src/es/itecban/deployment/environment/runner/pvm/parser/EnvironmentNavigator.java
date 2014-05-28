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
package es.itecban.deployment.environment.runner.pvm.parser;

import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;

public class EnvironmentNavigator {
	
	public static NodeType getNode(String nodeName, DeploymentTargetType deploymentTarget) {
		if (deploymentTarget == null) return null;
		EList<NodeType> nodes = deploymentTarget.getNodes().getNode();
		for (NodeType node: nodes) {
			if (nodeName.equals(node.getName())) return node; 
		}
		return null; // If it doesn't exist inside the target
	}
	
	public static ContainerType getContainer(String containerName, NodeType node) {
		if (node == null) return null;
		EList<ContainerType> containers = node.getNodeContainers().getNodeContainer();
		for (ContainerType container : containers) {
			if (containerName.equals(container.getName())) return container;
		}
		return null; // If it doesn't exist inside the node
	}
	
	public static RuntimeResourceType getContainerResource(String containerResourceName, ContainerType container) {
		if (container == null) return null;
		EList<RuntimeResourceType> containerResources = container.getContainerResources().getContainerResource();
		for (RuntimeResourceType containerResource : containerResources) {
			if (containerResourceName.equals(containerResource.getName())) return containerResource; 
		}
		return null; // If it doesn't exist inside the container
	}
	
	public static RuntimeUnitType getUnit(String unitName, ContainerType container) {
		if (container == null) return null;
		EList<RuntimeUnitType> units = container.getRuntimeUnits().getUnit();
		for (RuntimeUnitType unit : units) {
			if (unitName.equals(unit.getName())) return unit; 
		}
		return null; // If it doesn't exist inside the container
	}
	
	public static RuntimeResourceType getUnitResource(String unitResourceName, RuntimeUnitType unit) {
		if (unit == null) return null;
		EList<RuntimeResourceType> unitResources = unit.getRuntimeResources().getResource();
		for (RuntimeResourceType unitResource : unitResources) {
			if (unitResourceName.equals(unitResource.getName())) return unitResource; 
		}
		return null; // If it doesn't exist inside the unit
	}

}

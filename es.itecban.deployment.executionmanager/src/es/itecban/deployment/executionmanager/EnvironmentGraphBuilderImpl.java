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
package es.itecban.deployment.executionmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.services.EnvironmentGraphBuilder;
import es.itecban.deployment.executionmanager.utils.EnvironmentGraphUtils;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitsType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphFactory;
import es.itecban.deployment.model.environment.graph.Node;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;

public class EnvironmentGraphBuilderImpl implements EnvironmentGraphBuilder {

	private EnvironmentGraph graph;
	
	private static Logger logger = Logger.getLogger("es.itecban.deployment.executionmanager");
	static {
			logger.setLevel(Level.ALL);
	}
	
	public EnvironmentGraphBuilderImpl(DeploymentTargetType environment, DeploymentUnitType unit, RepositoryManagerCore repoManager, EnvironmentManagerCore envManager, EnvironmentGraphUtils utils, List<String> containerList) throws Exception {
		// Create the graph
		graph = GraphFactory.eINSTANCE.createEnvironmentGraph();
		// Create a revised containers List
		List<String> revisedContainersList = new ArrayList<String>();
		// Check that the provided containers contain the deployment unit
		for (String containerName : containerList) {
			// If it is, add it to the revised list
			if (utils.isUnitInContainer(containerName, unit.getName(), unit.getVersion()))
				revisedContainersList.add(containerName);
		}
		//The graph has only to represent the units what are going to be updated/deleted
		// Iterate them
		for (String unitContainer : revisedContainersList) {
			// Create the origin node
			Node origin = utils.createNode(unit, unitContainer);
			graph.addNode(origin);		
			graph.getOrigins().add(origin);
			// Get the dependencies
			logger.info("Getting dependencies for the unit deployed in contanier: " + unitContainer);
			List<Node> dependencies = utils.getDependencies(origin, unit, unitContainer, graph);
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
	}
	
	public EnvironmentGraph getGraph() {
		return graph;
	}
	
}

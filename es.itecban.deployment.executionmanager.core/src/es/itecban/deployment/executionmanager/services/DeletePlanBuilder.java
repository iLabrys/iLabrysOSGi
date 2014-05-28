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
package es.itecban.deployment.executionmanager.services;

import java.util.List;

import es.itecban.deployment.executionmanager.elements.Constraint;
import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.elements.UnresolvedResource;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;

public interface DeletePlanBuilder extends PlanBuilder {
	

	/**
	 * Returns the list of containers in which a given group can be installed.
	 * 
	 * @param group
	 *            The group to be installed.
	 * @return A String array with the names of all the containers in which the
	 *         group can be installed.
	 */
//	public String[] getSuitableContainers(DeploymentGroup group);

	/**
	 * Assigns a deployment group to a specified container. Can't assign a group
	 * to various containers. If it's run several times on the same group only
	 * the last assignment will be kept.
	 * 
	 * @param group
	 *            A deployment group obtained from a graph via
	 *            DependencyGroupProcessor class.
	 * @param containerName
	 *            Unique name that identifies a container.
	 * @param allowNotSuitableContainer
	 *            true if the group is to be assigned to a container not
	 *            suitable for it. For example, if a constraint that will be
	 *            added later is the on e missing.
	 * @return true if the group has been assigned correctly, false otherwise.
	 */
	public boolean assignGroupToContainer(DeploymentGroup group, String containerName, boolean allowNotSuitableContainer);

	/**
	 * Returns what constraints a given container is missing to satisfy a given
	 * group. The user can navigate these constraints to see if can be satisfied
	 * by other means like configuring the container.
	 * 
	 * @param group
	 *            The group against the container is checked.
	 * @param containerName
	 *            The container with the missing constraints.
	 * @return An array of constraints.
	 */
	public Constraint[] getMissingConstraintsFromContainer(DeploymentGroup group, String containerName);

	/**
	 * Gets the name of the container in which the group is assigned to be
	 * deployed
	 * 
	 * @param group
	 *            A String with the unique name of the container
	 * @return
	 */
	public String getAssignedContainer(DeploymentGroup group);

	/**
	 * Gives the graph with the installation elements and its dependencies
	 * 
	 * @return The DependencyGraph
	 */
//	public DependencyGraph getGraph();

	/**
	 * Gives the deployable groups for this plan's graph
	 * 
	 * @return An array with the groups
	 */
	public DeploymentGroup[] getGroups();

	/**
	 * Returns a list containing the configurable unit resources that need
	 * manual configuration
	 * 
	 * @return A list with the configurable unit resources
	 */
	public List<UnresolvedResource> getUnresolvedUnitResources();

	/**
	 * Allows the manual configuration of a unit resource
	 * 
	 * @param confRes The configurable unit resource to be added
	 */
	void configureUnitResource(UnresolvedResource confRes);
}

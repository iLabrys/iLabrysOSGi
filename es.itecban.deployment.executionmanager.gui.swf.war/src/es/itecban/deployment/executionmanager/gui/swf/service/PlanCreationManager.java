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
package es.itecban.deployment.executionmanager.gui.swf.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.binding.message.MessageContext;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.elements.Constraint;
import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.elements.DeploymentUnit;
import es.itecban.deployment.executionmanager.utils.PlanContextBrowser;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;

public class PlanCreationManager {

	// Beans
	private EnvironmentManagerCore environmentManager;
	private CommonCreationManager common;

	private boolean validated;
	private String errorMessage = "Unknown error";

	private Logger logger = Logger.getLogger(PlanCreationManager.class
			.getName());

	public void initialize(RequestContext context) {

		logger.fine("Initializing at PlanCreationManager.");
		context.getFlowScope().put(Constants.FLOW_OPERATION_FLOW,
				Constants.FLOW_OPERATION_INSTALL);
	}

	public String selectDefaultGoalID(RequestContext context) {

		return this.common.selectDefaultGoalID(context);
	}

	/**
	 * Gets the environment names existing in the system
	 * 
	 * @param context
	 */
	public void getEnvironments(RequestContext context) {

		this.common.getEnvironments(context);
	}

	public String selectEnvironment(RequestContext context) throws Exception {

		return this.common.selectEnvironment(context);
	}

	public void findListDeploymentUnitsPaginated(
			RequestContext context) {

		this.common.findListDeploymentUnitsPaginated(context);
	}

	public void selectUnit(RequestContext context, String planNameUniq)
			throws Exception {

		this.common.selectUnit(context, planNameUniq);
	}

	public void findTargetContainers(RequestContext context)
			throws Exception {

		// Updating the information of the environment
		DeploymentTargetType environment = null;
		String lock = "findTargetContainers_lock";
		synchronized (lock) {
			String environmentName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_ENV);
			try {
				long time1 = System.currentTimeMillis();
//				Calendar cal1 = Calendar.getInstance();
				logger.info("Updating the environment information...");
				environment = this.environmentManager
						.updateEnvironment(environmentName);
				long time2 = System.currentTimeMillis();
//				Calendar cal2 = Calendar.getInstance();
//				Utils.getTimeOfExecution(cal1, cal2,
//						"Time of updating the environment: ");
				Utils.getTimeOfExecution(time1, time2, "Time of updating the environment: ");
			} catch (Exception e) {
				logger.severe("Error while updating the environment information"
						+ e);
				e.printStackTrace();
				ErrorUtils.createMessageError(context, e.getMessage(), null);
				throw new Exception();
			}
			// Get the nodes
			List<NodeType> nodes = environment.getNodes().getNode();
			// Iterate every node for the containers
			List<String> containerNames = new ArrayList<String>();
			for (Iterator<NodeType> iterator = nodes.iterator(); iterator.hasNext();) {
				NodeType node = (NodeType) iterator.next();
				// Get the names of the containers
				List<ContainerType> nodeContainers = node.getNodeContainers()
						.getNodeContainer();
				for (Iterator<ContainerType> contIterator = nodeContainers
						.iterator(); contIterator.hasNext();) {
					ContainerType container = (ContainerType) contIterator.next();
					containerNames.add(container.getName());
				}
			}
			// Put the names of the nodes in the context
			String[] containerNamesArray = new String[containerNames.size()];
			containerNames.toArray(containerNamesArray);
			DependencyGraph graph = this.common.resolveUnit(context, environment);
			DeploymentGroup[] depGroups = (DeploymentGroup[]) context
					.getFlowScope().get(Constants.FLOW_DEPLOYMENT_GROUPS);
			// Installed units. They are needed to determine where the deployment
			// unit can be installed
			List<InstalledUnit> installedUnitList = (List<InstalledUnit>) context
					.getFlowScope().get(Constants.FLOW_INSTALLED_UNITS);

			
			// candidates[container][group]
			boolean[][] candidates;
			if (depGroups != null) {
				candidates = new boolean[containerNamesArray.length][depGroups.length];
				for (int g = 0; g < depGroups.length; g++) {
					DeploymentGroup group = depGroups[g];
					PlanContextBrowser browser = new PlanContextBrowser(
							environment, graph);
					String[] suitableContainers = browser
							.getSuitableContainers(group);

					if (suitableContainers.length == 0) {
						String groupUnits = "";
						List<DeploymentUnit> deploymentUnitList = group.getUnits();
						for (DeploymentUnit dUnit : deploymentUnitList) {
							groupUnits = groupUnits + "\r\n\r\n" + dUnit.getName();
						}
						String constraintString = "";
						List<Constraint> constraintList = group.getConstraints();
						for (Constraint constraint : constraintList) {
							constraintString = constraintString + "\r\n\r\n"
									+ constraint.getName();
						}
						this.errorMessage = "There is no suitable container for the group "
								+ "with the folowing units:"
								+ groupUnits
								+ "\r\n\r\nand with the "
								+ "following constraints"
								+ constraintString;
						ErrorUtils.createMessageError(context, this.errorMessage,
								null);
						throw new Exception();
					}
					for (int c = 0; c < containerNamesArray.length; c++) {
						String container = containerNamesArray[c];
						// rellenamos la matriz comprobando si estan en los
						// suitables ->
						candidates[c][g] = contains(container, suitableContainers);
						if (logger.isLoggable(Level.FINE))
							logger.fine("" + candidates[c][g]);
					}
				}
				context.getFlowScope().put(Constants.FLOW_INSTALLED_UNITS, installedUnitList);
				context.getFlowScope().put(Constants.FLOW_CONTAINERS, containerNamesArray);
				context.getFlashScope().put(Constants.FLOW_CANDIDATES, candidates);
			}
		}
		lock = null;
	}

	private boolean contains(String node, String[] suitableHosts) {
		for (String valid : suitableHosts) {
			if (node.equals(valid))
				return true;
		}
		return false;
	}

	public boolean map(RequestContext context,
			DeploymentGroup[] groups, String[] containers, String planNameUniq)
			throws Exception {

		String lock = "map_lock";
		boolean isOk = false;
		synchronized (lock) {
			Calendar map1 = Calendar.getInstance();
			String environmentName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_ENV);
			DeploymentTargetType environment = this.environmentManager
					.getEnvironment(environmentName);
			DependencyGraph graph = this.common.getDependencyGraph(context,
					environment.getName());
			PlanContextBrowser browser = new PlanContextBrowser(environment, graph);

			logger.fine("Starting Mapping");
			String stActionsToDo = context.getRequestParameters()
					.get("actionsToDo");
			if (stActionsToDo == null || stActionsToDo.equals("")) {
				ErrorUtils.createMessageError(context,
						"running.error.noSelectedContainer", null);
				throw new Exception();
			}
			// check if they are less because come of the units are already
			// installed
			String[] actionsToDoArray = stActionsToDo.split(",");
			List<InstalledUnit> installedUnitList = (List<InstalledUnit>) context
					.getFlowScope().get("installedUnitList");
			int numberOfAssignedUnits = 0;
			// look for the non assigned groups
			// get the unique groups of assignment
			Set<String> uniqueGroups = new HashSet<String>();
			for (String action : actionsToDoArray) {
				String assignedGroup = action.substring(0, action.indexOf('|'));
				uniqueGroups.add(assignedGroup);
			}
			// if any of the group has not been assigned check if it is already
			// installed in the environment
			String[] uniqueGroupsArray = uniqueGroups
					.toArray(new String[uniqueGroups.size()]);
			Arrays.sort(uniqueGroupsArray);
			if (uniqueGroups.size() < groups.length) {
				for (int i = 0, k = 0; i < groups.length; i++) {
					boolean notAssigned = false;
					int groupNumber = -1;
					try {
						groupNumber = Integer.parseInt(uniqueGroupsArray[k]);
					} catch (ArrayIndexOutOfBoundsException e) {
						notAssigned = true;
					}
					if (notAssigned || groupNumber != i) {
						// group number not assigned, necessary to check if this
						// group is already installed
						DeploymentGroup groupNotAssigned = groups[i];
						List<DeploymentUnit> unitList = groupNotAssigned.getUnits();
						for (DeploymentUnit unit : unitList) {
							String unitName = unit.getName();
							String unitVersion = unit.getVersion();
							// check against the installed units
							for (InstalledUnit installedUnit : installedUnitList) {
								if (installedUnit.getUnitName().equals(unitName)
										&& installedUnit.getUnitVersion().equals(
												unitVersion)) {
									// the unit is installed, it is not necessary to
									// install it again
									numberOfAssignedUnits++;
									break;
								}
							}
						}
					}
					if (groupNumber == i)
						k = k + 1;
				}
			}
			if (uniqueGroupsArray.length + numberOfAssignedUnits < groups.length) {
				ErrorUtils.createMessageError(context,
						"running.error.noSelectedAllContainer", null);
				throw new Exception();
			}
			String[] aActionsToDo = stActionsToDo.split(",");

			for (int i = 0; i < aActionsToDo.length; i++) {
				String[] actioni = aActionsToDo[i].split("\\|");
				int g = Integer.parseInt(actioni[0]);
				DeploymentGroup group = groups[g];
				String containeri = actioni[1];
				try {
					Map<DeploymentGroup, String> groupsToContainer = this.common
							.assignGroupToContainer(group, containeri, false,
									context, browser);
					context.getFlowScope().put(Constants.FLOW_GROUPS_TO_CONTAINER,
							groupsToContainer);
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			Calendar map2 = Calendar.getInstance();
			Utils.getTimeOfExecution(map1, map2, "Time of executing map: ");
			isOk = this.common.validatePlan(context, environment, graph);
		}
		lock = null;
		return isOk;
	}

	public Event performResourceSearch() {
		logger.fine("performResourceSearch() method executed");
		Event evento = new Event(this, "performResourceSearchResult");
		return evento;
	}

	public String confirmParameters() {
		logger.fine("confirmParameters() method executed");
		// Event evento = new Event(this, "confirmParametersResult");
		return "";
	}

	public Event displayTargetNodes() {
		logger.fine("displayTargetNodes() method executed");
		Event evento = new Event(this, "displayTargetNodesResult");
		return evento;
	}

	public Event displayGroups() {
		logger.fine("displayGroups() method executed");
		Event evento = new Event(this, "displayGroupsResult");
		return evento;
	}

	public Event savePlan(RequestContext context,
			String planNameUniq) throws Exception {

		return this.common.savePlan(context, planNameUniq);
	}

	public Event isValidated() {
		if (this.validated) {
			return new Event(this, "yes");
		} else {
			return new Event(this, "no");
		}
	}

	public String parseMessageError(MessageContext messageContext) {
		// messageContext.addMessage(new
		// MessageBuilder().error().code("theCode")
		// .defaultText("Message text")
		// .build());
		return this.errorMessage;
	}

	public void setEnvironmentManager(EnvironmentManagerCore environmentManager) {
		this.environmentManager = environmentManager;
	}

	public void setCommon(CommonCreationManager common) {
		this.common = common;
	}
}

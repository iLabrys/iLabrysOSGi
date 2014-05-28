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

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.binding.message.MessageContext;
import org.springframework.webflow.context.ExternalContext;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.utils.PlanContextBrowser;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;

public class DeletePlanCreationManager {

	private EnvironmentManagerCore envManager;
	private CommonCreationManager common;
	private String errorMessage = "Unknown error";
	private boolean validated;

	private Logger logger = Logger.getLogger(DeletePlanCreationManager.class
			.getName());

	public void findTargetContainers(RequestContext context)
			throws Exception {

		DeploymentTargetType environment = null;
		String lock = "findTargetcontainers_lock";
		synchronized (lock) {
			String environmentName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_ENV);
			String unitName = (String) context.getFlowScope().get(Constants.FLOW_SELECTED_UNIT_NAME);
			String unitVersion = (String) context.getFlowScope().get(Constants.FLOW_SELECTED_UNIT_VERSION);
			try {
				Calendar cal1 = Calendar.getInstance();
				logger.info("Updating the environment information...");
				environment = envManager.updateEnvironment(environmentName);
				Calendar cal2 = Calendar.getInstance();
				Utils.getTimeOfExecution(cal1, cal2,
						"Time of updating the environment: ");
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
			// Web context code
			String[] containerNamesArray = new String[containerNames.size()];
			containerNames.toArray(containerNamesArray);

			this.common.resolveUnit(context, environment);
			
			List<InstalledUnit> installedUnitList = (List<InstalledUnit>)context.getFlowScope().get(Constants.FLOW_INSTALLED_UNITS);
			if (installedUnitList == null || installedUnitList.size() == 0) {
				// This an updating plan. If there is no installed units, something
				// must be incorrect
				ErrorUtils.createMessageError(context,
						"running.error.flow.delete.noInstalledUnit", null);
				throw new Exception();
			}

			DeploymentGroup[] depGroups = (DeploymentGroup[])context.getFlowScope().get(Constants.FLOW_DEPLOYMENT_GROUPS);
			boolean[][] candidates;
			if (depGroups != null) {
				String[] suitableContainers = null;
				candidates = new boolean[containerNamesArray.length][depGroups.length];
				for (int g = 0; g < depGroups.length; g++) {
					// the suitable containers for a unit to be deleted is
					// the containers where is already installed
					for (InstalledUnit iUnit : installedUnitList) {
						// to be candidate to be deleted, the unit name and version must be the same
						if (iUnit.getUnitName().equals(unitName) && iUnit.getUnitVersion().equals(unitVersion)){
							suitableContainers = new String[iUnit
									.getContainerArray().length];
							for (int i = 0; i < iUnit.getContainerArray().length; i++) {
								suitableContainers[i] = iUnit
										.getContainerArray()[i];
							}
						}
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
				context.getFlowScope().put(Constants.FLOW_CONTAINERS,
						containerNamesArray);
				context.getFlowScope().put(Constants.FLOW_INSTALLED_UNITS,
						null);
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

	public boolean map(RequestContext context, DeploymentGroup[] groups,
			String[] containers, String planNameUniq) throws Exception {

		logger.fine("Starting Mapping");
		String lock = "map_lock";
		boolean ok = false;
		synchronized (lock) {
			String environmentName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_ENV);
			DeploymentTargetType environment = this.envManager
					.getEnvironment(environmentName);
			Calendar cal2 = Calendar.getInstance();
			DependencyGraph graph = this.common.getDependencyGraph(context,
					environment.getName());
			PlanContextBrowser browser = new PlanContextBrowser(environment, graph);

			String stActionsToDo = context.getRequestParameters()
					.get("actionsToDo");
			if (stActionsToDo == null || stActionsToDo.equals("")) {
				ErrorUtils.createMessageError(context,
						"running.error.noSelectedContainer", null);
				throw new Exception();
			}

			// Check if the selected unit to operate with has been assigned to a
			// container
			DeploymentGroup dgOfTargetUnitSelected = groups[groups.length - 1];
			String selectedUnitName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_UNIT_NAME);
			String selectedUnitVersion = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_UNIT_VERSION);

			if (!(dgOfTargetUnitSelected.getUnits().get(0).getName().equals(
					selectedUnitName) && dgOfTargetUnitSelected.getUnits().get(0)
					.getVersion().equals(selectedUnitVersion))) {
				ErrorUtils.createMessageError(context,
						"running.error.principalUnitNoAssigned", null);
				throw new Exception();
			}
			if (stActionsToDo == null || stActionsToDo.equals("")) {
				ErrorUtils.createMessageError(context,
						"running.error.noSelectedContainer", null);
				throw new Exception();
			}

			String[] aActionsToDo = stActionsToDo.split(",");

			// y esto para que es??
			if (context.getFlowScope().get(Constants.FLOW_CONTAINER_GRAPH) != null)
				context.getFlowScope().put(Constants.FLOW_CONTAINER_GRAPH, null);

			String containerGraphList = "";
			for (int i = 0; i < aActionsToDo.length; i++) {
				String[] actioni = aActionsToDo[i].split("\\|");
				int g = Integer.parseInt(actioni[0]);
				DeploymentGroup group = groups[g];
				String containeri = actioni[1];
				try {
					String containerList = (String) context.getFlowScope().get(
							Constants.FLOW_CONTAINER_GRAPH);
					if (containerList == null || containerList.equals(""))
						containerGraphList = containeri;
					else
						containerGraphList = containerList + "|" + containeri;
					context.getFlowScope().put(Constants.FLOW_CONTAINER_GRAPH,
							containerGraphList);

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
			logger.fine("Mapped everything OK");
			ExternalContext externalContext = context.getExternalContext();
			HttpServletRequest request = (HttpServletRequest) externalContext
					.getNativeRequest();
			String xmlDependencyGraph;
			try {
				xmlDependencyGraph = this.getXMLDependencyGraphURL(request,
						selectedUnitName, selectedUnitVersion, environmentName,
						containerGraphList);
				context.getFlowScope()
						.put("xmlDependencyGraph", xmlDependencyGraph);
				context.getFlowScope().put("name", selectedUnitName);
				context.getFlowScope().put("version", selectedUnitVersion);
				context.getFlowScope().put("environment", environmentName);
				// add the nodes to be updated so the graph of all of them will be
				// shown
				context.getFlowScope().put(Constants.FLOW_CONTAINER_GRAPH,
						containerGraphList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ok = this.common.validatePlan(context, environment, graph);

		}
		lock = null;
		return ok;
	}

	private String getXMLDependencyGraphURL(HttpServletRequest request,
			String unitName, String unitVersion, String selectedEnv,
			String containerGraphList) throws Exception {
		String file = request.getRequestURI();
		file = file.substring(0, file.indexOf("/", file.indexOf("/") + 1));

		if (request.getQueryString() != null) {
			// file += '?' +
			// request.getQueryString()+"&_eventId_getXMLGraph=true&name="+unitName+"&version="+unitVersion+"&environment="+selectedEnv;
			file += "/unitInverseDependencies.htm" + '?' + "name=" + unitName
					+ "&version=" + unitVersion + "&environment="
					+ selectedEnv.replace(' ', '+') + "&justGraph=true"
					+ "&containerGraphList=" + containerGraphList;
		}
		URL reconstructedURL = new URL(request.getScheme(), request
				.getServerName(), request.getServerPort(), file);
		return (reconstructedURL.toString()).substring(request.getScheme()
				.length(), (reconstructedURL.toString().length()));
	}

	public void selectUnit(RequestContext context, String planNameUniq)
			throws Exception {

		this.common.selectUnit(context, planNameUniq);
	}

	public void initialize(RequestContext context) {

		logger.fine("Initializing at DeletePlanCreationManager.");
		context.getFlowScope().put(Constants.FLOW_OPERATION_FLOW,
				Constants.FLOW_OPERATION_DELETE);
	}

	public String selectDefaultGoalID(RequestContext context) {

		return this.common.selectDefaultGoalID(context);
	}

	public void getEnvironments(RequestContext context) {

		this.common.getEnvironments(context);
	}

	public String selectEnvironment(RequestContext context)
			throws Exception {

		return this.common.selectEnvironment(context);
	}

	public void findListDeploymentUnitsPaginated(
			RequestContext context) {

		this.common.findListDeploymentUnitsPaginated(context);
	}

	public String parseMessageError(MessageContext messageContext) {
		// messageContext.addMessage(new
		// MessageBuilder().error().code("theCode")
		// .defaultText("Message text")
		// .build());
		return this.errorMessage;
	}

	public Event savePlan(RequestContext context,
			String planNameUniq) throws Exception {

		return this.common.savePlan(context, planNameUniq);
	}

	public void setEnvManager(EnvironmentManagerCore envManager) {
		this.envManager = envManager;
	}

	public void setCommon(CommonCreationManager common) {
		this.common = common;
	}
}

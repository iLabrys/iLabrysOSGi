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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.DeleteBuilder;
import es.itecban.deployment.executionmanager.DependencyGroupProcessor;
import es.itecban.deployment.executionmanager.InstallBuilder;
import es.itecban.deployment.executionmanager.UpdateBuilder;
import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.elements.DeploymentUnit;
import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.executionmanager.utils.ManagerUtils;
import es.itecban.deployment.executionmanager.utils.PlanContextBrowser;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.marshaller.PlanMarshaller;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.marshaller.TargetMarshaller;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;
import es.itecban.deployment.repository.services.core.ResolverCore;
import es.itecban.deployment.security.client.ws.AuthenticationManager;

public class CommonCreationManager {

	private RepositoryManagerCore repoManager;
	private EnvironmentManagerCore envManager;
	private PlanManager planManager;
	private ResolverCore resolver;
	private boolean validated;
	private Logger logger = Logger.getLogger(CommonCreationManager.class
			.getName());

	/**
	 * Gets the default goal
	 * 
	 * @param context
	 * @return
	 */

	public String selectDefaultGoalID(RequestContext context) {

		logger.fine("Getting into selectDefaultGoal");
		String lock = "selectDefaultGoalID_lock";
		synchronized (lock) {
			String planName = (String) context.getRequestParameters().get(
					"planName");
			logger.fine("planName: " + planName);
			// later, the planNameUniq (==planName) will be concatenated with
			// date
			// and environment
			context.getFlowScope().put(Constants.FLOW_PLAN_NAME, planName);
		}
		lock = null;
		return "yes";
	}

	/**
	 * Gets the environment names existing in the system
	 * 
	 * @param context
	 * @return
	 */
	public void getEnvironments(RequestContext context) {

		Calendar getEnv1 = Calendar.getInstance();
		logger.fine("Getting into getEnvironments");
		String lock = "getEnvironments_lock";
		String[] environments = null;
		synchronized (lock) {
			try {
				environments = envManager.getEnvironmentsName();
				context.getFlowScope().put(Constants.FLOW_ENVIRONMENTS,
						environments);
			} catch (Exception e) {
				e.printStackTrace();
				// throw new
				// Exception("Error while retrieving the environment names");
			}
		}
		lock = null;

		Calendar getEnv2 = Calendar.getInstance();
		Utils.getTimeOfExecution(getEnv1, getEnv2,
				"Time of execution of getEnvironments: ");
		// return environments;
	}

	/**
	 * Introduces the selected environment name in the flow Introduces the
	 * unique plan name (name + environmentname + date) in the flow Introduces
	 * the container names array in the flow
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public String selectEnvironment(RequestContext context) throws Exception {

		Calendar selectEnv1 = Calendar.getInstance();
		// Web context code
		logger.fine("Getting into selectEnvironment");
		String lock = "selectEnvironment_lock";
		synchronized (lock) {
			String selectedEnvironment = (String) context
					.getRequestParameters().get("selectedEnvironment");
			context.getFlowScope().put(Constants.FLOW_SELECTED_ENV,
					selectedEnvironment);
			// concatenation of the plan name
			String planName = (String) context.getFlowScope().get(
					Constants.FLOW_PLAN_NAME);
			Calendar calendar = Calendar.getInstance();
			Date date = calendar.getTime();
			String planNameUniq = planName + "|" + selectedEnvironment + "|"
					+ date.toString();

			// Concatenate the creation user to the name of the plan
			logger
					.info("Creation user: "
							+ AuthenticationManager.getUserName());
			planNameUniq = planNameUniq + "|"
					+ AuthenticationManager.getUserName();

			context.getFlowScope().put(Constants.FLOW_PLAN_UNIQUE_NAME,
					planNameUniq);
			Calendar selectEnv2 = Calendar.getInstance();
			Utils.getTimeOfExecution(selectEnv1, selectEnv2,
					"Time of execution selectEnvironment: ");
		}
		lock = null;
		return "yes";
	}

	public void findListDeploymentUnitsPaginated(RequestContext context) {

		Calendar list = Calendar.getInstance();
		PagedListHolder duList = null;
		String lock = "selectEnvironment_lock";
		synchronized (lock) {
			if (context.getCurrentEvent().getId().equals("findDeploymentUnit")) {
				duList = new PagedListHolder(Arrays.asList(this
						.findDeploymentUnit(context)));
			} else if (context.getCurrentEvent().getId().equals(
					"findDeploymentUnitByName")) {
				duList = new PagedListHolder(Arrays.asList(this
						.findDeploymentUnitByName(context)));
			} else if (context.getCurrentEvent().getId().equals(
					"viewAllAvailableDeploymentUnits")) {
				duList = new PagedListHolder(Arrays.asList(this
						.findAllAvailableDeploymentUnits(context)));
			} else if (context.getCurrentEvent().getId().equals(
					"findDeploymentUnitByResource")) {
				duList = new PagedListHolder(Arrays.asList(this
						.findDeploymentUnitByResource(context)));
			} else if (context.getCurrentEvent().getId().equals(
					"paginatedListDU")) {
				duList = (PagedListHolder) context.getFlowScope().get(
						"availableDeploymentUnits", PagedListHolder.class);
			}

			if (duList != null) {
				if (context.getRequestParameters().get("p") != null) {
					duList.setPage(Integer.parseInt(context
							.getRequestParameters().get("p")));
				}
			}

			duList.setMaxLinkedPages(50);
			duList.setPageSize(10);
			Calendar list2 = Calendar.getInstance();
			Utils.getTimeOfExecution(list, list2,
					"Time of executing getUnitList: ");
			context.getFlowScope().put(Constants.FLOW_DEPLOYMENT_UNIT_LIST,
					duList);
		}
		lock = null;
	}

	private DeploymentUnit[] findDeploymentUnitByName(RequestContext context) {

		// Web context code
		logger.fine("Getting into findUnitByName");
		String unitName = (String) context.getRequestParameters().get("name");
		String unitVersion = (String) context.getRequestParameters().get(
				"version");
		// Repository code
		// Get the deployment units
		DeploymentUnitType[] units = null;
		try {
			units = repoManager.findDeploymentUnits(unitName, unitVersion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Transform into serializable simplified deployment units
		DeploymentUnit[] serUnits = new DeploymentUnit[units.length];
		for (int i = 0; i < serUnits.length; i++) {
			serUnits[i] = new DeploymentUnit(units[i].getName(), units[i]
					.getVersion());
		}
		// Check the amount of units
		if (units == null) {
			logger
					.info("No deployment units found matching the version range.");
		} else {
			for (int i = 0; i < serUnits.length; i++) {
				if (logger.isLoggable(Level.FINE))
					logger.fine(serUnits[i].toString());
			}
		}
		logger.fine("Getting out of findUnitByName");
		return serUnits;
	}

	private DeploymentUnit[] findDeploymentUnit(RequestContext context) {

		// Web context code
		logger.fine("Getting into findDeploymentUnit");

		DeploymentUnit[] du = null;
		String type = (String) context.getRequestParameters().get("type");
		if (type != null && type.equals("deployment.unit")) {
			du = this.findDeploymentUnitByName(context);
		} else if (type != null && type.equals("unit.resource")) {
			du = this.findDeploymentUnitByResource(context);
		} else {
			du = this.findAllAvailableDeploymentUnits(context);
		}
		logger.fine("Getting out of findDeploymentUnit");
		return du;
	}

	private DeploymentUnit[] findDeploymentUnitByResource(RequestContext context) {
		// Web context code
		logger.fine("Getting into findUnitByResource");
		String resourceName = (String) context.getRequestParameters().get(
				"resourceName");
		String resourceVersion = (String) context.getRequestParameters().get(
				"resourceVersion");
		String resourceType = (String) context.getRequestParameters().get(
				"resourceType");
		// Repository code
		// Get the deployment units
		DeploymentUnitType[] units = null;
		try {
			units = repoManager.findDeploymentUnitByResource(resourceName,
					resourceVersion, resourceType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Transform into serializable simplified deployment units
		DeploymentUnit[] serUnits = new DeploymentUnit[units.length];
		for (int i = 0; i < serUnits.length; i++) {
			serUnits[i] = new DeploymentUnit(units[i].getName(), units[i]
					.getVersion());
		}
		// Check the amount of units
		if (units == null) {
			logger
					.fine("No deployment units found matching the input resource.");
		} else {
			for (int i = 0; i < serUnits.length; i++) {
				if (logger.isLoggable(Level.FINE))
					logger.fine(serUnits[i].toString());
			}
		}
		logger.fine("Getting out of findUnitByResource");
		return serUnits;
	}

	private DeploymentUnit[] findAllAvailableDeploymentUnits(
			RequestContext context) {
		// Repository code
		// Get the deployment units
		DeploymentUnitType[] units = null;
		try {
			units = repoManager.getAllDeploymentUnits();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Transform into serializable simplified deployment units
		DeploymentUnit[] serUnits = new DeploymentUnit[units.length];
		for (int i = 0; i < serUnits.length; i++) {
			serUnits[i] = new DeploymentUnit(units[i].getName(), units[i]
					.getVersion());
		}
		// Check the amount of units
		if (units == null) {
			logger.fine("No deployment units found.");
		} else {
			for (int i = 0; i < serUnits.length; i++) {
				if (logger.isLoggable(Level.FINE))
					logger.fine(serUnits[i].toString());
			}
		}
		logger.fine("Getting out of findAllAvailableDeploymentUnits");
		return serUnits;
	}

	/**
	 * The unit selected is the new unit to install. The unit which is going to
	 * substitute the old ones
	 * 
	 * @param context
	 * @param planNameUniq
	 * @return
	 * @throws Exception
	 */

	public void selectUnit(RequestContext context, String planNameUniq)
			throws Exception {

		// Web context code
		logger.fine("Getting into selectUnit");
		String lock = "selectUnit_lock";
		synchronized (lock) {
			Calendar selectUnit1 = Calendar.getInstance();
			String unitName = (String) context.getRequestParameters().get(
					Constants.FLOW_SELECTED_UNIT_NAME);
			String unitVersion = (String) context.getRequestParameters().get(
					Constants.FLOW_SELECTED_UNIT_VERSION);
			// this are the name and version of the unit to be installed
			context.getFlowScope().put(Constants.FLOW_SELECTED_UNIT_NAME,
					unitName);
			context.getFlowScope().put(Constants.FLOW_SELECTED_UNIT_VERSION,
					unitVersion);
			Calendar selectUnit2 = Calendar.getInstance();
			Utils.getTimeOfExecution(selectUnit1, selectUnit2,
					"Time of execution of selectUnit: ");
		}
	}

	/**
	 * 
	 * @param context
	 * @throws Exception
	 */
	public List<InstalledUnit> getInstalledUnits(RequestContext context,
			DeploymentGroup[] deploymentGroupArray,
			DeploymentTargetType environment) throws Exception {

		logger.fine("Getting the already installed units");
		// Get the selected unit
		String unitName = (String) context.getFlowScope().get(
				Constants.FLOW_SELECTED_UNIT_NAME);
		List<InstalledUnit> installedUnitList = new ArrayList<InstalledUnit>();
		// Getting the xml object
		String envXML = this.getEnvironmentXML(environment);

		InputStream is = null;
		try {
			is = new ByteArrayInputStream(envXML.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Get Xpath instance
		XPath xpath = XPathFactory.newInstance().newXPath();
		String expression = "";
		NodeList nodeSet = null;
		for (DeploymentGroup deploymentGroup : deploymentGroupArray) {
			List<DeploymentUnit> unitList = deploymentGroup.getUnits();
			for (DeploymentUnit unit : unitList) {
				// Asking with XPath to get the version of an specific unit
				expression = "//unit[name[text()='" + unit.getName()
						+ "']]/version";
				try {
					is = new ByteArrayInputStream(envXML.getBytes());
					nodeSet = (NodeList) xpath.evaluate(expression,
							new InputSource(is), XPathConstants.NODESET);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String[] versionArray = new String[nodeSet.getLength()];
				for (int i = 0; i < nodeSet.getLength(); i++) {
					Element element = (Element) nodeSet.item(i);
					versionArray[i] = (String) element.getTextContent();
				}
				// if is an updating or deletion, the unit must exist in any
				// container
				if (versionArray.length == 0
						&& unit.getName().equals(unitName)
						&& ((context.getFlowScope()
								.get(Constants.FLOW_OPERATION_FLOW))
								.equals(Constants.FLOW_OPERATION_UPDATE) || (context
								.getFlowScope()
								.get(Constants.FLOW_OPERATION_FLOW))
								.equals(Constants.FLOW_OPERATION_DELETE))) {
					if ((context.getFlowScope()
							.get(Constants.FLOW_OPERATION_FLOW))
							.equals(Constants.FLOW_OPERATION_UPDATE)) {
						String[] args = {
								unit.getName() + "_" + unit.getVersion(),
								"'UPDATE OPERATION'" };
						ErrorUtils.createMessageError(context,
								"running.error.noSuitableContaierForUpdate",
								args);
					} else {
						String[] args = {
								unit.getName() + "_" + unit.getVersion(),
								"'DELETE OPERATION'" };
						ErrorUtils.createMessageError(context,
								"running.error.noSuitableContaierForUpdate",
								args);
					}

					throw new Exception();
				}

				// We have an array with the name of the containers where the
				// unit is in any version. Search with exact version has each
				// container
				for (String version : versionArray) {
					expression = "//nodeContainer[runtimeUnits/unit/name[text()='"
							+ unit.getName()
							+ "'] and runtimeUnits/unit/version[text()='"
							+ version + "']]/name";
					try {
						is = new ByteArrayInputStream(envXML.getBytes());
						nodeSet = (NodeList) xpath.evaluate(expression,
								new InputSource(is), XPathConstants.NODESET);

					} catch (Exception e) {
						e.printStackTrace();
					}
					String[] containerArray = new String[nodeSet.getLength()];
					for (int i = 0; i < nodeSet.getLength(); i++) {
						Element element = (Element) nodeSet.item(i);
						containerArray[i] = (String) element.getTextContent();
					}
					if (containerArray.length > 0) {
						InstalledUnit installedUnit = new InstalledUnit(unit
								.getName(), version, containerArray);
						installedUnitList.add(installedUnit);
					}
				}
			}
		}
		return installedUnitList;
	}

	public DependencyGraph resolveUnit(RequestContext context,
			DeploymentTargetType environment) throws Exception {

		DeploymentGroup[] deploymentGroups = null;
		try {
			DependencyGraph graph = this.getDependencyGraph(context,
					environment.getName());
			DependencyGroupProcessor processor = new DependencyGroupProcessor(
					graph);
			deploymentGroups = processor.getGroups();

			// mjb: check if there is a repeated group in the graph
			// take an auxiliar list of the groups
			List<DeploymentGroup> depGroupList = new ArrayList<DeploymentGroup>();
			for (int i = 0; i < deploymentGroups.length; i++) {
				DeploymentGroup depGroupInArray = deploymentGroups[i];
				if (i == 0)
					depGroupList.add(depGroupInArray);
				else {
					boolean eqs = false;
					for (DeploymentGroup depGroupInList : depGroupList) {
						// checks the group is different before adding it
						if (depGroupInList.equals(depGroupInArray))
							eqs = true;
					}
					if (eqs == false)
						depGroupList.add(depGroupInArray);
				}
			}
			DeploymentGroup[] deploymentGroupsNonEqual = depGroupList
					.toArray(new DeploymentGroup[depGroupList.size()]);

			// mjb: to control the already deployed units
			// introduce a hastable in the flowscope with: key=name of the unit,
			// value, container
			List<InstalledUnit> installedUnitList = this.getInstalledUnits(
					context, deploymentGroupsNonEqual, environment);

			context.getFlowScope().put(Constants.FLOW_INSTALLED_UNITS,
					installedUnitList);
			context.getFlowScope().put(Constants.FLOW_DEPLOYMENT_GROUPS,
					deploymentGroupsNonEqual);
			return graph;
		} catch (Exception e) {
			logger.severe("Error " + e.getMessage());
			ErrorUtils.createMessageError(context, e.getMessage(), null);
			throw new Exception("Error " + e.getMessage());
		}
	}

	/**
	 * 
	 * @param context
	 * @param environmentName
	 * @return
	 * @throws Exception
	 */

	public DependencyGraph getDependencyGraph(RequestContext context,
			String environmentName) throws Exception {

		String unitName = (String) context.getFlowScope().get(
				Constants.FLOW_SELECTED_UNIT_NAME);
		String unitVersion = (String) context.getFlowScope().get(
				Constants.FLOW_SELECTED_UNIT_VERSION);
		DeploymentUnitType unit = repoManager.getDeploymentUnit(unitName,
				unitVersion);

		DependencyGraph dg = resolver.resolveDeploymentUnit(unit,
				environmentName);

		// If there is a delete operation then the graph must be reduced to one
		// unit only (the one to be uninstalled
		if (((String) context.getFlowScope().get(Constants.FLOW_OPERATION_FLOW))
				.equals(Constants.FLOW_OPERATION_DELETE)) {
			// This code minimize the dependencies graph to the origin unit,
			// because in an unistallation
			// there is no sense to have a bigger graph
			int nodesSize = dg.getNode().size();
			for (int i = 0; i < nodesSize; i++) {
				if (i != 0) {
					dg.getNode().remove(1);

				} else {
					int nodeDependecySize = dg.getNode().get(i).getDependency()
							.size();
					for (int j = 0; j < nodeDependecySize; j++) {
						// graph.getNode().get(i).getDependency().remove(j);
						dg.getNode().get(i).getDependency().remove(0);
					}
				}
			}
			int dependeciesSize = dg.getDependency().size();
			for (int i = 0; i < dependeciesSize; i++) {
				dg.getDependency().remove(0);
			}
		}
		return dg;
	}

	public String getPreviousUnitVersion(String containeri,
			List<InstalledUnit> installedUnitList) throws Exception {

		List<InstalledUnit> auxInstalledUnitList = new ArrayList<InstalledUnit>();
		for (Iterator units = installedUnitList.iterator(); units.hasNext();) {
			InstalledUnit iu = (InstalledUnit) units.next();
			String[] containers = iu.getContainerArray();
			if (containers != null)
				for (int i = 0; i < containers.length; i++) {
					if (containers[i].equals(containeri)) {
						// return iu.getUnitVersion();
						auxInstalledUnitList.add(iu);
					}
				}
		}
		if (auxInstalledUnitList.size() > 1) {
			// There are more than one unit with different version installed in
			// the same container. Getting the bigger version
			List<String> versionList = new ArrayList<String>();
			for (int i = 0; i < installedUnitList.size(); i++) {
				versionList.add(installedUnitList.get(i).getUnitVersion());
			}
			Collections.sort(versionList);
			return versionList.get(versionList.size() - 1);
		} else if (auxInstalledUnitList.size() == 1)
			return auxInstalledUnitList.get(0).getUnitVersion();
		else
			throw new Exception("No container for update found");
	}

	public String getXMLDependencyGraphURL(HttpServletRequest request,
			String unitName, String unitVersion, String selectedEnv,
			String containerGraphList) throws Exception {
		String file = request.getRequestURI();
		file = file.substring(0, file.indexOf("/", file.indexOf("/") + 1));

		if (request.getQueryString() != null) {
			// file += '?' +
			// request.getQueryString()+"&_eventId_getXMLGraph=true&name="+
			// unitName+"&version="+unitVersion+"&environment="+selectedEnv;
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

	public Map<DeploymentGroup, String> assignGroupToContainer(
			DeploymentGroup group, String containerName,
			boolean allowNotSuitableContainer, RequestContext context,
			PlanContextBrowser browser) throws Exception {

		Map<DeploymentGroup, String> groupsToContainer = (Map<DeploymentGroup, String>) context
				.getFlowScope().get(Constants.FLOW_GROUPS_TO_CONTAINER);
		if (groupsToContainer == null)
			groupsToContainer = new HashMap<DeploymentGroup, String>();
		logger.info("Assigning a group to the container " + containerName);
		// If don't allow not suitable container check if the container is
		// suitable for the group

		if (allowNotSuitableContainer) {

			String[] suitableContainers = browser.getSuitableContainers(group);
			boolean isSuitable = false;
			for (int i = 0; i < suitableContainers.length; i++) {
				if (suitableContainers[i].equals(containerName)) {
					isSuitable = true;
				}
			}
			if (!isSuitable) {
				logger.info("The container " + containerName
						+ " is not a suitable container for the group");
				logger.info("Assigning a group to the container "
						+ containerName + " : FAIL");
			}
		}
		// // Write the assignment to the map
		// groupsToContainer.put(group, containerName);
		// logger.info("Assigning a group to the container " + containerName
		// + " : SUCCESS");
		if (groupsToContainer.get(group) == null)
			groupsToContainer.put(group, containerName);
		else
			groupsToContainer.put(group, containerName + "|"
					+ groupsToContainer.get(group));

		return groupsToContainer;
	}

	public Map<DeploymentGroup, String> assignGroupToContainerForInstall(
			DeploymentGroup group, String containerName,
			boolean allowNotSuitableContainer, RequestContext context,
			PlanContextBrowser browser) {

		logger.info("Assigning a group to the container " + containerName);
		Map<DeploymentGroup, String> groupsToContainerForInstall = (Map<DeploymentGroup, String>) context
				.getFlowScope().get(
						Constants.FLOW_GROUPS_TO_CONTAINER_FOR_INSTALL);
		if (groupsToContainerForInstall == null)
			groupsToContainerForInstall = new HashMap<DeploymentGroup, String>();
		logger.info("Assigning a group to the container " + containerName);
		// If don't allow not suitable container check if the container is
		// suitable for the group
		if (allowNotSuitableContainer) {
			String[] suitableContainers = browser.getSuitableContainers(group);
			boolean isSuitable = false;
			for (int i = 0; i < suitableContainers.length; i++) {
				if (suitableContainers[i].equals(containerName)) {
					isSuitable = true;
				}
			}
			if (!isSuitable) {
				logger.info("The container " + containerName
						+ " is not a suitable container for the group");
				logger.info("Assigning a group to the container "
						+ containerName + " : FAIL");
				// return false;
			}
		}
		// // Write the assignment to the map
		if (groupsToContainerForInstall.get(group) == null)
			groupsToContainerForInstall.put(group, containerName);
		else
			groupsToContainerForInstall.put(group, containerName + "|"
					+ groupsToContainerForInstall.get(group));
		return groupsToContainerForInstall;
	}

	public boolean validatePlan(RequestContext context,
			DeploymentTargetType environment, DependencyGraph dg) {

//		Calendar validate1 = Calendar.getInstance();
		long validate1 = System.currentTimeMillis();
		logger.fine("Validating the plan");
		try {
			// FIXME. needed to make a new query to the database
			// Calendar cal1 = Calendar.getInstance();
			// String environmentName =
			// (String)context.getFlowScope().get(Constants.FLOW_SELECTED_ENV);
			// DeploymentTargetType environment =
			// this.envManager.getEnvironment(environmentName);
			// Calendar cal2 = Calendar.getInstance();
			// Utils.getTimeOfExecution(cal1, cal2,
			// "Time for retrieving the environment information: ");
			// DependencyGraph dg = this.getDependencyGraph(context,
			// environment.getName());
			String planName = (String) context.getFlowScope().get(
					Constants.FLOW_PLAN_UNIQUE_NAME);
			if (context.getFlowScope().get(Constants.FLOW_OPERATION_FLOW)
					.equals(Constants.FLOW_OPERATION_UPDATE)) {
				UpdateBuilder upb = new UpdateBuilder(planName, environment,
						dg, false);
				Map<DeploymentGroup, String> groupsToContainer = (Map<DeploymentGroup, String>) context
						.getFlowScope().get(Constants.FLOW_GROUPS_TO_CONTAINER);
				upb.setGroupsToContainer(groupsToContainer);
				Map<DeploymentGroup, String> groupsToContainerForInstall = (Map<DeploymentGroup, String>) context
						.getFlowScope().get(
								Constants.FLOW_GROUPS_TO_CONTAINER_FOR_INSTALL);
				upb.setGroupsToContainerForInstall(groupsToContainerForInstall);
				upb.buildPlan();
				upb.validatePlan();
				String planXML = this.reviewPlanXML(context, upb.getPlan());
				context.getFlowScope().put(Constants.FLOW_PLAN_XML, planXML);
				String json = this.reviewPlanJSON(context, upb.getPlan());
				context.getFlowScope().put(Constants.FLOW_PLAN_JSON, json);
			} else if ((context.getFlowScope()
					.get(Constants.FLOW_OPERATION_FLOW))
					.equals(Constants.FLOW_OPERATION_INSTALL)) {
				InstallBuilder ib = new InstallBuilder(planName, environment,
						dg, false);
				Map<DeploymentGroup, String> groupsToContainer = (Map<DeploymentGroup, String>) context
						.getFlowScope().get(Constants.FLOW_GROUPS_TO_CONTAINER);
				ib.setGroupsToContainer(groupsToContainer);
				ib.buildPlan();
				ib.validatePlan();
				String planXML = this.reviewPlanXML(context, ib.getPlan());
				context.getFlowScope().put(Constants.FLOW_PLAN_XML, planXML);
				String json = this.reviewPlanJSON(context, ib.getPlan());
				context.getFlowScope().put(Constants.FLOW_PLAN_JSON, json);
			} else if ((context.getFlowScope()
					.get(Constants.FLOW_OPERATION_FLOW))
					.equals(Constants.FLOW_OPERATION_DELETE)) {
				DeleteBuilder db = new DeleteBuilder(planName, environment, dg,
						false);
				Map<DeploymentGroup, String> groupsToContainer = (Map<DeploymentGroup, String>) context
						.getFlowScope().get(Constants.FLOW_GROUPS_TO_CONTAINER);
				db.setGroupsToContainer(groupsToContainer);
				db.buildPlan();
				db.validatePlan();
				String planXML = this.reviewPlanXML(context, db.getPlan());
				context.getFlowScope().put(Constants.FLOW_PLAN_XML, planXML);
				String json = this.reviewPlanJSON(context, db.getPlan());
				context.getFlowScope().put(Constants.FLOW_PLAN_JSON, json);
			}

		} catch (Exception e) {
			logger.severe("Plan not validated." + e);
			this.validated = false;
			// return new Event(this, "no");
			return false;
		}
		this.validated = true;
//		Calendar validate2 = Calendar.getInstance();
		long validate2 = System.currentTimeMillis();
		Utils.getTimeOfExecution(validate1, validate2,
				"Time of executing validatePlan: ");
		return true;
	}

	public Event savePlan(RequestContext context,
			String planNameUniq) throws Exception {

		Calendar save1 = Calendar.getInstance();
		String lock = "savePlan_lock";
		synchronized (lock) {
			DeploymentPlanType existingPlan = planManager
					.findPlanByName(planNameUniq);
			if (existingPlan != null) {
				throw new Exception("The plan name must be unique");
			}
			try {
				String planString = (String) context.getFlowScope().get(
						Constants.FLOW_PLAN_XML);
				DeploymentPlanType plan = PlanMarshaller
						.getPlanFromPath(planString);
				this.planManager.save(plan);
				// for launching later the same plan
			} catch (Exception e) {
				e.printStackTrace();
				ErrorUtils.createMessageError(context,
						"running.error.savingPlan", null);
				throw new Exception();
			}
			Calendar save2 = Calendar.getInstance();
			Utils.getTimeOfExecution(save1, save2,
					"Time of executing savePlan: ");
		}
		lock = null;
		return new Event(this, "yes");
	}

	private String reviewPlanXML(RequestContext context, DeploymentPlanType plan) {
		try {
			String xml = this.getPlanXML(plan);
			return xml;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private String getPlanXML(DeploymentPlanType plan) {

		return PlanMarshaller.getXMLFromPlan(plan);
	}

	public String getEnvironmentXML(DeploymentTargetType environment) {

		return TargetMarshaller.getXMLFromTarget(environment);
	}

	private String reviewPlanJSON(RequestContext context,
			DeploymentPlanType plan) {

		try {
			String json = ManagerUtils.getPlan2JSON(plan);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setRepoManager(RepositoryManagerCore repoManager) {
		this.repoManager = repoManager;
	}

	public void setEnvManager(EnvironmentManagerCore envManager) {
		this.envManager = envManager;
	}

	public void setResolver(ResolverCore resolver) {
		this.resolver = resolver;
	}

	public void setPlanManager(PlanManager planManager) {
		this.planManager = planManager;
	}
}

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

import javax.servlet.http.HttpServletRequest;

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

public class UpdatePlanCreationManager{

	private EnvironmentManagerCore envManager;
	private CommonCreationManager common;
	private String errorMessage = "Unknown error";
	private boolean validated;
	
	private Logger logger = Logger.getLogger(UpdatePlanCreationManager.class
			.getName());
	
	public String selectDefaultGoalID(RequestContext context) {
		
		return this.common.selectDefaultGoalID(context);
	}
	
	public void findTargetContainers(RequestContext context) throws Exception {

		// Update the environment manager information before getting it
		DeploymentTargetType environment = null;
		String lock = "findTargetcontainers_lock";
		synchronized (lock) {
			String environmentName = (String)context.getFlowScope().get(Constants.FLOW_SELECTED_ENV);
			try {
				Calendar cal1 = Calendar.getInstance();
				logger.info("Updating the environment information...");
				environment = envManager.updateEnvironment(environmentName);
				Calendar cal2 = Calendar.getInstance();
				Utils.getTimeOfExecution(cal1, cal2, "Time of updating the environment: ");
			} catch (Exception e) {
				logger.severe("Error while updating the environment information"
						+ e);
				e.printStackTrace();
				ErrorUtils.createMessageError(context,
						e.getMessage(), null);
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
			// Put the names of the nodes in the context
			String[] containerNamesArray = new String[containerNames.size()];
			containerNames.toArray(containerNamesArray);
			Calendar findTargetContainers1 = Calendar.getInstance();
			DependencyGraph graph = this.common.resolveUnit(context, environment);
			DeploymentGroup[] depGroups = (DeploymentGroup[])context.getFlowScope().get(Constants.FLOW_DEPLOYMENT_GROUPS);
			// Installed units. They are needed to determine where the deployment
			// unit can be installed
			List<InstalledUnit> installedUnitList = (List<InstalledUnit>)context.getFlowScope().get(Constants.FLOW_INSTALLED_UNITS);
			if (installedUnitList == null || installedUnitList.size() == 0){
				// This an updating plan. If there is no installed units, something must be incorrect
				ErrorUtils.createMessageError(context, "running.error.flow.update.noInstalledUnit", null);
				throw new Exception();
			}
			// candidates[container][group]
			boolean[][] candidates;
			PlanContextBrowser browser = new PlanContextBrowser(environment, graph);
			if (depGroups != null) {
				candidates = new boolean[containerNamesArray.length][depGroups.length];
				// Besides the container constraints when the operation to execute
				// is an update
				// it is necessary to discard the containers where the unit is not
				// deployed
				// (we cannot update something not already deployed)
				for (int g = 0; g < depGroups.length; g++) {
					DeploymentGroup group = depGroups[g];
					String[] suitableContainers = null;
					String unitName = (String) context.getFlowScope().get(Constants.FLOW_SELECTED_UNIT_NAME);
					// TODO this can be done only for updating, but for installing
					// this must be valid
					if (group.getUnits().size() > 1)
						throw new Exception(
								"Update action over a group with more than one unit is not supported");
					else {
						// unit to update
						if (group.getUnits().get(0).getName().equals(unitName)) {
							// the suitable containers for a unit to be updated is
							// the containers where is already installed
							for (InstalledUnit iUnit : installedUnitList) {
								// If in the list of installed units there exist the
								// same unit in any version, there can be updated
								if (iUnit.getUnitName().equals(unitName)){
									suitableContainers = new String[iUnit
											.getContainerArray().length];
									for (int i = 0; i < iUnit.getContainerArray().length; i++) {
										suitableContainers[i] = iUnit
												.getContainerArray()[i];
									}
								}
							}
						}
						// units to install
						else {
							suitableContainers = browser.getSuitableContainers(group);
							// The suitable containers for a unit to be installed
							// are the ones according to the constraints plus the
							// ones in which the unit with same version is not
							// installed
							for (InstalledUnit iUnit : installedUnitList) {
								if (group.getUnits().get(0).getName().equals(iUnit.getUnitName())&& group.getUnits().get(0).getVersion()
												.equals(iUnit.getUnitVersion())) {
									List<String> suitableContainersList = Arrays.asList(suitableContainers);
									List<String> suitableContainersListAux = new ArrayList<String>();
									for (int i = 0; i < suitableContainersList.size(); i++) {
										boolean alreadyInstalled = false;
										for (int j = 0; j < iUnit.getContainerArray().length; j++) {
											if (iUnit.getContainerArray()[j].equals(suitableContainersList.get(i))) {
												alreadyInstalled = true;
												break;
											}
										}
										if (alreadyInstalled == false)
											suitableContainersListAux
													.add(suitableContainersList
															.get(i));
									}
									suitableContainers = suitableContainersListAux
											.toArray(new String[suitableContainersListAux
													.size()]);
								}
							}
						}
					}

					/*
					 * Apart from the suitable containers according to the
					 * constraints, it is necessary to reject the containers where
					 * the unit to update is not installed (it cannot be updated)
					 */
					// if there is no suitable container, show a message error
					// FIXME adapt to the error page. Internationalization
					if (suitableContainers.length == 0
							&& group.getUnits().get(0).getName().equals(unitName)) {
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
								+ groupUnits;
								
						if (constraintString != null && !constraintString.equals("")){
							this.errorMessage = this.errorMessage 
								+ "\r\n\r\nand with the "
								+ "following constraints"
								+ constraintString;
							
						}
						logger.severe(this.errorMessage);
						if (constraintString.equals("")){
							String[] args = { groupUnits, "'Non defined constraint in the descriptor'" };
							ErrorUtils.createMessageError(context,
									"running.error.noSuitableContaierForUpdate", args);
							throw new Exception();
						}else{
							String[] args = { groupUnits, constraintString };
							ErrorUtils.createMessageError(context,
									"running.error.noSuitableContaierForUpdate", args);
							throw new Exception();
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
				context.getFlowScope().put(Constants.FLOW_INSTALLED_UNITS, installedUnitList);
				context.getFlowScope().put(Constants.FLOW_CONTAINERS, containerNamesArray);
				System.out.println("______________ Saliendo de findTargetContainers " + Calendar.getInstance().getTime().toString());
				Calendar findTargetContainers2 = Calendar.getInstance();
				Utils.getTimeOfExecution(findTargetContainers1, findTargetContainers2, "Time in executing findTargetContainers: ");
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
		
		Calendar map1 = Calendar.getInstance();
		String lock = "map_lock";
		boolean ok = false;
		synchronized (lock) {
			String environmentName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_ENV);
			DeploymentTargetType environment = this.envManager
					.getEnvironment(environmentName);
		DependencyGraph graph = this.common.getDependencyGraph(context, environment
					.getName());
			PlanContextBrowser browser = new PlanContextBrowser(environment, graph);

			logger.fine("Starting Mapping");
			String stActionsToDo = context.getRequestParameters()
					.get("actionsToDo");
			if (stActionsToDo == null || stActionsToDo.equals("")) {
				ErrorUtils.createMessageError(context,
						"running.error.noSelectedContainer", null);
				throw new Exception();
			}
			// Check if the selected unit to operate with has been assigned to a container
			DeploymentGroup dgOfTargetUnitSelected = groups[groups.length - 1];
			String selectedUnitName = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_UNIT_NAME);
			String selectedUnitVersion = (String) context.getFlowScope().get(
					Constants.FLOW_SELECTED_UNIT_VERSION);
			if (dgOfTargetUnitSelected.getUnits().size() > 1)
				throw new Exception(
						"The updating of a unit in a group with more than one unit is not implemented yet");
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
			// check if they are less because come of the units are already
			// installed
			String[] actionsToDoArray = stActionsToDo.split(",");
			List<InstalledUnit> installedUnitList = (List<InstalledUnit>) context
					.getFlowScope().get(Constants.FLOW_INSTALLED_UNITS);
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

			// TODO TODO TODO TODO TODO necessary to check if there is going to be
			// updated more than one
			// version of a unit
			String[] aActionsToDo = stActionsToDo.split(",");
			// FIXME para que es esto del if?
			if (context.getFlowScope().get(Constants.FLOW_CONTAINER_GRAPH) != null)
				context.getFlowScope().put(Constants.FLOW_CONTAINER_GRAPH, null);
			for (int i = 0; i < aActionsToDo.length; i++) {
				String[] actioni = aActionsToDo[i].split("\\|");
				int g = Integer.parseInt(actioni[0]);
				DeploymentGroup group = groups[g];
				String containeri = actioni[1];
				if (group.equals(dgOfTargetUnitSelected)) {
					try {
						// TODO We suppose that there is only a unit version
						// at a time but we are not restricting it programmatically
						HttpServletRequest request = (HttpServletRequest) context
								.getExternalContext().getNativeRequest();
						// FIXME considera unicamente una version, como si no
						// pudiera haber mas
						String containerList = (String) context.getFlowScope().get(
								Constants.FLOW_CONTAINER_GRAPH);
						String containerGraphList = "";
						if (containerList == null || containerList.equals(""))
							containerGraphList = containeri;
						else
							containerGraphList = containerList + "|" + containeri;
						String previousVersion = this.common.getPreviousUnitVersion(containeri,
								installedUnitList);
						String xmlDependencyGraph = this.common.getXMLDependencyGraphURL(
								request, selectedUnitName, previousVersion,
								environmentName, containerGraphList);
						context.getFlowScope().put("name", selectedUnitName);
						context.getFlowScope().put("version", previousVersion);
						context.getFlowScope().put("environment",
								environmentName);
						context.getFlowScope().put("xmlDependencyGraph",
								xmlDependencyGraph);
						// add the nodes to be updated so the graph of all of them
						// will be shown
						context.getFlowScope().put(Constants.FLOW_CONTAINER_GRAPH,
								containerGraphList);
						Map<DeploymentGroup, String> groupsToContainer = this
								.common.assignGroupToContainer(group, containeri, false,
										context, browser);
						context.getFlowScope().put(
								Constants.FLOW_GROUPS_TO_CONTAINER,
								groupsToContainer);

					} catch (Exception e) {
						e.printStackTrace();
						return false;
					}
				} else {
					// These operations are of installation
					Map<DeploymentGroup, String> groupsToContainer = this.common
							.assignGroupToContainerForInstall(group, containeri,
									false, context, browser);
					context.getFlowScope().put(
							Constants.FLOW_GROUPS_TO_CONTAINER_FOR_INSTALL,
							groupsToContainer);
				}
			}
			logger.fine("Mapped everything OK");
			Calendar map2 = Calendar.getInstance();
			Utils.getTimeOfExecution(map1, map2, "Time of executing map: ");
			ok = this.common.validatePlan(context, environment, graph);
	
		}
		lock = null;
		return ok;
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

	public void selectUnit(RequestContext context,
			String planNameUniq) throws Exception {
		
		this.common.selectUnit(context, planNameUniq);
	}
	
	public void initialize(RequestContext context) {

		logger.fine("Initializing at UpdatePlanCreationManager.");
		context.getFlowScope().put(Constants.FLOW_OPERATION_FLOW, Constants.FLOW_OPERATION_UPDATE);
	}

	/**
	 * Gets the environment names existing in the system
	 * @param context
	 */
	public void getEnvironments(RequestContext context) {

		this.common.getEnvironments(context);
	}

	/**
	 * Introduces the selected environment name in the flow
	 * Introduces the unique plan name (name + environmentname + date) in the flow
	 * Introduces the container names array in the flow
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public String selectEnvironment(RequestContext context) throws Exception {
		
		return this.common.selectEnvironment(context);
	}
	
	/**
	 * 
	 * @param context
	 * @return
	 */
	
	public void findListDeploymentUnitsPaginated(RequestContext context){
		
		this.common.findListDeploymentUnitsPaginated(context);
	}

	private String parseMessageError(MessageContext messageContext) {
		// messageContext.addMessage(new
		// MessageBuilder().error().code("theCode")
		// .defaultText("Message text")
		// .build());
		return this.errorMessage;
	}

	public Event savePlan(RequestContext context, String planNameUniq)
			throws Exception {

		return this.common.savePlan(context, planNameUniq);
	}
	
	public EnvironmentManagerCore getEnvManager() {
		return envManager;
	}

	public void setEnvManager(EnvironmentManagerCore envManager) {
		this.envManager = envManager;
	}

	public void setCommon(CommonCreationManager common) {
		this.common = common;
	}
}
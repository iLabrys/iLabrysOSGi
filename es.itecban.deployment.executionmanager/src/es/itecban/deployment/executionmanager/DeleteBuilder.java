package es.itecban.deployment.executionmanager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.elements.DeploymentUnit;
import es.itecban.deployment.executionmanager.elements.UnresolvedResource;
import es.itecban.deployment.executionmanager.utils.ExpressionResolver;
import es.itecban.deployment.executionmanager.utils.PlanContextBrowser;
import es.itecban.deployment.model.dependency.graph.Dependency;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.dependency.graph.Node;
import es.itecban.deployment.model.deployment.plan.ActivitiesType;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType;
import es.itecban.deployment.model.deployment.plan.ConfigurationType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.InitialConfigurationType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.ResourceConfigurationType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;

public class DeleteBuilder {

	final private String SEPARATOR = "#";
	final private String CONFIGURABLE_RESOURCE = "es.itecban.configuration.resource";

	private boolean preConfigure;
	private String name;
	private DeploymentTargetType environment;
	private DependencyGraph graph;
	private DeploymentPlanType plan;
	private PlanContextBrowser browser;
	private ExpressionResolver resolver;
	private Map<DeploymentGroup, String> groupsToContainer;
	private Map<ContainerType, List<ResourceType>> configurableContainerResources;
	private Map<ContainerType, List<PropertyType>> configurableContainerProperties;
	private Map<DeploymentUnitType, List<ResourceType>> configurableUnitResources;
	// TODO do the following for unresolved properties
	private List<UnresolvedResource> unresolvedContainerResources;
	private List<UnresolvedResource> unresolvedUnitResources;

	// int for assigning the id of the activities
	private int activityIndex;
	
	private static Logger logger = Logger
	.getLogger("es.itecban.deployment.executionmanager");

	static {
			logger.setLevel(Level.ALL);
	}
	
	public DeleteBuilder(String name,
			DeploymentTargetType environment, DependencyGraph graph,
			boolean preConfigure) {
		// Set parameters
		// If name is null set a default name
		if (name == null) {
			// mjb: put the date in a correct format
			this.name = environment.getName()
					+ Calendar.getInstance().getTimeInMillis();
		} else {
			this.name = name;
		}
		this.environment = environment;
		this.graph = graph;
		this.initPlan();
		this.browser = new PlanContextBrowser(environment, graph);
		this.resolver = new ExpressionResolver(browser);
		activityIndex = 1;
		// Check if the plan will have independent configuration activities
		// or it will use installation activities as configuration
		this.preConfigure = preConfigure;
		this.initMappings();
	}
	
	private void initPlan() {
		// Create plan
		plan = PlanFactory.eINSTANCE.createDeploymentPlanType();
		// Set plan name
		plan.setName(name);
		// Set environment
		plan.setEnvironment(environment.getName());
		try {
			// Set schedule
			ScheduleType schedule = PlanFactory.eINSTANCE.createScheduleType();
			plan.setScheduleData(schedule);
			GregorianCalendar creationDate = new GregorianCalendar();
			XMLGregorianCalendar creationXMLDate;
			creationXMLDate = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(creationDate);
			schedule.setCreationDate(creationXMLDate);
		} catch (DatatypeConfigurationException e) {
			logger.severe("Error creating the schedule for the plan: "
					+ this.name);
		}
		// Set activities
		ActivitiesType activities = PlanFactory.eINSTANCE
				.createActivitiesType();
		plan.setActivities(activities);
	}

	private void initMappings() {
		// Init the mappings
		initGroupsToContainerMap();
		initConfigurableUnitResourcesMap();
		unresolvedUnitResources = new ArrayList<UnresolvedResource>();
		initConfigurableContainerResourcesMap();
		initConfigurableContainerPropertiesMap();

	}
	
	private void initGroupsToContainerMap() {
		// Create the empty map
		this.groupsToContainer = new HashMap<DeploymentGroup, String>();
		// Obtain the groups
		DependencyGroupProcessor groupProcessor = new DependencyGroupProcessor(
				this.graph);
		DeploymentGroup[] groups = groupProcessor.getGroups();
		// Fill it with the groups to be installed
		for (DeploymentGroup dg : groups) {
			groupsToContainer.put(dg, null);
		}
	}

	private void initConfigurableUnitResourcesMap() {
		// Create the empty map
		this.configurableUnitResources = new HashMap<DeploymentUnitType, List<ResourceType>>();
		// Put the configurable units in the map
		// Iterate the units of the graph
		List<Node> nodes = graph.getNode();
		for (Iterator<Node> nodeIterator = nodes.iterator(); nodeIterator
				.hasNext();) {
			Node node = (Node) nodeIterator.next();
			DeploymentUnitType unit = node.getUnit();
			// Iterate the resources of each unit and put the configurable ones
			// in a list
			List<ResourceType> resources = unit.getExportedResources()
					.getExportedResource();
			List<ResourceType> configurableResources = UnitFactory.eINSTANCE
					.createExportedResourcesType().getExportedResource();
			for (Iterator<ResourceType> resourceIterator = resources.iterator(); resourceIterator
					.hasNext();) {
				ResourceType resource = (ResourceType) resourceIterator.next();
				// If the resource is configurable add the resource to the
				// configurable resources list
				// Iterate the resource types
				List<String> types = resource.getTypes().getType();
				for (Iterator<String> typesIterator = types.iterator(); typesIterator
						.hasNext();) {
					String type = (String) typesIterator.next();
					if (type.equals(CONFIGURABLE_RESOURCE)) {
						configurableResources.add(resource);
					}
				}
			}
			// If there is any configurable resource and the unit isn't already
			// in the map put it
			if (!this.configurableUnitResources.containsKey(unit)
					&& configurableResources.size() > 0) {
				this.configurableUnitResources.put(unit, configurableResources);
			}
		}
	}

	private void initConfigurableContainerResourcesMap() {
		// Create the empty map
		this.configurableContainerResources = new HashMap<ContainerType, List<ResourceType>>();
		// TODO to be implemented
	}

	private void initConfigurableContainerPropertiesMap() {
		// Create the empty map
		this.configurableContainerProperties = new HashMap<ContainerType, List<PropertyType>>();
		// TODO to be implemented
	}
	
	public boolean buildPlan() {
		// Create the activities
		if (!createActivities()) {
			logger.severe("Error creating the activities for the plan: "
					+ this.name);
			logger.info("Building plan: " + this.name + " : FAIL");
			return false;
		}
		// Check if all the dependencies have been satisfied
		if (!setActivityDependencies()) {
			logger.severe("Error setting the dependencies for the plan: "
					+ this.name);
			logger.info("Building plan: " + this.name + " : FAIL");
			return false;
		}
		// Perform the configuration
		if (preConfigure) {
			if (!performPreConfActivityConfiguration()) {
				logger
						.severe("Error performing the preconfiguration for the plan: "
								+ this.name);
				logger.info("Building plan: " + this.name + " : FAIL");
				return false;
			}
		} else {
			if (!performActivityConfiguration()) {
				logger
						.severe("Error performing the configuration for the plan: "
								+ this.name);
				logger.info("Building plan: " + this.name + " : FAIL");
				return false;
			}
		}
		// Set plan last modification date
		try {
			GregorianCalendar lastModificationDate = new GregorianCalendar();
			XMLGregorianCalendar lastModificationXMLDate = DatatypeFactory
					.newInstance()
					.newXMLGregorianCalendar(lastModificationDate);
			this.plan.getScheduleData().setLastModificationDate(
					lastModificationXMLDate);
		} catch (DatatypeConfigurationException e) {
			logger
					.severe("Error setting the last modification date for the plan: "
							+ this.name);
			logger.info("Building plan: " + this.name + " : FAIL");
		}
		// Set plan status to CREATING
		plan.setPlanStatus("CREATING");
		logger.info("Building plan: " + this.name + " : SUCCESS");
		return true;
	}
	
	private boolean performActivityConfiguration() {
		// TODO other configuration types
		logger.info("Performing configuration");
		// Repeat until no properties have been resolved in an iteration
		boolean propertiesResolved = true;
		while (propertiesResolved == true) {
			// Set propertiesResolved to false
			propertiesResolved = false;
			// Iterate configurable activities
			List<ActivityType> activities = plan.getActivities().getActivity();
			for (Iterator<ActivityType> activityIterator = activities
					.iterator(); activityIterator.hasNext();) {
				ActivityType activity = (ActivityType) activityIterator.next();
				// Check if the activity is a configuration activity
				if (activity instanceof ConfigurationActivityType) {
					ConfigurationActivityType configurationActivity = (ConfigurationActivityType) activity;
					List<PropertyType> configurationProperties = configurationActivity
							.getConfiguration().getProperty();
					String target = configurationActivity.getTarget();
					logger.info("Configuring activity with target" + target);
					// If the type is CONFIGURE UNIT RESOURCE
					if (configurationActivity
							.getType()
							.equals(
									ConfigurationActivityKindType.CONFIGUREUNITRESOURCE)) {
						String unitName = target.split("\\" + SEPARATOR)[3];
						logger.info("Configuring unit " + unitName);
						// Get the configurable unit
						Set<DeploymentUnitType> unitSet = configurableUnitResources
								.keySet();
						DeploymentUnitType dUnit = null;
						for (Iterator<DeploymentUnitType> unitIterator = unitSet
								.iterator(); unitIterator.hasNext();) {
							DeploymentUnitType tempDUnit = (DeploymentUnitType) unitIterator
									.next();
							if (unitName.equals(tempDUnit.getName())) {
								dUnit = tempDUnit;
							}
						}
						// Check if the unit has been found
						if (dUnit == null) {
							logger.severe("Deployment unit " + unitName
									+ " is not a configurable one");
							logger.severe("Configuring unit " + unitName
									+ " : FAIL");
							logger.severe("Configuring activity with target"
									+ target + " : FAIL");
							logger.severe("Performing configuration: FAIL");
							return false;
						}
						// Get the list of configurable resources
						List<ResourceType> resources = configurableUnitResources
								.get(dUnit);
						// Iterate the resources
						for (Iterator<ResourceType> resourceIterator = resources
								.iterator(); resourceIterator.hasNext();) {
							ResourceType resource = (ResourceType) resourceIterator
									.next();
							// Get the property that specifies the configuration
							// source
							String source = resolver
									.getConfigurationSource(resource);
							// Check if its the resource configurable by this
							// activity
							if (resource.getName().equals(
									target.split("\\" + SEPARATOR)[4])) {
								// Create an empty map of unresolved properties
								Map<String, String> unresolvedProperties = new HashMap<String, String>();
								// Iterate the resource properties
								List<PropertyType> properties = resource
										.getResourceProperties()
										.getResourceProperty();
								for (Iterator<PropertyType> propertyIterator = properties
										.iterator(); propertyIterator.hasNext();) {
									PropertyType property = (PropertyType) propertyIterator
											.next();
									// Check if the property is configurable
									if (property.getValue().contains("${")) {
										// If it can be resolved, remove it from
										// the list
										logger.info("Configuring property "
												+ property.getName()
												+ " with value "
												+ property.getValue());
										String resolvedValue = resolver
												.resolveExpression(property
														.getValue(), target,
														source);
										if (resolvedValue != null) {
											if (!resolvedValue.equals(property
													.getValue())) {
												property
														.setValue(resolvedValue);
												logger
														.info("Configuring property "
																+ property
																		.getName()
																+ " with value "
																+ property
																		.getValue()
																+ " : SUCCESS");
												// Add it to the activity
												configurationProperties
														.add(property);
												// Set propertiesResolved to
												// true
												propertiesResolved = true;
											} else {
												// Add the property to the map
												// of unresolved properties
												unresolvedProperties.put(
														property.getName(),
														property.getValue());
												logger
														.info("Configuring property "
																+ property
																		.getName()
																+ " with value "
																+ property
																		.getValue()
																+ " : Dependency needed : FAIL");
											}
										} else {
											// The property is not configurable
											logger
													.severe("Performing configuration: FAIL");
											return false;
										}
									}
								}
								// Create a new configurable resource
								UnresolvedResource confRes = new UnresolvedResource(
										dUnit.getName(), dUnit.getVersion(),
										resource.getName(),
										unresolvedProperties);
								// If the unresolved properties map is not
								// empty, add it to the list of unresolved unit
								// resource
								if (unresolvedProperties.size() != 0) {
									// Add the configurable resource to the list
									// of unresolved unit resources
									// Check if the list already contains that
									// resource
									// Iterate the resources
									for (Iterator<UnresolvedResource> iterator = unresolvedUnitResources
											.iterator(); iterator.hasNext();) {
										UnresolvedResource tempConfRes = (UnresolvedResource) iterator
												.next();
										// If already contains it, first remove
										// the old one
										if (tempConfRes.equals(confRes)) {
											unresolvedUnitResources
													.remove(tempConfRes);
											break;
										}
									}
									// Add it
									unresolvedUnitResources.add(confRes);
								}
								// If the unresolved properties map is empty,
								// check if it in the unresolved unit resources
								// map, and, if it is, remove it
								else {
									// Iterate the resources
									for (Iterator<UnresolvedResource> iterator = unresolvedUnitResources
											.iterator(); iterator.hasNext();) {
										UnresolvedResource tempConfRes = (UnresolvedResource) iterator
												.next();
										// If already contains it, remove it
										if (tempConfRes.equals(confRes)) {
											unresolvedUnitResources
													.remove(tempConfRes);
											break;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		logger.info("Performing configuration: SUCCESS");
		return true;
	}

	private boolean performPreConfActivityConfiguration() {
		logger.info("Performing unit resource configuration");
		// True if all the properties for a given have been resolved
		boolean propertiesResolved = true;
		// True if a resource have been completely resolved
		boolean resourcesResolved = true;
		// Repeat until no resources have been resolved in an iteration
		while (propertiesResolved == true) {
			// Set resourcesResolved to false
			resourcesResolved = false;
			// Set propertiesResolved to false
			propertiesResolved = false;
			// Iterate configurable activities
			List<ActivityType> activities = plan.getActivities().getActivity();
			for (Iterator<ActivityType> activityIterator = activities
					.iterator(); activityIterator.hasNext();) {
				DeploymentActivityType activity = (DeploymentActivityType) activityIterator
						.next();
				// Check if the activity is a configuration activity
				if (activity.getType() == DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT
						&& (activity.getInitialConfiguration() != null)
						&& !activity.getInitialConfiguration()
								.getConfiguration().isEmpty()) {
					String unitName = activity.getUnitName();
					logger.info("Configuring activity for unit" + unitName);
					// Iterate ResourceConfigurations
					List<ResourceConfigurationType> resConfs = activity
							.getInitialConfiguration().getConfiguration();
					for (ResourceConfigurationType resourceConf : resConfs) {
						String resName = resourceConf.getName();
						logger.info("Configuring activity for resource"
								+ resName);
						List<PropertyType> confProperties = resourceConf
								.getConfigurationProperties()
								.getConfigurationProperties();
						// Get the configurable unit
						Set<DeploymentUnitType> unitSet = configurableUnitResources
								.keySet();
						DeploymentUnitType dUnit = null;
						for (Iterator<DeploymentUnitType> unitIterator = unitSet
								.iterator(); unitIterator.hasNext();) {
							DeploymentUnitType tempDUnit = (DeploymentUnitType) unitIterator
									.next();
							if (unitName.equals(tempDUnit.getName())) {
								dUnit = tempDUnit;
							}
						}
						// Check if the unit has been found
						if (dUnit == null) {
							logger.severe("Deployment unit " + unitName
									+ " is not a configurable one");
							logger.severe("Configuring unit " + unitName
									+ " : FAIL");
							logger.severe("Performing configuration: FAIL");
							return false;
						}
						// Get the list of configurable resources
						List<ResourceType> resources = configurableUnitResources
								.get(dUnit);
						// Iterate the resources
						for (Iterator<ResourceType> resourceIterator = resources
								.iterator(); resourceIterator.hasNext();) {
							ResourceType resource = (ResourceType) resourceIterator
									.next();
							// Get the property that specifies the configuration
							// source
							String source = resolver
									.getConfigurationSource(resource);
							// Check if its the resource configurable by this
							// activity
							if (resource.getName().equals(resName)) {
								// Create an empty map of unresolved properties
								Map<String, String> unresolvedProperties = new HashMap<String, String>();
								// Iterate the resource properties
								List<PropertyType> properties = resource
										.getResourceProperties()
										.getResourceProperty();
								for (Iterator<PropertyType> propertyIterator = properties
										.iterator(); propertyIterator.hasNext();) {
									PropertyType property = (PropertyType) propertyIterator
											.next();
									// Check if the property is configurable
									if (property.getValue().contains("${")) {
										// If it can be resolved, remove it from
										// the list
										logger.info("Configuring property "
												+ property.getName()
												+ " with value "
												+ property.getValue());
										// Create the target string for the
										// resolver
										String target = activity.getTarget()
												+ SEPARATOR + dUnit.getName()
												+ SEPARATOR + resName
												+ SEPARATOR
												+ property.getName();
										String resolvedValue = resolver
												.resolveExpression(property
														.getValue(), target,
														source);
										if (resolvedValue != null) {
											if (!resolvedValue.equals(property
													.getValue())) {
												property
														.setValue(resolvedValue);
												logger
														.info("Configuring property "
																+ property
																		.getName()
																+ " with value "
																+ property
																		.getValue()
																+ " : SUCCESS");
												// Add it to the activity
												confProperties.add(property);
												// Set propertiesResolved to
												// true
												propertiesResolved = true;

											} else {
												// Add the property to the map
												// of unresolved properties
												unresolvedProperties.put(
														property.getName(),
														property.getValue());
												logger
														.info("Configuring property "
																+ property
																		.getName()
																+ " with value "
																+ property
																		.getValue()
																+ " : Dependency needed : FAIL");
											}
										} else {
											// The property is not configurable
											logger
													.severe("Performing configuration: FAIL");
											return false;
										}
									}
								}
								// Create a new configurable resource
								UnresolvedResource confRes = new UnresolvedResource(
										dUnit.getName(), dUnit.getVersion(),
										resource.getName(),
										unresolvedProperties);
								// If the unresolved properties map is not
								// empty, add it to the list of unresolved unit
								// resource
								if (unresolvedProperties.size() != 0) {
									// Add the configurable resource to the list
									// of unresolved unit resources
									// Check if the list already contains that
									// resource
									// Iterate the resources
									for (Iterator<UnresolvedResource> iterator = unresolvedUnitResources
											.iterator(); iterator.hasNext();) {
										UnresolvedResource tempConfRes = (UnresolvedResource) iterator
												.next();
										// If already contains it, first remove
										// the old one
										if (tempConfRes.equals(confRes)) {
											unresolvedUnitResources
													.remove(tempConfRes);
											break;
										}
									}
									// Add it
									unresolvedUnitResources.add(confRes);
								}
								// If the unresolved properties map is empty,
								// check if it in the unresolved unit resources
								// map, and, if it is, remove it
								else {
									// Iterate the resources
									for (Iterator<UnresolvedResource> iterator = unresolvedUnitResources
											.iterator(); iterator.hasNext();) {
										UnresolvedResource tempConfRes = (UnresolvedResource) iterator
												.next();
										// If already contains it, remove it
										if (tempConfRes.equals(confRes)) {
											unresolvedUnitResources
													.remove(tempConfRes);
											break;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		logger.info("Performing configuration: SUCCESS");
		return true;
	}

	private boolean setActivityDependencies() {
		// Set the dependencies obtained from the graph
		logger.info("Setting dependencies for plan: " + plan.getName());
		List<ActivityType> activities = plan.getActivities().getActivity();
		List<Dependency> dependencies = graph.getDependency();
		// Iterate the dependencies
		for (Iterator<Dependency> dependencyIterator = dependencies.iterator(); dependencyIterator
				.hasNext();) {
			Dependency dependency = (Dependency) dependencyIterator.next();
			// Get the source and destination nodes
			Node sourceNode = dependency.getSource();
			Node destinationNode = dependency.getDestination();
			// Get the deployment unit info from the source and destination
			DeploymentUnitType sourceUnit = sourceNode.getUnit();
			DeploymentUnitType destinationUnit = destinationNode.getUnit();
			// Get the id of the destination activity
			List<Integer> activitiesID = new ArrayList<Integer>();
			for (Iterator<ActivityType> activityIterator = activities
					.iterator(); activityIterator.hasNext();) {
				ActivityType activity = activityIterator.next();
				// Check if the activity is a deployment activity
				if (activity instanceof DeploymentActivityType) {
					DeploymentActivityType deploymentActivity = (DeploymentActivityType) activity;
					// Get the deployment unit info from the activity
					String unitName = deploymentActivity.getUnitName();
					String unitVersion = deploymentActivity.getUnitVersion();
					// If the deployment unit is the same get the id
					if (unitName.equals(destinationUnit.getName())
							&& unitVersion.equals(destinationUnit.getVersion())) {
						activitiesID.add(new Integer(deploymentActivity
								.getActivityId()));
					}
				}
			}
			// Get the source activity
			ActivityType activity = null;
			// Iterate plan deployment activities
			for (Iterator<ActivityType> activityIterator = activities
					.iterator(); activityIterator.hasNext();) {
				ActivityType tempActivity = activityIterator.next();
				// Check if the activity is a deployment activity
				if (tempActivity instanceof DeploymentActivityType) {
					DeploymentActivityType tempDeploymentActivity = (DeploymentActivityType) tempActivity;
					// Get the deployment unit info from the activity
					String unitName = tempDeploymentActivity.getUnitName();
					String unitVersion = tempDeploymentActivity
							.getUnitVersion();
					// If the deployment unit is the same get the activity
					if (unitName.equals(sourceUnit.getName())
							&& unitVersion.equals(sourceUnit.getVersion())) {
						activity = tempDeploymentActivity;
					}
				}
			}
			// If the source activity exists, set the dependencies
			if (activity != null) {
				logger.info("Setting dependencies for plan: " + plan.getName()
						+ " regarding deployment unit " + sourceUnit.getName());
				activity.getDependency().addAll(activitiesID);
			}
		}
		logger.info("Setting dependencies for plan: " + plan.getName()
				+ " : SUCCESS");
		return true;
	}
	
	private boolean createActivities() {
		// Create the activities for every group and check if it has been set
		// Sets the automatic dependencies (uninstall -> configure -> stop)
		Set<DeploymentGroup> deploymentGroups = groupsToContainer.keySet();
loop:	for (DeploymentGroup deploymentGroup : deploymentGroups) {
			String containerName = groupsToContainer.get(deploymentGroup);
			// Return false if a group has not been assigned to a container
			if (containerName == null || containerName.equalsIgnoreCase("")) {
				logger.fine("This group has not assigned a container. This unit must be already installed in the environment");
				continue loop;
//				logger
//						.severe("At least one group has not been assigned to a container");
//				logger.info("Validating plan: " + plan.getName() + " : FAIL");
//				return false;
			}
			// There can be more than one container assigned to a group
			String[] assignedContainerArray = containerName.split("\\|");
			// Look for the node with the desired container in the environment
			// Iterate nodes
			List<NodeType> nodesList = environment.getNodes().getNode();
			// Do for all the containers assigned to the group
			for (int i = 0 ; i < assignedContainerArray.length ; i++){
				for (Iterator<NodeType> nodeIterator = nodesList.iterator(); nodeIterator
						.hasNext();) {
					ContainerType container = null;
					NodeType tempNode = (NodeType) nodeIterator.next();
					// Iterate containers
					List<ContainerType> containersList = tempNode
						.getNodeContainers().getNodeContainer();
				
					for (Iterator<ContainerType> containerIterator = containersList
							.iterator(); containerIterator.hasNext();) {
						ContainerType tempContainer = (ContainerType) containerIterator
								.next();
						if (tempContainer.getName().equals(assignedContainerArray[i])) {
							logger
									.info("Creating activities for a group uninstall to the container "
											+ assignedContainerArray[i] + " : Container found");
							container = tempContainer;
						}
					}
					// If the container exists create the activities
					if (container != null) {
						// Create an installation deployment activity for each unit
						// in this group
						List<DeploymentUnit> units = deploymentGroup.getUnits();
						// Iterate the units
						for (Iterator<DeploymentUnit> unitIterator = units
								.iterator(); unitIterator.hasNext();) {
							DeploymentUnit deploymentUnit = (DeploymentUnit) unitIterator
									.next();
							// Check if the unit is already in the container
							// if (!browser.isUnitInContainer(container,
							// deploymentUnit.getName(),
							// deploymentUnit.getVersion())) {
							// the old will be like the folling call:
							// if (!browser.isUnitInContainer(container,
							// unitPackage[0], unitPackege[1])) {
							// mjb: search for the name of the package, not the unit
							// name, to compare
							// with the units name
							String[] unitPackage = this.getUnitPackage(
									deploymentUnit.getName(), deploymentUnit
											.getVersion());
//							if (!browser.isUnitInContainer(container, unitPackage[0],
//									unitPackage[1])) {
								// Create the activities
								// Create the installation activity
								logger
										.info("Creating a UNINSTALL deployment activity for unit "
												+ deploymentUnit.getName()
												+ " in container " + assignedContainerArray[i]);
								DeploymentActivityType uninstallActivity = PlanFactory.eINSTANCE
										.createDeploymentActivityType();
								uninstallActivity.setActivityId(activityIndex);
								activityIndex++;
								uninstallActivity.setTarget(environment.getName()
										+ SEPARATOR + tempNode.getName()
										+ SEPARATOR + container.getName());
								uninstallActivity
										.setType(DeploymentActivityKindType.STOPDEPLOYMENTUNIT);
								uninstallActivity.setUnitName(deploymentUnit
										.getName());
								uninstallActivity.setUnitVersion(deploymentUnit
										.getVersion());
								// Create the stop activity
								logger
										.info("Creating a STOP deployment activity for unit "
												+ deploymentUnit.getName()
												+ " in container " + assignedContainerArray[i]);
								DeploymentActivityType stopActivity = PlanFactory.eINSTANCE
										.createDeploymentActivityType();
								stopActivity.setActivityId(activityIndex);
								activityIndex++;
								stopActivity.setTarget(environment.getName()
										+ SEPARATOR + tempNode.getName()
										+ SEPARATOR + container.getName());
								stopActivity
										.setType(DeploymentActivityKindType.UNINSTALLDEPLOYMENTUNIT);
								stopActivity.setUnitName(deploymentUnit.getName());
								stopActivity.setUnitVersion(deploymentUnit
										.getVersion());
								// Create the dependency between the two activities
								stopActivity.getDependency().add(
										uninstallActivity.getActivityId());
								// Add the activity to the activities list
								plan.getActivities().getActivity().add(
										uninstallActivity);
								plan.getActivities().getActivity().add(
										stopActivity);
								// If the unit is configurable create an empty
								// configuration activity
								DeploymentUnitType configurableUnit = isConfigurable(deploymentUnit);
								if (configurableUnit != null) {
									// Check the type of configuration activities
									// for this plan
									if (!preConfigure) {
										// Independent configuration activities
										// Create an activity for each configurable
										// resource
										List<ResourceType> resources = configurableUnitResources
												.get(configurableUnit);
										// Iterate the resources
										for (Iterator<ResourceType> resourceIterator = resources
												.iterator(); resourceIterator
												.hasNext();) {
											ResourceType resource = (ResourceType) resourceIterator
													.next();
											logger
													.info("Creating a UNITRESOURCE configuration activity for unit "
															+ deploymentUnit
																	.getName()
															+ "with resource"
															+ resource
															+ " in container "
															+ assignedContainerArray[i]);
											ConfigurationActivityType configurationActivity = PlanFactory.eINSTANCE
													.createConfigurationActivityType();
											configurationActivity
													.setActivityId(activityIndex);
											activityIndex++;
											configurationActivity
													.setTarget(environment
															.getName()
															+ SEPARATOR
															+ tempNode.getName()
															+ SEPARATOR
															+ container.getName()
															+ SEPARATOR
															+ deploymentUnit
																	.getName()
															+ SEPARATOR
															+ resource.getName());
											configurationActivity
													.setType(ConfigurationActivityKindType.CONFIGUREUNITRESOURCE);
											// Create the configuration
											ConfigurationType configuration = PlanFactory.eINSTANCE
													.createConfigurationType();
											configurationActivity
													.setConfiguration(configuration);
											// Set the dependencies of the configure
											// and
											// start activities
											configurationActivity
													.getDependency()
													.add(
															uninstallActivity
																	.getActivityId());
											stopActivity.getDependency().add(
													configurationActivity
															.getActivityId());
											// Add the activity to the plan
											plan.getActivities().getActivity().add(
													configurationActivity);
										}
									} else {
										// Installation activities with built-in
										// configuration
										// Add the initialConfiguration to the
										// install activity
										InitialConfigurationType initConf = PlanFactory.eINSTANCE
												.createInitialConfigurationType();
										List<ResourceConfigurationType> resConfs = initConf
												.getConfiguration();
										uninstallActivity
												.setInitialConfiguration(initConf);
										// Add a property to the installation
										// activity for each
										// configurable resource
										List<ResourceType> resources = configurableUnitResources
												.get(configurableUnit);
										// Iterate the resources
										for (Iterator<ResourceType> resourceIterator = resources
												.iterator(); resourceIterator
												.hasNext();) {
											ResourceType resource = (ResourceType) resourceIterator
													.next();
											logger
													.info("Adding a UNITRESOURCE configuration to a uninstall activity for unit "
															+ deploymentUnit
																	.getName()
															+ "with resource"
															+ resource
															+ " in container "
															+ assignedContainerArray[i]);
											// Create a resourceConfigurationType
											// for each resource
											ResourceConfigurationType resConf = PlanFactory.eINSTANCE
													.createResourceConfigurationType();
											resConf.setName(resource.getName());
											ConfigurationPropertiesType confProps = PlanFactory.eINSTANCE
													.createConfigurationPropertiesType();
											resConf
													.setConfigurationProperties(confProps);
											resConfs.add(resConf);

										}
									}
								}
//							} else {
//								logger.info("Unit " + deploymentUnit.getName()
//										+ " already in container " + containerName);
//							}
						}
						break;
					}
				}
			}
		}
		// If everything has worked return true
		return true;
	}
	
	/**
	 * Gets the packageType of a unit existing in the graph of the plan. This is
	 * necessary to check if the unit is already deployed in the environment
	 * 
	 * @param unitName
	 * @param unitVersion
	 * @return
	 */
	// mjb
	private String[] getUnitPackage(String unitName, String unitVersion) {

		List<Node> nodeList = this.graph.getNode();
		for (Node node : nodeList) {
			DeploymentUnitType unitType = node.getUnit();
			if (unitType.getName().equals(unitName)
					&& unitType.getVersion().equals(unitVersion)) {
				// FIXME: no getpackage
				String[] name_version = { unitType.getPackage().getName(),
						unitType.getPackage().getVersion() };
				return name_version;
			}
		}
		return null;
	}
	
	private DeploymentUnitType isConfigurable(DeploymentUnit unit) {
		String unitName = unit.getName();
		String unitVersion = unit.getVersion();
		// Iterate the configurable units map
		Set<DeploymentUnitType> configurableUnits = configurableUnitResources
				.keySet();
		for (Iterator<DeploymentUnitType> setIterator = configurableUnits
				.iterator(); setIterator.hasNext();) {
			DeploymentUnitType configurableUnit = (DeploymentUnitType) setIterator
					.next();
			// If its the same unit return it
			if (configurableUnit.getName().equals(unitName)
					&& configurableUnit.getVersion().equals(unitVersion)) {
				return configurableUnit;
			}
		}
		// Else return null
		return null;
	}
	
	public boolean validatePlan() {
		logger.info("Validating plan: " + this.name);
		if (plan.getPlanStatus() == null) {
			logger.info("Building of the plan not yet performed");
			logger.info("Validating plan: " + this.name + " : FAIL");
			return false;
		} else if (unresolvedUnitResources.size() != 0) {
			logger
					.info("Some deployment unit resource properties have to be configured manually");
			logger.info("Validating plan: " + this.name + " : FAIL");
			return false;
		}
		// Set plan status to CREATED
		this.plan.setPlanStatus("CREATED");
		// Return true
		logger.info("Validating plan: " + this.name + " : SUCCESS");
		return true;
	}
	
	public void setGroupsToContainer(
			Map<DeploymentGroup, String> groupsToContainer) {
		this.groupsToContainer = groupsToContainer;
	}
	
	public DeploymentPlanType getPlan() {
		return this.plan;
	}
}

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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import es.itecban.deployment.environmentmanager.Constants;
import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.executionmanager.services.AddDataSourcePlanBuilder;
import es.itecban.deployment.executionmanager.utils.XMLUtils;
import es.itecban.deployment.model.deployment.plan.ActivitiesType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.TypesType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;

public class AddDataSourcePlanBuilderImpl implements AddDataSourcePlanBuilder {

	final private String SEPARATOR = "#";
	final private String RESOURCETYPE = "es.itecban.deployment.j2ee.jdbc.datasource";
	final private String DBTYPE = "es.itecban.deployment.container.db";
	
	private String name;
	private DeploymentTargetType environment;
	private ConfigurationProvider confProvider;
	private ContainerType datasourceContainer;
	private Properties datasourceConfiguration;
	private ContainerType dbmsContainer;
	private Properties dbmsConfiguration;
	private String dbmsVendor;
	private RuntimeUnitType database;
	private String databaseName;
	private DeploymentPlanType plan;

	private static Logger logger = Logger
			.getLogger("es.itecban.deployment.executionmanager");

	static {
		logger.setLevel(Level.ALL);
	}

	protected AddDataSourcePlanBuilderImpl(String name,
			DeploymentTargetType environment,
			ContainerType datasourceContainer,
			ConfigurationProvider confProvider) {
		// Set parameters
		// If name is null set a default name
		if (name == null) {
			this.name = environment.getName()
					+ Calendar.getInstance().getTimeInMillis();
		} else {
			this.name = name;
		}
		this.environment = environment;
		this.confProvider = confProvider;
		// Set the datasource container
		this.datasourceContainer = datasourceContainer;
		// Set the datasource container configuration
		this.datasourceConfiguration = this.getContainerProperties(datasourceContainer.getName());
		this.dbmsContainer = null;
		this.initPlan();
	}

	private void initPlan() {
		// Create plan
		plan = PlanFactory.eINSTANCE.createDeploymentPlanType();
		// Set plan name
		plan.setName(name);
		// Set environment
		plan.setEnvironment(environment.getName());
		logger.info("Creating add DataSource plan " + name + " in environment " + environment.getName());
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

	
	@Override
	public boolean buildPlan() {
		//          .ijjGDDEEEDLj;. 
		//        iGWWWW#####W#####Wfi 
		//     :tEKW#WW###############WG: 
		//   ;DW#WKWKW###################Et: 
		//   GKGWKKWW##W######K#############KGt 
		//  :EDLWWKW##WWW######WWW#############WKLDj  : 
		//  jKWKWW#######W######KW##################LWDiW, 
		//.LEEK########WWWW######WKW####################Ki 
		//;GKK#WW##ELjfW##WW#####WWWW###########WW########### 
		//tEKK###Wt   t#W#########WW#############W########### 
		//LKEDEG:   :E######f:,W#WW###########W#WW########## 
		//.;..i:   :L####Dj.   L####WW####WWW#WWW########### 
		//      ,jK##D:      i#####W###W#W#WWWK########### 
		//      tLW#E         ,G###WWW#WWWWWKKW########### 
		//      ,tj;            .jW#W#W#WWWKWKWW########## 
		//                        .tW#W#WWWWWWWWWWWW###### 
		//                          iWWWWWWWKKWWWWWW####W# 
		//                    ..    EW#WKWWWKKWWWWWW###### 
		//                ;tDDEW#Ki.WW#KWWWWWKKWWWW####### 
		//               .ifKEW####DEDDEEW###WWWWWW####### 
		//                 .itfDK##LfE###########WW####### 
		//                      :jfGW##################### 
		//                        ,:tfE################### 
		//                          ,:LW#W################ 
		//                            ;D################## 
		//                             .tKW#W############# 
		//                                WW####K######### 		
		logger.info("Building plan: " + this.name);
		// If the DBMS container has not been set yet return false
		if (this.dbmsContainer == null) {
			logger.info("To build a plan a DBMS has to be set first.");
			return false;
		}
		// If the database has not been set yet return false
		if (this.database == null) {
			logger.info("To build a plan a database has to be selected first.");
			return false;
		}
		// Create the ResourceActivity and add it to the plan
		ResourceActivityType activity = PlanFactory.eINSTANCE
				.createResourceActivityType();
		plan.getActivities().getActivity().add(activity);
		activity.setActivityId(1);
		activity.setType(ResourceActivityKindType.ADDCONTAINERRESOURCE);
		NodeType node = this.getContainerNode(this.datasourceContainer);
		activity.setTarget(environment.getName() + SEPARATOR + node.getName() + SEPARATOR
				+ datasourceContainer.getName());
		// Create the Resource for the Activity
		ResourceType resource = UnitFactory.eINSTANCE.createResourceType();
		activity.setResource(resource);
		resource.setName("jdbc/" + databaseName);
		// Create the Type for the Resource
		TypesType types = UnitFactory.eINSTANCE.createTypesType();
		resource.setTypes(types);
		types.getType().add(RESOURCETYPE);
		// Create the Properties for the Resource
		ResourcePropertiesType resourceProperties = UnitFactory.eINSTANCE
				.createResourcePropertiesType();
		resource.setResourceProperties(resourceProperties);
		List<PropertyType> properties = resourceProperties
				.getResourceProperty();
		// From the application server
		// No needed since the plan executor provides them
//		PropertyType hostname = UnitFactory.eINSTANCE.createPropertyType();
//		hostname.setName("hostName");
//		hostname.setValue(this.findContainerProperty(datasourceContainer,
//				"hostName"));
//		properties.add(hostname);
//		PropertyType adminPort = UnitFactory.eINSTANCE.createPropertyType();
//		adminPort.setName("jmxPort");
//		adminPort.setValue(this.findContainerProperty(datasourceContainer,
//				"jmxPort"));
//		properties.add(adminPort);
		// From the application server (private data)
		// No needed since the plan executor provides them
//		PropertyType username = UnitFactory.eINSTANCE.createPropertyType();
//		username.setName("es.itecban.deployment.container.username");
//		username.setValue(datasourceConfiguration.getProperty("es.itecban.deployment.container.username"));
//		properties.add(username);
//		PropertyType password = UnitFactory.eINSTANCE.createPropertyType();
//		password.setName("es.itecban.deployment.container.password");
//		password.setValue(datasourceConfiguration.getProperty("es.itecban.deployment.container.password"));
//		properties.add(password);
		// From the database
		PropertyType databaseVendor = UnitFactory.eINSTANCE
				.createPropertyType();
		databaseVendor.setName("databaseVendor");
		databaseVendor.setValue(dbmsVendor);
		properties.add(databaseVendor);
		PropertyType jdbcResourceName = UnitFactory.eINSTANCE
				.createPropertyType();
		jdbcResourceName.setName("jdbcResourceName");
		jdbcResourceName.setValue("jdbc/" + databaseName);
		properties.add(jdbcResourceName);
		PropertyType dbName = UnitFactory.eINSTANCE.createPropertyType();
		dbName.setName("property.databaseName");
		dbName.setValue(databaseName);
		properties.add(dbName);
		PropertyType url = UnitFactory.eINSTANCE.createPropertyType();
		url.setName("property.url");
		url.setValue("jdbc:mysql://"
				+ this.findContainerProperty(dbmsContainer, "hostName")
				+ ":"
				+ this.findContainerProperty(dbmsContainer, "dbPort")
				+ "/" + databaseName);
		properties.add(url);
		// From the database (private data)
		PropertyType dbUsername = UnitFactory.eINSTANCE.createPropertyType();
		dbUsername.setName("property.user");
		dbUsername.setValue(dbmsConfiguration.getProperty("es.itecban.deployment.container.username"));
		properties.add(dbUsername);
		PropertyType dbPassword = UnitFactory.eINSTANCE.createPropertyType();
		dbPassword.setName("property.password");
		dbPassword.setValue(dbmsConfiguration.getProperty("es.itecban.deployment.container.password"));
		properties.add(dbPassword);
		// End of Properties creation
		// Setting the status
		plan.setPlanStatus("CREATING");
		logger.info("Building plan: " + this.name + " SUCCESS");			
		return true;
	}

	@Override
	public DeploymentTargetType getEnvironment() {
		return this.environment;
	}

	@Override
	public DeploymentPlanType getPlan() {
		return this.plan;
	}

	@Override
	public String getPlanXML() {
		try {
			return XMLUtils.getPlanXML(plan);
		} catch (IOException e) {
			logger.severe("Error parsing deployment plan: " + this.name
					+ " to XML.");
			return null;
		}
	}

	@Override
	public boolean validatePlan() {
		logger.info("Validating plan: " + this.name);
		if (plan.getPlanStatus() == null) {
			logger.info("Building of the plan not yet performed");
			logger.info("Validating plan: " + this.name + " : FAIL");
			return false;
		}
		// Set plan status to CREATED
		this.plan.setPlanStatus("CREATED");
		// Return true
		logger.info("Validating plan: " + this.name + " : SUCCESS");
		return true;
	}

	@Override
	public List<ContainerType> getDBMSContainers() {
		logger.info("Getting available DBMS containers");
		List<ContainerType> dbmsContainers = new ArrayList<ContainerType>();
		// Iterate the nodes of the environment
		List<NodeType> nodes = environment.getNodes().getNode();
		for (NodeType node : nodes) {
			// Iterate the containers of the node
			List<ContainerType> containers = node.getNodeContainers()
					.getNodeContainer();
			for (ContainerType container : containers) {
				// If the containers is a DBMS, add it to the List
				if (isDBMS(container) && !dbmsContainers.contains(container)) {
					dbmsContainers.add(container);
				}
			}
		}
		// Return the List
		return dbmsContainers;
	}

	@Override
	public void setDBMSContainer(ContainerType dbmsContainer) {
		logger.info("Trying to set " + dbmsContainer.getName() + " as DBMS");
		if (isDBMS(dbmsContainer)) {
			// Set the DBMS container
			this.dbmsContainer = dbmsContainer;
			// Set the configuration
			dbmsConfiguration = this.getContainerProperties(dbmsContainer.getName());
			// Takes the second part of the name as the vendor
			dbmsVendor = dbmsContainer.getName().substring(dbmsContainer.getName().lastIndexOf(" ") + 1);
			logger.info(dbmsContainer.getName()+ " set as DBMS");
			return;
		}
		logger.severe(dbmsContainer.getName() + " is not a DBMS, failed to set as DBMS");
	}

	@Override
	public List<String> getDatabases() {
		logger.info("Getting available databases");
		if (dbmsContainer != null) {
			// Get the runtime units of the DBMS container that have a resource
			// with type es.itecban.deployment.unit.db.ddl and name the same
			// of the runtime unit 
			List<String> dbNames = new ArrayList<String>();
			List<RuntimeUnitType> units = dbmsContainer.getRuntimeUnits().getUnit();
			// Add the names of the units to the list
			for (RuntimeUnitType unit : units) {
				// Only if the unit is a database
				List<RuntimeResourceType> resources = unit.getRuntimeResources().getResource();
				for (RuntimeResourceType resource : resources) {
					List<String> types = resource.getRuntimeResourceTypes().getType();
					for (String type : types) {
						if (type.equals("es.itecban.deployment.unit.db.ddl") && !dbNames.contains(unit.getName())) {
							dbNames.add(unit.getName());
						}
					}
				}
			}
			return dbNames;
		}
		logger.severe("Tried to get available databases without setting the DBMS container first");
		return null;
	}

	@Override
	public void setDatabase(String database) {
		logger.info("Trying to set " + database + " as database");
		if (dbmsContainer != null) {
			// Iterate the runtime units of the DBMS container
			List<RuntimeUnitType> units = dbmsContainer.getRuntimeUnits()
					.getUnit();
			// If its the unit, set it as database
			for (RuntimeUnitType unit : units) {
				if (unit.getName().equals(database)) {
					logger.info(database + " set as database");
					this.database = unit;
					// Iterate the database resources searching for the name
					List <RuntimeResourceType> resources = unit.getRuntimeResources().getResource();
					for (RuntimeResourceType resource : resources) {
						// Iterate the types of the resource
						List<String> types = resource.getRuntimeResourceTypes().getType();
						for (String type : types) {
							if (type.equals("es.itecban.deployment.db.database")) {
								this.databaseName = resource.getName();
							}
						}
					}
					return;
				}
			}
			logger.severe(database + " does not exist in the DBMS, failed to set as database");
		}
		logger.severe("Tried to set the database without setting the DBMS container first");
	}

	/**
	 * Checks if a provided container is a DBMS (at least one of its types is
	 * es.itecban.deployment.container.db or a subtype of it).
	 * 
	 * @param container
	 *            The ContainerType to be checked.
	 * @return true if it is a DBMS container
	 */
	private boolean isDBMS(ContainerType container) {
		logger.info("Checking if container " + container.getName() + " is a DBMS");
		List<ContainerTypeType> containerTypes = container.getContainerTypes()
				.getContainerType();
		for (ContainerTypeType containerType : containerTypes) {
			if (containerType.getName().contains(DBTYPE)) {
				logger.info("Container " + container.getName() + " is a DBMS");
				return true;
			}
		}
		return false;
	}

	private NodeType getContainerNode(ContainerType container) {
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
				ContainerType currentContainer = (ContainerType) containerIterator
						.next();
				// If matches the variable, return true
				if (currentContainer.getName().equals(container.getName())) {
					return node;
				}
			}
		}
		// Else, return null
		return null;
	}

	private String findContainerProperty(ContainerType container,
			String propertyName) {
		logger.info("Searching for property " + propertyName + " in container " + container.getName());
		// Get the desired property from the container
		// Iterate the properties
		List<PropertyType> properties = container.getContainerProperties()
				.getContainerProperty();
		for (Iterator<PropertyType> propertyIterator = properties.iterator(); propertyIterator
				.hasNext();) {
			PropertyType tempProperty = (PropertyType) propertyIterator.next();
			// If matches the variable, get the property
			if (tempProperty.getName().equals(propertyName)) {
				logger.info("Found property " + propertyName + " in container " + container.getName() + " : " + tempProperty.getValue());
				return tempProperty.getValue();
			}
		}
		logger.severe("Searching for property " + propertyName + " in container " + container.getName() + " : Property doesn't exist");
		return "";
	}
	
	private Properties getContainerProperties(String containerName) {
		logger.info("Getting properties for container " + containerName);
		Properties props = new Properties();
		try {
			// Get the properties File
			File configurationFile = confProvider.getContainerConfiguration(environment.getName(), containerName, 
					Constants.CONTAINER_CONEXION_CONFIGURATION);
			if (configurationFile == null) {
				logger.severe("Getting properties for container " + containerName + " : File Not Found");
			}
			// Load the properties from the file
			FileInputStream fis = new FileInputStream(configurationFile);
			props.load(fis);
		} catch (IOException e) {
			logger.severe("Getting properties for container " + containerName + " : Error while loading the file");
		}
		logger.info("Getting properties for container " + containerName + " : SUCCESS");
		return props;
	}
}

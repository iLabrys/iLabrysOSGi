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
package es.itecban.deployment.environmentmanager.manager;

import java.lang.reflect.Method;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.hibernate.SessionFactory;
import org.hibernate.jmx.StatisticsService;

import es.itecban.deployment.model.deployment.target.ContainerPropertiesType;
import es.itecban.deployment.model.deployment.target.ContainerResourcesType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.ContainerTypesType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeContainersType;
import es.itecban.deployment.model.deployment.target.NodePropertiesType;
import es.itecban.deployment.model.deployment.target.NodeResourcesType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeResourcesType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.SupportedPackageType;
import es.itecban.deployment.model.deployment.target.SupportedPackagesType;
import es.itecban.deployment.model.deployment.target.TargetFactory;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.TypesType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;

public class EnvironmentManagerUtils {

	public static Logger logger = Logger
			.getLogger(EnvironmentManagerUtils.class.getName());

	/**
	 * Enables the statistics for hibernate. Registers a MBean. With JConsole
	 * can be managed
	 */

	protected static void enableStatistics(SessionFactory sessionFactory) {

		try {
			Hashtable<String, String> tb = new Hashtable<String, String>();
			tb.put("type", "statistics");
			tb.put("sessionFactory", "myFinancialApp");
			ObjectName on = new ObjectName("hibernate", tb); // MBean object
																// name

			StatisticsService stats = new StatisticsService(); // MBean
																// implementation
			stats.setSessionFactory(sessionFactory); // Bind the stats to a
														// SessionFactory
			stats.setStatisticsEnabled(true);
			MBeanServer server = EnvironmentManagerUtils.getLocalMBeanServer();
			server.registerMBean(stats, on); // Register the Mbean on the server
		} catch (Exception e) {
			logger.severe("fallo en las estadisticas de hibernate");
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return the local MBeanServer
	 */

	public static MBeanServer getLocalMBeanServer() {
		MBeanServer server = null;
		try {
			String jvm = System.getProperty("java.version"); // 1.5.0 or
			// higher
			String[] s = jvm.split("\\.");
			if (Integer.parseInt(s[1]) < 5) {// In this way it should also
				// work with Mustang
				server = MBeanServerFactory.createMBeanServer();
			} else {
				Class clazz = Class
						.forName("java.lang.management.ManagementFactory");
				Method m = clazz.getDeclaredMethod("getPlatformMBeanServer",
						new Class[0]);
				server = (MBeanServer) m.invoke(null, (Object[]) null);
			}
		} catch (Exception ex) {
		}
		return server;
	}

	public static DeploymentTargetType getLastEnvironment(
			List<DeploymentTargetType> deploymentTargetTypeList)
			throws DatatypeConfigurationException {

		if (deploymentTargetTypeList.size() == 1)
			return deploymentTargetTypeList.get(0);
		XMLGregorianCalendar[] xmlCalendarArray = new XMLGregorianCalendar[deploymentTargetTypeList
				.size()];
		for (int i = 0; i < deploymentTargetTypeList.size(); i++) {
			XMLGregorianCalendar xmlCalendar = deploymentTargetTypeList.get(i)
					.getTimestamp();
			xmlCalendarArray[i] = xmlCalendar;
		}
		int h = 0;
		GregorianCalendar timestampGregorian = new GregorianCalendar();
		XMLGregorianCalendar aux = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(timestampGregorian);
		for (int i = 0; i < xmlCalendarArray.length; i++) {
			h = i;
			for (int j = h; j < xmlCalendarArray.length; j++) {
				if ((xmlCalendarArray[i].compare(xmlCalendarArray[j])) == DatatypeConstants.GREATER) {
					aux = xmlCalendarArray[i];
					xmlCalendarArray[i] = xmlCalendarArray[j];
					xmlCalendarArray[j] = aux;
				}
			}
		}
		for (DeploymentTargetType deploymentTargetType : deploymentTargetTypeList) {
			XMLGregorianCalendar dttCalendar = deploymentTargetType
					.getTimestamp();
			if (dttCalendar
					.compare(xmlCalendarArray[xmlCalendarArray.length - 1]) == DatatypeConstants.EQUAL)
				return deploymentTargetType;
		}
		return null;
	}

	public static DeploymentTargetType normalizeRuntimeUnitVersions(DeploymentTargetType deploymentTargetType){
		
		List<NodeType> nodeList = deploymentTargetType.getNodes().getNode();
		for (NodeType node : nodeList){
			List<ContainerType> containerTypeList = node.getNodeContainers().getNodeContainer();
			for (int i = 0 ; i < containerTypeList.size() ; i++){
				ContainerType container = containerTypeList.get(i);
				List<RuntimeUnitType> runtimeUnitList = container.getRuntimeUnits().getUnit();
				for (int j = 0 ; j < runtimeUnitList.size() ; j++){
					RuntimeUnitType runtimeUnit = runtimeUnitList.get(j);
					runtimeUnit.setVersion(normalizeVersion(runtimeUnit.getVersion()));
					// TODO upload to SVN (is to avoid nullpointers)
					RuntimeResourcesType rtResources = runtimeUnit.getRuntimeResources();
					if (rtResources != null){
					//List<RuntimeResourceType> resourceList = runtimeUnit.getRuntimeResources().getResource();
						List<RuntimeResourceType> resourceList = rtResources.getResource();
						for (int k = 0 ; k < resourceList.size() ; k++){
							RuntimeResourceType resource = resourceList.get(k) ;
							resource.setVersion(normalizeVersion(resource.getVersion()));
						}
					}
				}
			}
		}
		return deploymentTargetType;
	}

	private static String normalizeVersion(String version) {

		String normalizedVersion = "";
		if (version == null) {
			return null;
		}
		// if version has only two digits, it is converted to three
		String[] versionDigitArray = version.split("\\.");
		if (version.equals("unknown"))
			normalizedVersion = version;
		else if (versionDigitArray.length == 1)
			// the version has only one digit: convert to three
			normalizedVersion = version + ".0.0";
		else if (versionDigitArray.length == 2)
			// the version has only two digits: convert to three
			normalizedVersion = version + ".0";
		else if (versionDigitArray.length == 3)
			// the version is correct
			normalizedVersion = version;
		else if (versionDigitArray.length > 3)
			// this is not possible!! error!!!
			logger
					.severe("ERROR: the version has four digits. This is not allowed. Version: "
							+ version);
		return normalizedVersion;
	}
}

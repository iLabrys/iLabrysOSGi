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

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.model.deployment.plan.ActivitiesType;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;

public class ActivityCompensator {
	
	private	static final String SEPARATOR = "#";
	private static final String COMPENSATION_PREFIX = "COMPENSATION ";
	
	public static DeploymentPlanType antiPlan(DeploymentPlanType plan, ExecutionReportType report, 
			DeploymentTargetType deploymentTarget) {
		
		DeploymentPlanType antiPlan = PlanFactory.eINSTANCE.createDeploymentPlanType();
		antiPlan.setEnvironment(plan.getEnvironment());
		antiPlan.setName(COMPENSATION_PREFIX + plan.getName());
		antiPlan.setPlanStatus("CREATED");
		EList<ActivityExecReportType> actReports = report.getActivitiesExecutionReport().getActivityExecutionReport();
		List<Integer> order = new ArrayList<Integer>();
		for (int i = actReports.size(); i > 0; i--) {
			ActivityExecReportType actReport = actReports.get(i-1);
			int activityId = Integer.parseInt(actReport.getActivityId());
			order.add(-activityId);
		}
		EList<ActivityType> antiActivities = compensations(plan.getActivities().getActivity(), deploymentTarget);
		try {
			antiActivities = ActivitySorter.setOrder(antiActivities, order);
		} catch (Exception e) {e.printStackTrace();}
		for (int i = 1; i < actReports.size(); i++) {
			ActivityType activity = antiActivities.get(i);
			ActivityType previousActivity = antiActivities.get(i-1);
			activity.getDependency().add(previousActivity.getActivityId());
		}
		ActivitiesType antiActs = PlanFactory.eINSTANCE.createActivitiesType();
		antiActs.getActivity().addAll(antiActivities);
		antiPlan.setActivities(antiActs);
		ScheduleType schedule = PlanFactory.eINSTANCE.createScheduleType();
		GregorianCalendar planCreationDate = new GregorianCalendar();
		XMLGregorianCalendar planCreationTime = null;
		try {
			planCreationTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(planCreationDate);
		} catch (DatatypeConfigurationException e) {}
		schedule.setCreationDate(planCreationTime);
		schedule.setLastModificationDate(planCreationTime);
		antiPlan.setScheduleData(schedule);
		return antiPlan;
		
	}
	
	public static EList<ActivityType> compensations(EList<ActivityType> acts, DeploymentTargetType deploymentTarget) {
		EList<ActivityType> compensations = new BasicEList<ActivityType>();
		for (ActivityType act : acts) {
			compensations.add(compensation(act, deploymentTarget));
		}
		return compensations;
	}
	
	public static ActivityType compensation(ActivityType act, DeploymentTargetType deploymentTarget) {
		if (act instanceof DeploymentActivityType) {
			return deploymentCompensation((DeploymentActivityType)act);
		}
		if (act instanceof ConfigurationActivityType) {
			return configurationCompensation((ConfigurationActivityType)act, deploymentTarget);
		}
		if (act instanceof ResourceActivityType) {
			return resourceCompensation((ResourceActivityType)act);
		}
		return null;
	}
	
	public static DeploymentActivityType deploymentCompensation(DeploymentActivityType da) {
		
		DeploymentActivityType compensation = PlanFactory.eINSTANCE.createDeploymentActivityType();
		compensation.setActivityId(-da.getActivityId());
		compensation.setTarget(da.getTarget());
		compensation.setUnitName(da.getUnitName());
		compensation.setUnitVersion(da.getUnitVersion());
		if (da.getType().equals(DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT)) {
			compensation.setType(DeploymentActivityKindType.UNINSTALLDEPLOYMENTUNIT);
		}
		if (da.getType().equals(DeploymentActivityKindType.UNINSTALLDEPLOYMENTUNIT)) {
			compensation.setType(DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT);
		}
		if (da.getType().equals(DeploymentActivityKindType.STARTDEPLOYMENTUNIT)) {
			compensation.setType(DeploymentActivityKindType.STOPDEPLOYMENTUNIT);
		}
		if (da.getType().equals(DeploymentActivityKindType.STOPDEPLOYMENTUNIT)) {
			compensation.setType(DeploymentActivityKindType.STARTDEPLOYMENTUNIT);
		}
		if (da.getType().equals(DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT)) {
			compensation.setType(DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT);
			compensation.setUnitName(da.getPreviousUnitName());
			compensation.setUnitVersion(da.getPreviousUnitVersion());
			compensation.setPreviousUnitName(da.getUnitName());
			compensation.setPreviousUnitVersion(da.getUnitVersion());
//			String target = da.getTarget();
//			String[] params = target.split(SEPARATOR, 3);
//			String nodeName = params[1];
//			NodeType node = EnvironmentNavigator.getNode(nodeName, deploymentTarget);
//			String containerName = params[2];
//			ContainerType container = EnvironmentNavigator.getContainer(containerName, node);
//			RuntimeUnitType unit = EnvironmentNavigator.getUnit(da.getUnitName(), container);
//			compensation.setUnitVersion(unit.getVersion());
		}
		return compensation;
		
	}
	
	public static ConfigurationActivityType configurationCompensation(ConfigurationActivityType ca, 
			DeploymentTargetType deploymentTarget) {
		
		ConfigurationActivityType compensation = PlanFactory.eINSTANCE.createConfigurationActivityType();
		compensation.setActivityId(-ca.getActivityId());
		compensation.setTarget(ca.getTarget());
		compensation.setType(ca.getType());
		EList<PropertyType> currentProperties = null;
		EList<PropertyType> newProperties = ca.getConfiguration().getProperty();
		String target = ca.getTarget();
		String[] params = target.split(SEPARATOR, 5);
		String nodeName = params[1];
		NodeType node = EnvironmentNavigator.getNode(nodeName, deploymentTarget);
		String containerName = params[2];
		ContainerType container = EnvironmentNavigator.getContainer(containerName, node);
		if (ca.getType().equals(ConfigurationActivityKindType.CONFIGURECONTAINERPROPERTY)) {
			currentProperties = container.getContainerProperties().getContainerProperty();
		}
		if (ca.getType().equals(ConfigurationActivityKindType.CONFIGURECONTAINERRESOURCE)) {
			String containerResourceName = params[3];
			RuntimeResourceType containerResource = EnvironmentNavigator.getContainerResource(containerResourceName, container);
			currentProperties = containerResource.getRuntimeResourceProperties().getResourceProperty();
		}
		if (ca.getType().equals(ConfigurationActivityKindType.CONFIGUREUNITRESOURCE)) {
			String unitName = params[3];
			RuntimeUnitType unit = EnvironmentNavigator.getUnit(unitName, container);
			String unitResourceName = params[4];
			RuntimeResourceType unitResource = EnvironmentNavigator.getUnitResource(unitResourceName, unit);
			currentProperties = unitResource.getRuntimeResourceProperties().getResourceProperty();
		}
		compensation.setConfiguration(getCompensationConfiguration(currentProperties, newProperties));
		return compensation;
		
	}
	
	public static ResourceActivityType resourceCompensation(ResourceActivityType ra) {
		
		ResourceActivityType compensation = PlanFactory.eINSTANCE.createResourceActivityType();
		compensation.setActivityId(-ra.getActivityId());
		compensation.setTarget(ra.getTarget());
		compensation.setResource(ra.getResource());
		if (ra.getType().equals(ResourceActivityKindType.ADDCONTAINERRESOURCE)) {
			compensation.setType(ResourceActivityKindType.REMOVECONTAINERRESOURCE);
		}
		if (ra.getType().equals(ResourceActivityKindType.REMOVECONTAINERRESOURCE)) {
			compensation.setType(ResourceActivityKindType.ADDCONTAINERRESOURCE);
		}
		return compensation;
		
	}
	
	private static ConfigurationType getCompensationConfiguration(EList<PropertyType> currentProperties, 
			EList<PropertyType> newProperties) {
		
		ConfigurationType compensationConfiguration = PlanFactory.eINSTANCE.createConfigurationType();
		EList<PropertyType> compensationProperties = compensationConfiguration.getProperty();
		for (PropertyType newProperty : newProperties) {
			boolean isPresent = false;
			for (PropertyType currentProperty : currentProperties) {
				if (newProperty.getName().equals(currentProperty.getName())) {
					isPresent = true;
					if (!newProperty.getValue().equals(currentProperty.getValue())) {
						PropertyType prop = UnitFactory.eINSTANCE.createPropertyType();
						prop.setName(currentProperty.getName());
						prop.setValue(currentProperty.getValue());
						compensationProperties.add(prop);
					}
				}
			}
			if (!isPresent) {
				PropertyType prop = UnitFactory.eINSTANCE.createPropertyType();
				prop.setName(newProperty.getName());
				prop.setValue("#REMOVE");
				compensationProperties.add(prop);
			}
		}
		return compensationConfiguration;
		
	}
	
	
}

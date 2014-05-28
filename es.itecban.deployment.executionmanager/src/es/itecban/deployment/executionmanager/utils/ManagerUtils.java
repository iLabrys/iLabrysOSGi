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
package es.itecban.deployment.executionmanager.utils;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import es.itecban.deployment.environmentmanager.services.ReportManager;
import es.itecban.deployment.executionmanager.elements.DeploymentPlan;
import es.itecban.deployment.executionmanager.elements.PlanReport;
import es.itecban.deployment.executionmanager.services.PlanBuilder;
import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.util.PlanResourceImpl;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.TypesType;

public class ManagerUtils {

	private static Logger logger = Logger.getLogger(ManagerUtils.class
			.getName());

	public DeploymentPlan findPlanById(String planID) {
		// TODO
		return null;
	}

	public DeploymentPlan serializePlanBin(DeploymentPlanType deploymentPlanType) {

		DeploymentPlan dplan = new DeploymentPlan();
		String planID = deploymentPlanType.getName();
		dplan.setPlanID(planID);
		String environment = deploymentPlanType.getEnvironment();
		dplan.setDeploymentTarget(environment);
		return dplan;
	}

	public PlanReport serializePlanReportBin(
			ExecutionReportType executionReportType) {

		PlanReport pReport = new PlanReport();
		pReport.setPlanName(executionReportType.getPlanId());
		pReport.setStartTime(executionReportType.getStartTime());
		return pReport;
	}

	public DeploymentPlan[] toSerializablePlans(DeploymentPlanType[] plans) {
		DeploymentPlan[] duBeans = new DeploymentPlan[plans.length];
		for (int i = 0; i < plans.length; i++) {
			duBeans[i] = this.serializePlanBin(plans[i]);
		}
		return duBeans;
	}

	public static String getPlan2JSON(String planID, PlanManager pm,
			PlanBuilder pb) throws Exception {
		
		DeploymentPlanType plan = null;
		if (pm != null) {
			plan = pm.findPlanByName(planID);
		} else if (pb != null) {
			plan = pb.getPlan();
		}

		return ManagerUtils.getPlan2JSON(plan);
	}
	
	public static String getPlan2JSON(DeploymentPlanType plan) throws Exception {
		
		PlanResourceImpl planimpl = new PlanResourceImpl(null);
		es.itecban.deployment.model.deployment.plan.DocumentRoot root = PlanFactory.eINSTANCE
				.createDocumentRoot();
		planimpl.getContents().add(root);
		root.setPlan(plan);
		StringBuilder stJson = new StringBuilder();
		int longStJson = 0;
		stJson.append("{\"name\":\"").append(plan.getName().split("\\|")[0]).append("\",");
		stJson.append("\"environment\":\"").append(plan.getEnvironment())
				.append("\",");
		//To maintain the compatibility with older versions
		if (plan.getName().split("\\|").length > 3)
			stJson.append("\"creationUser\":\"").append(plan.getName().split("\\|")[3])
					.append("\",");
		stJson.append("\"activities\":[");

		longStJson = stJson.length();

		for (ActivityType activity : plan.getActivities().getActivity()) {
			if (stJson.length() > longStJson) {
				stJson.append(",");
			}

			stJson.append("{\"activityId\":\"")
					.append(activity.getActivityId()).append("\",");
			stJson.append("\"target\":\"").append(activity.getTarget()).append(
					"\",");
			if (activity instanceof DeploymentActivityType) {
				DeploymentActivityType act = (DeploymentActivityType) activity;
				stJson.append("\"type\":\"").append(act.getType())
						.append("\",");
				stJson.append("\"unitName\":\"").append(act.getUnitName())
						.append("\",");
				stJson.append("\"unitVersion\":\"")
						.append(act.getUnitVersion()).append("\"");
				if (act.getPreviousUnitName()!=null){
				stJson.append(",\"previousUnitName\":\"").append(act.getPreviousUnitName())
						.append("\",");
				}
				if (act.getPreviousUnitVersion()!=null){
				stJson.append("\"previousUnitVersion\":\"")
						.append(act.getPreviousUnitVersion()).append("\"");
				}
				stJson.append("}");
			} else if (activity instanceof ConfigurationActivityType) {
				ConfigurationActivityType act = (ConfigurationActivityType) activity;
				stJson.append("\"type\":\"").append(act.getType())
						.append("\",");
				stJson.append("\"configuration\":\"[");

				StringBuilder stJsonAux = new StringBuilder();

				for (PropertyType property : act.getConfiguration()
						.getProperty()) {
					stJsonAux.append("{\"name\":\"").append(property.getName())
							.append("\",");
					stJsonAux.append("{\"value\":\"").append(
							property.getValue()).append("\"}");
					if (stJsonAux.length() > 0) {
						stJsonAux.append(",");
					}
				}
				
				stJson.append(stJsonAux);
				stJson.append("]}");
			}else if (activity instanceof ResourceActivityType) {
				ResourceActivityType act = (ResourceActivityType) activity;
				stJson.append("\"type\":\"").append(act.getType())
						.append("\",");
				stJson.append("\"resource\":[");
				stJson.append("{\"name\":\"").append(act.getResource().getName()).append("\",");
				stJson.append("\"version\":\"").append(act.getResource().getVersion()).append("\",");
				stJson.append("\"types\":[{");
				
				
				List<String> types=act.getResource().getTypes().getType();
				for (Iterator iterator = types.iterator(); iterator
						.hasNext();) {
					String type = (String) iterator.next();
					stJson.append("\"type\":\"").append(type).append("\"");
				}
				
				
				
				stJson.append("}");//close types
				stJson.append("],");//close types
				
				stJson.append("\"resourceProperties\":[{\"resourceProperty\":\"\"}]");
				
				
				stJson.append("}");//close resources
				stJson.append("]");//close resources
				stJson.append("}");//close activities
			
			}
		}

		stJson.append("],");
		stJson.append("\"scheduleData\":{");
		stJson.append("\"creationDate\":\"").append(
				plan.getScheduleData().getCreationDate()).append("\",");
		stJson.append("\"lastModificationDate\":\"").append(
				plan.getScheduleData().getLastModificationDate())
				.append("\"}}"); 
		System.out.println(stJson.toString());

		return stJson.toString();

	}

	public static String getPlanReport2JSON(String planId,
			ReportManager reportManager) throws DatatypeConfigurationException {

		ExecutionReportType planReport = null;
		// the planId given is a concatenation of the name of the plan and the
		// startTime of the plan of the report
		String reportName = planId.substring(0, planId.lastIndexOf('|'));
		String calendarString = planId.substring(planId.lastIndexOf('|') + 1);
		XMLGregorianCalendar xmlCalendar = milisecs2XMLGregorianCalendar(calendarString);
		planReport = reportManager.findExecutionReportByPlanId(reportName, xmlCalendar);

		StringBuilder stJson = new StringBuilder();
		int longStJson = 0;

		stJson.append("{\"reportName\":\"").append(planReport.getPlanId()).append(
				"\",");
		stJson.append("\"reportCalendar\":\"").append(calendarString).append(
		"\",");
		stJson.append("\"startTime\":\"").append(planReport.getStartTime())
				.append("\",");
		stJson.append("\"endTime\":\"").append(planReport.getEndTime()).append(
				"\",");
		stJson.append("\"creationUserId\":\"").append(
				planReport.getCreationUserId()).append("\",");
		stJson.append("\"launcherUserId\":\"").append(
				planReport.getLauncherUserId()).append("\",");
		stJson.append("\"environment\":\"").append(planReport.getEnvironment())
				.append("\",");
		// stJson.append(
		// "\"technicalExecutionReport\":\"").append(planReport.getTechnicalExecutionReport()).append("\",");
		stJson.append("\"result\":\"").append(planReport.getResult()).append(
				"\",");
		stJson.append("\"message\":\"").append(planReport.getMessage()).append(
				"\",");
		stJson.append("\"activitiesExecutionReport\":[");

		longStJson = stJson.length();

		for (ActivityExecReportType activity : planReport
				.getActivitiesExecutionReport().getActivityExecutionReport()) {
			if (stJson.length() > longStJson) {
				stJson.append(",");
			}

			stJson.append("{\"activityId\":\"")
					.append(activity.getActivityId()).append("\",");
			stJson.append("\"startTime\":\"").append(activity.getStartTime())
					.append("\",");
			stJson.append("\"endTime\":\"").append(activity.getEndTime())
					.append("\",");
			stJson.append("\"description\":\"").append(
					activity.getDescription()).append("\",");
			stJson.append("\"resultCode\":\"").append(activity.getResultCode())
					.append("\",");
			stJson.append("\"result\":\"").append(activity.getResult()).append(
					"\"}");
			// stJson.append("\"technicalActivityExecReport\":\"").append(activity.getTechnicalActivityExecReport()).append("\"}");
		}
		stJson.append("]}");
		logger.fine(stJson.toString());

		return stJson.toString();
	}
	
	public static XMLGregorianCalendar milisecs2XMLGregorianCalendar(String milisecs) throws DatatypeConfigurationException{
		long calendarMiliSecs = Long.decode(milisecs);
		GregorianCalendar gregCalendar = new GregorianCalendar();
		gregCalendar.setTimeInMillis(calendarMiliSecs);
		XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCalendar);
		return xmlCalendar;
	}

	public static XMLGregorianCalendar getXMLGregorianCalendar(String date) {

		if (date == null || date.equals("")) {
			return null;
		}
		XMLGregorianCalendar dateCalendar = new XMLGregorianCalendarImpl();
		String[] dateSplitted = date.split("/");
		dateCalendar.setDay(Integer.parseInt(dateSplitted[0]));
		dateCalendar.setMonth(Integer.parseInt(dateSplitted[1]));
		dateCalendar.setYear(Integer.parseInt(dateSplitted[2]));

		return dateCalendar;
	}
}

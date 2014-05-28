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

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.webflow.execution.RequestContext;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.elements.DeploymentPlan;
import es.itecban.deployment.executionmanager.elements.PlanFilter;
import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.executionmanager.utils.ManagerUtils;
import es.itecban.deployment.executionmanager.utils.XMLUtils;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;

public class PlanSearchManager {

	private PlanManager planManager;
	private EnvironmentManagerCore environmentManager;

	private static Logger logger = Logger.getLogger(PlanCreationManager.class
			.getName());

	static {
		logger.setLevel(Level.FINE);
	}

	public PagedListHolder findPlansPaginated(RequestContext context) {
		PagedListHolder pList = null;
		if (context.getCurrentEvent().getId().equals("advancedSearch")) {
			pList = new PagedListHolder(Arrays.asList(this.findPlansByFilter(context)));
		} else {
			pList = (PagedListHolder) context.getFlowScope().get("availableDeploymentPlans", PagedListHolder.class);
		}

		if (pList != null) {
			if (context.getRequestParameters().get("p") != null) {
				pList.setPage(Integer.parseInt(context.getRequestParameters().get("p")));
			}
			pList.setPageSize(10);

		}
		return pList;
	}

	// TODO: this is temporary, because of lack of time
	public void showDescriptor(RequestContext context) {
		String planName = (String) context.getRequestParameters().get(
				"selectedDeploymentPlan");
		// String planID2 = "Entorno de pruebas-1216199527185";
		DeploymentPlanType dplanType = planManager.findPlanByName(planName);
		String xmlFile = "Error while showing the xml information";
		try {
			xmlFile = XMLUtils.getPlanXML(dplanType);
		} catch (IOException e) {
			e.printStackTrace();
		}
		context.getFlowScope().put("xmlModelInformation", xmlFile);
		context.getFlowScope().put("planNameUniq", planName);
		// for the launch plan option
	}

	public void reviewPlanJSON(RequestContext context) {
		String planID = (String) context.getRequestParameters().get(
				"selectedDeploymentPlan");
		try {
			String json = ManagerUtils.getPlan2JSON(planID, planManager, null);
			context.getFlowScope().put(Constants.FLOW_PLAN_JSON, json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DeploymentPlan[] findPlanByFilter(RequestContext context,
			String planName) {
		return null;
	}

	public String[] getEnvironmentList(RequestContext context) throws Exception {
		return environmentManager.getEnvironmentsName();
	}

	public DeploymentPlan[] findPlansByFilter(RequestContext context) {
		String target = (String) context.getRequestParameters().get(
				"environment");
		String creationMinString = (String) context.getRequestParameters().get(
				"creationDateMin");
		String creationMaxString = (String) context.getRequestParameters().get(
				"creationDateMax");
		String scheduledLaunchMinString = (String) context
				.getRequestParameters().get("scheduledLaunchDateMin");
		String scheduledLaunchMaxString = (String) context
				.getRequestParameters().get("scheduledLaunchDateMax");
		String lastModificationMinString = (String) context
				.getRequestParameters().get("lastModificationDateMin");
		String lastModificationMaxString = (String) context
				.getRequestParameters().get("lastModificationDateMax");
		
		XMLGregorianCalendar creationMin = this
				.getXMLGregorianCalendar(creationMinString);
		XMLGregorianCalendar creationMax = this
				.getXMLGregorianCalendar(creationMaxString);
		XMLGregorianCalendar scheduledLaunchMin = this
				.getXMLGregorianCalendar(scheduledLaunchMinString);
		XMLGregorianCalendar scheduledLaunchMax = this
				.getXMLGregorianCalendar(scheduledLaunchMaxString);
		XMLGregorianCalendar lastModificationMin = this
				.getXMLGregorianCalendar(lastModificationMinString);
		XMLGregorianCalendar lastModificationMax = this
				.getXMLGregorianCalendar(lastModificationMaxString);
		
		PlanFilter planFilter = new PlanFilter(target, creationMin,
				creationMax, scheduledLaunchMin, scheduledLaunchMax,
				lastModificationMin, lastModificationMax);
		String planName = (String) context.getRequestParameters().get("planName");
		DeploymentPlanType[] deploymentPlanTypeArray = planManager
				.findDeploymentPlans(planFilter, planName);
		int arrayLength = deploymentPlanTypeArray.length;
		DeploymentPlan[] dplanArray = new DeploymentPlan[arrayLength];
		ManagerUtils utils = new ManagerUtils();
		for (int i = 0; i < deploymentPlanTypeArray.length; i++) {
			dplanArray[i] = utils.serializePlanBin(deploymentPlanTypeArray[i]);
		}
		return dplanArray;

		// return null;
	}

	public XMLGregorianCalendar getXMLGregorianCalendar(String date) {

		if (date == null || date.equals("")){
			return null;
		}
		XMLGregorianCalendar dateCalendar = new XMLGregorianCalendarImpl();
		String[] dateSplitted = date.split("/");
		dateCalendar.setDay(Integer.parseInt(dateSplitted[0]));
		dateCalendar.setMonth(Integer.parseInt(dateSplitted[1]));
		dateCalendar.setYear(Integer.parseInt(dateSplitted[2]));

		return dateCalendar;
	}

	public PlanManager getPlanManager() {
		return planManager;
	}

	public void setPlanManager(PlanManager planManager) {
		this.planManager = planManager;
	}

	public EnvironmentManagerCore getEnvironmentManager() {
		return environmentManager;
	}

	public void setEnvironmentManager(EnvironmentManagerCore environmentManager) {
		this.environmentManager = environmentManager;
	}

}

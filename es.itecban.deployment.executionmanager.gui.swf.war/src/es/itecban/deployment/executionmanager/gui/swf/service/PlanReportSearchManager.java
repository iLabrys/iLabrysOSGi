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

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.webflow.execution.RequestContext;

import es.itecban.deployment.environmentmanager.services.ReportManager;
import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.utils.ManagerUtils;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

public class PlanReportSearchManager {

	private ReportManager reportManager;
	private EnvironmentManagerCore environmentManager;

	public ReportManager getReportManager() {
		return reportManager;
	}

	public void setReportManager(ReportManager reportManager) {
		this.reportManager = reportManager;
	}

	private static Logger logger = Logger
			.getLogger(PlanReportSearchManager.class.getName());

	static {
		logger.setLevel(Level.FINE);
	}

	public String[] findPlanReportByParameters(RequestContext context) {
		if (context.getFlowScope().get("pList") != null) {
			context.getFlowScope().remove("pList");
		}
		String planName = "";
		XMLGregorianCalendar endDateMin = null;
		XMLGregorianCalendar endDateMax = null;
		String creationUser = "";
		String launcherUser = "";
		String environment = "";

		// In this case planId is the plan name
		if (context.getRequestParameters().get("planName") != null) {
			planName = (String) context.getRequestParameters().get("planName");
		}
		if (context.getRequestParameters().get("endDateMin") != null) {
			endDateMin = ManagerUtils.getXMLGregorianCalendar((String) context
					.getRequestParameters().get("endDateMin"));
		}
		if (context.getRequestParameters().get("endDateMax") != null) {
			endDateMax = ManagerUtils.getXMLGregorianCalendar((String) context
					.getRequestParameters().get("endDateMax"));
		}
		if (context.getRequestParameters().get("creationUser") != null) {
			creationUser = (String) context.getRequestParameters().get(
					"creationUser");
		}
		if (context.getRequestParameters().get("launcherUser") != null) {
			launcherUser = (String) context.getRequestParameters().get(
					"launcherUser");
		}
		if (context.getRequestParameters().get("environment") != null) {
			environment = (String) context.getRequestParameters().get(
					"environment");
		}

		String[] executionReportTypeArray = reportManager
				.findExecutionReportByParameters(planName, endDateMin,
						endDateMax, creationUser, launcherUser, environment);
		return executionReportTypeArray;
	}

	public PagedListHolder findReportsPaginated(RequestContext context) {
		PagedListHolder pList = null;
		if (context.getCurrentEvent().getId().equals("search")) {
			pList = new PagedListHolder(Arrays.asList(this.findPlanReportByParameters(context)));
		} else {
			pList = (PagedListHolder) context.getFlowScope().get("availableReports", PagedListHolder.class);
		}

		if (pList != null) {
			if (context.getRequestParameters().get("p") != null) {
				pList.setPage(Integer.parseInt(context.getRequestParameters()
						.get("p")));
			}
			pList.setPageSize(10);
		}
		return pList;
	}

	public void reviewReportJSON(RequestContext context, String selectedReport) {

		String reportId = null;
		String planID = (String) context.getRequestParameters().get(
			"selectedReport");
		context.getFlowScope().put("planID", planID);
		
		if (selectedReport != null)
			reportId = selectedReport;
		else if (planID != null)
			reportId = planID;
		else{			
		
		}
		try {
			String json = ManagerUtils
					.getPlanReport2JSON(reportId, reportManager);
			context.getFlowScope().put("jsonReport", json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getLastReportOfPlan(RequestContext context, String planNameUniq) throws Exception{
		
		String[] reportNameArray = this.reportManager.findExecutionReportByParameters(planNameUniq, null, null, null, null, null);
		if (reportNameArray == null || reportNameArray.length==0){
//			context.getFlowScope().put("error", "running.error.noReport");
			ErrorUtils.createMessageError(context, "running.error.noReport", null);
			throw new Exception();
		}
		String reportNameId = reportNameArray[reportNameArray.length-1];
		System.out.println("**** plandID = "+reportNameId);
		context.getFlowScope().put("selectedReport", reportNameId);
		this.reviewReportJSON(context, reportNameId);
	}

	public String[] getEnvironmentList(RequestContext context) throws Exception {
		return environmentManager.getEnvironmentsName();
	}

	public EnvironmentManagerCore getEnvironmentManager() {
		return environmentManager;
	}

	public void setEnvironmentManager(EnvironmentManagerCore environmentManager) {
		this.environmentManager = environmentManager;
	}
}

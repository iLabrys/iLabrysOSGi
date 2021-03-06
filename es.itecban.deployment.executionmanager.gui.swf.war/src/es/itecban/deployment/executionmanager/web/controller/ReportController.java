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
package es.itecban.deployment.executionmanager.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import es.itecban.deployment.environmentmanager.services.ReportManager;
import es.itecban.deployment.executionmanager.utils.ManagerUtils;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

public class ReportController extends AbstractController {

	// private RepositoryManager service;
	private ReportManager service;

	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		String planName = req.getParameter("planName");
		String activityId = req.getParameter("activityId");
		
		String reportName = planName.substring(0, planName.lastIndexOf('|'));
		String calendarString = planName.substring(planName.lastIndexOf('|') + 1);
				
		ExecutionReportType report = null;
		// the planId given is a concatenation of the name of the plan and the
		// startTime of the plan of the report
		XMLGregorianCalendar xmlCalendar = ManagerUtils.milisecs2XMLGregorianCalendar(calendarString);
		report = service.findExecutionReportByPlanId(reportName, xmlCalendar);
		
		if (activityId==null || activityId.equals("")){
			if (report != null) {
				ModelAndView mav = new ModelAndView("report", "report", report);
				return mav;
			}	
		}else{
			for (int i=0;i<report.getActivitiesExecutionReport().getActivityExecutionReport().size();i++){
				if (report.getActivitiesExecutionReport().getActivityExecutionReport().get(i).getActivityId().equals(activityId)){
					ModelAndView mav = new ModelAndView("reportActivity", "report", report.getActivitiesExecutionReport().getActivityExecutionReport().get(i));
					return mav;
				}
			}
			
		}
		throw new Exception("The requested plan report does not exist");
	}

	public ReportManager getService() {
		return service;
	}

	public void setService(ReportManager service) {
		this.service = service;
	}
}

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
package es.itecban.deployment.executionmanager.queryprovider.oracle;

import javax.xml.datatype.XMLGregorianCalendar;

import es.itecban.deployment.executionmanager.elements.PlanFilter;
import es.itecban.deployment.executionmanager.manager.queryprovider.DefaultQueryProvider;

public class OracleQueryProvider extends DefaultQueryProvider{
	
//	Plan Manager Queries
	
	@Override
	public String getDeploymentPlan(String name) {
		/*where upper(dunit.name) like'%" + name.toUpperCase() + "%' ";*/
		return "from DeploymentPlanType where upper(name)='" + name.toUpperCase() + "'";
	}
	
	@Override
	public String getDeploymentList(PlanFilter filter, String planName) {
		
		String qSelect = "select dplan from DeploymentPlanType as dplan"
				+ " inner join dplan.scheduleData sch"
				+ " where dplan.environment=:planTarget";
		
		//getting the name
		if (planName!=null && !planName.equals("")){
			//be careful!! the name is concatenated with "|environmentName|date"
			qSelect = qSelect + " and upper(dplan.name) like '" + "%" + planName.toUpperCase() + "%|%|%|%" + "'";
		}
		//getting the creationDateMin date from the filter
		if (filter.getCreationMin()!=null){
			qSelect = qSelect + " and sch.creationDate>=:creationDateMin";
		}
		//getting the creationDateMax date from the filter
		if (filter.getCreationMax()!=null){
			qSelect = qSelect + " and sch.creationDate<=:creationDateMax";
		}
		//getting the lastModificationDateMin date from the filter
		if (filter.getLastModificationMin()!=null){
			qSelect = qSelect + " and sch.lastModificationDate>=:lastModificationDateMin";
		}
		//getting the lastModificationDateMax date from the filter
		if (filter.getLastModificationMax()!=null){
			qSelect = qSelect + " and sch.lastModificationDate<=:lastModificationDateMax";
		}
		//getting the scheduledLaunchDateMin date from the filter
		if (filter.getScheduledLaunchMin()!=null){
			qSelect = qSelect + " and sch.scheduledLaunchDate>:scheduledLaunchDateMin";
		}
		//getting the scheduledLaunchDateMax date from the filter
		if (filter.getScheduledLaunchMax()!=null){
			qSelect = qSelect + " and sch.scheduledLaunchDate<:scheduledLaunchDateMax";
		}
		return qSelect + " order by sch.creationDate asc";
	}

//	Report Manager Queries
	
	@Override
	public String findReportsByParameters(String planName,
			XMLGregorianCalendar endTimeMin, XMLGregorianCalendar endTimeMax,
			String creationUserId, String launchUserId, String environment) {


		String qSelect = "select report.planId, report.startTime from ExecutionReportType as report"
			+ " where report.environment like :environment";
		
		if (planName != null && !planName.equals(""))
			qSelect = qSelect + " and upper(report.planId) like '" + "%" + planName.toUpperCase() + "%'";
//			qSelect = qSelect + " and upper(report.planId) like '" + "%" + planName.toUpperCase() + "%" + "|%" + "|%" + "'";
		if (endTimeMin != null)
			qSelect = qSelect + " and report.endTime>= :endTimeMin";
		if (endTimeMax != null)
			qSelect = qSelect + " and report.endTime<= :endTimeMax";
		if (creationUserId != null && !creationUserId.equals(""))
			qSelect = qSelect
					+ " and upper(report.creationUserId) like '" + "%" + creationUserId.toUpperCase() + "%" + "'";
		if (launchUserId != null && !launchUserId.equals(""))
			qSelect = qSelect + " and upper(report.launcherUserId) like '" + "%" + launchUserId.toUpperCase() + "%" + "'";

		qSelect = qSelect + " order by report.startTime";
		
		return qSelect;
	}

//	@Override
//	public String findReport(String planName, XMLGregorianCalendar calendar) {
//		
//		String qSelect = "select report from ExecutionReportType as report"
//			+ " where uppper(report.planId)='" + planName.toUpperCase() + "'"
//			+ " and report.startTime=:startTime";
//	
//		return qSelect;
//	}
}

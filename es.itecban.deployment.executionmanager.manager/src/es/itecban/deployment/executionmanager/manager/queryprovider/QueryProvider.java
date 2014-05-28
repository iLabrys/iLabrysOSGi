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
package es.itecban.deployment.executionmanager.manager.queryprovider;

import javax.xml.datatype.XMLGregorianCalendar;

import es.itecban.deployment.executionmanager.elements.PlanFilter;

/**
 * 
 * @author mjblazquez
 *
 */

public interface QueryProvider {
	
//	Plan Manager Queries
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public abstract String getDeploymentPlan(String name);
	
	/**
	 * 
	 * @return
	 */
	public abstract String getAllDeploymentPlans();
	
	/**
	 * 
	 * @param filter
	 * @param name
	 * @return
	 */
	public abstract String getDeploymentList(PlanFilter filter, String name);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public abstract String findPlanById(String id);
	
//	Report Manager Queries
	
	/**
	 * This query is not strict match
	 * @param planName
	 * @param endTimeMin
	 * @param endTimeMax
	 * @param creationUserId
	 * @param launchUserId
	 * @param environment
	 * @return
	 */
	public abstract String findReportsByParameters(String planName,
			XMLGregorianCalendar endTimeMin, XMLGregorianCalendar endTimeMax,
			String creationUserId, String launchUserId, String environment);
	
	/**
	 * It is strict match in both the name and the date
	 * @param planName
	 * @param calendar
	 * @return
	 */
	public abstract String findReport(String planName, XMLGregorianCalendar calendar);
}

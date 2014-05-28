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
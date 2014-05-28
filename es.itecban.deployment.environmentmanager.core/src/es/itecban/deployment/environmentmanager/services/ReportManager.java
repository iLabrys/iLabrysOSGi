package es.itecban.deployment.environmentmanager.services;

import javax.xml.datatype.XMLGregorianCalendar;

import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

/**
 * Interface of the Execution Manager that provides basic CRUD operations.
 * A plan manager implementation must be in contact with a EnvironmentManager
 * implementation in order to request a launch plan.
 * 
 * TODO the implementation will support plan scheduling
 * @author jlrrevuelta
 *
 */
public interface ReportManager {
	
	/**
	 * Save plan for future use. Store information 
	 * related to time 
	 * @param plan
	 * @throws Exception 
	 */
	public void save(ExecutionReportType report) throws Exception;
	
	/**
	 * 
	 * @param planID
	 * @return the deployment plan type or null if it is not found
	 */
	public String[] findExecutionReportByParameters(String planId,
			XMLGregorianCalendar endTimeMin, XMLGregorianCalendar endTimeMax,
			String creationUserId, String launcherUserId, String environment);	

	/**
	 * 
	 * @param query in HSQLDB format
	 * @return found plans
	 */
	public String[] findExecutionReports(String query);

	/**
	 * 
	 * @param planID
	 * @return the deployment plan type 
	 */
	public ExecutionReportType findExecutionReportByPlanId (String planId, XMLGregorianCalendar creationDate);
	
	/**
	 * Sets the creation user id in the report
	 * @param reportName
	 * @param startTime
	 * @param creationUserId
	 * @throws Exception 
	 */
	
	public void setCreationUserId (String reportName, XMLGregorianCalendar startTime, String creationUserId) throws Exception;
	
	/**
	 * Sets the launch user id in the report
	 * @param reportName
	 * @param startTime
	 * @param launcherUserId
	 * @throws Exception 
	 */
	
	public void setLauncherUserId (String reportName, XMLGregorianCalendar startTime, String launcherUserId) throws Exception;
}

package es.itecban.deployment.executionmanager.services;


import es.itecban.deployment.environmentmanager.services.ExecutionReport;
import es.itecban.deployment.executionmanager.core.Schedule;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;
/**
 * This component is responsible for scheduling and launching deployment plans
 * It needs connection to the plan interpreter in order to launch a plan
 * @author jlrrevuelta
 *
 */
public interface ScheduleManager{
	
	public static final String EMERGENCY_CALENDAR="emerg_calendar";
			
	/**
	 * The deployment plan includes information related to the environment and the
	 * scheduling. Schedule information will be interpreted as a schedule request.
	 * If the scheduling is possible then the plan will be marked for its eventual execution.	  
	 * 
	 * @param plan the plan to be scheduled
	 * @throws Exception if the plan cannot be scheduled as requested or if there are no
	 * timing parameters
	 */
	public void schedulePlan(DeploymentPlanType plan, boolean reschedule) throws Exception;
	/**
	 * An emergency plan will ignore restrictions on the environment calendar. This functionality should
	 * only be exposed to users with certain privileges
	 * @throws Exception
	 */
	public void scheduleEmergencyPlan(DeploymentPlanType plan) throws Exception;
	/**
	 * 
	 * @param environment identifier of the environment
	 * @return scheduled plans for this environment
	 * @throws Exception when the environment does not exist or there are problems
	 * when retrieving this information
	 */
	public Schedule[] getScheduledPlans(String environment) throws Exception;
		
}

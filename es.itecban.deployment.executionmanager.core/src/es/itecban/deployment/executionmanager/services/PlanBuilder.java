package es.itecban.deployment.executionmanager.services;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;

/**
 * Wraps the creation and manipulation of a deployment plan
 * 
 * @author rodrigo
 * 
 */
public interface PlanBuilder {

	/**
	 * Gives the resulting plan modeled as a DeploymentPlanType object .
	 * 
	 * @return the DeploymentPlanType object.
	 */
	public DeploymentPlanType getPlan();

	/**
	 * Gives the resulting plan modeled as a String containing an XML.
	 * 
	 * @return the String representing the plan.
	 */
	public String getPlanXML();

	/**
	 * Perform the necessary steps to build the plan. The type of the plan
	 * defines which steps must be performed. Has to be executed before the
	 * manual adjustments to the plan will be made.
	 * 
	 * @return true if the plan has been built, false if it contains errors.
	 */
	public boolean buildPlan();

	/**
	 * Checks if the plan has been correctly formed. Until this method returns
	 * true the plan is not valid.
	 * 
	 * @return true if the plan has been created without errors, false if it
	 *         contains errors.
	 */
	public boolean validatePlan();

	/**
	 * Gives the environment in which the plan is working.
	 * 
	 * @return A DeploymentTargetType representing the environment.
	 */
	public DeploymentTargetType getEnvironment();

}

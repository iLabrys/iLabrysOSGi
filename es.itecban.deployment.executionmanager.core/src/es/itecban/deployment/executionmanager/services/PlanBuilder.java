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

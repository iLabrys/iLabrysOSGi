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

import es.itecban.deployment.executionmanager.elements.PlanFilter;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;

/**
 * Interface of the Execution Manager that provides basic CRUD operations.
 * A plan manager implementation must be in contact with a EnvironmentManager
 * implementation in order to request a launch plan.
 * 
 * TODO the implementation will support plan scheduling
 * @author jlrrevuelta
 *
 */
public interface PlanManager {
	
	/**
	 * Save plan for future use. Store information 
	 * related to time 
	 * @param plan
	 */
	public long save(DeploymentPlanType plan) throws Exception;
	public void delete(DeploymentPlanType plan) throws Exception;
	public void update(DeploymentPlanType plan) throws Exception;
	
	/**
	 * 
	 * @param planID
	 * @return the deployment plan type or null if it is not found
	 */
//	FIXME: I think this is  not used
	public DeploymentPlanType findPlanById(String planID);
	
	/**
	 * 
	 * @param deploymentTarget
	 * @return
	 */
	public DeploymentPlanType[] findDeploymentPlans(PlanFilter filter);
	public DeploymentPlanType[] findDeploymentPlans(PlanFilter filter, String planName);
	
	
	/**
	 * 
	 * @param query in HSQLDB format
	 * @return found plans
	 */
	public DeploymentPlanType[] findDeploymentPlans(String query);
	
	public DeploymentPlanType findPlanByName(String planName);
	public String[] findPlansByName(String planName);
}

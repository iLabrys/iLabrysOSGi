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
package es.itecban.deployment.executionmanager.ws.services;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;



public interface ExecutionManagerService {

		// Service Interface
		public String launchPlan(String planID) throws Exception;
		public String addPlan(DeploymentPlanType plan) throws Exception;
		public String deletePlan(DeploymentPlanType plan) throws Exception;
		public String updatePlan(DeploymentPlanType plan) throws Exception;
		public DeploymentPlanType getPlan(String planID) throws Exception;
		public DeploymentPlanType[] findPlans(String target, ScheduleType schedule) throws Exception;
}

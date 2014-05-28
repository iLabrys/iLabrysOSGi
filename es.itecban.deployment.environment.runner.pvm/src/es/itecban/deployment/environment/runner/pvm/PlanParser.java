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
package es.itecban.deployment.environment.runner.pvm;

import org.eclipse.emf.common.util.EList;
import org.jbpm.pvm.client.ClientProcessDefinition;
import org.jbpm.pvm.internal.model.NodeImpl;
import org.jbpm.pvm.model.OpenProcessDefinition;

import es.itecban.deployment.model.deployment.plan.ActivityType;

/**
 * Parses deployment plans to obtain their corresponding PVM process definitions.
 * @author marco
 * @version 0.2
 */
public interface PlanParser {
	
	/**
	 * Creates a PVM process definition according to a deployment plan.
	 * @param plan the deployment plan to be parsed
	 * @return process definition of the plan
	 */
	public ClientProcessDefinition getProcessDefinition(EList<ActivityType> activities);
	public void createCompensationNodes(EList<ActivityType> compActivities, OpenProcessDefinition processDefinition, NodeImpl currentNode);

}

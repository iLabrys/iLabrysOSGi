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
package es.itecban.deployment.repository.services.core;

import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface ResolverCore {

	/**
	 * 
	 * @param unit reference to a deployment unit that is to be installed
	 * @return a graph with the required deployment units
	 * to successfully install the unit
	 * @throws Exception
	 */
	public DependencyGraph resolveDeploymentUnit(DeploymentUnitType unit) throws Exception;
	
	/**
	 * 
	 * @param unit reference to a deployment unit that is to be installed
	 * @param environmentName, to check the units already deployed in the environment
	 * @return a graph with the required deployment units
	 * to successfully install the unit
	 * @throws Exception
	 */
	public DependencyGraph resolveDeploymentUnit(DeploymentUnitType unit,
			String environmentName) throws Exception;	
}

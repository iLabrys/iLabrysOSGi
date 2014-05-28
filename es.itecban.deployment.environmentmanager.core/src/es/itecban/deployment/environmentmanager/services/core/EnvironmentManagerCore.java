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
package es.itecban.deployment.environmentmanager.services.core;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;

public interface EnvironmentManagerCore {

	public void deleteEnvironment(String environmentname) throws Exception;
	
	/**
	 * Updates the info of the given environment
	 * @param environmentname, the name of the environment to be updated
	 * @return true, if successful
	 */
	
	public DeploymentTargetType updateEnvironment(String environmentname)  throws Exception;
	
	public String[] getEnvironmentsName() throws Exception ;
		
	public DeploymentTargetType getEnvironment(String environmentName) throws Exception;
	
	/**
	 * 
	 * @param environment
	 * @param name the name of the unit to be found
	 * @param version the version range (optional parameter)
	 * @return an empty array if there is no result, or the list of containers where the unit has been found
	 * @throws Exception
	 */
	public ContainerType[] findRuntimeUnit(String environment, String name, String version, boolean strictMatch) throws Exception;
}

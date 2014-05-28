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
package es.itecban.deployment.environmentmanager.services;

import java.io.File;

import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;

public interface ConfigurationProvider {

	/**
	 * 
	 * @param environmentName
	 * @return the configuration of an environment (a properties file)
	 */
	public ConfigurationPropertiesType getEnvironmentConfiguration (String environmentName);
	
	/**
	 * 
	 * @param environmentName
	 * @param containerName
	 * @return the configuration of a container (there can be more than one archive)
	 */
	public File[] getContainerConfiguration (String environmentName, String containerName);
	
	/**
	 * 
	 * @param environmentName
	 * @param containerName
	 * @param fileName
	 * @return the configuration of a container given a name
	 */
	
	public File getContainerConfiguration (String environmentName, String containerName, String fileName);
	
	/**
	 * 
	 * @param environmentName
	 * @return an environment property associated to the given environment
	 */
	
	public EnvironmentPropertyType getEnvironmentProperty (String environmentName, String propertyName);
}

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

/**
 * This interface will be later in the core bundle
 * This interface gives the necessary methods to manage the environment and container configurations
 * @author mjblazquez
 *
 */

public interface ConfigurationManager {

	/**
	 * Shows the configuration of an environment
	 * @param environmentName
	 */
	public ConfigurationPropertiesType showEnvironmentConfiguration (String environmentName);
	
	/**
	 * Shows the attachments to a specific container
	 * @param environmentName
	 * @param containerName
	 */
	public File[] showContainerConfiguration (String environmentName, String containerName);
	
	/**
	 * Edits the configuration associated to an environment
	 * @param environmentName
	 */
	public void updateEnvironmentConfiguration (String environmentName, ConfigurationPropertiesType configuration);
	
	/**
	 * Edits the configuration associated to a container
	 * @param environmentName
	 * @param containerName
	 */
	/* el void dependerá de lo que necesite jjimenezt en la interfaz para representarlo */
	/* la forma en que se le pasará la configuración dependerá de lo que diga jjimenezt */
	/* se deberá comprobar que no exista ya un fichero con ese nombre, y si lo hay, que lo sobreescriba, o avise */
	//redundante
	//public boolean editContainerConfiguration (String environmentName, String containerName, File configuration);
	
	/**
	 * Adds a new environment in the database
	 * @param environmentName
	 */
	
	public void addEnvironment(String environmentName);
	
	/**
	 * 
	 * @param environmentName
	 * @throws Exception 
	 */
	
	public void addConfiguration2Environment (String environmentName, ConfigurationPropertiesType configuration) throws Exception;
	
	/**
	 * This must check the environment exists and has no other container with this name
	 * @param environmentName
	 * @param containerName
	 */
	public void addContainer2Environment (String environmentName, String containerName);
	
	/**
	 * 
	 * @param environmentName
	 * @param containerName
	 * @param file
	 * @throws Exception 
	 */
	/* this can substitute the method editContainerConfiguration */
	public void addConfigurationFile2Container (String environmentName, String containerName, File file) throws Exception;
	
	public void deleteConfigurationFileFromContainer (String environmentName, String containerName, String fileName) throws Exception;
}



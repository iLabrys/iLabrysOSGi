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
 * 
 * @author mjblazquez
 *
 */

public interface InterceptorManager {

	/**
	 * 
	 * @param configuration
	 * @param component
	 * @return a File object with the configured component
	 * @throws Exception
	 */
	public File configure (ConfigurationPropertiesType configuration, File component) throws Exception;

	boolean isConfigurable(String artifactName) throws Exception;
}

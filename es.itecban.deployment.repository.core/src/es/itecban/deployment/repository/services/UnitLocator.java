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
package es.itecban.deployment.repository.services;

import java.io.File;
import java.util.Date;
import java.util.Hashtable;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.repository.services.core.UnitLocatorCore;

/**
 * This service is used to obtain the location of the compressed archive that
 * corresponds to a certain deployment unit
 * 
 * @author jlrrevuelta, anavas
 * 
 */
public interface UnitLocator extends UnitLocatorCore{
	

	/**
	 * 
	 * @param tmpFile
	 *            the temporary file to be added
	 * @param du The DeploymentUnitType corresponding to the file being added
	 * @return null
	 * @throws Exception
	 */
	public void addArtifact(File tmpFile, DeploymentUnitType du)
			throws Exception;

	/**
	 * @param artifactName The name of the artifact you want to find
	 * @return null if it doesn't find the artifact or the file associated to the artifact
	 * @throws Exception
	 */
	public File getArtifact(String artifactName) throws Exception;
	
	/**
	 * @return A String array containing all the artifacts in the repository
	 * @throws Exception
	 */
	public String[] getArtifactsList() throws Exception;
	
	/**
	 * @return artifacts in the repository <artifactName, artifactDate>
	 * @throws Exception
	 */
	public Hashtable<String, Date> getArtifacts() throws Exception;
}

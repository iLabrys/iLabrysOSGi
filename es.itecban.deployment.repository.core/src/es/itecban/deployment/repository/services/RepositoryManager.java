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

import java.util.Hashtable;
import java.util.List;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.software.product.SoftwareProductType;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;

/**
 * This interface can be used to query, insert update and delete elements in the
 * repository. It is also an access point to find required resources
 * 
 * @author jlruiz
 * 
 */
public interface RepositoryManager extends RepositoryManagerCore {

	public static final String CHECKSUMTYPE = "MD5";
	public static final String JAVA_PKG_TYPE = "es.itecban.deployment.java.package";
	public static final String OSGI_SERVICE_TYPE = "es.itecban.deployment.service.osgi";
	public static final String DEPLOYMENT_UNIT = "deployment.unit";
	public static final String UNIT_VERSION = "unit.version";

	/**
	 * 
	 * @param name
	 *            Resource name you can use the following wildcards: '%' for any
	 *            number of characters, '_' for any singular character
	 * @param version
	 *            Version range of the exported resource. can use [ ( notation,
	 *            or be null to query for anyone
	 * @param type
	 *            Resource Type
	 * @param strictMatch
	 *            true if the resource name is to be matched exactly
	 * @return all DeploymentUnits which export a resource matching the three
	 *         arguments
	 * @throws Exception
	 */

	public DeploymentUnitType[] findDeploymentUnitByResource(String name,
			String version, String type, boolean strictMatch) throws Exception;

	/**
	 * 
	 * @return
	 */

	public SoftwareProductType[] getAllSoftwareProducts();

	/**
	 * 
	 * @param name
	 *            you can use the following wildcards: '%' for any number of
	 *            characters, '_' for any singular character
	 * @param version
	 *            The version or range of version of the units you want to find
	 * @param type
	 *            use null if you don't know the type of resource you are
	 *            looking for
	 * @return deployment units that provide resources that fit to your
	 *         description
	 * @throws Exception
	 */
	public DeploymentUnitType[] findResourceBySimilarName(String name,
			String version, String type) throws Exception;

	/**
	 * 
	 * @param product
	 * @throws Exception
	 */

	public void addSoftwareProduct(SoftwareProductType product)
			throws Exception;

	/**
	 * 
	 * @param product
	 * @throws Exception
	 */

	public void deleteSoftwareProduct(SoftwareProductType product)
			throws Exception;

	/**
	 * 
	 * @param product
	 * @throws Exception
	 */

	public void updateSoftwareProduct(SoftwareProductType product)
			throws Exception;

	/**
	 * 
	 * @param name
	 *            name of the product, wildcards are supported (% for any number
	 *            of characters and ? for any character)
	 * @param version
	 *            version code of the product, if null all software products
	 *            with that name will be returned
	 * @return the list of software products matching the search
	 * @throws Exception
	 */
	public SoftwareProductType[] findSoftwareProducts(String name,
			String version) throws Exception;

	/**
	 * @param packageName
	 *            name of the file that provides the deployment unit
	 * @return the list of deployment units if they are registered in the
	 *         repository with that package name and null otherwise
	 */
	public DeploymentUnitType[] findDeploymentUnitsByPackageName(
			String packageName) throws Exception;

	/**
	 * Returns a hashtable where the key is the
	 * deploymentUnitName_deploymentUnitVersion and the value is an array with
	 * all the resources found in the deployment unit with the given search
	 * criteria
	 * 
	 * @param resourceName
	 * @param resourceVersion
	 * @param resourceType
	 * @param strictMatch
	 * @return
	 * @throws Exception
	 */
	public Hashtable<String, ResourceType[]> findResources(String resourceName,
			String resourceVersion, String resourceType, boolean strictMatch)
			throws Exception;

	/**
	 * Returns an specific resource given the specific values for the search
	 * criteria
	 * 
	 * @param unitName
	 * @param resourceName
	 * @param resourceVersion
	 * @param resourceType
	 * @return
	 */
	public ResourceType findResource(String unitName, String unitVersion,
			String resourceName, String resourceVersion, String resourceType);
}

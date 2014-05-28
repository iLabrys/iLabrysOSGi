package es.itecban.deployment.repository.services.core;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface RepositoryManagerCore {
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public static final String CHECKSUMTYPE = "MD5";
	public static final String JAVA_PKG_TYPE = "es.itecban.deployment.java.package";
	public static final String OSGI_SERVICE_TYPE = "es.itecban.deployment.service.osgi";
	public static final String DEPLOYMENT_UNIT = "deployment.unit";
	public static final String UNIT_VERSION = "unit.version";
	
	public DeploymentUnitType[] getAllDeploymentUnits() throws Exception;
	
	/**
	 *  
	 * @param name Resource name
	 * you can use the following wildcards: '%' for any number of
	 *            characters, '_' for any singular character
	 * @param version Version range of the exported resource. can use [ ( notation, or be null to query for anyone
	 * @param type Resource Type
	 * @return all DeploymentUnits which export a resource matching the three arguments
	 * @throws Exception
	 */
	
	public DeploymentUnitType[] findDeploymentUnitByResource(String name,String version,String type) throws Exception;
	
	/**
	 * @param packageName
	 *            name of the file that provides the deployment unit
	 * @return the deployment unit if it is registered in the repository with
	 *         that package name and null otherwise
	 */
	
	public DeploymentUnitType findDeploymentUnitByPackageName(String packageName) throws Exception;
	
	/**
	 * Returns a DeploymentUnit matching exactly that name and version
	 * 
	 * @param name
	 *            The name of the deployment unit
	 * @param version
	 *            The version
	 * @return null if not found, or the deployment unit otherwise
	 * @throws Exception
	 */
	
	public DeploymentUnitType getDeploymentUnit(String name, String version) throws Exception;
	
	/**
	 * Returns an array with every Deployment Unit matching that name and
	 * versionRange
	 * 
	 * 
	 * 
	 * @param name
	 *            must not be null, can use % and _ for wildcards
	 * @param versionRange
	 *            if null equals to any. Accepts both exact requirements and
	 *            version ranges
	 * @return
	 * @throws Exception
	 */
	public DeploymentUnitType[] findDeploymentUnits(String name, String versionRange) throws Exception;
	
	
	/**
	 * 
	 * @param du
	 * @throws Exception
	 */

	public void addDeploymentUnit(DeploymentUnitType du) throws Exception;
	/**
	 * 
	 * @param du
	 * @throws Exception
	 */

	public void deleteDeploymentUnit(DeploymentUnitType du) throws Exception;

	/**
	 * 
	 * @param du
	 * @throws Exception
	 */

	public void updateDeploymentUnit(DeploymentUnitType du) throws Exception;
}

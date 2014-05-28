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

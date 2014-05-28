package es.itecban.deployment.environmentmanager.services;

import java.util.Hashtable;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;

public interface EnvironmentManager extends EnvironmentManagerCore{

public void addNewEnvironment (String environmentname, String dirIp) throws Exception;
	
	
	public void deleteEnvironment(String environmentname) throws Exception;
	
	/**
	 * 
	 * @param environmentname
	 * @return the DeploymentTargetType object with the info of the environment
	 * @throws Exception 
	 */
	
	public DeploymentTargetType getDeploymentTargetInfo(String environmentname) throws Exception;
	
	/**
	 * Updates the info of the given environment
	 * @param environmentname, the name of the environment to be updated
	 * @return true, if successful
	 */
	
	public DeploymentTargetType updateEnvironment(String environmentname)  throws Exception;
	
	/**
	 * Changes the dir Ip of an especific environment
	 * @param environmentname
	 * @param dirIp
	 * @return true, if successful
	 * @throws Exception 
	 */
	public void updateEnvinronmentUUID (String environmentname, String dirIp) throws Exception;
	
	/**
	 * 
	 */
	
	public String[] getEnvironmentsName() throws Exception ;
		
	/**
	 * method to intro a environment info in the database
	 * @param deploymenttarget
	 * @throws Exception 
	 */
	public void addDeploymentTarget(DeploymentTargetType deploymenttarget) throws Exception;
	
	/**
	 * auxiliar method to intro de info in the database
	 * @param info
	 */
	//FIXME remove and use marshallers for these things
	public void addDeploymentTargetTypeInfo(String info);
	
	/**
	 * Find resources in a environment using information related to resource name, type and version.
	 * @param rr Version and resource properties are optional parameters, type is required and the name also.
	 * @parameter strictMatch if true then an exact match is queried, else it is autocompleted with wildcards
	 * @return a collection of resources, where the key is the container name and the value the a runtimeresource array 
	 */
	public Hashtable<String, RuntimeResourceType[]> findResources(RequiredResourceType rr, String environment, boolean strictMatch) throws Exception;
	/**
	 * 
	 * @param environment
	 * @param resourceType
	 * @param name optional parameter, if null or "" then no name is used for the query
	 * @param strictMatch if true then an exact match is carried out
	 * @return a collection of resources, where the key is the container name and the value the a runtimeresource array
	 * @throws Exception
	 */
	public Hashtable<String, RuntimeResourceType[]> findResources(String environment,  String name, String resourceType, boolean strictMatch) throws Exception;
	
	/**
	 * 
	 * @param environment
	 * @param name the name of the unit to be found
	 * @param version the version range (optional parameter). If "", all the versions are returned
	 * @return an empty array if there is no result, or the list of containers where the unit has been found
	 * @throws Exception
	 */
	public ContainerType[] findRuntimeUnit(String environment, String name, String version, boolean strictMatch) throws Exception;
	
	public Hashtable<String, RuntimeUnitType[]> findRuntimeUnitInContainer(String environmentName, String name,
			String version, boolean strictMatch) throws Exception;
		
	public RuntimeResourceType findResource(String environmentName, String containerName, String resourceName, String resourceVersion, String types) throws Exception;
}

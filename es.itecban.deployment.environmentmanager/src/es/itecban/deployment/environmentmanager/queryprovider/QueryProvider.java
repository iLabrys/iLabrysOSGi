package es.itecban.deployment.environmentmanager.queryprovider;

/**
 * Utility interface for solving queries required by the
 * Repository Manager interface. There is a default implementation
 * for the query interface and then extra implementations can be added
 * 
 * @author jlrrevuelta
 *
 */
public interface QueryProvider {

	/**
	 * No case sensitive
	 * @param resourceName
	 * @param resourceType
	 * @param strictMatch
	 * @return
	 */
	public abstract String findUnitResources(String resourceName, String resourceType, boolean strictMatch);
	
	/**
	 * No case sensitive
	 * @param resourceName
	 * @param resourceType
	 * @param strictMatch
	 * @return
	 */
	public abstract String findContainerResources(String resourceName, String resourceType, boolean strictMatch);
	
	/**
	 * No case sensitive
	 * @param name
	 * @param version
	 * @param strictMatch
	 * @return
	 */
	public abstract String findUnitInContainers(String name, String version, boolean strictMatch);
	
	/**
	 * No case sensitive
	 * @param name
	 * @param version
	 * @param strictMatch
	 * @return
	 */
	public abstract String getUnitsFromContainer(String name, String version, boolean strictMatch);
	
	/**
	 * This method is case sensitive
	 * @return
	 */
	public abstract String findUnitResource();
	
	/**
	 * this method is case sensitive
	 * @return
	 */
	public abstract String findContainterResource();
}
package es.itecban.deployment.executionmanager.elements;


import java.util.Map;

/**
 * Class that wraps the resources that will be manually configured
 * @author rodrigo
 *
 */
public class UnresolvedResource {

	private String parentName;
	private String parentVersion;
	private String resource;
	// Map between the property name and its value
	private Map<String, String> properties;
	
	/**
	 * Wrap a resource that will be manually configured
	 * @param parentName The name of the parent of this resource (unit, container or node)
	 * @param parentVersion The version of the parent of this resource (unit, container or node)
	 * @param resource The name of the resource
	 * @param properties A map with the pairs "configurable property"-"unresolved value" of the resource
	 */
	public UnresolvedResource(String parentName, String parentVersion, String resource, Map<String, String> properties) {
		this.parentName = parentName;
		this.parentVersion = parentVersion;
		this.resource = resource;
		this.properties = properties;
	}

	/**
	 * Manually configures a property of this resource
	 * @param property The name of the property
	 * @param value The resolved value to be assigned
	 * @throws Exception Of a property with the given name has not been found
	 */
	public void resolveProperty(String property, String value) throws Exception {
		if (properties.containsValue(property)) {
			properties.put(property, value);
		}
		else {
			throw new Exception("Property not found");
		}
	}
	
	/**
	 * 
	 * @return The name of the parent of this resource (unit, container or node)
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * 
	 * @return The version of the parent of this resource (unit, container or node)
	 */
	public String getParentVersion() {
		return parentVersion;
	}

	/**
	 * 
	 * @return The name of the resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * 
	 * @return properties A map with the pairs "configurable property"-"unresolved/resolved value" of the resource
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	@Override
	public boolean equals(Object obj) {
		if (((UnresolvedResource) obj).getParentName().equals(parentName) && ((UnresolvedResource) obj).getParentVersion().equals(parentVersion) && ((UnresolvedResource) obj).getResource().equals(resource)) {
			return true;
		}
		else {
			return false;
		}
	}
}

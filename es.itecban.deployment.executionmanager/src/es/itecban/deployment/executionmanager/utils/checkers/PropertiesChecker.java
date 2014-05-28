package es.itecban.deployment.executionmanager.utils.checkers;

import java.util.logging.Level;
import java.util.logging.Logger;

import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType;

/**
 * 
 * @author Rodrigo Garcia
 *
 */
public class PropertiesChecker {

private static Logger logger = Logger.getLogger(ResourceChecker.class.getName());
	
	static {
		logger.setLevel(Level.FINE);
	}
	
	public static boolean compareProperties(RequiredResourcePropertyType reqResProperty, PropertyType property) {
		// Check name
		String reqResPropertyName = reqResProperty.getName();
		String propertyName = property.getName();
		if (!reqResPropertyName.equals(propertyName)) {
			return false;
		}
		// Check value
		String reqResPropertyValue = reqResProperty.getValue();
		String propertyValue = property.getValue();
		if (!reqResPropertyValue.equals(propertyValue)) {
			return false;
		}
		// Not needed to check type
		return true;
	}
}

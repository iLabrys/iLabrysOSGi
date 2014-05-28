package es.itecban.deployment.executionmanager.utils;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourceType;

public class ExpressionResolver {

	final private String CONFIGURATION_SOURCE = "es.itecban.configuration.source";
	final private String DEPENDENCIES = "DEPENDENCIES";
	final private String HOSTCONTAINER = "HOSTCONTAINER";
	final private String HOSTNODE = "HOSTNODE";
	final private String SEPARATOR = "#";
	
	private PlanContextBrowser browser;
	
	private static Logger logger = Logger.getLogger("es.itecban.deployment.executionmanager");

	static {
		logger.setLevel(Level.ALL);
	}
	
	
	public ExpressionResolver(PlanContextBrowser browser) {
		this.browser = browser;
	}
	
	public String getConfigurationSource(ResourceType resource) {
		// Iterate the resource properties
		List<PropertyType> properties = resource.getResourceProperties().getResourceProperty();
		for (Iterator<PropertyType> propertyIterator = properties.iterator(); propertyIterator.hasNext();) {
			PropertyType property = (PropertyType) propertyIterator.next();
			// Check if its the configuration source property
			if (property.getName().equals(CONFIGURATION_SOURCE)) {
				return property.getValue();
			}
		}
		// Code should never reach this point...
		return null;
	}
	
	public String resolveExpression(String expression, String target, String source) {
		// Split the string in as many parts as configurable values it contains
		String[] substrings = expression.split("\\&\\{\\}");
		// Take its length to get the number of configurable values
		int length = substrings.length;
		// If the string begins and ends with a configurable value reduce this length by 1 
		if (!(expression.charAt(0) == '$') &&
			!(expression.charAt(expression.length() -1 ) == '}')) {
			length++;
		}
		// Create a temporary string to be modified
		String tempString = new String(expression.getBytes());
		// Check every value
		for (int i = 0; i < length; i++) {
			// Get the configurable value
			String part = tempString.substring(tempString.indexOf("${"), tempString.indexOf("}") + 1);
			// Update the temporary string 
			tempString = tempString.substring(tempString.indexOf("}") + 1);
			logger.info("Resolving configuration value " + part);
			// Resolve the value
			String newPart = resolveValue(part, target, source);
			// If the returned part is null the property is not configurable
			if (newPart == null) {
				logger.info("Resolving configuration value " + part + " : FAIL");
				return null;
			}
			// If the returned part is a configurable value not resolved yet, keep the original values
			if (newPart.contains("${")) {
				logger.info("Resolving configuration value " + part + " : Dependency needed : FAIL");
				return expression;
			}
			// Update the string
			expression = expression.replace(part, newPart);
			logger.info("Resolving configuration value " + part + " with " + newPart + " : SUCCESS");
		}
		return expression;
	}
	
	private String resolveValue(String value, String target, String source) {
		String variable1 = null;
		String variable2 = null;
		String variable3 = null;
		// Check if the value has 1, 2 o 3 variables
		String trimmedValue = value.substring(2, value.length() - 1);
		String[] substrings = trimmedValue.split("\\" + SEPARATOR);
		int variables = substrings.length;
		// Check the configuration source
		// If it's a deployment unit
		if (source.equals(DEPENDENCIES)) {
			// If it has 2 variables
			if (variables == 2) {
				variable1 = substrings[0]; // Resource
				variable2 = substrings[1]; // Property
				String resolvedValue = browser.findResourceProperty(variable1, variable2, target.split("\\" + SEPARATOR)[3]);
				if (resolvedValue == "") {
					return value;
				}
				return resolvedValue;
			}
			// If it has 3
			else if (variables == 3) {
				variable1 = substrings[0]; // Unit
				variable2 = substrings[1]; // Resource
				variable3 = substrings[2]; // Property
				String resolvedValue = browser.findUnitResourceProperty(variable1, variable2, variable3);
				if (resolvedValue == "") {
					return value;
				}
				return resolvedValue;
			}
		}
		// If it's a container
		else if (source.equals(HOSTCONTAINER)) {
			String hostContainer = target.split("\\" + SEPARATOR)[2];
			// If it has 1 variable
			if (variables == 1) {
				variable1 = substrings[0]; // Property
				String resolvedValue = browser.findContainerProperty(hostContainer, variable1);
				if (resolvedValue == "") {
					return value;
				}
				return resolvedValue;
			}
			// If it has 2
			else if (variables == 2) {
				variable1 = substrings[0]; // Resource
				variable2 = substrings[1]; // Property
				String resolvedValue = browser.findContainerResourceProperty(hostContainer, variable1, variable2);
				if (resolvedValue == "") {
					return value;
				}
				return resolvedValue;
			}
		}
		// If it's a node
		else if (source.equals(HOSTNODE)) {
			String hostNode = target.split("\\" + SEPARATOR)[1];
			// If it has 1 variable
			if (variables == 1) {
				variable1 = substrings[0]; // Property
				String resolvedValue = browser.findNodeProperty(hostNode, variable1);
				if (resolvedValue == "") {
					return value;
				}
				return resolvedValue;
			}
			// If it has 2
			else if (variables == 2) {
				variable1 = substrings[0]; // Resource
				variable2 = substrings[1]; // Property
				String resolvedValue = browser.findNodeResourceProperty(hostNode, variable1, variable2);
				if (resolvedValue == "") {
					return value;
				}
				return resolvedValue;
			}
		}
		// Else... something horrible happened
		logger.severe("Malformed configuration value: " +  value);
		return null;
	}
}

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
package es.itecban.deployment.executionmanager.utils.checkers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.executionmanager.elements.Constraint;
import es.itecban.deployment.model.deployment.target.NodeResourcesType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType;
import es.itecban.deployment.model.deployment.target.StatusType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.model.deployment.unit.ResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.TypesType;

/**
 * 
 * @author Rodrigo Garcia
 * 
 */
public class ResourceChecker {

	private final static String SHARED_LIBRARY_TYPE = "es.itecban.deployment.architecture.shared.library";
	private static Logger logger = Logger.getLogger(ResourceChecker.class
			.getName());

	static {
		logger.setLevel(Level.FINE);
	}

	// TODO take code outside to clean methods
	// TODO define the comparison method of properties (exactly the same, at
	// least the same, more than the same?)

	public static boolean compareConstraint(Constraint constraint,
			ResourceType resource) {
		// Check names
		String constraintName = constraint.getName();
		String resourceName = resource.getName();

		if (!constraintName.equals(resourceName)) {
			return false;
		}
		// Check versions
		String constraintVersion = constraint.getVersion();
		String resourceVersion = resource.getVersion();
		// This is different in every method
		if (constraintVersion != null
				&& resourceVersion != null
				&&
				// !constraintVersion.equals("") &&
				// !resourceVersion.equals("") &&
				!constraintVersion.equalsIgnoreCase("unknown")
				&& !resourceVersion.equalsIgnoreCase("unknown")
				&& !VersionChecker.compareVersions(constraintVersion,
						resourceVersion)) {
			return false;
		}
		// Check types
		String constraintType = constraint.getType();
		TypesType resourceTypes = resource.getTypes();
		List<String> resourceTypesList = resourceTypes.getType();
		if (!resourceTypesList.contains(constraintType)) {
			return false;
		}
		// If all it's ok return true
		return true;
	}

	public static boolean compareConstraint(Constraint constraint,
			RuntimeResourceType resource) {
		
		// Turnaround
		// If the constraint has the type es.itecban.deployment.architecture.shared.library
		// then this comparison is skipped (till the agents can obtain this type of information
		if (constraint.getType().equals(ResourceChecker.SHARED_LIBRARY_TYPE))
			return true;
		
		
		
		// Check names
		String constraintName = constraint.getName();
		String containerResourceName = resource.getName();
		logger.finest("Comparing constraint: " + constraintName
				+ "with resource: " + containerResourceName);
		if (!constraintName.equals(containerResourceName)) {
			return false;
		}
		// Check versions
		String constraintVersion = constraint.getVersion();
		String containerResourceVersion = resource.getVersion();
		// This is different in every method
		if (constraintVersion != null
				&& containerResourceVersion != null
				&&
				// !constraintVersion.equals("") &&
				// !containerResourceVersion.equals("") &&
				!constraintVersion.equalsIgnoreCase("unknown")
				&& !containerResourceVersion.equalsIgnoreCase("unknown")
				&& !VersionChecker.compareVersions(constraintVersion,
						containerResourceVersion)) {
			return false;
		}
		// Check types
		String constraintType = constraint.getType();
		RuntimeResourceTypesType resourceTypes = resource
				.getRuntimeResourceTypes();
		EList<String> resourceTypesList = resourceTypes.getType();
		if (!resourceTypesList.contains(constraintType)) {
			return false;
		}
		// If all it's ok return true
		return true;
	}

	/**
	 * @param requiredResource
	 *            RequiredResouceType modeling the resource that needs to be
	 *            satisfied.
	 * @param resource
	 *            ResourceType modeling the provided resource to be matched
	 *            against the required resource.
	 * @return true if the provided resource satisfies the required resource.
	 */
	
	public static boolean compareResources(
			RequiredResourceType requiredResource, ResourceType resource) {
		// Check names
		String reqResName = requiredResource.getName();
		String resName = resource.getName();
		logger.finest("Comparing required resource: " + reqResName
				+ "with resource: " + resName);
		if (!reqResName.equals(resName)) {
			// Turn around. Now (03/12/09) the jndi resources has the jndi name
			// as the resource name instead of in the resource jndi property. To
			// have compatibility with old descriptors, this turn around is done
			if (isJndiOrJCAResource(requiredResource)) {
				// It has to be compared with the runtimeResourceType with the
				// name "resourceName"
				List<PropertyType> propertyList = resource
						.getResourceProperties().getResourceProperty();
				for (PropertyType property : propertyList) {
					if (property.getName().equals("resourceName")) {
						String value = property.getValue();
						if (value.equals(reqResName))
							return true;
					}
				}
			}
			return false;
		}
		// Check versions
		String reqResVersion = requiredResource.getVersion();
		String resVersion = resource.getVersion();
		// This is different in every method
		if (!VersionChecker.compareVersions(reqResVersion, resVersion)) {
			return false;
		}
		// Check types
		String reqResType = requiredResource.getType();
		TypesType resTypes = resource.getTypes();
		List<String> resTypesList = resTypes.getType();
		if (!resTypesList.contains(reqResType)) {
			return false;
		}
		// Check properties
		RequiredResourcePropertiesType reqResProperties = requiredResource
				.getRequiredResourceProperties();
		List<RequiredResourcePropertyType> reqResPropsList = reqResProperties
				.getProperty();
		ResourcePropertiesType resProperties = resource.getResourceProperties();
		List<PropertyType> resPropsList = resProperties.getResourceProperty();
		if (reqResPropsList.size() != resPropsList.size()) {
			return false;
		}
		for (PropertyType resProperty : resPropsList) {
			boolean match = false;
			for (RequiredResourcePropertyType reqResProperty : reqResPropsList) {
				if (PropertiesChecker.compareProperties(reqResProperty,
						resProperty)) {
					match = true;
				}
			}
			if (match = false) {
				return false;
			}
		}
		// If all it's ok return true
		return true;
	}

	/**
	 * Turnaround method. Returns true only if the required resource has the
	 * type of jdbc datasource or jca connection factory
	 * 
	 * @param requiredResource
	 * @return
	 */
	private static boolean isJndiOrJCAResource(
			RequiredResourceType requiredResource) {

		String jndi = "es.itecban.deployment.j2ee.jdbc.datasource";
		String jca = "es.itecban.deployment.j2ee.jca.connectionfactory";
		if (requiredResource.getType().equals(jndi)
				|| requiredResource.getType().equals(jca)) {
			return true;
		}
		return false;
	}

	public static boolean compareResources(ResourceType resource,
			RequiredResourceType requiredResource) {
		// Check names
		String reqResName = requiredResource.getName();
		String resName = resource.getName();
		logger.finest("Comparing required resource: " + reqResName
				+ "with resource: " + resName);
		if (!reqResName.equals(resName)) {
			return false;
		}
		// Check versions
		String reqResVersion = requiredResource.getVersion();
		String resVersion = resource.getVersion();
		// This is different in every method
		if (!VersionChecker.compareVersions(resVersion, reqResVersion)) {
			return false;
		}
		// Check types
		String reqResType = requiredResource.getType();
		TypesType resTypes = resource.getTypes();
		List<String> reqResTypesList = resTypes.getType();
		if (!reqResTypesList.contains(reqResType)) {
			return false;
		}
		// Check properties
		RequiredResourcePropertiesType reqResProperties = requiredResource
				.getRequiredResourceProperties();
		List<RequiredResourcePropertyType> reqResPropsList = reqResProperties
				.getProperty();
		ResourcePropertiesType resProperties = resource.getResourceProperties();
		List<PropertyType> resPropsList = resProperties.getResourceProperty();
		if (reqResPropsList.size() != resPropsList.size()) {
			return false;
		}
		for (PropertyType resProperty : resPropsList) {
			boolean match = false;
			for (RequiredResourcePropertyType reqResProperty : reqResPropsList) {
				if (PropertiesChecker.compareProperties(reqResProperty,
						resProperty)) {
					match = true;
				}
			}
			if (match = false) {
				return false;
			}
		}
		// If all it's ok return true
		return true;
	}

	public static boolean compareResources(
			RuntimeResourceType containerResource, ResourceType resource) {
		// Check names
		String contResName = containerResource.getName();
		String resName = resource.getName();
		logger.finest("Comparing container resource: " + contResName
				+ "with resource: " + resName);
		if (!contResName.equals(resName)) {
			return false;
		}
		// Check versions
		String contResVersion = containerResource.getVersion();
		String resVersion = resource.getVersion();
		// This is different in every method
		if (!VersionChecker.compareVersions(contResVersion, resVersion)) {
			return false;
		}
		// Check types
		RuntimeResourceTypesType contResTypes = containerResource
				.getRuntimeResourceTypes();
		EList<String> contResTypesList = contResTypes.getType();
		TypesType resTypes = resource.getTypes();
		List<String> reqResTypesList = resTypes.getType();
		if (contResTypesList.size() != reqResTypesList.size()) {
			return false;
		}
		for (String reqResType : reqResTypesList) {
			if (!reqResTypesList.contains(reqResType)) {
				return false;
			}
		}
		// Check properties
		RuntimeResourcePropertiesType contResProperties = containerResource
				.getRuntimeResourceProperties();
		EList<PropertyType> contResPropsList = contResProperties
				.getResourceProperty();
		ResourcePropertiesType resProperties = resource.getResourceProperties();
		List<PropertyType> resPropsList = resProperties.getResourceProperty();
		if (contResPropsList.size() != resPropsList.size()) {
			return false;
		}
		for (PropertyType resProperty : resPropsList) {
			if (!contResPropsList.contains(resProperty)) {
				return false;
			}
		}
		// TODO Check status?
		StatusType contResStatus = containerResource.getStatus();
		// If all it's ok return true
		return true;
	}

	public static boolean compareResources(ResourceType resource,
			RuntimeResourceType containerResource) {
		// Check names
		String contResName = containerResource.getName();
		String resName = resource.getName();
		logger.finest("Comparing container resource: " + contResName
				+ "with resource: " + resName);
		if (!contResName.equals(resName)) {
			return false;
		}
		// Check versions
		String contResVersion = containerResource.getVersion();
		String resVersion = resource.getVersion();
		// This is different in every method
		if (!VersionChecker.compareVersions(resVersion, contResVersion)) {
			return false;
		}
		// Check types
		RuntimeResourceTypesType contResTypes = containerResource
				.getRuntimeResourceTypes();
		EList<String> contResTypesList = contResTypes.getType();
		TypesType resTypes = resource.getTypes();
		List<String> reqResTypesList = resTypes.getType();
		if (contResTypesList.size() != reqResTypesList.size()) {
			return false;
		}
		for (String reqResType : reqResTypesList) {
			if (!reqResTypesList.contains(reqResType)) {
				return false;
			}
		}
		// Check properties
		RuntimeResourcePropertiesType contResProperties = containerResource
				.getRuntimeResourceProperties();
		EList<PropertyType> contResPropsList = contResProperties
				.getResourceProperty();
		ResourcePropertiesType resProperties = resource.getResourceProperties();
		List<PropertyType> resPropsList = resProperties.getResourceProperty();
		if (contResPropsList.size() != resPropsList.size()) {
			return false;
		}
		for (PropertyType resProperty : resPropsList) {
			if (!contResPropsList.contains(resProperty)) {
				return false;
			}
		}
		// TODO Check status?
		StatusType contResStatus = containerResource.getStatus();
		// If all it's ok return true
		return true;
	}

	public static boolean compareResources(RuntimeResourceType runtimeResource,
			RequiredResourceType requiredResource) {
		// Check names
		String reqResName = requiredResource.getName();
		String contResName = runtimeResource.getName();
		logger.finest("Comparing required resource: " + reqResName
				+ "with container resource: " + contResName);
		if (!reqResName.equals(contResName)) {
			return false;
		}
		// Check versions
		String reqResVersion = requiredResource.getVersion();
		String contResVersion = runtimeResource.getVersion();
		// This is different in every method
		if (!VersionChecker.compareVersions(contResVersion, reqResVersion)) {
			return false;
		}
		// Check types
		String reqResType = requiredResource.getType();
		RuntimeResourceTypesType contResTypes = runtimeResource
				.getRuntimeResourceTypes();
		EList<String> reqResTypesList = contResTypes.getType();
		if (!reqResTypesList.contains(reqResType)) {
			return false;
		}
		// Check properties
		RequiredResourcePropertiesType reqResProperties = requiredResource
				.getRequiredResourceProperties();
		List<RequiredResourcePropertyType> reqResPropsList = reqResProperties
				.getProperty();
		RuntimeResourcePropertiesType contResProperties = runtimeResource
				.getRuntimeResourceProperties();
		EList<PropertyType> contResPropsList = contResProperties
				.getResourceProperty();
		if (reqResPropsList.size() != contResPropsList.size()) {
			return false;
		}
		for (PropertyType resProperty : contResPropsList) {
			boolean match = false;
			for (RequiredResourcePropertyType reqResProperty : reqResPropsList) {
				if (PropertiesChecker.compareProperties(reqResProperty,
						resProperty)) {
					match = true;
				}
			}
			if (match = false) {
				return false;
			}
		}
		// If all it's ok return true
		return true;
	}

	public static boolean compareResources(ResourceType resource1,
			ResourceType resource2) {
		// Check names
		String res1Name = resource1.getName();
		String res2Name = resource2.getName();
		logger.finest("Comparing resource: " + res1Name + "with resource: "
				+ res2Name);
		if (!res1Name.equals(res2Name)) {
			return false;
		}
		// Check versions
		String res1Version = resource1.getVersion();
		String res2Version = resource2.getVersion();
		// This is different in every method
		if (!VersionChecker.compareVersions(res1Version, res2Version)) {
			return false;
		}
		// Check types
		TypesType res1Types = resource1.getTypes();
		List<String> res1TypesList = res1Types.getType();
		TypesType res2Types = resource2.getTypes();
		List<String> res2TypesList = res2Types.getType();
		if (res1TypesList.size() != res2TypesList.size()) {
			return false;
		}
		for (String res1Type : res1TypesList) {
			if (!res2TypesList.contains(res1Type)) {
				return false;
			}
		}
		// Check properties
		ResourcePropertiesType res1Properties = resource1
				.getResourceProperties();
		List<PropertyType> res1PropsList = res1Properties.getResourceProperty();
		ResourcePropertiesType res2Properties = resource2
				.getResourceProperties();
		List<PropertyType> res2PropsList = res2Properties.getResourceProperty();
		if (res1PropsList.size() != res2PropsList.size()) {
			return false;
		}
		for (PropertyType res1Property : res1PropsList) {
			if (!res2PropsList.contains(res1Property)) {
				return false;
			}
		}
		// If all it's ok return true
		return true;
	}

	/**
	 * @param requiredResource
	 *            RequiredResourceType modeling the resource that needs to be
	 *            satisfied.
	 * @param node
	 *            The node in which the required resource tries to be found.
	 * @return true if the node satisfies the required resource.
	 */
	public static boolean isResourceInNode(
			RequiredResourceType requiredResource, NodeType node) {
		// Node resources
		NodeResourcesType nodeResources = node.getNodeResources();
		EList<ResourceType> resourcesList = nodeResources.getNodeResource();
		logger.info("Cheking if required resource: "
				+ requiredResource.getName() + " is in node " + node.getName());
		// Iterating resources in node
		for (ResourceType nodeResource : resourcesList) {
			if (compareResources(requiredResource, nodeResource))
				return true;
		}
		return false;
	}
}

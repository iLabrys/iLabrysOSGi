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
package es.itecban.deployment.environmentmanager.manager.queryprovider.oracle;

import es.itecban.deployment.environmentmanager.queryprovider.DefaultQueryProvider;

public class OracleQueryProvider extends DefaultQueryProvider {

	@Override
	public String findUnitResources(String resourceName, String resourceType,
			boolean strictMatch) {

		String qSelect = "select nodeContainer.name, resource from RuntimeResourceType as resource"
				+ ", DeploymentTargetType as dtt"
				+ " inner join dtt.nodes nodes"
				+ " inner join nodes.node node"
				+ " inner join node.nodeContainers nodeContainers"
				+ " inner join nodeContainers.nodeContainer nodeContainer"
				+ " inner join nodeContainer.runtimeUnits runtimeUnits"
				+ " inner join runtimeUnits.unit unit"
				+ " inner join unit.runtimeResources runtimeResources"
				+ " inner join runtimeResources.resource containerResource"
				+ " inner join resource.runtimeResourceTypes runtimeResourceTypes"
				+ " inner join runtimeResourceTypes.type type"
				+ " where resource.e_id = containerResource.e_id and"
				+ " dtt.timestamp=:timestamp and"
				+ " dtt.name=:environmentName and"
				+ " type ='"
				+ resourceType.trim() + "'";

		if (!(resourceName == null || resourceName.equals("") )) {
			if (!strictMatch) 
				qSelect = qSelect + " and upper(resource.name) like '" + "%"
						+ resourceName.toUpperCase() + "%" + "'";
			else 
				qSelect = qSelect + " and resource.name = '" + resourceName
						+ "'";
		}
		return qSelect;
	}

	@Override
	public String findContainerResources(String resourceName,
			String resourceType, boolean strictMatch) {

		String qSelect = "select nodeContainer.name, resource from RuntimeResourceType as resource"
				+ ", DeploymentTargetType as dtt"
				+ " inner join dtt.nodes nodes"
				+ " inner join nodes.node node"
				+ " inner join node.nodeContainers nodeContainers"
				+ " inner join nodeContainers.nodeContainer nodeContainer"
				+ " inner join nodeContainer.containerResources containerResources"
				+ " inner join containerResources.containerResource containerResource"
				+ " inner join resource.runtimeResourceTypes runtimeResourceTypes"
				+ " inner join runtimeResourceTypes.type type"
				+ " where resource.e_id = containerResource.e_id and"
				+ " dtt.timestamp=:timestamp and"
				+ " dtt.name=:environmentName and"
				+ " type ='"
				+ resourceType.trim() + "'";

		if (!(resourceName == null || resourceName.equals("") )) {
			if (!strictMatch) {
				qSelect = qSelect + " and upper(resource.name) like '" + "%"
						+ resourceName.toUpperCase() + "%" + "'";
			} else {
				qSelect = qSelect + " and resource.name='" + resourceName + "'";
			}
		}
		return qSelect;
	}

	@Override
	public String findUnitInContainers(String name, String version,
			boolean strictMatch) {

		String qSelect = "select nodeContainer from DeploymentTargetType as dtt"
			+ " inner join dtt.nodes nodes"
			+ " inner join nodes.node node"
			+ " inner join node.nodeContainers nodeContainers"
			+ " inner join nodeContainers.nodeContainer nodeContainer"
			+ " inner join nodeContainer.runtimeUnits runtimeUnits"
			+ " inner join runtimeUnits.unit unit"
			+ " where dtt.timestamp=:timestamp"
			+ " and dtt.name=:environmentName";

		if (version != null)
			qSelect = qSelect + " and unit.version like '" + "%" + version
					+ "%" + "'";
		if (!strictMatch)
			qSelect = qSelect + " and upper(unit.name) like '" + "%"
					+ name.toUpperCase() + "%" + "'";
		else
			qSelect = qSelect + " and unit.name ='" + name + "'";
		return qSelect;
	}

	@Override
	public String getUnitsFromContainer(String name, String version,
			boolean strictMatch) {

		String qSelect = "select nodeContainer.name, unit from DeploymentTargetType as dtt"
				+ " inner join dtt.nodes nodes"
				+ " inner join nodes.node node"
				+ " inner join node.nodeContainers nodeContainers"
				+ " inner join nodeContainers.nodeContainer nodeContainer"
				+ " inner join nodeContainer.runtimeUnits runtimeUnits"
				+ " inner join runtimeUnits.unit unit"
				+ " where dtt.timestamp=:timestamp"
				+ " and dtt.name=:environmentName";
		if (version != null)
			qSelect = qSelect + " and unit.version like '" + "%" + version
					+ "%" + "'";
		if (!strictMatch)
			qSelect = qSelect + " and upper(unit.name) like '" + "%"
					+ name.toUpperCase() + "%" + "'";
		else
			qSelect = qSelect + " and unit.name='" + name + "'";
		return qSelect;
	}
}

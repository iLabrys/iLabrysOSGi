package es.itecban.deployment.environmentmanager.queryprovider;

public class DefaultQueryProvider implements QueryProvider {

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

		if (!(resourceName == null || resourceName.equals(""))) {
			if (!strictMatch) {
				qSelect = qSelect + " and resource.name like '" + "%"
						+ resourceName + "%" + "'";
			} else {
				qSelect = qSelect + " and resource.name = '" + resourceName
						+ "'";
			}
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

		if (!( resourceName == null || resourceName.equals(""))) {
			if (!strictMatch) {
				qSelect = qSelect + " and resource.name like '" + "%"
						+ resourceName + "%" + "'";
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
			qSelect = qSelect + " and unit.name like '" + "%" + name + "%"
					+ "'";
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
			qSelect = qSelect + " and unit.name like '" + "%" + name + "%"
					+ "'";
		else
			qSelect = qSelect + " and unit.name like'" + name + "'";
		return qSelect;
	}

	@Override
	public String findUnitResource() {

		String qSelect = "select resource from RuntimeResourceType as resource "
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
				+ " where resource.name=:resourceName and"
				+ " resource.version=:resourceVersion and"
				+ " nodeContainer.name=:containerName and"
				+ " resource.e_id=containerResource.e_id and"
				+ " dtt.timestamp=:timestamp and" 
				+ " dtt.name=:environmentName and"
				+ " type =:type";
		return qSelect;
	}

	@Override
	public String findContainterResource() {

		String qSelect = "select resource from RuntimeResourceType as resource "
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
				+ " resource.name=:resourceName and"
				+ " resource.version=:resourceVersion and"
				+ " nodeContainer.name=:containerName and"
				+ " dtt.timestamp=:timestamp and" 
				+ " dtt.name=:environmentName and"
				+ " type =:resourceType";
		return qSelect;
	}
}
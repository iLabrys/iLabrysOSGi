package es.itecban.deployment.repository.services.core;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface UnitLocatorCore {
	/**
	 * @param unit
	 *            the unit being searched
	 * @return null if the unit is not found, or the URL to download the unit
	 */
	public String getDownloadURL(DeploymentUnitType unit) throws Exception;

}

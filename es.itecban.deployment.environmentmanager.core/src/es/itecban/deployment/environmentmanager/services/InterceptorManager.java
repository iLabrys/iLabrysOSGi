package es.itecban.deployment.environmentmanager.services;

import java.io.File;

import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;

/**
 * 
 * @author mjblazquez
 *
 */

public interface InterceptorManager {

	/**
	 * 
	 * @param configuration
	 * @param component
	 * @return a File object with the configured component
	 * @throws Exception
	 */
	public File configure (ConfigurationPropertiesType configuration, File component) throws Exception;

	boolean isConfigurable(String artifactName) throws Exception;
}

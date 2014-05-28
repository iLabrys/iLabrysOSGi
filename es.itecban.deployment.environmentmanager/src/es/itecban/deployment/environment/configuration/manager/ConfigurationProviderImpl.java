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
package es.itecban.deployment.environment.configuration.manager;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.osgi.framework.BundleContext;

import es.itecban.deployment.environment.database.DatabaseManager;
import es.itecban.deployment.environmentmanager.configuration.EnvironmentConfigurationUtils;
import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.model.configuration.ConfigurationFileType;
import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.configuration.ConfigurationContainerType;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.configuration.EnvironmentType;

public class ConfigurationProviderImpl implements ConfigurationProvider {

	private BundleContext context;
	private DatabaseManager service;
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(ConfigurationProviderImpl.class
			.getName());

	public void initDB() {
		this.sessionFactory = service.getSessionFactory();
	}

	// TODO cambiar a que si se pone a null el argumento se pueda eliminar el
	// metodo de abajo (no filename)

	@Override
	public File getContainerConfiguration(String environmentName,
			String containerName, String fileName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			// check if the environment and container exist in the database.
			// Else ERROR
			String queryString = "select environment from EnvironmentType as environment "
					+ "inner join environment.containers containers "
					+ "inner join containers.container container "
					+ "where environment.name='"
					+ environmentName
					+ "' and "
					+ "container.name='" + containerName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment != null) {
				// search for the desired container
				List<ConfigurationContainerType> containerList = existingEnvironment
						.getContainers().getContainer();
				for (ConfigurationContainerType container : containerList) {
					if (container.getName().equals(containerName)) {
						// container found
						// check if the container has collection of file objects
						try {
							List<ConfigurationFileType> configFileList = container
									.getConfigurationFiles()
									.getConfigurationFile();
							File targetFile = null;
							for (int i = 0; i < configFileList.size(); i++) {
								ConfigurationFileType configFile = configFileList
										.get(i);
								if (configFile.getFileName().equals(fileName)) {
									// file found
									byte[] fileByteArray = configFile
											.getConfigFile();
									targetFile = EnvironmentConfigurationUtils
											.getFileFromBytes(fileByteArray,
													configFile.getFileName(),
													context);
								}
							}
							return targetFile;
						} catch (NullPointerException e1) {
							logger.fine("There are no configuration files for "
									+ "this environment\n" + e1);
							e1.printStackTrace();
						}
					}
				}
			} else {
				// The environment and the container does not exist
				logger.severe("These environment/container does not exist. "
						+ "You must add them first!");
				// TODO: this can be recursively: first call to create
				// environment, then container and lastly this same method
			}
		} catch (Exception e) {
			logger
					.severe("Error while getting the container configuration from the database\n"
							+ e);
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public File[] getContainerConfiguration(String environmentName,
			String containerName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			// check if the environment and container exist in the database.
			// Else ERROR
			String queryString = "select environment from EnvironmentType as environment "
					+ "inner join environment.containers containers "
					+ "inner join containers.container container "
					+ "where environment.name='"
					+ environmentName
					+ "' and "
					+ "container.name='" + containerName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment != null) {
				// search for the desired container
				List<ConfigurationContainerType> containerList = existingEnvironment
						.getContainers().getContainer();
				for (ConfigurationContainerType container : containerList) {
					if (container.getName().equals(containerName)) {
						// container found
						// check if the container has collection of file objects
						try {
							List<ConfigurationFileType> configFileList = container
									.getConfigurationFiles()
									.getConfigurationFile();
							File[] configFileArray = new File[configFileList
									.size()];
							for (int i = 0; i < configFileList.size(); i++) {
								ConfigurationFileType configFile = configFileList
										.get(i);
								byte[] fileByteArray = configFile
										.getConfigFile();
								File file = EnvironmentConfigurationUtils
										.getFileFromBytes(fileByteArray,
												configFile.getFileName(),
												context);
								configFileArray[i] = file;
							}
							return configFileArray;
						} catch (NullPointerException e1) {
							logger.info("There is no configuration files for "
									+ "this environment\n" + e1);
							e1.printStackTrace();
						}
					}
				}
			} else {
				// The environment and the container does not exist
				logger.severe("These environment/container do not exist. "
						+ "You must add an them firstly");
				// TODO: this can be recursively: first call to create
				// environment, then container and lastly this same method
			}
		} catch (Exception e) {
			logger
					.severe("Error while adding the environment properties to the database");
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public ConfigurationPropertiesType getEnvironmentConfiguration(
			String environmentName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			// check if the environment exists in the database. Else ERROR
			String queryString = "from EnvironmentType where name='"
					+ environmentName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment == null) {
				logger.severe("The environment does not exist");
				return null;
			}
			ConfigurationPropertiesType configProperties = existingEnvironment
					.getConfigurationProperties();
			if (configProperties == null) {
				logger
						.severe("There do no exist properties for this environment");
				throw new NullPointerException();
			}
			return configProperties;
		} catch (Exception e) {
			logger
					.severe("Error while getting the environment properties from the database");
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public void setContext(BundleContext context) {
		this.context = context;
	}

	public void setService(DatabaseManager service) {
		this.service = service;
	}

	// not tested. Currently, used for the RAM. (GEX y GEN must be in the same
	// OSGi)
	@Override
	public EnvironmentPropertyType getEnvironmentProperty(
			String environmentName, String propertyName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			// check if the property exist in the database
			// Else ERROR
			String queryString = "select environment from EnvironmentType as environment "
					+ "inner join environment.configurationProperties configurationProperties "
					+ "inner join configurationProperties.environmentProperties environmentProperties "
					+ "where environment.name=:environmentName and "
					+ "environmentProperties.key=:propertyName";
			Query query = session.createQuery(queryString);
			query.setString("environmentName", environmentName);
			query.setString("propertyName", propertyName);
			EnvironmentType existingEnvironment = (EnvironmentType) query
					.uniqueResult();
			if (existingEnvironment != null) {
				// search the property
				List<EnvironmentPropertyType> propertyList = existingEnvironment
						.getConfigurationProperties()
						.getEnvironmentProperties();
				for (EnvironmentPropertyType property : propertyList) {
					if (property.getKey().equals(propertyName)) {
						// property found
						return property;
					}
				}
			} else {
				logger.info(propertyName + " env. property does not exist");
			}
		} catch (Exception e) {
			logger.severe("Error while getting the property from the database");
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
}

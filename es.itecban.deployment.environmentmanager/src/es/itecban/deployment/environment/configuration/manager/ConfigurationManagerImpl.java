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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.osgi.framework.BundleContext;

import es.itecban.deployment.environment.database.DatabaseManager;
import es.itecban.deployment.environmentmanager.configuration.EnvironmentConfigurationUtils;
import es.itecban.deployment.environmentmanager.services.ConfigurationManager;
import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.model.configuration.ConfigurationContainerType;
import es.itecban.deployment.model.configuration.ConfigurationFactory;
import es.itecban.deployment.model.configuration.ConfigurationFileType;
import es.itecban.deployment.model.configuration.ConfigurationFilesType;
import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.configuration.ContainersType;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.configuration.EnvironmentType;

public class ConfigurationManagerImpl implements ConfigurationManager {

	private DatabaseManager databaseManager;
	private SessionFactory sessionFactory;
	private ConfigurationProvider configProv;

	private Logger logger=Logger.getLogger(ConfigurationManagerImpl.class.getName());

	/**
	 * Initializes the connection to the database
	 */
	
	public void initDB(){
		this.sessionFactory = databaseManager.getSessionFactory();
	}



	@Override
	public File[] showContainerConfiguration(String environmentName,
			String containerName) {
		File[] configFileArray =configProv.getContainerConfiguration(
				environmentName, containerName);
		return configFileArray;
	}

	@Override
	public ConfigurationPropertiesType showEnvironmentConfiguration(
			String environmentName) {
		
		ConfigurationPropertiesType configProperties = configProv
				.getEnvironmentConfiguration(environmentName);
		return configProperties;
	}

	/* there is no treatment for deleting containers from environment */
	// check this. not tested yet
	@Override
	public void addContainer2Environment(String environmentName,
			String containerName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		// boolean ok = false;
		try {
			// ckech there is no other in the database. If exist: to update
			String queryString = "from EnvironmentType where name='"
					+ environmentName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment == null) {
				logger.log(Level.WARNING,"The environment must exist");
				return;
			} else {
				ContainersType containers = existingEnvironment.getContainers();
				if (containers != null) {
					// a list of containers exist. Check if the one to be added
					// already exist
					List<ConfigurationContainerType> containerList = containers
							.getContainer();
					boolean exist = false;
					for (ConfigurationContainerType container : containerList) {
						if (container.getName().equals(containerName)) {
							logger
									.fine("The container already exist in the database");
							exist = true;
						}
					}
					if (exist == false) {
						ConfigurationContainerType container = ConfigurationFactory.eINSTANCE
								.createConfigurationContainerType();
						container.setName(containerName);
						containerList.add(container);
					}
				} else {
					// necessary to create the collection
					containers = ConfigurationFactory.eINSTANCE
							.createContainersType();
					List<ConfigurationContainerType> containerList = containers
							.getContainer();
					ConfigurationContainerType container = ConfigurationFactory.eINSTANCE
							.createConfigurationContainerType();
					container.setName(containerName);
					containerList.add(container);
					existingEnvironment.setContainers(containers);
					
				}
				session.save(existingEnvironment);
				session.getTransaction().commit();
				// ok = true;
			}
		} catch (Exception e) {
			logger.severe("Error while adding the environment properties to the database");
			e.printStackTrace();
		} finally {
			session.close();
		}
		// return ok;
	}

	@Override
	public void addConfiguration2Environment(String environmentName,
			ConfigurationPropertiesType configuration) throws Exception {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			// ckech there is no other in the database. If exist: to update
			String queryString = "from EnvironmentType where name='"
					+ environmentName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment != null) {
				logger.log(Level.FINE, "The environment already exists");
				this.updateEnvironmentConfiguration(environmentName,
						configuration);
			} else {
				// This environment does not exist. Create the object with this
				// environment and save
				EnvironmentType environment = ConfigurationFactory.eINSTANCE
						.createEnvironmentType();
				environment.setName(environmentName);
				// TODO: think about this
				if (configuration instanceof ConfigurationPropertiesType) {
					ConfigurationPropertiesType properties = (ConfigurationPropertiesType) configuration;
					environment.setConfigurationProperties(properties);
					session.save(environment);
					session.getTransaction().commit();
				} else
					logger.severe("the properties are wrong");
			}
		} catch (Exception e) {
			logger.severe("Error while adding the environment properties to the database");
			e.printStackTrace();
			throw new Exception ("Error while adding the environment properties to the database");
		} finally {
			session.close();
		}
	}

	/* TODO: not tested yet. Check the query */
	@Override
	public void addConfigurationFile2Container(String environmentName, String containerName, File file) throws Exception {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			String queryString = "select environment from EnvironmentType as environment "
				+ "inner join environment.containers containers "
				+ "inner join containers.container container "
				+ "where environment.name=:environmentName and "
				+ "container.name=:containerName";
			Query query = session.createQuery(queryString);
			query.setString("environmentName", environmentName);
			query.setString("containerName", containerName);
			EnvironmentType existingEnvironment = (EnvironmentType) query.uniqueResult();
//			String queryString3 = "select environment from EnvironmentType as environment "
//				+ "inner join environment.containers containers "
//				+ "inner join containers.container container "
//				+ "where environment.name='"
//				+ environmentName
//				+ "' and "
//				+ "container.name='" + containerName + "'";
//			EnvironmentType existingEnvironment3 = (EnvironmentType) session
//			.createQuery(queryString3).uniqueResult();
			// ckech if the environment and container exist in the database. If
			// exist: to update
			if (existingEnvironment != null) {
				logger.log(Level.FINE,"The environment already exists");
				// search for the desired container
				List<ConfigurationContainerType> containerList = existingEnvironment
						.getContainers().getContainer();
				boolean existingContainer = false;
				for (ConfigurationContainerType container : containerList) {
					if (container.getName().equals(containerName)) {
						existingContainer = true;
						// container found. Check if the file already exists
						ConfigurationFilesType configFiles = container.getConfigurationFiles();
						if (configFiles == null){
							//there does not exist a configurationList. creating new one
							configFiles = ConfigurationFactory.eINSTANCE.createConfigurationFilesType();
							List<ConfigurationFileType> configFileList = configFiles.getConfigurationFile();
							ConfigurationFileType configFile =ConfigurationFactory.eINSTANCE.createConfigurationFileType();
							configFile.setFileName(file.getName());
							configFile.setConfigFile(EnvironmentConfigurationUtils.getBytesFromFile(file));
							configFileList.add(configFile);
							container.setConfigurationFiles(configFiles);
							session.save(existingEnvironment);
						}else{
							List<ConfigurationFileType> configurationFileList = container.getConfigurationFiles().getConfigurationFile();
							boolean exist = false;
							for (ConfigurationFileType configFile : configurationFileList) {
								if (configFile.getFileName().equals(file.getName())) {
									// the file exist, it will be updated
									configFile.setConfigFile(EnvironmentConfigurationUtils.getBytesFromFile(file));
									exist = true;
									break;
								}
							}
							// if "exist" is already false, the file does not exist, it
							// will be stored
							if (!exist){
								ConfigurationFileType newFile = ConfigurationFactory.eINSTANCE
											.createConfigurationFileType();
								newFile.setFileName(file.getName());
								newFile.setConfigFile(EnvironmentConfigurationUtils.getBytesFromFile(file));
								configurationFileList.add(newFile);
								session.save(existingEnvironment);
							}
						}
						break;
					}
				}
				if (!existingContainer){
					//the container does not exist. Adding to the environment
					this.addContainer2Environment(environmentName, containerName);
					this.addConfigurationFile2Container(environmentName, containerName, file);
				}
				
				session.getTransaction().commit();
			} else {
				//later maybe this will be incorrect
				this.addEnvironment(environmentName);
				this.addContainer2Environment(environmentName, containerName);
				this.addConfigurationFile2Container(environmentName, containerName, file);
			}
		} catch (Exception e) {
			logger.severe("Error while adding the environment properties to the database");
			//The minimum fix here is to change the documentation for the binary type to warn users that their byte[]'s will be truncated if they end with 0x20 on MySQL (and maybe a few other DBMSes).
			e.printStackTrace();
			throw new Exception ("Error while adding the environment properties to the database");
		} finally {
			session.close();
		}
	}

	/**
	 * udpates the environment configuration properties
	 */
	@Override
	public void updateEnvironmentConfiguration(String environmentName,
			ConfigurationPropertiesType configuration) {

		logger.info("Updating environment configuration. ");
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();

		try {
			// chech if the environment exists in the database. If exist: to
			// update
			String queryString = "from EnvironmentType where name='"
					+ environmentName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment == null) {
				logger
						.severe("There must exist the environment in the database");
				return;
			}
			existingEnvironment.setConfigurationProperties(configuration);
			session.save(existingEnvironment);
			session.getTransaction().commit();
		} catch (Exception e) {
			logger.severe("Error while adding the environment properties to the database");
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	// TODO: think about the return
	@Override
	public void addEnvironment(String environmentName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			// ckech if the environment exists in the database. If exist: to
			// update
			String queryString = "from EnvironmentType where name='"
					+ environmentName + "'";
			EnvironmentType existingEnvironment = (EnvironmentType) session
					.createQuery(queryString).uniqueResult();
			if (existingEnvironment != null) {
				logger.log(Level.INFO,"The environment already exists");
				return;
			}
			EnvironmentType environment = ConfigurationFactory.eINSTANCE
					.createEnvironmentType();
			environment.setName(environmentName);
			session.save(environment);
			session.getTransaction().commit();
		} catch (Exception e) {
			logger.severe("Error while adding the environment properties to the database");
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void setDatabaseManager(DatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}

	@Override
	public void deleteConfigurationFileFromContainer(String environmentName,
			String containerName, String fileName) throws Exception {
		
		logger.info("Deleting " + fileName + " from container " + containerName + " in " + environmentName);
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			//Check if the file exist
			String queryExistString = "select environment from EnvironmentType as environment"
				+ " inner join environment.containers containers"
				+ " inner join containers.container container"
				+ " inner join container.configurationFiles configurationFiles"
				+ " inner join configurationFiles.configurationFile configurationFile"
				+ " where environment.name=:environmentName and"
				+ " container.name=:containerName and"
				+ " configurationFile.fileName=:fileName";
			Query queryExist = session.createQuery(queryExistString);
			queryExist.setString("environmentName", environmentName);
			queryExist.setString("containerName", containerName);
			queryExist.setString("fileName", fileName);
			EnvironmentType existingEnvironment = (EnvironmentType) queryExist.uniqueResult();
			if (existingEnvironment == null){
				logger.info("The file does not exist in the given container");
				return;
			}
//			the file exist. Deleting it...
			String queryString = "select file from ConfigurationFileType as file"
				+ " where file.fileName=:fileName";

			Query query = session.createQuery(queryString);
			query.setString("fileName", fileName);
			List<ConfigurationFileType> file2deleteList = query.list();
			for (int i = 0 ; i < file2deleteList.size() ; i++){
				ConfigurationFileType file2delete = file2deleteList.get(i);
				ConfigurationFilesType configurationFiles = (ConfigurationFilesType) file2delete.eContainer();
				ConfigurationContainerType container = (ConfigurationContainerType) configurationFiles.eContainer();
				if (!container.getName().equals(containerName))
					continue;
				ContainersType containers = (ContainersType) container.eContainer();
				EnvironmentType environment = (EnvironmentType) containers.eContainer();
				if (environment.getName().equals(environmentName)){
					List<ConfigurationFileType> configFileList = configurationFiles.getConfigurationFile();
					for (int j = 0 ; j < configFileList.size() ; j++){
						if (configFileList.get(j).getFileName().equals(file2delete.getFileName())){
							configFileList.remove(j);
							break;
						}
					}
					session.update(configurationFiles);
				}
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			logger.severe("Error while deleting the configuration file from the container confituration");
			e.printStackTrace();
			throw new Exception ("Error while deleting the configuration file from the container confituration");
		} finally {
			session.close();
		}
	}



	public void setConfigProv(ConfigurationProvider configProv) {
		this.configProv = configProv;
	}



	public ConfigurationProvider getConfigProv() {
		return configProv;
	}
}

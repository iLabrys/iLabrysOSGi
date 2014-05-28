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
package es.itecban.deployment.executionmanager.database.manager;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Properties;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.classloader.ClassClassLoaderStrategy;
import org.eclipse.emf.teneo.classloader.ClassLoaderStrategy;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;

import es.itecban.deployment.executionmanager.database.DatabaseManager;
import es.itecban.deployment.model.deployment.plan.PlanPackage;
import es.itecban.deployment.model.deployment.plan.report.ReportPackage;
import es.itecban.deployment.model.deployment.target.TargetPackage;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

public class DatabaseManagerImpl implements DatabaseManager{

	// propiedades para configuración externa
	private boolean externalConfig;
	private URI externalPropertiesURI;
	// propiedades para configuración externa
	
	private String dataStoreName;
	private HbDataStore dataStore;
	public SessionFactory sessionFactory;
	private org.springframework.core.io.Resource propertiesResource;
	private Properties hibernateProperties = new Properties();
	private Logger logger=Logger.getLogger(DatabaseManagerImpl.class.getName());
	
	public void setPropertiesResource(
			org.springframework.core.io.Resource propertiesResource) {
		this.propertiesResource = propertiesResource;
	}

	public void setExternalConfig(boolean externalConfig) {
		this.externalConfig = externalConfig;
	}

	public void setExternalPropertiesURI(URI externalPropertiesURI) {
		this.externalPropertiesURI = externalPropertiesURI;
	}

	/**
	 * Initializes the connection to the database
	 */
	public void initDB() {

		logger.fine("Initializing the database... ");
		dataStoreName = "planrepository";
		dataStore = (HbDataStore) HbHelper.INSTANCE
				.createRegisterDataStore(dataStoreName);
		try {
			logger.fine("Loading properties...");
			if (this.externalConfig) // Hay configuración externa para hibernate
			{
				File file = new File(this.externalPropertiesURI);
				this.hibernateProperties.load(new FileInputStream(file));
			}
			else  // no hay configuración externa para hibernate		
				this.hibernateProperties.load(propertiesResource.getInputStream());
			logger.fine("Properties loaded: " + hibernateProperties.toString());
		} catch (Exception e) {
			logger.severe("Impossible to load the hibernate.properties file\n"+e);
			e.printStackTrace();
		}
		this.hibernateProperties.put(PersistenceOptions.MAPPING_FILE_PATH,
				"/executionmanager.hbm.xml");
		
		dataStore.setProperties(this.hibernateProperties);
		dataStore.getExtensionManager().registerExtension( ClassLoaderStrategy.class.getName(), ClassClassLoaderStrategy.class.getName());
		dataStore.setEPackages(new EPackage[] { UnitPackage.eINSTANCE,
				TargetPackage.eINSTANCE, ReportPackage.eINSTANCE, PlanPackage.eINSTANCE});
		try {
			dataStore.initialize();
		} catch (Exception e) {
			System.err.println("Problem while initializing the database ");
			e.printStackTrace();
		}
		sessionFactory = dataStore.getSessionFactory();
	}

	@Override
	public SessionFactory getSessionFactory() {
		
		return this.sessionFactory;
	}
}

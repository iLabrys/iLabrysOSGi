package es.itecban.deployment.environment.database.manager;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.classloader.ClassClassLoaderStrategy;
import org.eclipse.emf.teneo.classloader.ClassLoaderStrategy;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;

import es.itecban.deployment.environment.database.DatabaseManager;
import es.itecban.deployment.model.configuration.ConfigurationPackage;
import es.itecban.deployment.model.deployment.target.TargetPackage;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

public class DatabaseManagerImpl implements DatabaseManager {

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
	
	public void setExternalPropertiesURI (URI externalPropertiesURI) {
		this.externalPropertiesURI = externalPropertiesURI;
	}
	
	/**
	 * Initializes the connection to the database
	 */
	public void initDB() {

		logger.log(Level.FINE,"Initializing the database... ");
		dataStoreName = "deployment";
		dataStore = (HbDataStore) HbHelper.INSTANCE
				.createRegisterDataStore(dataStoreName);
		try {
			logger.log(Level.FINE,"Loading properties...");
			if (this.externalConfig) // Hay configuración externa para hibernate
			{
				File file = new File(this.externalPropertiesURI);
				this.hibernateProperties.load(new FileInputStream(file));
			}
			else  // no hay configuración externa para hibernate
				this.hibernateProperties.load(propertiesResource.getInputStream());
			logger.log(Level.FINE,"Properties loaded: " + hibernateProperties.toString());
		} catch (Exception e) {
			System.err.println("Impossible to load the hibernate.properties file");
			e.printStackTrace();
		}
		this.hibernateProperties.put(PersistenceOptions.MAPPING_FILE_PATH,
				"/environmentmanager.hbm.xml");
		
		dataStore.setProperties(this.hibernateProperties);
		dataStore.getExtensionManager().registerExtension( ClassLoaderStrategy.class.getName(), ClassClassLoaderStrategy.class.getName());
		dataStore.setEPackages(new EPackage[] { UnitPackage.eINSTANCE,
				TargetPackage.eINSTANCE, ConfigurationPackage.eINSTANCE});
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

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
package es.itecban.deployment.environmentmanager.manager;

import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.*;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import es.itecban.deployment.agents.TargetManagerMXBean;
import es.itecban.deployment.environment.database.DatabaseManager;
import es.itecban.deployment.environmentmanager.Constants;
import es.itecban.deployment.environmentmanager.configuration.EnvironmentConfigurationUtils;
import es.itecban.deployment.environmentmanager.queryprovider.DefaultQueryProvider;
import es.itecban.deployment.environmentmanager.queryprovider.QueryProvider;
import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.environmentmanager.services.EnvironmentManager;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.marshaller.ObjectMarshaller;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;

/**
 * 
 * @author
 * 
 */

public class EnvironmentManagerImpl implements EnvironmentManager {

	private DatabaseManager databaseManager;
	private SessionFactory sessionFactory;
	private ConfigurationProvider configurationProvider;
	public String portTM; // this port is set in the bundle-context.xml
	private Logger logger = Logger.getLogger(EnvironmentManagerImpl.class
			.getName());
	private String queryProvider;
	private QueryProvider qp;

	public void initDB() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {

		this.sessionFactory = databaseManager.getSessionFactory();
		// Try to load a queryprovider for the specific database
		if (this.qp == null){
			queryProvider = DefaultQueryProvider.class.getName();
			Class cprov = this.getClass().getClassLoader().loadClass(queryProvider);
			this.qp = (QueryProvider) cprov.newInstance();
		}
	}

	/**
	 * adds a deploymenttarget to the database. If the deploymentarget already
	 * exists, it is only updated
	 * 
	 * @param deploymenttarget
	 * @throws Exception
	 */
	@Override
	public void addDeploymentTarget(DeploymentTargetType deploymenttarget)
			throws Exception {

		if (deploymenttarget == null)
			throw new Exception(
					"The information given by the target manager is null.");

		// Filter the data obtained from the database (not desired
		// nodes/clusters)
		EnvironmentPropertyType property = this.configurationProvider
				.getEnvironmentProperty(deploymenttarget.getName(),
						Constants.ENVIRONMENT_CONFIGURATION_CONTAINER_FILTER);
		if (property != null) {
			EnvironmentConfigurationUtils utils = new EnvironmentConfigurationUtils();
			deploymenttarget = utils.filterContainers(deploymenttarget,
					property.getValue());
		}

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {

			GregorianCalendar timestampGregorian = new GregorianCalendar();
			XMLGregorianCalendar timestamp = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(timestampGregorian);
			deploymenttarget.setTimestamp(timestamp);
			// deploymenttarget = EnvironmentManagerUtils
			// .checkNullability(deploymenttarget);
			deploymenttarget = EnvironmentManagerUtils
					.normalizeRuntimeUnitVersions(deploymenttarget);
			session.save(deploymenttarget);
			session.getTransaction().commit();
			logger.info("DeploymentTargetType correctly added to the database");
			// THIS IS A TURNAROUND!!!
//			this.alterEnvironmentInfo(deploymenttarget.getName());
		} catch (Exception e) {
			logger
					.severe("Error while adding the deploymenttarget to the database "
							+ e);
			e.printStackTrace();
			throw new Exception(
					"Error while adding the deploymenttarget to the database "
							+ e);
		} finally {
			session.close();
		}
	}

	/**
	 * Adds a new environment with the actual info in the environment
	 * 
	 * @param environmentname
	 * @throws Exception
	 */

	public void addNewEnvironment(String environmentname, String dirIp)
			throws Exception {

		try {
			this.persistDeploymentTarget(environmentname, dirIp);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * Deletes all the information of a given environment from the database
	 * 
	 * @param environmentname
	 * @return true, if success
	 * @throws Exception
	 */

	public boolean deleteDeploymentTarget(String environmentname)
			throws Exception {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		boolean ok = false;
		try {
			Criteria dttCriteria = session
					.createCriteria(DeploymentTargetType.class);
			dttCriteria.add(Restrictions.eq("name", environmentname));
			List<DeploymentTargetType> deploymentTargetTypeList = dttCriteria
					.list();

			if (deploymentTargetTypeList == null)
				return false;
			for (DeploymentTargetType deploymenttargettype : deploymentTargetTypeList) {
				session.delete(deploymenttargettype);
			}
			session.getTransaction().commit();
			logger.fine("Info correctly deleted");
			ok = true;
		} catch (Exception e) {
			logger.severe("Error while deleting the deploymenttarget info");
			throw new Exception("Error while deleting the deploymentTarget "
					+ e);
		} finally {
			session.close();
		}
		return ok;
	}

	/**
	 * Deletes all the DeploymentTypes with the given name
	 * 
	 * @param environmentname
	 * @return true, if success
	 * @throws Exception
	 */

	@Override
	public void deleteEnvironment(String environmentname) throws Exception {

		try {
			this.deleteDeploymentTarget(environmentname);
		} catch (Exception e) {
			throw new Exception(
					"Error while deleting the environment from the database "
							+ e);
		}
	}

	/**
	 * 
	 * @param environmentname
	 * @return
	 * @throws Exception
	 */

	@Override
	public DeploymentTargetType getDeploymentTargetInfo(String environmentname)
			throws Exception {

		logger.fine("Retrieving the DeploymentTarget info from the database");
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		DeploymentTargetType deploymentTargetType = null;
		Object lastEnvironmentDate = this
				.getLastEnvironmentDate(environmentname);
		try {
			Criteria dttCriteria = session
					.createCriteria(DeploymentTargetType.class);
			dttCriteria.add(Restrictions.eq("timestamp", lastEnvironmentDate));
			deploymentTargetType = (DeploymentTargetType) dttCriteria
					.uniqueResult();
			// This filtering now is done before storing the data in the
			// database
			// EnvironmentPropertyType property = this.configurationProvider
			// .getEnvironmentProperty(
			// environmentname,
			// Constants.ENVIRONMENT_CONFIGURATION_CONTAINER_FILTER);
			// if (property != null) {
			// EnvironmentConfigurationUtils utils = new
			// EnvironmentConfigurationUtils();
			// deploymentTargetType = utils.filterContainers(
			// deploymentTargetType, property.getValue());
			// }
			return deploymentTargetType;
		} catch (Exception e) {
			logger.severe("Error while retrieving the info from the database");
			throw new Exception(
					"Error while retrieving the information from the database "
							+ e);
		} finally {
			session.close();
		}
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */

	@Override
	public String[] getEnvironmentsName() throws Exception {

		logger
				.fine("Getting the name of the existing environments in the database");
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<String> dttNameList;
		try {
			Criteria dttCriteria = session
					.createCriteria(DeploymentTargetType.class);
			dttCriteria.setProjection(Property.forName("name"));
			dttCriteria.setProjection(Projections.distinct(Property
					.forName("name")));

			dttNameList = dttCriteria.list();
		} catch (Exception e) {
			logger
					.severe("Error while retrieving the environments from the database "
							+ e);
			throw new Exception(
					"Error while retrieving the environments from the database "
							+ e);
		} finally {
			session.close();
		}
		return dttNameList.toArray(new String[dttNameList.size()]);
	}

	/**
	 * se conecta, pide la info y la persiste TODO: cambiar esto o estandarizar
	 * o algo POR SIMPLICIDAD, AHORA PONGO SIEMPRE EL TM AL MISMO PUERTO, EL
	 * 1155, QUE ME GUSTA
	 * 
	 * @param environmentname
	 * @return true if everything has gone correctly. False if there has been an
	 *         error
	 * @throws Exception
	 */

	private synchronized DeploymentTargetType persistDeploymentTarget(
			String environmentname, String dirIp) throws Exception {

		// Connects to the TM
		TargetManagerMXBean targetmanagermxbean = AgentConnector.connect2TM(
				environmentname, dirIp, this.portTM, this.sessionFactory);
		if (targetmanagermxbean == null)
			throw new Exception("Impossible to connect to the targetManager.");

		// Gets the environment info
		targetmanagermxbean.updateNodeDomain();
		String dttxmlstring = targetmanagermxbean.doDeploymentTargetXML();

		// translates into a dtt object
		DeploymentTargetType deploymenttargettype = null;
		try {
			deploymenttargettype = (new ObjectMarshaller())
					.unmarshallDeploymentTarget(dttxmlstring);
		} catch (Exception e) {
			logger.severe("Error in the marshalling process");
			throw new Exception("Error in marshalling process " + e);
		}
		deploymenttargettype.setName(environmentname);
		this.addDeploymentTarget(deploymenttargettype);
		return deploymenttargettype;
	}

	/**
	 * 
	 * @param environmentName
	 * @param deploymentTargetType
	 * @return
	 * @throws Exception
	 */

	public synchronized void updateDeploymentTarget(String environmentName,
			DeploymentTargetType deploymentTargetType) throws Exception {

		this.addDeploymentTarget(deploymentTargetType);
	}

	/**
	 * 
	 * @param environmentname
	 * @return true, if success
	 * @throws Exception
	 */

	@Override
	public DeploymentTargetType updateEnvironment(String environmentname)
			throws Exception {

		logger.fine("Updating the environment with name: " + environmentname);
		try {
			DeploymentTargetType environment = this.persistDeploymentTarget(
					environmentname, null);
			return environment;
		} catch (Exception e) {
			e.printStackTrace();
			logger.severe("Error while updating the environment " + e);
			throw new Exception(e.getMessage());
		}
	}

	private Object getLastEnvironmentDate(String environmentName) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();

		// Get the latest date for the "photos" stored in the database
		Criteria timestampCriteria = session
				.createCriteria(DeploymentTargetType.class);
		timestampCriteria.setProjection(Projections.projectionList().add(
				Projections.max("timestamp")));
		timestampCriteria.add(Restrictions.eq("name", environmentName));
		Object lastEvironmentTimestampCriteria = timestampCriteria
				.uniqueResult();

		session.close();
		return lastEvironmentTimestampCriteria;
	}

	/**
	 * @param environmentname
	 * @param dirIp
	 * @return true, if success
	 * @throws Exception
	 */

	@Override
	public void updateEnvinronmentUUID(String environmentname, String dirIp)
			throws Exception {

		logger.fine("Updating the url for the environment: " + environmentname
				+ " with the url: " + dirIp);
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		try {
			List<DeploymentTargetType> deploymenttargetList = session
					.createQuery("from DeploymentTargetType").list();
			if (deploymenttargetList == null)
				throw new Exception(
						"The environment does not exist in the database");
			DeploymentTargetType deploymenttargettype = EnvironmentManagerUtils
					.getLastEnvironment(deploymenttargetList);
			deploymenttargettype.setUUID(dirIp);
			// deploymenttargettype = EnvironmentManagerUtils
			// .checkNullability(deploymenttargettype);
			session.save(deploymenttargettype);
			session.getTransaction().commit();
		} catch (Exception e) {
			logger
					.severe("Error while retrieving the environments from the database "
							+ e);
			throw new Exception("Error while updating the environment UUID "
					+ e);
		} finally {
			session.close();
		}
	}

	/**
	 * Adds the info of an environment of a xml file to the database
	 * 
	 * @param info
	 */

	public void addDeploymentTargetTypeInfo(String info) {

		try {
			DeploymentTargetType dtt = (new ObjectMarshaller())
					.unmarshallDeploymentTarget(info);
			this.addDeploymentTarget(dtt);
			logger.fine("DeploymentTargetType correctly added");
		} catch (Exception e) {
			logger.severe("Error while adding the deploymenttarget");
			e.printStackTrace();
		}
	}

	public void setDatabaseManager(DatabaseManager service) {
		this.databaseManager = service;
	}

	@Override
	public Hashtable<String, RuntimeResourceType[]> findResources(
			RequiredResourceType rr, String environment, boolean strictMatch)
			throws Exception {

		return null;
	}

	/**
	 * 
	 * @param environmentName
	 * @param resourceType
	 * @param resourceName
	 *            optional parameter, if null or "" then no name is used for the
	 *            query
	 * @param strictMatch
	 *            if true then an exact match is carried out
	 * @return a collection of resources, where the key is the container name
	 *         and the value a runtimeresource array
	 * @throws Exception
	 */
	@Override
	public Hashtable<String, RuntimeResourceType[]> findResources(
			String environmentName, String resourceName, String resourceType,
			boolean strictMatch) throws Exception {

		EnvironmentManagerReader emReader = new EnvironmentManagerReader(
				this.sessionFactory, this.qp);
		Hashtable hashtable = emReader.findResources(environmentName,
				resourceName, resourceType, strictMatch);
		return hashtable;
	}

	@Override
	public ContainerType[] findRuntimeUnit(String environmentName, String name,
			String version, boolean strictMatch) throws Exception {

		EnvironmentManagerReader emReader = new EnvironmentManagerReader(
				this.sessionFactory, this.qp);
		ContainerType[] containerArray = emReader.findRuntimeUnit(
				environmentName, name, version, strictMatch);
		return containerArray;
	}

	@Override
	public RuntimeResourceType findResource(String environmentName,
			String containerName, String resourceName, String resourceVersion,
			String types) throws Exception {

		EnvironmentManagerReader emReader = new EnvironmentManagerReader(
				this.sessionFactory, this.qp);
		RuntimeResourceType runtimeResource = emReader.findResource(
				environmentName, containerName, resourceName, resourceVersion,
				types);
		return runtimeResource;
	}

	public void setPortTM(String portTM) {
		this.portTM = portTM;
	}

	public void setConfigurationProvider(
			ConfigurationProvider configurationProvider) {
		this.configurationProvider = configurationProvider;
	}

	@Override
	public DeploymentTargetType getEnvironment(String environmentName)
			throws Exception {

		return this.getDeploymentTargetInfo(environmentName);
	}

	@Override
	public Hashtable<String, RuntimeUnitType[]> findRuntimeUnitInContainer(
			String environmentName, String name, String version,
			boolean strictMatch) throws Exception {
		EnvironmentManagerReader emReader = new EnvironmentManagerReader(
				this.sessionFactory, this.qp);
		Hashtable<String, RuntimeUnitType[]> hashtable = emReader
				.findRuntimeUnitInContainer(environmentName, name, version,
						strictMatch);
		return hashtable;
	}

//	/**
//	 * method to solve the problem in detecting the esb container. THIS IS A
//	 * TURNAROUND ONLY FOR THE EIF ENVIRONMENT IN INDRA. Executing this method
//	 * will not affect the execution in other environments
//	 * 
//	 * @throws Exception
//	 */
//
//	/*
//	 * Not included in the queryProvider class because this is a turnaround por
//	 * the EIF in Indra
//	 */
//
//	private void alterEnvironmentInfo(String environmentName) throws Exception {
//
//		final Session session = this.sessionFactory.openSession();
//		session.beginTransaction();
//		try {
//			Query query = null;
//			String qSelect = "select nodeContainer from DeploymentTargetType as dtt"
//					+ " inner join dtt.nodes nodes"
//					+ " inner join nodes.node node"
//					+ " inner join node.nodeContainers nodeContainers"
//					+ " inner join nodeContainers.nodeContainer nodeContainer"
//					+ " where dtt.timestamp=:timestamp and"
//					+ " nodeContainer.name like :name";
//			query = session.createQuery(qSelect);
//			Object lastEnvironmentDate = this
//					.getLastEnvironmentDate(environmentName);
//			query.setParameter("timestamp", lastEnvironmentDate);
//			query.setString("name", "%CEIcell01%CEIcluster.AppTarget%");
//			ContainerType container = (ContainerType) query.uniqueResult();
//			if (container == null)
//				return;
//			List<ContainerTypeType> containerTypeList = container
//					.getContainerTypes().getContainerType();
//			for (ContainerTypeType containerType : containerTypeList) {
//				if (containerType.getName().equals(
//						"es.itecban.deployment.container.jee.websphere.wsps"))
//					containerType
//							.setName("es.itecban.deployment.container.jee.websphere.wesb");
//			}
//			session.save(container);
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			logger.severe("Error while modifying the CEI container type" + e);
//			throw new Exception("Error while modifying the CEI container type"
//					+ e);
//		} finally {
//			session.close();
//		}
//	}

	public void setQueryProvider(String queryProvider) {
		this.queryProvider = queryProvider;
	}

	public void setQp(QueryProvider qp) {
		this.qp = qp;
	}
	
	public String getQueryProvider() {
		return queryProvider;
	}
}

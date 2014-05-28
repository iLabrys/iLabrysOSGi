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

import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import es.itecban.deployment.environmentmanager.queryprovider.QueryProvider;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;

public class EnvironmentManagerReader {

	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(EnvironmentManagerReader.class
			.getName());
	private QueryProvider qp;

	public EnvironmentManagerReader(SessionFactory sessionFactory, QueryProvider qp) {

		this.sessionFactory = sessionFactory;
		this.qp = qp;
	}

	public Hashtable<String, RuntimeResourceType[]> findResources(
			RequiredResourceType rr, String environment, boolean strictMatch)
			throws Exception {
		// TODO Auto-generated method stub
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
	public Hashtable<String, RuntimeResourceType[]> findResources(
			String environmentName, String resourceName, String resourceType,
			boolean strictMatch) throws Exception {

		// Name is optional
		Hashtable<String, RuntimeResourceType[]> hashtable = new Hashtable<String, RuntimeResourceType[]>();

		if (resourceName == null || resourceName.equals("") ) {
			logger.fine("Finding resources with name=" + resourceName
					+ " and type=" + resourceType + " in environment="
					+ environmentName);
		} else
			logger.fine("Finding resources of type=" + resourceType
					+ " in environment=" + environmentName);

		Object lastEnvironmentTimestamp = this
				.getLastEnvironmentDate(environmentName);

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = null;
		Query query2 = null;
		try {
			String qSelect = this.qp.findUnitResources(resourceName, resourceType, strictMatch);
			String qSelect2 = this.qp.findContainerResources(resourceName, resourceType, strictMatch);

			query = session.createQuery(qSelect);
			query2 = session.createQuery(qSelect2);
			query.setParameter("environmentName", environmentName);
			query.setParameter("timestamp", lastEnvironmentTimestamp);
			query2.setParameter("environmentName", environmentName);
			query2.setParameter("timestamp", lastEnvironmentTimestamp);

			List<Object[]> objectList = query.list();
			List<Object[]> objectList2 = query2.list();
			if ((objectList == null || objectList.size() == 0)
					&& (objectList2 == null || objectList2.size() == 0))
				return null;
			for (int i = 0; i < objectList.size(); i++) {
				Object[] objectCouple = objectList.get(i);
				String containerName = (String) objectCouple[0];
				RuntimeResourceType resource = (RuntimeResourceType) objectCouple[1];
				// look if exist
				if (!hashtable.containsKey(containerName)) {
					// The container is new
					RuntimeResourceType[] resourceArray = new RuntimeResourceType[1];
					resourceArray[0] = resource;
					hashtable.put(containerName, resourceArray);
				} else {
					// The container already exists
					RuntimeResourceType[] runtimeResourceArrayOld = hashtable
							.get(containerName);
					RuntimeResourceType[] runtimeResourceArrayNew = new RuntimeResourceType[runtimeResourceArrayOld.length + 1];
					int j = 0;
					for (; j < runtimeResourceArrayOld.length; j++) {
						runtimeResourceArrayNew[j] = runtimeResourceArrayOld[j];
					}
					runtimeResourceArrayNew[j] = resource;
					hashtable.put(containerName, runtimeResourceArrayNew);
				}
			}
			for (int i = 0; i < objectList2.size(); i++) {
				Object[] objectCouple = objectList2.get(i);
				String containerName = (String) objectCouple[0];
				RuntimeResourceType resource = (RuntimeResourceType) objectCouple[1];
				// look if exist
				if (!hashtable.containsKey(containerName)) {
					// The container is new
					RuntimeResourceType[] resourceArray = new RuntimeResourceType[1];
					resourceArray[0] = resource;
					hashtable.put(containerName, resourceArray);
				} else {
					// The container already exists
					RuntimeResourceType[] runtimeResourceArrayOld = hashtable
							.get(containerName);
					RuntimeResourceType[] runtimeResourceArrayNew = new RuntimeResourceType[runtimeResourceArrayOld.length + 1];
					int j = 0;
					for (; j < runtimeResourceArrayOld.length; j++) {
						runtimeResourceArrayNew[j] = runtimeResourceArrayOld[j];
					}
					runtimeResourceArrayNew[j] = resource;
					hashtable.put(containerName, runtimeResourceArrayNew);
				}
			}
		} catch (Exception e) {
			logger
					.severe("Error while retrieving the environments from the database "
							+ e);
			e.printStackTrace();
		} finally {
			session.close();
		}
		return hashtable;
	}

	public ContainerType[] findRuntimeUnit(String environmentName, String name,
			String version, boolean strictMatch) throws Exception {
	
		logger.info("Finding runtimeUnits with name=" + name + " and version="
				+ version + " in environment=" + environmentName);

		Object lastEnvironmentTimestamp = this
				.getLastEnvironmentDate(environmentName);
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = null;
		try {
			String qSelect = this.qp.findUnitInContainers(name, version, strictMatch);
			query = session.createQuery(qSelect);
			query.setParameter("timestamp", lastEnvironmentTimestamp);
			query.setParameter("environmentName", environmentName);
			List<ContainerType> containerList = query.list();
			if (containerList == null || containerList.size() == 0)
				return containerList.toArray(new ContainerType[0]);
			else
				return containerList.toArray(new ContainerType[containerList
						.size()]);
		} catch (Exception e) {
			logger
					.severe("Error while retrieving the container where exist the runtime unit in."
							+ e);
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	public Hashtable<String, RuntimeUnitType[]> findRuntimeUnitInContainer(String environmentName, String name,
			String version, boolean strictMatch) throws Exception {

		logger.info("Finding runtimeUnits with name=" + name + " and version="
				+ version + " in environment=" + environmentName);

		Hashtable<String, RuntimeUnitType[]> hashtable = new Hashtable<String, RuntimeUnitType[]>();
		Object lastEnvironmentTimestamp = this
				.getLastEnvironmentDate(environmentName);
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = null;
		try {
			String qSelect = this.qp.getUnitsFromContainer(name, version, strictMatch);
			query = session.createQuery(qSelect);
			query.setParameter("environmentName", environmentName);
			query.setParameter("timestamp", lastEnvironmentTimestamp);
			List<Object[]> objectList = query.list();
			if (objectList == null || objectList.size() == 0)
				return null;
			for (int i = 0; i < objectList.size(); i++) {
				Object[] objectCouple = objectList.get(i);
				String containerName = (String) objectCouple[0];
				RuntimeUnitType unit = (RuntimeUnitType) objectCouple[1];
				// look if exist
				if (!hashtable.containsKey(containerName)) {
					// The container is new
					RuntimeUnitType[] unitArray = new RuntimeUnitType[1];
					unitArray[0] = unit;
					hashtable.put(containerName, unitArray);
				} else {
					// The container already exists
					RuntimeUnitType[] runtimeUnitArrayOld = hashtable
							.get(containerName);
					RuntimeUnitType[] runtimeUnitArrayNew = new RuntimeUnitType[runtimeUnitArrayOld.length + 1];
					int j = 0;
					for (; j < runtimeUnitArrayOld.length; j++) {
						runtimeUnitArrayNew[j] = runtimeUnitArrayOld[j];
					}
					runtimeUnitArrayNew[j] = unit;
					hashtable.put(containerName, runtimeUnitArrayNew);
				}
			}
		} catch (Exception e) {
			logger
					.severe("Error while retrieving the container where exist the runtime unit in."
							+ e);
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
		return hashtable;
	}

	public RuntimeResourceType findResource(String environmentName,
			String containerName, String resourceName, String resourceVersion,
			String type) throws Exception {

		logger.fine("Finding runtimeResource with name=" + environmentName
				+ " and version=" + resourceVersion + " in environment="
				+ environmentName);

		Object lastEnvironmentTimestamp = this
				.getLastEnvironmentDate(environmentName);
		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();

		try {
			Query query = null;
			Query query2 = null;

			String qSelect = this.qp.findUnitResource();
			String qSelect2 = this.qp.findContainterResource();
			query = session.createQuery(qSelect);
			query2 = session.createQuery(qSelect2);
			query.setString("resourceName", resourceName);
			query.setString("resourceVersion", resourceVersion);
			query.setString("containerName", containerName);
			query.setString("type", type);
			query.setString("environmentName", environmentName);
			query.setParameter("timestamp", lastEnvironmentTimestamp);
			query2.setString("resourceName", resourceName);
			query2.setString("resourceVersion", resourceVersion);
			query2.setString("containerName", containerName);
			query2.setString("resourceType", type);
			query2.setString("environmentName", environmentName);
			query2.setParameter("timestamp", lastEnvironmentTimestamp);

			List<RuntimeResourceType> resourceList = query.list();
			List<RuntimeResourceType> resourceList2 = query2.list();
			if ((resourceList == null || resourceList.size() == 0)
					&& (resourceList2 == null || resourceList2.size() == 0))
				return null;
			if (resourceList.size() + resourceList2.size() > 1) {
				logger.severe("There is more than one possible resource");
				throw new Exception ("running.error.toomanyresources");
			}
			if (resourceList.size() == 1)
				return resourceList.get(0);
			else
				return resourceList2.get(0);
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		} finally {
			session.close();
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
}

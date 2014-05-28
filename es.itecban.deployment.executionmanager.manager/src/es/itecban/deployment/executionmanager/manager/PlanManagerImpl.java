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
package es.itecban.deployment.executionmanager.manager;

import java.util.List;
import java.util.logging.Logger;


import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.itecban.deployment.executionmanager.database.DatabaseManager;
import es.itecban.deployment.executionmanager.elements.PlanFilter;
import es.itecban.deployment.executionmanager.manager.queryprovider.DefaultQueryProvider;
import es.itecban.deployment.executionmanager.manager.queryprovider.QueryProvider;
import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;

public class PlanManagerImpl implements PlanManager {

	private DatabaseManager DBManager;
	private Logger logger = Logger.getLogger(PlanManagerImpl.class.getName());
	private String queryProvider;
	private QueryProvider qp;
	final String dataStoreName = "PlanDataStore";
	final HbDataStore dataStore = (HbDataStore) HbHelper.INSTANCE
			.createRegisterDataStore(dataStoreName);
	private SessionFactory sessionFactory;

	public void initSessionFactory() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		sessionFactory = DBManager.getSessionFactory();
		// Try to load a queryprovider for the specific database
		if (queryProvider == null)
			queryProvider = DefaultQueryProvider.class.getName();
		Class cprov = this.getClass().getClassLoader().loadClass(
				queryProvider);
		this.qp = (QueryProvider) cprov.newInstance();
	}

	/**
	 * Deletes a plan stored in the plan repository. It is mandatory, the name
	 * of the plan is unique
	 */
	public void delete(DeploymentPlanType plan) throws Exception {

		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		String planName = plan.getName();
		String query = qp.getDeploymentPlan(planName);
		Query q = session.createQuery(query);
		DeploymentPlanType toBedeleted = (DeploymentPlanType) q.uniqueResult();
		session.delete(toBedeleted);
		session.getTransaction().commit();
		// Close the session
		session.close();
	}

	/**
	 * Find all plans that match a given filter
	 */

	// TODO: check for the new unique plan name
	public DeploymentPlanType[] findDeploymentPlans(PlanFilter filter) {
		return findDeploymentPlans(filter,null);
	}
	
	//TODO: implement this
	
	public DeploymentPlanType[] findDeploymentPlans(PlanFilter filter, String planName) {
		DeploymentPlanType[] result = null;
		Query query = null;
		
		final Session session = sessionFactory.openSession();
		try {
			if (filter == null)
				throw new Exception("A non-null plan filter must be specified.");
			//getting the target from the filter
			if (filter.getTarget() == null){
				logger.fine("The target in the filter is null. Getting all the plans");
				return this.getAllDeploymentPlans();
			}
			String planTarget = filter.getTarget();
			String qSelect = qp.getDeploymentList(filter, planName);
			logger.info("Query to execute: " + qSelect);
			query = session.createQuery(qSelect);
			
			query.setString("planTarget", planTarget);
			if (filter.getCreationMin()!=null)
				query.setDate("creationDateMin", filter.getCreationMin().toGregorianCalendar().getTime());
			if (filter.getCreationMax()!=null)
				query.setDate("creationDateMax", filter.getCreationMax().toGregorianCalendar().getTime());
			if (filter.getLastModificationMin()!=null)
				query.setDate("lastModificationDateMin", filter.getLastModificationMin().toGregorianCalendar().getTime());
			if (filter.getLastModificationMax()!=null)
				query.setDate("lastModificationDateMax", filter.getLastModificationMax().toGregorianCalendar().getTime());
			if (filter.getScheduledLaunchMin()!=null)
				query.setDate("scheduledLaunchDateMin", filter.getScheduledLaunchMin().toGregorianCalendar().getTime());
			if (filter.getScheduledLaunchMax()!=null)
				query.setDate("scheduledLaunchDateMax", filter.getScheduledLaunchMax().toGregorianCalendar().getTime());
			
			List deploymentPlans = query.list();
			
			logger.fine("Executing query: " + qSelect);
			result = (DeploymentPlanType[]) deploymentPlans
					.toArray(new DeploymentPlanType[deploymentPlans.size()]);
			logger.fine("Number of plans matching criteria found: "
					+ result.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return result;
	}

	/**
	 * Find all plans that match a given query
	 */
	// TODO: check for the new unique plan name
	public DeploymentPlanType[] findDeploymentPlans(String query) {

		final Session session = sessionFactory.openSession();
		try {
			if (query == null || query.equals(""))
				throw new Exception("A non-empty query must be specified.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Query dbQuery = session.createQuery(query);
		List deploymentPlans = dbQuery.list();
		session.close();
		return (DeploymentPlanType[]) deploymentPlans
				.toArray(new DeploymentPlanType[deploymentPlans.size()]);
	}

	/**
	 * Find all plans
	 * 
	 * @return
	 */
	public DeploymentPlanType[] getAllDeploymentPlans() {

		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		String qSelect = qp.getAllDeploymentPlans();
		Query query = session.createQuery(qSelect);
		List deploymentPlans = query.list();
		session.close();
		return (DeploymentPlanType[]) deploymentPlans
				.toArray(new DeploymentPlanType[deploymentPlans.size()]);
	}

	/**
	 * Saves a plan to the plan repository
	 * @throws Exception 
	 */
	public long save(DeploymentPlanType plan) throws Exception {

		long planId = 0;
		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			planId = (Long) session.save(plan);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Problem while storing the plan into the database " + e);
		}finally{
			session.close();
		}
		logger.info("Plan correctly saved in the database");
		return planId;
	}

	/**
	 * Update an existing plan in the plan repository. It is mandatory that the
	 * name of the plan is unique
	 * 
	 * @throws Exception
	 */

	public void update(DeploymentPlanType plan) throws Exception {

		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		String planName = plan.getName();
		try {
			String qSelect = qp.getDeploymentPlan(planName);
			Query query = session.createQuery(qSelect);
			DeploymentPlanType deploymentPlan = (DeploymentPlanType) query
					.uniqueResult();
			session.update(deploymentPlan);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Finds the plan with an id given
	 * 
	 * @param planID
	 * @return
	 */
//FIXME: I think this is not used
	
	public DeploymentPlanType findPlanById(String planID) {

		DeploymentPlanType result = null;
		final Session session = sessionFactory.openSession();
		try {
			if (planID == null)
				throw new Exception("A non-null plan id must be specified.");
			String qSelect = qp.findPlanById(planID);
			logger.fine("Executing query: " + qSelect);
			DeploymentPlanType deploymentPlan = (DeploymentPlanType) session
					.createQuery(qSelect).uniqueResult();
			result = deploymentPlan;
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return result;
	}

	/**
	 * finds the plan with a name given. It is mandatory that the plan name is
	 * unique
	 * 
	 * @param planName
	 * @return
	 */

	public DeploymentPlanType findPlanByName(String planName) {

		DeploymentPlanType result = null;
		final Session session = sessionFactory.openSession();
		try {
			if (planName == null)
				throw new Exception("A non-null plan id must be specified.");
			String qSelect = qp.getDeploymentPlan(planName);
			Query query = session.createQuery(qSelect);
			logger.fine("Executing query: " + qSelect);
			DeploymentPlanType deploymentPlan = (DeploymentPlanType) query.uniqueResult();
			result = deploymentPlan;
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return result;
	}
	
	/**
	 * finds the plan with a name given. It is mandatory that the plan name is
	 * unique
	 * 
	 * @param planName
	 * @return
	 */

	@Override
	public String[] findPlansByName(String planName) {

		final Session session = sessionFactory.openSession();
		try {
			if (planName == null)
				throw new Exception("A non-null plan id must be specified.");
			String qSelect = null;
			Query query = null;
			qSelect = qp.getDeploymentPlan(planName);
			query = session.createQuery(qSelect);
			logger.fine("Executing query: " + qSelect);
			List<String> deploymentPlanNameList = query.list();
			return deploymentPlanNameList.toArray(new String[deploymentPlanNameList.size()]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return null;
	}
	
	public void setQueryProvider(String queryProvider) {
		this.queryProvider = queryProvider;
	}
	
	public String getQueryProvider() {
		return queryProvider;
	}
	
	public DatabaseManager getDBManager() {
		return DBManager;
	}

	public void setDBManager(DatabaseManager manager) {
		DBManager = manager;
	}
}

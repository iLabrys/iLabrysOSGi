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
package es.itecban.deployment.executionmanager.manager.report.manager;

import java.util.List;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.itecban.deployment.environmentmanager.services.ReportManager;
import es.itecban.deployment.executionmanager.database.DatabaseManager;
import es.itecban.deployment.executionmanager.manager.queryprovider.DefaultQueryProvider;
import es.itecban.deployment.executionmanager.manager.queryprovider.QueryProvider;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

public class ReportManagerImpl implements ReportManager {

	private DatabaseManager DBManager;
	private Logger logger = Logger.getLogger(ReportManagerImpl.class.getName());
	private String queryProvider;
	private QueryProvider qp;

	public DatabaseManager getDBManager() {
		return DBManager;
	}

	public void setDBManager(DatabaseManager manager) {
		DBManager = manager;
	}

	private SessionFactory sessionFactory;

	public void initSessionFactory() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {

		sessionFactory = DBManager.getSessionFactory();
		// Try to load a queryprovider for the specific database
		if (queryProvider == null)
			queryProvider = DefaultQueryProvider.class.getName();
		Class cprov = this.getClass().getClassLoader().loadClass(queryProvider);
		this.qp = (QueryProvider) cprov.newInstance();
	}

	@Override
	public String[] findExecutionReportByParameters(String planName,
			XMLGregorianCalendar endTimeMin, XMLGregorianCalendar endTimeMax,
			String creationUserId, String launchUserId, String environment) {

		Query query = null;
		final Session session = sessionFactory.openSession();

		String qSelect = this.qp.findReportsByParameters(planName, endTimeMin,
				endTimeMax, creationUserId, launchUserId, environment);
		query = session.createQuery(qSelect);
		// Set the values
		query.setString("environment", environment != null ? environment : "%");
		if (endTimeMin != null)
			query.setDate("endTimeMin", endTimeMin.toGregorianCalendar()
					.getTime());
		if (endTimeMax != null)
			query.setDate("endTimeMax", endTimeMax.toGregorianCalendar()
					.getTime());

		String[] executionReportArray = this.findExecutionReports(query);
		session.close();
		return executionReportArray;
	}

	// @Override
	public String[] findExecutionReports(Query query) {

		final Session session = sessionFactory.openSession();
		String[] reportList = null;
		List<Object> objectList = null;
		try {
			objectList = query.list();
			reportList = new String[objectList.size()];
			if (objectList != null && objectList.size() > 0) {
				for (int i = 0; i < objectList.size(); i++) {
					Object[] objectArray = (Object[]) objectList.get(i);
					StringBuffer sb = new StringBuffer();
					long timeInMilis = ((XMLGregorianCalendar) objectArray[1])
							.toGregorianCalendar().getTimeInMillis();
					sb.append((String) objectArray[0]).append("|").append(
							timeInMilis);
					reportList[i] = sb.toString();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return reportList;
	}

	@Override
	public void save(ExecutionReportType report) throws Exception {

		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			session.save(report);
			session.getTransaction().commit();
			logger.fine("Report correctly added to the database");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error while saving the report");
		} finally {
			session.close();
		}
	}

	@Override
	public ExecutionReportType findExecutionReportByPlanId(String planId,
			XMLGregorianCalendar startTime) {

		ExecutionReportType result = null;
		Query query = null;
		if (planId == null || startTime == null) {
			logger
					.severe("There does not exist a report with the given name and start time");
			return result;
		}
		final Session session = sessionFactory.openSession();
		String qSelect = this.qp.findReport(planId, startTime);
		query = session.createQuery(qSelect);
		startTime.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		query.setParameter("startTime", startTime);
		result = (ExecutionReportType) query.uniqueResult();

		session.close();
		return result;
	}

	// delete this?
	@Override
	public String[] findExecutionReports(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCreationUserId(String reportName,
			XMLGregorianCalendar startTime, String creationUserId)
			throws Exception {

		ExecutionReportType result = null;
		Query query = null;
		if (reportName == null || startTime == null) {
			logger
					.severe("For searching a report, it is necessary to have the reportName and the startTime parameters");
			return;
		}
		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			String qSelect = this.qp.findReport(reportName, startTime);
			query = session.createQuery(qSelect);
			startTime.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			query.setParameter("startTime", startTime);
			result = (ExecutionReportType) query.uniqueResult();
			// sets the creation user id
			result.setCreationUserId(creationUserId);
			session.update(result);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			logger.severe("Error while setting the creation user id to the report");
			throw new Exception(
					"running.error.setCreationUser");
		} finally {
			session.close();
		}
	}

	@Override
	public void setLauncherUserId(String reportName,
			XMLGregorianCalendar startTime, String launcherUserId)
			throws Exception {

		ExecutionReportType result = null;
		Query query = null;
		if (reportName == null || startTime == null) {
			logger
					.severe("For searching a report, it is necessary to have the reportName and the startTime parameters");
			return;
		}
		final Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			String qSelect = this.qp.findReport(reportName, startTime);
			query = session.createQuery(qSelect);
			startTime.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			query.setParameter("startTime", startTime);
			result = (ExecutionReportType) query.uniqueResult();
			// sets the creation user id
			result.setLauncherUserId(launcherUserId);
			session.update(result);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(
					"Error while setting the launch user id to the report");
		} finally {
			session.close();
		}
	}

	public void setQueryProvider(String queryProvider) {
		this.queryProvider = queryProvider;
	}

	public String getQueryProvider() {
		return queryProvider;
	}
}

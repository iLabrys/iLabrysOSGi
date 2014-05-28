package es.itecban.deployment.environmentmanager.manager;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import es.itecban.deployment.environment.database.DatabaseManager;
import es.itecban.deployment.environmentmanager.services.DBCleaner;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;

public class DBCleanerImpl implements DBCleaner {

	private DatabaseManager databaseManager;
	private SessionFactory sessionFactory;
	private Logger logger;

	/**
	 * Cleans all the photos except one for a date interval Vamos día a día
	 * borrando
	 */

	@Override
	public int clean(XMLGregorianCalendar minDate, XMLGregorianCalendar maxDate)
			throws Exception {

		logger.info("Beginning the cleannin of data.");
		final Session session = this.sessionFactory.openSession();
		int i = 0;
		List<DeploymentTargetType> environmentList = null;
		try {
			String[] environmentNameArray = this.getEnvironmentsName();
			// For each of the environments...
			for (String environmentName : environmentNameArray){
				XMLGregorianCalendar minDateAux = new XMLGregorianCalendarImpl();
				minDateAux.setDay(minDate.getDay());
				minDateAux.setMonth(minDate.getMonth());
				minDateAux.setYear(minDate.getYear());
				boolean moreDays = true;
				while (moreDays) {
					Criteria dttCriteria = session
							.createCriteria(DeploymentTargetType.class);
					// cuando no hay fecha es null o es ""??
					if (minDateAux != null)
						dttCriteria.add(Restrictions.ge("timestamp", minDateAux));
					
					XMLGregorianCalendar maxDateRelative = new XMLGregorianCalendarImpl();
//					maxDateRelative.setDay(minDateAux.getDay());
					maxDateRelative.setMonth(minDateAux.getMonth());
					maxDateRelative.setYear(minDateAux.getYear());
					
					maxDateRelative.setDay(minDateAux.getDay() + 1);
					Object lastDayPhoto = null;
					if (maxDate != null
							&& maxDateRelative.compare(maxDate) == DatatypeConstants.LESSER
							|| maxDateRelative.compare(maxDate) == DatatypeConstants.EQUAL){
						lastDayPhoto = this.getLastEnvironmentDayDate(environmentName, minDateAux, maxDateRelative);
					}else{
						moreDays = false;
					}
					// OJO mirar que pasa y tratar cuando el intervalo es abierto
					dttCriteria.add(Restrictions.lt("timestamp",
						lastDayPhoto));
					dttCriteria.add(Restrictions.eq("name", environmentName));
					dttCriteria.setMaxResults(3);
					boolean more = true;
					while (more && moreDays) {
						session.beginTransaction();
						environmentList = dttCriteria.setMaxResults(3).list();
						if (environmentList.size() < 3)
							more = false;
						for (DeploymentTargetType environment : environmentList) {
							session.delete(environment);
							i++;
						}
						// Check if there is more to delete
						session.getTransaction().commit();

					}
					minDateAux.setDay(minDateAux.getDay() + 1);
				}
			}
		} catch (Exception e) {
			logger
					.severe("Error while deleting the environment from the database"
							+ e);
			throw new Exception(
					"Error while deleting the environment from the database"
							+ e);
		} finally {
			session.close();
		}
		logger.info("Finished the cleannin of data.");
		return i;
	}

	/**
	 * Cleans all the photos of a date interval
	 */

	// @Override
	// public int clean(XMLGregorianCalendar minDate, XMLGregorianCalendar
	// maxDate) throws Exception {
	//
	// logger.info("Beginning the cleannin of data.");
	// final Session session = this.sessionFactory.openSession();
	// int i = 0;
	// List<DeploymentTargetType> environmentList = null;
	// try {
	// Criteria dttCriteria = session
	// .createCriteria(DeploymentTargetType.class);
	// // cuando no hay fecha es null o es ""??
	// if (minDate != null)
	// dttCriteria.add(Restrictions.ge("timestamp", minDate));
	// if (maxDate != null)
	// dttCriteria.add(Restrictions.le("timestamp", maxDate));
	// dttCriteria.setMaxResults(3);
	// boolean more = true;
	//			
	// while (more){
	// session.beginTransaction();
	// environmentList = dttCriteria.setMaxResults(3).list();
	// if (environmentList.size() < 3)
	// more = false;
	// for (DeploymentTargetType environment : environmentList) {
	// session.delete(environment);
	// i++;
	// }
	// // Check if there is more to delete
	// session.getTransaction().commit();
	//				
	// }
	// } catch (Exception e) {
	// logger.severe("Error while deleting the environment from the database"
	// + e);
	// throw new Exception(
	// "Error while deleting the environment from the database" + e);
	// } finally {
	// session.close();
	// }
	// logger.info("Finished the cleannin of data.");
	// return i;
	// }
	private Object getLastEnvironmentDayDate(String environmentName, XMLGregorianCalendar minDate, XMLGregorianCalendar maxDate) {

		final Session session = this.sessionFactory.openSession();
		session.beginTransaction();

		// Get the latest date for the "photos" stored in the database
		Criteria timestampCriteria = session
				.createCriteria(DeploymentTargetType.class);

		if (minDate != null)
			timestampCriteria.add(Restrictions.ge("timestamp", minDate));
		if (maxDate != null)
			timestampCriteria.add(Restrictions.lt("timestamp", maxDate));

		timestampCriteria.setProjection(Projections.projectionList().add(
				Projections.max("timestamp")));
		timestampCriteria.add(Restrictions.eq("name", environmentName));
		Object lastEvironmentTimestampCriteria = timestampCriteria
				.uniqueResult();

		session.close();
		return lastEvironmentTimestampCriteria;
	}
	
	private String[] getEnvironmentsName() throws Exception {

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

	public void init() throws Exception {

		this.sessionFactory = ((DatabaseManager) databaseManager)
				.getSessionFactory();
		this.logger = Logger.getLogger(DBCleanerImpl.class.getName());
	}

	public void setDatabaseManager(DatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}
}

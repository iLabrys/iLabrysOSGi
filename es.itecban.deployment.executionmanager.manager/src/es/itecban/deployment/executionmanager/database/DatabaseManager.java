package es.itecban.deployment.executionmanager.database;

import org.hibernate.SessionFactory;

public interface DatabaseManager {

	public SessionFactory getSessionFactory();
}

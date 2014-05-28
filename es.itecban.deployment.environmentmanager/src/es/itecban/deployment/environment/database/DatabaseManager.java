package es.itecban.deployment.environment.database;

import org.hibernate.SessionFactory;

public interface DatabaseManager {

	public SessionFactory getSessionFactory();
}

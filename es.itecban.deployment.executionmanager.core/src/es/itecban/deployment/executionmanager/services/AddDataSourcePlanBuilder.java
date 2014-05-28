package es.itecban.deployment.executionmanager.services;

import java.util.List;

import es.itecban.deployment.model.deployment.target.ContainerType;

/**
 * Plan for the creation of plans that create a JDBC DataSource in a JEE
 * container. Currently only MySQL databases and JDBC Datasources are supported.
 * 
 * @author rodrigo
 * 
 */
public interface AddDataSourcePlanBuilder extends PlanBuilder {

	/**
	 * Gives all the containers in the environment that are DBMS (DataBase
	 * Management Systems)
	 * 
	 * @return A List with all the ContainerTypes of the environment with type
	 *         es.itecban.deployment.container.db.*
	 */
	public List<ContainerType> getDBMSContainers();

	/**
	 * Sets the DBMS container for which the DataSource will be created.
	 * 
	 * @param dbmsContainer
	 *            A ContainerType referencig the target DBMS
	 */
	public void setDBMSContainer(ContainerType dbmsContainer);

	/**
	 * Gives all the available databases in the DBMS container
	 * 
	 * @return A List of Strings with the names of the databases
	 */
	public List<String> getDatabases();

	/**
	 * Sets the database for which the DataSource will be created.
	 * 
	 * @param database
	 *            A String with the name of the database (a runtime unit in the
	 *            DBMS container)
	 */
	public void setDatabase(String database);

}

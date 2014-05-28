package es.itecban.deployment.environmentmanager;

/**
 *
 * @author 
 *
 */

public interface Constants {

//	//this property is given by runtime arguments. By default 1155 is used
//	public static final String RMI_CONNECTION_PORT = System.getProperty("TMport");

	//To connect to the TM module MBean
	public static final String TM_OBJECT_NAME = "es.itecban.deployment.targetmanager:type=targetManager";
	
	//To connect to the TM module MBean
	public static final String NM_OBJECT_NAME = "es.itecban.deployment.nodemanager:type=nodeManager";
	
//	//To connect to the TM module MBean port
//	public static final String TM_PORT = "1155";
	
	// file where the user, password, ulr and port may be
	public static final String CONTAINER_CONEXION_CONFIGURATION = "container.properties";

	//
	public static final String ENVIRONMENT_CONFIGURATION_PROPERTIES = "env.properties";

	// property contaning the objectNames of the servers/clusters which must not
	// be shown. They are concatenated with "+". This property is an environment
	// property
	public static final String ENVIRONMENT_CONFIGURATION_CONTAINER_FILTER = "es.itecban.deployment.environment.container.filter";
}

package es.itecban.deployment.environmentmanager.manager;

import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.management.JMX;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import es.itecban.deployment.agents.NodeManagerMXBean;
import es.itecban.deployment.agents.TargetManagerMXBean;
import es.itecban.deployment.environmentmanager.Constants;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;

public class AgentConnector {
	
	private static Logger logger = Logger.getLogger(AgentConnector.class.getName());
	private static Hashtable connectionTable = new Hashtable();
	
	private AgentConnector(){
		
	}

	/**
	 * Connects to a NodeManager with a specific jmx address
	 * @param environmentname
	 * @return the Nodemanager MXBean
	 */
	
	protected static NodeManagerMXBean connect2NM (String jmxUrl){
		
		if (jmxUrl == null){
			logger.severe("To connecto to the node a jmx url is necessary ");
			return null;
		}
		NodeManagerMXBean nodemanagermxbean = null;
		try{
			JMXConnector jmxconnector = JMXConnectorFactory.connect(new JMXServiceURL(jmxUrl));
			MBeanServerConnection mbeanserverconnection = jmxconnector.getMBeanServerConnection();
			nodemanagermxbean = JMX.newMXBeanProxy(mbeanserverconnection, new ObjectName(Constants.NM_OBJECT_NAME), NodeManagerMXBean.class);
		}catch (Exception e){
			logger.severe("Connection Fail!! check the given jmx url\n"+e);
		}
		return nodemanagermxbean;
	}
	
	/**
	 * Connects to a TM with a specific ip address. The port by default is 1155
	 * @param environmentname
	 * @return the TargetManager MXBean
	 * @throws Exception 
	 */
	
	protected static TargetManagerMXBean connect2TM (String environmentname, String dirIp, String port, SessionFactory sessionFactory) throws Exception{
		
		if (dirIp == null){
			final Session session = sessionFactory.openSession();
			session.beginTransaction();
			try {
				// Get the latest date for the "photos" stored in the database
				Criteria timestampCriteria = session.createCriteria(DeploymentTargetType.class);
				timestampCriteria.setProjection(Projections.projectionList().add(
						Projections.max("timestamp")));
				timestampCriteria.add(Restrictions.eq("name", environmentname));
				Object lastEvironmentTimestampCriteria = timestampCriteria
				.uniqueResult();
				if (lastEvironmentTimestampCriteria == null)
					throw new Exception ("There is no environment with that name in the database");
				//TODO: cambiar cuando el TM este actualizado en indra
				String qSelect = "select dtt.uUID from DeploymentTargetType as dtt"
					+ " where dtt.timestamp=:timestamp and"
					+ " dtt.name=:environmentName";
				Query query = session.createQuery(qSelect);
				query.setParameter("timestamp", lastEvironmentTimestampCriteria);
				query.setString("environmentName", environmentname);
				dirIp = (String)query.uniqueResult();
			} catch (Exception e) {
				System.err.println("Error while retrieving the ip to connect via JMX");
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
		if (port == null)
			port = "1155";
		String serviceurl = "service:jmx:rmi:///jndi/rmi://" + dirIp + ":" + port + "/TargetManager";
		logger.info("JMX direction: " + serviceurl);
		
		TargetManagerMXBean targetmanagermxbean = null;
		try{
			//checks if the connection is already established (in the connectionTable)
			MBeanServerConnection mBeanServerConnection = null;
			if (!connectionTable.containsKey(serviceurl)){
				//the connection does not exist. Creating the new connection
				JMXConnector jmxconnector = JMXConnectorFactory.connect(new JMXServiceURL(serviceurl));
				mBeanServerConnection = jmxconnector.getMBeanServerConnection();
				targetmanagermxbean = JMX.newMXBeanProxy(mBeanServerConnection, new ObjectName(Constants.TM_OBJECT_NAME), TargetManagerMXBean.class);
				logger.info ("New connection created to TargetManager with name: " + targetmanagermxbean.getName());
				connectionTable.put(serviceurl, mBeanServerConnection);
			}else{
				mBeanServerConnection = (MBeanServerConnection)connectionTable.get(serviceurl);
				try{
					targetmanagermxbean = JMX.newMXBeanProxy(mBeanServerConnection, new ObjectName(Constants.TM_OBJECT_NAME), TargetManagerMXBean.class);
					if (targetmanagermxbean == null || !targetmanagermxbean.isactive())
						throw new Exception();
					logger.info ("Connection obtained to TargetManager with name: " + targetmanagermxbean.getName());
				
				}catch (Exception e){
					logger.info ("Recreating the connection to TargetManager");
					//maybe the connection to the target manager has been closed so it must be created again
					try{
						JMXConnector jmxconnector = JMXConnectorFactory.connect(new JMXServiceURL(serviceurl));
						mBeanServerConnection = jmxconnector.getMBeanServerConnection();
						targetmanagermxbean = JMX.newMXBeanProxy(mBeanServerConnection, new ObjectName(Constants.TM_OBJECT_NAME), TargetManagerMXBean.class);
						if (targetmanagermxbean == null || !targetmanagermxbean.isactive())
							throw new Exception();
						connectionTable.put(serviceurl, mBeanServerConnection);
						logger.info ("Connection recreated to TargetManager with name: " + targetmanagermxbean.getName());
					}catch (Exception e1){
						logger.severe("Impossible to recreate the connection to the TargetManager with name: " + targetmanagermxbean.getName());
						e1.printStackTrace();
					}
				}
			}
		}catch (Exception e){
			logger.severe("Problem while connecting to the targetmanager via JMX " + e);
			throw new Exception("running.error.tm.connection");
		}
		return targetmanagermxbean;
	}
}

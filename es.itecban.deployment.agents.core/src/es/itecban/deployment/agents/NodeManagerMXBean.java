package es.itecban.deployment.agents;


import javax.management.MXBean;

@MXBean
public interface NodeManagerMXBean {
	
	public static final String OBJECT_NAME = "es.itecban.deployment.nodemanager:type=nodeManager";
	
	//comentada para el light
	//public Node getNode();
	public void updateNode();
	public String getRemotingServiceUrl();
	public boolean startRemotingService();
	//public boolean executeDeploymentTransaction(DeploymentTransaction deploymentTransaction);
	//added for the new agent's version. Now the translation is done in NodeManager
	public String doDeploymentTargetXML();
}

package es.itecban.deployment.agents;


import javax.management.MXBean;

@MXBean
public interface TargetManagerMXBean {
	
	public static final String OBJECT_NAME = "es.itecban.deployment.targetmanager:type=targetManager";
	
	public String getName();
	//comentada para el light
	//public NodeDomain getNodeDomain();
	public void updateNodeDomain();
	//public boolean executeDeploymentPlan(DeploymentTransactionPlan deploymentPlan);
	//public boolean executeDeploymentPlanFromXMLFile(String XMLFileLocation);
	//added because of the new agent's version. The translation is now done in the NodeManager
	//and all the info in transmitted via a String
	public String doDeploymentTargetXML();
	
	public boolean isactive();
	public void setActive (boolean state);
}

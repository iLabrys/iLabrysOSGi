package es.itecban.deployment.executionmanager.elements;


public class DeploymentPlan implements java.io.Serializable{
	
	private String planID;
	private String deploymentTarget;
	
	public DeploymentPlan(){
		
	}
	
	public DeploymentPlan (String planID, String deploymentTarget){
		
		super();
		this.planID = planID;
		this.deploymentTarget = deploymentTarget;
	}
	
	public String getPlanID() {
		return planID;
	}
	
	public void setPlanID(String planID) {
		this.planID = planID;
	}
	
	public String getDeploymentTarget() {
		return deploymentTarget;
	}
	
	public void setDeploymentTarget(String deploymentTarget) {
		this.deploymentTarget = deploymentTarget;
	}

}

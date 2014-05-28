package es.itecban.deployment.executionmanager.gui.swf.service;

public class Unit {

	private String unitName;
	private boolean alreadyDeployed;
	private String containerName;
	
	public Unit(String unitName){
		this.unitName = unitName;
	}
	
	public void setAlreadyDeployed(boolean alreadyDeployed) {
		this.alreadyDeployed = alreadyDeployed;
	}
	
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	
	public String getUnitName() {
		return unitName;
	}
	
	public String getContainerName() {
		return containerName;
	}
	
	public boolean getAlreadyDeployed (){
		
		return this.alreadyDeployed;
	}
}

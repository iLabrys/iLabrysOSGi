package es.itecban.deployment.executionmanager.gui.swf.service;

import java.io.Serializable;

public class InstalledUnit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String unitName;
	private String unitVersion;
	private String[] containerArray;
		
	public InstalledUnit(String unitName, String unitVersion, String[] containerArray){
		
		this.unitName = unitName;
		this.unitVersion = unitVersion;
		this.containerArray = containerArray;
	}
	
	public String getUnitName() {
		return unitName;
	}
	
	public String getUnitVersion() {
		return unitVersion;
	}
	
	public String[] getContainerArray() {
		return containerArray;
	}
}
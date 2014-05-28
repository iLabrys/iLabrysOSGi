/*******************************************************************************
 * Copyright 2014 Indra
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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

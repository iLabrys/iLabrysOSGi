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
package es.itecban.deployment.executionmanager.elements;

import javax.xml.datatype.XMLGregorianCalendar;


public class PlanReport implements java.io.Serializable{
	

	private static final long serialVersionUID = -6414530699650347166L;
	private String planName;
	private XMLGregorianCalendar startTime;
	
	public PlanReport(){
		
	}
	
	public PlanReport (String planName, XMLGregorianCalendar startTime){
		
		super();
		this.planName = planName;
		this.startTime = startTime;
	}
	
	public String getPlanName() {
		return planName;
	}
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}
	
	public void setStartTime(XMLGregorianCalendar startTime) {
		this.startTime = startTime;
	}

}

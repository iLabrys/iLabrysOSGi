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

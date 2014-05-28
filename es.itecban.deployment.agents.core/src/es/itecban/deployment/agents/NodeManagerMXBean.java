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

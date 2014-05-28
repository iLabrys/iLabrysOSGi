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

import java.util.logging.Logger;

import org.springframework.webflow.execution.RequestContext;

public class GeneralPlanCreationManager {
	
	private Logger logger = Logger.getLogger(GeneralPlanCreationManager.class
			.getName());
	public final double varNb = Math.random();
	
	public GeneralPlanCreationManager(){
		
//		logger.info(".................Creating GeneralPlanCreationManager with number " + this.varNb);
	}
	
	public String[][] initialize(RequestContext context) {
		
		String[][] supportedGoals = new String[][] { 
				{ "INSTALL", "START" }, 
				{ "STOP", "UNINSTALL" }, 
				{ "UPDATE"}};
		context.getFlowScope().put("supportedGoals", supportedGoals);		
		return supportedGoals;
	}
	
	public int decideOperation(RequestContext context) throws Exception {
		int selectedOperation = Integer.parseInt((context.getRequestParameters().get("defaultGoal")));
		return selectedOperation;
	}
}

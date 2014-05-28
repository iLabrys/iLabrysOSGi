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

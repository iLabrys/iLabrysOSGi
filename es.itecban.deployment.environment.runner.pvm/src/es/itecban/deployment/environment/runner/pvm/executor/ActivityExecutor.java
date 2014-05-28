package es.itecban.deployment.environment.runner.pvm.executor;

import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;

/**
 * Executes deployment, configuration or resource activities.
 * @author marco
 * @version 0.2
 */
public interface ActivityExecutor {
	
	public String writeDescription(ActivityExecReportType actReport);
	public ActivityExecReportType runActivity();
	
}

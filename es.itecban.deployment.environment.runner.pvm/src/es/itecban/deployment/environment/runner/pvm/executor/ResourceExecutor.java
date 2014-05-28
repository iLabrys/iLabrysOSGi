package es.itecban.deployment.environment.runner.pvm.executor;

import java.util.Properties;

import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.unit.ResourceType;

/**
 * Executes resource activities.
 * @author marco
 * @version 0.2
 * @see ActivityExecutor
 */
public abstract class ResourceExecutor implements ResourceActivityExecutor {
	
	protected int activityId;
	protected ResourceActivityKindType activityKind;
	protected Properties props;
	protected ResourceType resource;
	
	protected ResourceExecutor(int activityId, ResourceActivityKindType activityKind, 
			Properties props, ResourceType resource) {
		this.activityId = activityId;
		this.activityKind = activityKind;
		this.props = props;
		this.resource = resource;
	}
	
	public String writeDescription(ActivityExecReportType actReport) {
		
		StringBuilder description = new StringBuilder();
		description.append("Activity ");
		description.append(activityId);
		description.append(" report: ");
		description.append(resource.getName());
		description.append(" v");
		description.append(resource.getVersion());
		description.append(" was ");
		ActivityResultKindType actResult = actReport.getResult();
		if (!actResult.equals(ActivityResultKindType.OK)) description.append("not ");
		if (activityKind.equals(ResourceActivityKindType.ADDCONTAINERRESOURCE)) 
			description.append("added on the ");
		if (activityKind.equals(ResourceActivityKindType.REMOVECONTAINERRESOURCE))
			description.append("removed from the ");
		description.append(props.getProperty("es.itecban.deployment.container.name"));
		description.append(" container.");
		return description.toString();
		
	}
	
	
	/**
	 * Runs the activity associated with this executor.
	 * @return report with information about the activity's execution
	 */
	public abstract ActivityExecReportType runActivity();
	
}

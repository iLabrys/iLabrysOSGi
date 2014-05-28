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

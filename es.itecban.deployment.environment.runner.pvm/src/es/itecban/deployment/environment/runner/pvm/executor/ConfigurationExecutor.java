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

import org.eclipse.emf.common.util.EList;

import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.unit.PropertyType;

/**
 * Executes configuration activities.
 * @author marco
 * @version 0.2
 * @see ActivityExecutor
 */
public abstract class ConfigurationExecutor implements ConfigurationActivityExecutor {
	
	protected int activityId;
	protected ConfigurationActivityKindType activityKind;
	protected Properties props;
	protected ConfigurationType configuration;
	
	protected ConfigurationExecutor(int activityId, ConfigurationActivityKindType activityKind, 
			Properties props, ConfigurationType configuration) {
		this.activityId = activityId;
		this.activityKind = activityKind;
		this.props = props;
		this.configuration = configuration;
	}
	
	public String writeDescription(ActivityExecReportType actReport) {
		
		StringBuilder description = new StringBuilder();
		description.append("Activity ");
		description.append(activityId);
		description.append(" report: ");
		if (activityKind.equals(ConfigurationActivityKindType.CONFIGURECONTAINERPROPERTY)) {
			description.append(props.getProperty("es.itecban.deployment.container.name"));
			description.append(" container");
		}
		if (activityKind.equals(ConfigurationActivityKindType.CONFIGURECONTAINERRESOURCE)) {
			description.append(props.getProperty("es.itecban.deployment.container.resource"));
			description.append(" resource in ");
			description.append(props.getProperty("es.itecban.deployment.container.name"));
			description.append(" container");
		}
		if (activityKind.equals(ConfigurationActivityKindType.CONFIGUREUNITRESOURCE)) {
			description.append(props.getProperty("es.itecban.deployment.unit.resource"));
			description.append(" resource of ");
			description.append(props.getProperty("es.itecban.deployment.container.unit"));
			description.append(" unit in ");
			description.append(props.getProperty("es.itecban.deployment.container.name"));
			description.append(" container");
		}
		description.append(" was ");
		ActivityResultKindType actResult = actReport.getResult();
		if (!actResult.equals(ActivityResultKindType.OK)) description.append("not ");
		description.append("configured with properties ");
		EList<PropertyType> properties = configuration.getProperty();
		for (PropertyType property : properties) {
			description.append(property.getName() + "=" + property.getValue() + "\n");
		}
		return description.toString();
		
	}
	
	
	/**
	 * Runs the activity associated with this executor.
	 * @return report with information about the activity's execution
	 */
	public abstract ActivityExecReportType runActivity();

}

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

import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourceType;

public class FaultExecutor implements ActivityExecutor {
	
	private ActivityType activity;
	private Properties fails;
	
	private	static final String SEPARATOR = "#";
	
	public FaultExecutor(ActivityType activity,	Properties fails) {
		this.activity = activity;
		this.fails = fails;
	}
	
	public String writeDescription(ActivityExecReportType actReport) {
		
		if (activity instanceof DeploymentActivityType) {
			DeploymentActivityType da = (DeploymentActivityType) activity;
			int activityId = da.getActivityId();
			String unitName = da.getUnitName();
			String unitVersion = da.getUnitVersion();
			String target = da.getTarget();
			String[] params = target.split(SEPARATOR, 3);
			//String nodeName = params[1];
			String containerName = params[2];
			DeploymentActivityKindType activityKind = da.getType();
			StringBuilder description = new StringBuilder();
			description.append("Activity ");
			description.append(activityId);
			description.append(" report: ");
			description.append(unitName);
			description.append(" v");
			description.append(unitVersion);
			description.append(" was ");
			ActivityResultKindType actResult = actReport.getResult();
			if (!actResult.equals(ActivityResultKindType.OK))
				description.append("not ");
			if (activityKind.equals(DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT))
				description.append("installed");
			if (activityKind.equals(DeploymentActivityKindType.UNINSTALLDEPLOYMENTUNIT))
				description.append("uninstalled");
			if (activityKind.equals(DeploymentActivityKindType.STARTDEPLOYMENTUNIT))
				description.append("started");
			if (activityKind.equals(DeploymentActivityKindType.STOPDEPLOYMENTUNIT))
				description.append("stopped");
			if (activityKind.equals(DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT))
				description.append("updated");
			description.append(" on the ");
			description.append(containerName);
			description.append(" container.");
			return description.toString();
		}
		
		if (activity instanceof ConfigurationActivityType) {
			ConfigurationActivityType ca = (ConfigurationActivityType) activity;
			int activityId = ca.getActivityId();
			//ConfigurationActivityKindType activityKind = ca.getType();
			String target = ca.getTarget();
			String[] params = target.split(SEPARATOR, 5);
			//String nodeName = params[1];
			String containerName = params[2];
			String containerResourceName = params[3];
			String unitName = params[3];
			String unitResourceName = params[4];
			ConfigurationActivityKindType activityKind = ca.getType();
			StringBuilder description = new StringBuilder();
			description.append("Activity ");
			description.append(activityId);
			description.append(" report: ");
			if (activityKind.equals(ConfigurationActivityKindType.CONFIGURECONTAINERPROPERTY)) {
				description.append(containerName);
				description.append(" container");
			}
			if (activityKind.equals(ConfigurationActivityKindType.CONFIGURECONTAINERRESOURCE)) {
				description.append(containerResourceName);
				description.append(" resource in ");
				description.append(containerName);
				description.append(" container");
			}
			if (activityKind.equals(ConfigurationActivityKindType.CONFIGUREUNITRESOURCE)) {
				description.append(unitResourceName);
				description.append(" resource of ");
				description.append(unitName);
				description.append(" unit in ");
				description.append(containerName);
				description.append(" container");
			}
			description.append(" was ");
			ActivityResultKindType actResult = actReport.getResult();
			if (!actResult.equals(ActivityResultKindType.OK)) description.append("not ");
			description.append("configured with properties ");
			EList<PropertyType> properties = ca.getConfiguration().getProperty();
			for (PropertyType property : properties) {
				description.append(property.getName() + "=" + property.getValue() + "\n");
			}
			return description.toString();
		}
		
		if (activity instanceof ResourceActivityType) {
			ResourceActivityType ra = (ResourceActivityType) activity;
			int activityId = ra.getActivityId();
			ResourceType resource = ra.getResource();
			String target = ra.getTarget();
			String[] params = target.split(SEPARATOR, 3);
			//String nodeName = params[1];
			String containerName = params[2];
			ResourceActivityKindType activityKind = ra.getType();
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
			description.append(containerName);
			description.append(" container.");
			return description.toString();
		}
		
		return "";
		
	}
	
	public ActivityExecReportType runActivity() {
		
		ActivityExecReportType actReport = ReportFactory.eINSTANCE.createActivityExecReportType();
		String failEnvironment = fails.getProperty("failEnvironment", "OK");
		String failExecutor = fails.getProperty("failExecutor", "OK");
		String failConnection = fails.getProperty("failConnection", "OK");
		String failUnit = fails.getProperty("failUnit", "OK");
		
		// Check for problems with environment
		if (failEnvironment.startsWith("NE")) {
			actReport.setResultCode("AERC001005");
			actReport.setResult(ActivityResultKindType.CONNECTIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failEnvironment.substring(3, failEnvironment.length()));
			return actReport;
		}
		if (failEnvironment.startsWith("NN")) {
			actReport.setResultCode("AERC001006");
			actReport.setResult(ActivityResultKindType.CONNECTIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failEnvironment.substring(3, failEnvironment.length()));
			return actReport;
		}
		if (failEnvironment.startsWith("NC")) {
			actReport.setResultCode("AERC001007");
			actReport.setResult(ActivityResultKindType.CONNECTIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failEnvironment.substring(3, failEnvironment.length()));
			return actReport;
		}
		if (failEnvironment.startsWith("NS")) {
			actReport.setResultCode("AERC001008");
			actReport.setResult(ActivityResultKindType.CONNECTIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failEnvironment.substring(3, failEnvironment.length()));
			return actReport;
		}
		if (failEnvironment.startsWith("NU")) {
			actReport.setResultCode("AERC001009");
			actReport.setResult(ActivityResultKindType.CONNECTIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failEnvironment.substring(3, failEnvironment.length()));
			return actReport;
		}
		if (failEnvironment.startsWith("NR")) {
			actReport.setResultCode("AERC001010");
			actReport.setResult(ActivityResultKindType.CONNECTIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failEnvironment.substring(3, failEnvironment.length()));
			return actReport;
		}
		
		// Check for problems with executor
		if (failExecutor.startsWith("WE")) {
			// TODO: Set result code
			actReport.setResultCode("AERCXXXYYY");
			// TODO: Set result (EXCEPTION u otro)
			actReport.setResult(ActivityResultKindType.UNKNOWN);
			actReport.setTechnicalActivityExecReport(failExecutor.substring(3, failExecutor.length()));
			return actReport;
		}
		
		// Check for problems with container connection properties
		if (failConnection.startsWith("CC")) {
			actReport.setResultCode("AERC003001");
			actReport.setResult(ActivityResultKindType.CONFIGURATIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failConnection.substring(3, failConnection.length()));
			return actReport;
		}
		
		// Check for problems with unit
		if (failUnit.startsWith("WU")) {
			actReport.setResultCode("AERC002001");
			actReport.setResult(ActivityResultKindType.UNAVAILABLEUNITS);
			actReport.setTechnicalActivityExecReport(failUnit.substring(3, failUnit.length()));
			return actReport;
		}
		if (failUnit.startsWith("BD")) {
			actReport.setResultCode("AERC002002");
			actReport.setResult(ActivityResultKindType.UNAVAILABLEUNITS);
			actReport.setTechnicalActivityExecReport(failUnit.substring(3, failUnit.length()));
			return actReport;
		}
		if (failUnit.startsWith("CP")) {
			actReport.setResultCode("AERC003002");
			actReport.setResult(ActivityResultKindType.CONFIGURATIONPROBLEM);
			actReport.setTechnicalActivityExecReport(failUnit.substring(3, failUnit.length()));
			return actReport;
		}
		
		return null;
		
	}
	
}

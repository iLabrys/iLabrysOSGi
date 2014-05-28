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

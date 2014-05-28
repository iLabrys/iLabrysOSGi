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
package es.itecban.deployment.environment.runner.pvm.factory;

import java.util.Properties;

import es.itecban.deployment.environment.runner.pvm.executor.DeploymentActivityExecutor;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface DeploymentExecutorFactory extends ActivityExecutorFactory {
	
	public DeploymentActivityExecutor createExecutor(int activityId, DeploymentActivityKindType activityKind, 
			Properties props, DeploymentUnitType unit);
	
}

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
package es.itecban.deployment.executionmanager.services;

import java.util.List;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

public interface EnvironmentGraphBuilderFactory {

	public EnvironmentGraphBuilder createEnvironmentGraphBuilder(DeploymentTargetType environment, DeploymentUnitType unit, List<String> containerList) throws Exception;
	
	public EnvironmentGraphBuilder createSingleUnitEnvironmentGraphBuilder(DeploymentTargetType environment, DeploymentUnitType unit, ContainerType container) throws Exception;
}

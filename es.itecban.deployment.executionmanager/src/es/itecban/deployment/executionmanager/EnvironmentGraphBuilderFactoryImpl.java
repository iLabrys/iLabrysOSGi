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
package es.itecban.deployment.executionmanager;

import java.util.List;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.services.EnvironmentGraphBuilder;
import es.itecban.deployment.executionmanager.services.EnvironmentGraphBuilderFactory;
import es.itecban.deployment.executionmanager.utils.EnvironmentGraphUtils;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;

public class EnvironmentGraphBuilderFactoryImpl implements EnvironmentGraphBuilderFactory{

	private RepositoryManagerCore repoManager;
	private EnvironmentManagerCore envManager;

	public void setRepoManager(RepositoryManagerCore repoManager) {
		this.repoManager = repoManager;
	}

	public void setEnvManager(EnvironmentManagerCore envManager) {
		this.envManager = envManager;
	}

	public EnvironmentGraphBuilder createEnvironmentGraphBuilder(DeploymentTargetType environment, DeploymentUnitType unit, List<String> containerList) throws Exception {
		EnvironmentGraphUtils utils = new EnvironmentGraphUtils(repoManager, envManager, environment);
		return new EnvironmentGraphBuilderImpl(environment, unit, repoManager, envManager, utils, containerList);
	}
	
	public EnvironmentGraphBuilder createSingleUnitEnvironmentGraphBuilder(DeploymentTargetType environment, DeploymentUnitType unit, ContainerType container) throws Exception {
		EnvironmentGraphUtils utils = new EnvironmentGraphUtils(repoManager, envManager, environment);
		return new SingleUnitEnvironmentGraphBuilderImpl(unit, container, repoManager, utils);
	}

}

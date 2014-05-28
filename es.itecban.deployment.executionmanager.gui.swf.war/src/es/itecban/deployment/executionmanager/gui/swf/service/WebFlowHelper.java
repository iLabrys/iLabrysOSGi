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
package es.itecban.deployment.executionmanager.gui.swf.service;

import org.springframework.webflow.conversation.impl.SessionBindingConversationManager;
import org.springframework.webflow.execution.repository.impl.DefaultFlowExecutionRepository;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.executor.FlowExecutorImpl;

public class WebFlowHelper {

	private FlowExecutor flowExecutor;

	public WebFlowHelper(FlowExecutor flowExecutor) {
		this.flowExecutor = flowExecutor;
	}

	public FlowExecutor getFlowExecutor() {
		return flowExecutor;
	}

	public SessionBindingConversationManager getConversationManager() {
		return ((SessionBindingConversationManager) ((DefaultFlowExecutionRepository) ((FlowExecutorImpl) flowExecutor)
				.getExecutionRepository()).getConversationManager());
	}

	public int getLockTimeoutSeconds() {
		return getConversationManager().getLockTimeoutSeconds();
	}

	public void setLockTimeoutSeconds(int lockTimeoutSeconds) {
		getConversationManager().setLockTimeoutSeconds(lockTimeoutSeconds);
	}
}

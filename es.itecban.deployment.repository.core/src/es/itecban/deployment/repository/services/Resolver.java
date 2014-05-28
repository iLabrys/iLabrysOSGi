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
package es.itecban.deployment.repository.services;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.repository.services.core.ResolverCore;


/**
 * This service interface is used at the active repository to carry out
 * dependency resolution among deployment units and resources.
 * The Resolver connects to one or more RepositoryManagers for querying
 * for Dep Units and Resources, and employs a SelectionPolicyManager for
 * choosing among candidate DependencyGraph
 * @author jlruiz, fcuadrado
 *
 */
public interface Resolver extends ResolverCore{
	/**
	 * 
	 * @param rr required resource
	 * @return a graph with the required deployment units
	 * to successfully install the resource
	 * @throws Exception
	 */
	public DependencyGraph resolveRequiredResource(RequiredResourceType rr) throws Exception;

	
}

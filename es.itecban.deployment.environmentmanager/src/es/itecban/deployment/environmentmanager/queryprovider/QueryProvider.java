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
package es.itecban.deployment.environmentmanager.queryprovider;

/**
 * Utility interface for solving queries required by the
 * Repository Manager interface. There is a default implementation
 * for the query interface and then extra implementations can be added
 * 
 * @author jlrrevuelta
 *
 */
public interface QueryProvider {

	/**
	 * No case sensitive
	 * @param resourceName
	 * @param resourceType
	 * @param strictMatch
	 * @return
	 */
	public abstract String findUnitResources(String resourceName, String resourceType, boolean strictMatch);
	
	/**
	 * No case sensitive
	 * @param resourceName
	 * @param resourceType
	 * @param strictMatch
	 * @return
	 */
	public abstract String findContainerResources(String resourceName, String resourceType, boolean strictMatch);
	
	/**
	 * No case sensitive
	 * @param name
	 * @param version
	 * @param strictMatch
	 * @return
	 */
	public abstract String findUnitInContainers(String name, String version, boolean strictMatch);
	
	/**
	 * No case sensitive
	 * @param name
	 * @param version
	 * @param strictMatch
	 * @return
	 */
	public abstract String getUnitsFromContainer(String name, String version, boolean strictMatch);
	
	/**
	 * This method is case sensitive
	 * @return
	 */
	public abstract String findUnitResource();
	
	/**
	 * this method is case sensitive
	 * @return
	 */
	public abstract String findContainterResource();
}

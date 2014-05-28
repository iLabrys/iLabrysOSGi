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
package es.itecban.deployment.resource.taxonomy;

import java.io.Serializable;
import java.util.Properties;
/**
 * Resources are structured in categories
 * @author jlrrevuelta
 */
public class Category implements Serializable{
	
	private String name;
	private String description;
	private Properties supportedTypes;
	
	public Category(String name, String description, Properties supportedTypes) {
		super();
		this.name = name;
		this.description = description;
		this.supportedTypes = supportedTypes;
	}
	
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.supportedTypes=new Properties();
	}
	
	public Category(String name) {
		super();
		this.name = name;
		this.description = name;
		this.supportedTypes=new Properties();
	}
	public String getName() {
		return name;
	}

	public Properties getSupportedTypes() {
		return supportedTypes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}

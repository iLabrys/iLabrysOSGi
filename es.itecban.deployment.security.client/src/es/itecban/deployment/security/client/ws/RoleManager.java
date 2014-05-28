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
package es.itecban.deployment.security.client.ws;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import org.springframework.core.io.Resource;

public class RoleManager {

	public static String DEFAULT_USER = "ROLE_REPO_USER";
	public static String REPO_MANAGER = "ROLE_REPO_MANAGER";
	public static String ENV_MANAGER = "ROLE_ENV_MANAGER";
	public static String EXEC_MANAGER = "ROLE_EXEC_MANAGER";

	private HashMap<String, String[]> roleMap=new HashMap<String, String[]>();
	private HashMap<String, String> users=new HashMap<String, String>();
	
	
	private Resource propertiesResource;

	public Resource getPropertiesResource() {
		return propertiesResource;
	}

	public void setPropertiesResource(Resource propertiesResource) throws Exception {
		this.propertiesResource = propertiesResource;
		Properties p=new Properties();
		p.load(propertiesResource
				.getInputStream());
		Enumeration keys=p.keys();
		if (keys!=null){
			while (keys.hasMoreElements()) {
				String rname = (String) keys.nextElement();
				String roles=p.getProperty(rname);
				String[] ritems = roles.split(",");
				if (ritems == null) {					
					ritems=new String[] { DEFAULT_USER };
				}
				if (ritems.length>1){
					String[] temp=new String[ritems.length-1];
					for (int i = 0; i < temp.length; i++) {
						temp[i]=ritems[i+1].trim();
					}
				}
				//Add the user to the users list
				if (!this.users.containsKey(rname))
					this.users.put(rname, ritems[0]);
				//Add roles to the users				
				this.roleMap.put(rname, ritems);
			}
		}
	}
	

	public String[] getUserRoles(String user) throws Exception {
		if (roleMap.containsKey(user)) {
			return this.roleMap.get(user);
		}
		throw new Exception(
				"Either the user is not registerd or there are no roles assigned to the user");
	}
	
	public HashMap<String, String> getUsers() {
		return users;
	}

}

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
package es.itecban.deployment.executionmanager.elements;

/**
 * Non-EMF bean for easily remoting DeploymentGroups through RMI
 * 
 * @author Félix Cuadrado
 *
 */

public class Constraint implements java.io.Serializable{
	private String name;
	private String version;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Constraint!= true)
			return false;
		Constraint n = (Constraint) obj;
		String nn = n.getName();
		String nv = n.getVersion();
		String nt = n.getType();
		String tn = this.getName();
		String tv = this.getVersion();
		String tt = this.getType();
		if (nn.equals(tn) && nt.equals(tt)) {
			if (nv == null && tv == null)
				return true;
			if (nv != null && tv != null)
				return nv.equals(tv);
		}
		return false;
	}
	
}

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

import java.util.ArrayList;
import java.util.List;

/**
 * A deployment group is a collection of Deployment Units which must be deployed
 * over the same container.
 * 
 * 
 * @author Félix Cuadrado
 * 
 */
public class DeploymentGroup implements java.io.Serializable {
	private ArrayList<DeploymentUnit> dus;
	private ArrayList<Constraint> groupConstraints;

	public DeploymentGroup() {
		groupConstraints = new ArrayList<Constraint>();
		dus = new ArrayList<DeploymentUnit>();
	}

	public boolean addDu(DeploymentUnit du) {
		if (du == null)
			return false;
		
		if (dus.contains(du)) {
			// Du already added to the group
			return false;
		}
		dus.add(du);
		return true;
	}

	public boolean addConstraint(Constraint c) {
		if(c == null)
			return false;
		if(groupConstraints.contains(c))
			//Constraint already added
			return false;
		groupConstraints.add(c);
		return true;
		
	}
	

	public List<DeploymentUnit> getUnits() {
		return dus;
	}

	public List<Constraint> getConstraints() {

		return groupConstraints;
	}

	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		// TODO Implement Equals (needed for contains)
		// Should be enough with comparing the list of Deployment Units
		if (obj instanceof DeploymentGroup != true)
			return false;
		DeploymentGroup other = (DeploymentGroup) obj;
		List<DeploymentUnit> lt = this.getUnits();
		List<DeploymentUnit> lo = other.getUnits();
		if (lt != null && lo != null)
			return this.getUnits().equals(other.getUnits());
		if (lt == null && lo == null)
			return true;
		return false;
	}
}

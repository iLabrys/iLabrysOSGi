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

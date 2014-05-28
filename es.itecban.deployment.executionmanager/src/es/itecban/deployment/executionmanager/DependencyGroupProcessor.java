package es.itecban.deployment.executionmanager;

import java.util.ArrayList;
import java.util.List;

import es.itecban.deployment.executionmanager.elements.Constraint;
import es.itecban.deployment.executionmanager.elements.DeploymentGroup;
import es.itecban.deployment.executionmanager.elements.DeploymentUnit;
import es.itecban.deployment.model.dependency.graph.Dependency;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.dependency.graph.Node;
import es.itecban.deployment.model.deployment.unit.ConstraintsType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;

public class DependencyGroupProcessor {
	private DependencyGraph dg;
	
	public DependencyGroupProcessor(DependencyGraph graph) {
		this.dg = graph;
	}
	
	public DeploymentGroup[] getGroups(){
 		Node node = dg.getOrigin();
		
		ArrayList<DeploymentGroup> groups = new ArrayList<DeploymentGroup>();
		startGroup(node, groups);
		DeploymentGroup[] groupsArray = new DeploymentGroup[groups.size()];
		for(int i = 0;i<groups.size();i++){
			groupsArray[i] = groups.get(groups.size()-i-1);
		}
		return groupsArray;	
	}
	
	private void startGroup(Node node, List<DeploymentGroup> groups){
		DeploymentUnitType du = node.getUnit();
		DeploymentGroup g = new DeploymentGroup();
		addDuToGroup(du,g);
		
		groups.add(g);
		
		List<Dependency> deps = node.getDependency();
		for (Dependency rel : deps) {
			if(rel.getLocality().equals("remote"))
				startGroup(rel.getDestination(),groups);
			else{ //local dependency: depunit must be added to group
				Node dest = rel.getDestination();
				continueGroup(dest,g,groups);
			}
		}
		
	}

	private boolean addDuToGroup(DeploymentUnitType du, DeploymentGroup g) {
		if (du == null)
			return false;
		DeploymentUnit unit = new DeploymentUnit();
		unit.setName(du.getName());
		unit.setVersion(du.getVersion());
		if(!g.addDu(unit))
			return false;
		
		ConstraintsType constraints = du.getConstraints();
		
		if (constraints != null)
			computeConstraints(constraints,g);

		return true;
		
	}

	private void computeConstraints(ConstraintsType constraints,
			DeploymentGroup g) {

			List<RequiredResourceType> news = constraints.getConstraint();
			for (RequiredResourceType rr : news) {
				// Here we would have to process, for each
				// requiredresourceproperty,
				// the kind to see whether they add, must be ignored or...
				//for the moment just dumb contains
				Constraint constraint = getConstraint(rr);
				g.addConstraint(constraint);
			}
	}

	private Constraint getConstraint(RequiredResourceType rr) {
		if(rr==null)
			return null;
		Constraint constraint  = new Constraint();
		constraint.setName(rr.getName());
		constraint.setVersion(rr.getVersion());
		constraint.setType(rr.getType());
		return constraint;
	}

	private void continueGroup(Node node, DeploymentGroup g,
			List<DeploymentGroup> groups) {
		
		
		addDuToGroup(node.getUnit(), g);
		List<Dependency> deps = node.getDependency();
		for (Dependency rel : deps) {
			if(rel.getLocality().equals("remote"))
				startGroup(rel.getDestination(),groups);
			else{ //local dependency: depunit must be added to group
				Node dest = rel.getDestination();
				continueGroup(dest,g,groups);
			}
		}
	}

	public DeploymentUnitType[] getUnits(){
		ArrayList<DeploymentUnitType> list = new ArrayList<DeploymentUnitType>();
		Node node = dg.getOrigin();
		list.add(node.getUnit());
		addUnitsChildren(node, list);
						
		return list.toArray(new DeploymentUnitType[list.size()]);
	}
	
	private void addUnitsChildren(Node node, ArrayList<DeploymentUnitType> list){
		List<Dependency> deps = node.getDependency();
		for (Dependency rel : deps) {
			Node destination = rel.getDestination();
			if(list.add(destination.getUnit()))
				addUnitsChildren(destination, list);
			
		}
	}
	
}

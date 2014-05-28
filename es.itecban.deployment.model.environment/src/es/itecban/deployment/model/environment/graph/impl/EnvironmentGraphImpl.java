/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.environment.graph.impl;

import es.itecban.deployment.model.environment.graph.Dependency;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphPackage;
import es.itecban.deployment.model.environment.graph.Node;
import es.itecban.deployment.model.environment.graph.Cause;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl#getNode <em>Node</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl#getOrigins <em>Origins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentGraphImpl extends EObjectImpl implements EnvironmentGraph {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * The cached value of the '{@link #getOrigins() <em>Origins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigins()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> origins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.ENVIRONMENT_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Node> getNode() {
		if (node == null) {
			node = new BasicInternalEList<Node>(Node.class);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new BasicInternalEList<Dependency>(Dependency.class);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Node> getOrigins() {
		if (origins == null) {
			origins = new BasicInternalEList<Node>(Node.class);
		}
		return origins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.ENVIRONMENT_GRAPH__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case GraphPackage.ENVIRONMENT_GRAPH__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.ENVIRONMENT_GRAPH__NODE:
				return getNode();
			case GraphPackage.ENVIRONMENT_GRAPH__DEPENDENCIES:
				return getDependencies();
			case GraphPackage.ENVIRONMENT_GRAPH__ORIGINS:
				return getOrigins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.ENVIRONMENT_GRAPH__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphPackage.ENVIRONMENT_GRAPH__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case GraphPackage.ENVIRONMENT_GRAPH__ORIGINS:
				getOrigins().clear();
				getOrigins().addAll((Collection<? extends Node>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.ENVIRONMENT_GRAPH__NODE:
				getNode().clear();
				return;
			case GraphPackage.ENVIRONMENT_GRAPH__DEPENDENCIES:
				getDependencies().clear();
				return;
			case GraphPackage.ENVIRONMENT_GRAPH__ORIGINS:
				getOrigins().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.ENVIRONMENT_GRAPH__NODE:
				return node != null && !node.isEmpty();
			case GraphPackage.ENVIRONMENT_GRAPH__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case GraphPackage.ENVIRONMENT_GRAPH__ORIGINS:
				return origins != null && !origins.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	public boolean addNode(Node node) {
		if (!this.getNode().contains(node)){
			getNode().add(node);
			((InternalEObject)node).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphPackage.NODE, null, null);
			return true;
		}
		return false;
	}
	
	/**
	 * @generated NOT
	 */
	public String toString() {
		StringBuffer result=new StringBuffer();
		result.append("---Nodes---\n");
		List<Node> nodes=this.getNode();
		if (nodes!=null)
		for (Node node:nodes){
			result.append("\t");
			result.append(node.getId());
			result.append("\n");
		}		
		result.append("---Dependencies---\n");
		List<Dependency> deps= this.getDependencies();
		if (deps!=null)
		for (Dependency dep:deps){
			result.append("\t From ");
			result.append(dep.getSource().getId());
			result.append(" to ");
			result.append(dep.getDestination().getId());		
			result.append("\n\t\t because of the following requirements:\n");
			List<Cause> causes=dep.getCause();
			if (causes!=null)
				for (Cause cause:causes){
					result.append("\t\t\t name:");
					result.append(cause.getName());
					result.append(" version:");
					result.append(cause.getVersion());
					result.append(" type:");
					result.append(cause.getType());
					result.append("\n");
				}
		}
		return result.toString();
	}

	/**
	 * 
	 * @generated NOT
	 */
	public void removeNode(Node node) {
		if (this.getNode().contains(node))		
			this.getNode().remove(node);
		
	}
	/**
	 * 
	 * 
	 * @param dep
	 * @return
	 * @generated NOT
	 */
	public boolean addDependency(Dependency dep){
		if (!this.getDependencies().contains(dep)){
			getDependencies().add(dep);
			((InternalEObject)dep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphPackage.DEPENDENCY, null, null);
			return true;
		}
		return false;
	}

} //EnvironmentGraphImpl

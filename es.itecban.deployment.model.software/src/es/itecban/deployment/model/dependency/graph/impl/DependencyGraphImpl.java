/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.dependency.graph.impl;

import es.itecban.deployment.model.dependency.graph.Cause;
import es.itecban.deployment.model.dependency.graph.Dependency;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.dependency.graph.GraphPackage;
import es.itecban.deployment.model.dependency.graph.Node;

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
 * An implementation of the model object '<em><b>Dependency Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl#getNode <em>Node</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyGraphImpl extends EObjectImpl implements DependencyGraph {
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
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Node origin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.DEPENDENCY_GRAPH;
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
	public List<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new BasicInternalEList<Dependency>(Dependency.class);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Node newOrigin) {
		origin = newOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.DEPENDENCY_GRAPH__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case GraphPackage.DEPENDENCY_GRAPH__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.DEPENDENCY_GRAPH__NODE:
				return getNode();
			case GraphPackage.DEPENDENCY_GRAPH__DEPENDENCY:
				return getDependency();
			case GraphPackage.DEPENDENCY_GRAPH__ORIGIN:
				return getOrigin();
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
			case GraphPackage.DEPENDENCY_GRAPH__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphPackage.DEPENDENCY_GRAPH__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case GraphPackage.DEPENDENCY_GRAPH__ORIGIN:
				setOrigin((Node)newValue);
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
			case GraphPackage.DEPENDENCY_GRAPH__NODE:
				getNode().clear();
				return;
			case GraphPackage.DEPENDENCY_GRAPH__DEPENDENCY:
				getDependency().clear();
				return;
			case GraphPackage.DEPENDENCY_GRAPH__ORIGIN:
				setOrigin((Node)null);
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
			case GraphPackage.DEPENDENCY_GRAPH__NODE:
				return node != null && !node.isEmpty();
			case GraphPackage.DEPENDENCY_GRAPH__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case GraphPackage.DEPENDENCY_GRAPH__ORIGIN:
				return origin != null;
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
		result.append("---Units---\n");
		List<Node> nodes=this.getNode();
		if (nodes!=null)
		for (Node node:nodes){
			result.append("\t");
			result.append(node.getId());
			result.append("\n");
		}		
		result.append("---Dependencies---\n");
		List<Dependency> deps= this.getDependency();
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
		if (!this.getDependency().contains(dep)){
			getDependency().add(dep);
			((InternalEObject)dep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphPackage.DEPENDENCY, null, null);
			return true;
		}
		return false;
	}
} //DependencyGraphImpl

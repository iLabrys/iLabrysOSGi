/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.NodeContainersType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Containers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodeContainersTypeImpl#getNodeContainer <em>Node Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeContainersTypeImpl extends EObjectImpl implements NodeContainersType {
	/**
	 * The cached value of the '{@link #getNodeContainer() <em>Node Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerType> nodeContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeContainersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.NODE_CONTAINERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerType> getNodeContainer() {
		if (nodeContainer == null) {
			nodeContainer = new EObjectContainmentEList<ContainerType>(ContainerType.class, this, TargetPackage.NODE_CONTAINERS_TYPE__NODE_CONTAINER);
		}
		return nodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.NODE_CONTAINERS_TYPE__NODE_CONTAINER:
				return ((InternalEList<?>)getNodeContainer()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.NODE_CONTAINERS_TYPE__NODE_CONTAINER:
				return getNodeContainer();
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
			case TargetPackage.NODE_CONTAINERS_TYPE__NODE_CONTAINER:
				getNodeContainer().clear();
				getNodeContainer().addAll((Collection<? extends ContainerType>)newValue);
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
			case TargetPackage.NODE_CONTAINERS_TYPE__NODE_CONTAINER:
				getNodeContainer().clear();
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
			case TargetPackage.NODE_CONTAINERS_TYPE__NODE_CONTAINER:
				return nodeContainer != null && !nodeContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeContainersTypeImpl

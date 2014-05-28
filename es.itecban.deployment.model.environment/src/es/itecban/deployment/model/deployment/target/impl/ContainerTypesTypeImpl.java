/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.ContainerTypesType;
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
 * An implementation of the model object '<em><b>Container Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypesTypeImpl#getContainerType <em>Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerTypesTypeImpl extends EObjectImpl implements ContainerTypesType {
	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerTypeType> containerType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.CONTAINER_TYPES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerTypeType> getContainerType() {
		if (containerType == null) {
			containerType = new EObjectContainmentEList<ContainerTypeType>(ContainerTypeType.class, this, TargetPackage.CONTAINER_TYPES_TYPE__CONTAINER_TYPE);
		}
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.CONTAINER_TYPES_TYPE__CONTAINER_TYPE:
				return ((InternalEList<?>)getContainerType()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.CONTAINER_TYPES_TYPE__CONTAINER_TYPE:
				return getContainerType();
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
			case TargetPackage.CONTAINER_TYPES_TYPE__CONTAINER_TYPE:
				getContainerType().clear();
				getContainerType().addAll((Collection<? extends ContainerTypeType>)newValue);
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
			case TargetPackage.CONTAINER_TYPES_TYPE__CONTAINER_TYPE:
				getContainerType().clear();
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
			case TargetPackage.CONTAINER_TYPES_TYPE__CONTAINER_TYPE:
				return containerType != null && !containerType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerTypesTypeImpl

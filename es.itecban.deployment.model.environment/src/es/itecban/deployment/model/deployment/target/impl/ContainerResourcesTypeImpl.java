/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.ContainerResourcesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
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
 * An implementation of the model object '<em><b>Container Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerResourcesTypeImpl#getContainerResource <em>Container Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerResourcesTypeImpl extends EObjectImpl implements ContainerResourcesType {
	/**
	 * The cached value of the '{@link #getContainerResource() <em>Container Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerResource()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeResourceType> containerResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.CONTAINER_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeResourceType> getContainerResource() {
		if (containerResource == null) {
			containerResource = new EObjectContainmentEList<RuntimeResourceType>(RuntimeResourceType.class, this, TargetPackage.CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE);
		}
		return containerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE:
				return ((InternalEList<?>)getContainerResource()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE:
				return getContainerResource();
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
			case TargetPackage.CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE:
				getContainerResource().clear();
				getContainerResource().addAll((Collection<? extends RuntimeResourceType>)newValue);
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
			case TargetPackage.CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE:
				getContainerResource().clear();
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
			case TargetPackage.CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE:
				return containerResource != null && !containerResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerResourcesTypeImpl

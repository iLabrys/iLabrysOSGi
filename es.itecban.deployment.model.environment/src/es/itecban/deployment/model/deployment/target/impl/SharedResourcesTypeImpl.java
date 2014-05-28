/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.SharedResourcesType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import es.itecban.deployment.model.deployment.unit.ResourceType;

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
 * An implementation of the model object '<em><b>Shared Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.SharedResourcesTypeImpl#getSharedResource <em>Shared Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SharedResourcesTypeImpl extends EObjectImpl implements SharedResourcesType {
	/**
	 * The cached value of the '{@link #getSharedResource() <em>Shared Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> sharedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.SHARED_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getSharedResource() {
		if (sharedResource == null) {
			sharedResource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, TargetPackage.SHARED_RESOURCES_TYPE__SHARED_RESOURCE);
		}
		return sharedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.SHARED_RESOURCES_TYPE__SHARED_RESOURCE:
				return ((InternalEList<?>)getSharedResource()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.SHARED_RESOURCES_TYPE__SHARED_RESOURCE:
				return getSharedResource();
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
			case TargetPackage.SHARED_RESOURCES_TYPE__SHARED_RESOURCE:
				getSharedResource().clear();
				getSharedResource().addAll((Collection<? extends ResourceType>)newValue);
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
			case TargetPackage.SHARED_RESOURCES_TYPE__SHARED_RESOURCE:
				getSharedResource().clear();
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
			case TargetPackage.SHARED_RESOURCES_TYPE__SHARED_RESOURCE:
				return sharedResource != null && !sharedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SharedResourcesTypeImpl

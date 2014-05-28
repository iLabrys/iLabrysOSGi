/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.InterconnectResourcesType;
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
 * An implementation of the model object '<em><b>Interconnect Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectResourcesTypeImpl#getInterconnectResource <em>Interconnect Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterconnectResourcesTypeImpl extends EObjectImpl implements InterconnectResourcesType {
	/**
	 * The cached value of the '{@link #getInterconnectResource() <em>Interconnect Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> interconnectResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.INTERCONNECT_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getInterconnectResource() {
		if (interconnectResource == null) {
			interconnectResource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, TargetPackage.INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE);
		}
		return interconnectResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE:
				return ((InternalEList<?>)getInterconnectResource()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE:
				return getInterconnectResource();
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
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE:
				getInterconnectResource().clear();
				getInterconnectResource().addAll((Collection<? extends ResourceType>)newValue);
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
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE:
				getInterconnectResource().clear();
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
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE:
				return interconnectResource != null && !interconnectResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterconnectResourcesTypeImpl

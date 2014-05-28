/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.BridgeResourcesType;
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
 * An implementation of the model object '<em><b>Bridge Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.BridgeResourcesTypeImpl#getBridgeResource <em>Bridge Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeResourcesTypeImpl extends EObjectImpl implements BridgeResourcesType {
	/**
	 * The cached value of the '{@link #getBridgeResource() <em>Bridge Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> bridgeResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.BRIDGE_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getBridgeResource() {
		if (bridgeResource == null) {
			bridgeResource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, TargetPackage.BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE);
		}
		return bridgeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE:
				return ((InternalEList<?>)getBridgeResource()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE:
				return getBridgeResource();
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
			case TargetPackage.BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE:
				getBridgeResource().clear();
				getBridgeResource().addAll((Collection<? extends ResourceType>)newValue);
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
			case TargetPackage.BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE:
				getBridgeResource().clear();
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
			case TargetPackage.BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE:
				return bridgeResource != null && !bridgeResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BridgeResourcesTypeImpl

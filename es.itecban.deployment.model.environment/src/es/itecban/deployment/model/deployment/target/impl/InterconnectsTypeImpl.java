/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.InterconnectType;
import es.itecban.deployment.model.deployment.target.InterconnectsType;
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
 * An implementation of the model object '<em><b>Interconnects Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectsTypeImpl#getInterconnect <em>Interconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterconnectsTypeImpl extends EObjectImpl implements InterconnectsType {
	/**
	 * The cached value of the '{@link #getInterconnect() <em>Interconnect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnect()
	 * @generated
	 * @ordered
	 */
	protected EList<InterconnectType> interconnect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.INTERCONNECTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterconnectType> getInterconnect() {
		if (interconnect == null) {
			interconnect = new EObjectContainmentEList<InterconnectType>(InterconnectType.class, this, TargetPackage.INTERCONNECTS_TYPE__INTERCONNECT);
		}
		return interconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.INTERCONNECTS_TYPE__INTERCONNECT:
				return ((InternalEList<?>)getInterconnect()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.INTERCONNECTS_TYPE__INTERCONNECT:
				return getInterconnect();
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
			case TargetPackage.INTERCONNECTS_TYPE__INTERCONNECT:
				getInterconnect().clear();
				getInterconnect().addAll((Collection<? extends InterconnectType>)newValue);
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
			case TargetPackage.INTERCONNECTS_TYPE__INTERCONNECT:
				getInterconnect().clear();
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
			case TargetPackage.INTERCONNECTS_TYPE__INTERCONNECT:
				return interconnect != null && !interconnect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterconnectsTypeImpl

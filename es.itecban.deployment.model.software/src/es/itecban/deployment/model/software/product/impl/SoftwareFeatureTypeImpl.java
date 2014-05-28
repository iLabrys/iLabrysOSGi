/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.SoftwareElementsType;
import es.itecban.deployment.model.software.product.SoftwareFeatureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareFeatureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareFeatureTypeImpl#getSoftwareElements <em>Software Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareFeatureTypeImpl extends EObjectImpl implements SoftwareFeatureType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftwareElements() <em>Software Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElements()
	 * @generated
	 * @ordered
	 */
	protected SoftwareElementsType softwareElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.SOFTWARE_FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_FEATURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareElementsType getSoftwareElements() {
		return softwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareElements(SoftwareElementsType newSoftwareElements, NotificationChain msgs) {
		SoftwareElementsType oldSoftwareElements = softwareElements;
		softwareElements = newSoftwareElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS, oldSoftwareElements, newSoftwareElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareElements(SoftwareElementsType newSoftwareElements) {
		if (newSoftwareElements != softwareElements) {
			NotificationChain msgs = null;
			if (softwareElements != null)
				msgs = ((InternalEObject)softwareElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS, null, msgs);
			if (newSoftwareElements != null)
				msgs = ((InternalEObject)newSoftwareElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS, null, msgs);
			msgs = basicSetSoftwareElements(newSoftwareElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS, newSoftwareElements, newSoftwareElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS:
				return basicSetSoftwareElements(null, msgs);
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
			case ProductPackage.SOFTWARE_FEATURE_TYPE__NAME:
				return getName();
			case ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS:
				return getSoftwareElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.SOFTWARE_FEATURE_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS:
				setSoftwareElements((SoftwareElementsType)newValue);
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
			case ProductPackage.SOFTWARE_FEATURE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS:
				setSoftwareElements((SoftwareElementsType)null);
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
			case ProductPackage.SOFTWARE_FEATURE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductPackage.SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS:
				return softwareElements != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SoftwareFeatureTypeImpl

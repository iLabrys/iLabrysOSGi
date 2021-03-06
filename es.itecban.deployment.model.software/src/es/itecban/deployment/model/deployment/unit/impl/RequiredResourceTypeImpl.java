/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl#getRequiredResourceProperties <em>Required Resource Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredResourceTypeImpl extends EObjectImpl implements RequiredResourceType {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredResourceProperties() <em>Required Resource Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected RequiredResourcePropertiesType requiredResourceProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.REQUIRED_RESOURCE_TYPE;
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
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		version = newVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourcePropertiesType getRequiredResourceProperties() {
		return requiredResourceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredResourceProperties(RequiredResourcePropertiesType newRequiredResourceProperties, NotificationChain msgs) {
		RequiredResourcePropertiesType oldRequiredResourceProperties = requiredResourceProperties;
		requiredResourceProperties = newRequiredResourceProperties;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResourceProperties(RequiredResourcePropertiesType newRequiredResourceProperties) {
		if (newRequiredResourceProperties != requiredResourceProperties) {
			NotificationChain msgs = null;
			if (requiredResourceProperties != null)
				msgs = ((InternalEObject)requiredResourceProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES, null, msgs);
			if (newRequiredResourceProperties != null)
				msgs = ((InternalEObject)newRequiredResourceProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES, null, msgs);
			msgs = basicSetRequiredResourceProperties(newRequiredResourceProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES:
				return basicSetRequiredResourceProperties(null, msgs);
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
			case UnitPackage.REQUIRED_RESOURCE_TYPE__NAME:
				return getName();
			case UnitPackage.REQUIRED_RESOURCE_TYPE__VERSION:
				return getVersion();
			case UnitPackage.REQUIRED_RESOURCE_TYPE__TYPE:
				return getType();
			case UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES:
				return getRequiredResourceProperties();
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
			case UnitPackage.REQUIRED_RESOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case UnitPackage.REQUIRED_RESOURCE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case UnitPackage.REQUIRED_RESOURCE_TYPE__TYPE:
				setType((String)newValue);
				return;
			case UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES:
				setRequiredResourceProperties((RequiredResourcePropertiesType)newValue);
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
			case UnitPackage.REQUIRED_RESOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnitPackage.REQUIRED_RESOURCE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case UnitPackage.REQUIRED_RESOURCE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES:
				setRequiredResourceProperties((RequiredResourcePropertiesType)null);
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
			case UnitPackage.REQUIRED_RESOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnitPackage.REQUIRED_RESOURCE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case UnitPackage.REQUIRED_RESOURCE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case UnitPackage.REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES:
				return requiredResourceProperties != null;
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
		result.append(", version: ");
		result.append(version);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RequiredResourceTypeImpl

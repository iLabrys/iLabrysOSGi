/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType;
import es.itecban.deployment.model.deployment.target.StatusType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl#getRuntimeResourceTypes <em>Runtime Resource Types</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl#getRuntimeResourceProperties <em>Runtime Resource Properties</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeResourceTypeImpl extends EObjectImpl implements RuntimeResourceType {
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
	 * The cached value of the '{@link #getRuntimeResourceTypes() <em>Runtime Resource Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeResourceTypes()
	 * @generated
	 * @ordered
	 */
	protected RuntimeResourceTypesType runtimeResourceTypes;

	/**
	 * The cached value of the '{@link #getRuntimeResourceProperties() <em>Runtime Resource Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected RuntimeResourcePropertiesType runtimeResourceProperties;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.RUNTIME_RESOURCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__NAME, oldName, name));
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
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourceTypesType getRuntimeResourceTypes() {
		return runtimeResourceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeResourceTypes(RuntimeResourceTypesType newRuntimeResourceTypes, NotificationChain msgs) {
		RuntimeResourceTypesType oldRuntimeResourceTypes = runtimeResourceTypes;
		runtimeResourceTypes = newRuntimeResourceTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES, oldRuntimeResourceTypes, newRuntimeResourceTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeResourceTypes(RuntimeResourceTypesType newRuntimeResourceTypes) {
		if (newRuntimeResourceTypes != runtimeResourceTypes) {
			NotificationChain msgs = null;
			if (runtimeResourceTypes != null)
				msgs = ((InternalEObject)runtimeResourceTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES, null, msgs);
			if (newRuntimeResourceTypes != null)
				msgs = ((InternalEObject)newRuntimeResourceTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES, null, msgs);
			msgs = basicSetRuntimeResourceTypes(newRuntimeResourceTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES, newRuntimeResourceTypes, newRuntimeResourceTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourcePropertiesType getRuntimeResourceProperties() {
		return runtimeResourceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeResourceProperties(RuntimeResourcePropertiesType newRuntimeResourceProperties, NotificationChain msgs) {
		RuntimeResourcePropertiesType oldRuntimeResourceProperties = runtimeResourceProperties;
		runtimeResourceProperties = newRuntimeResourceProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES, oldRuntimeResourceProperties, newRuntimeResourceProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeResourceProperties(RuntimeResourcePropertiesType newRuntimeResourceProperties) {
		if (newRuntimeResourceProperties != runtimeResourceProperties) {
			NotificationChain msgs = null;
			if (runtimeResourceProperties != null)
				msgs = ((InternalEObject)runtimeResourceProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES, null, msgs);
			if (newRuntimeResourceProperties != null)
				msgs = ((InternalEObject)newRuntimeResourceProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES, null, msgs);
			msgs = basicSetRuntimeResourceProperties(newRuntimeResourceProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES, newRuntimeResourceProperties, newRuntimeResourceProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_RESOURCE_TYPE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		StatusType oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TargetPackage.RUNTIME_RESOURCE_TYPE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES:
				return basicSetRuntimeResourceTypes(null, msgs);
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES:
				return basicSetRuntimeResourceProperties(null, msgs);
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
			case TargetPackage.RUNTIME_RESOURCE_TYPE__NAME:
				return getName();
			case TargetPackage.RUNTIME_RESOURCE_TYPE__VERSION:
				return getVersion();
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES:
				return getRuntimeResourceTypes();
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES:
				return getRuntimeResourceProperties();
			case TargetPackage.RUNTIME_RESOURCE_TYPE__STATUS:
				return getStatus();
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
			case TargetPackage.RUNTIME_RESOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES:
				setRuntimeResourceTypes((RuntimeResourceTypesType)newValue);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES:
				setRuntimeResourceProperties((RuntimeResourcePropertiesType)newValue);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__STATUS:
				setStatus((StatusType)newValue);
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
			case TargetPackage.RUNTIME_RESOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES:
				setRuntimeResourceTypes((RuntimeResourceTypesType)null);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES:
				setRuntimeResourceProperties((RuntimeResourcePropertiesType)null);
				return;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__STATUS:
				unsetStatus();
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
			case TargetPackage.RUNTIME_RESOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.RUNTIME_RESOURCE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES:
				return runtimeResourceTypes != null;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES:
				return runtimeResourceProperties != null;
			case TargetPackage.RUNTIME_RESOURCE_TYPE__STATUS:
				return isSetStatus();
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
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RuntimeResourceTypeImpl

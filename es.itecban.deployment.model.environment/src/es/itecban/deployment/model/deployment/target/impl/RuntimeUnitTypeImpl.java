/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.RuntimeResourcesType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
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
 * An implementation of the model object '<em><b>Runtime Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl#getRuntimeResources <em>Runtime Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeUnitTypeImpl extends EObjectImpl implements RuntimeUnitType {
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
	 * The cached value of the '{@link #getRuntimeResources() <em>Runtime Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeResources()
	 * @generated
	 * @ordered
	 */
	protected RuntimeResourcesType runtimeResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.RUNTIME_UNIT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_UNIT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_UNIT_TYPE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_UNIT_TYPE__STATUS, oldStatus, status, !oldStatusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TargetPackage.RUNTIME_UNIT_TYPE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
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
	public RuntimeResourcesType getRuntimeResources() {
		return runtimeResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeResources(RuntimeResourcesType newRuntimeResources, NotificationChain msgs) {
		RuntimeResourcesType oldRuntimeResources = runtimeResources;
		runtimeResources = newRuntimeResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES, oldRuntimeResources, newRuntimeResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeResources(RuntimeResourcesType newRuntimeResources) {
		if (newRuntimeResources != runtimeResources) {
			NotificationChain msgs = null;
			if (runtimeResources != null)
				msgs = ((InternalEObject)runtimeResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES, null, msgs);
			if (newRuntimeResources != null)
				msgs = ((InternalEObject)newRuntimeResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES, null, msgs);
			msgs = basicSetRuntimeResources(newRuntimeResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES, newRuntimeResources, newRuntimeResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES:
				return basicSetRuntimeResources(null, msgs);
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
			case TargetPackage.RUNTIME_UNIT_TYPE__NAME:
				return getName();
			case TargetPackage.RUNTIME_UNIT_TYPE__VERSION:
				return getVersion();
			case TargetPackage.RUNTIME_UNIT_TYPE__STATUS:
				return getStatus();
			case TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES:
				return getRuntimeResources();
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
			case TargetPackage.RUNTIME_UNIT_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.RUNTIME_UNIT_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case TargetPackage.RUNTIME_UNIT_TYPE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES:
				setRuntimeResources((RuntimeResourcesType)newValue);
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
			case TargetPackage.RUNTIME_UNIT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.RUNTIME_UNIT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TargetPackage.RUNTIME_UNIT_TYPE__STATUS:
				unsetStatus();
				return;
			case TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES:
				setRuntimeResources((RuntimeResourcesType)null);
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
			case TargetPackage.RUNTIME_UNIT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.RUNTIME_UNIT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TargetPackage.RUNTIME_UNIT_TYPE__STATUS:
				return isSetStatus();
			case TargetPackage.RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES:
				return runtimeResources != null;
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

} //RuntimeUnitTypeImpl

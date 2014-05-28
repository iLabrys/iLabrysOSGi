/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.ContainerPropertiesType;
import es.itecban.deployment.model.deployment.target.ContainerResourcesType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypesType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitsType;
import es.itecban.deployment.model.deployment.target.SupportedPackagesType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl#getContainerTypes <em>Container Types</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl#getSupportedPackages <em>Supported Packages</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl#getContainerResources <em>Container Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl#getContainerProperties <em>Container Properties</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl#getRuntimeUnits <em>Runtime Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerTypeImpl extends EObjectImpl implements ContainerType {
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
	 * The cached value of the '{@link #getContainerTypes() <em>Container Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTypes()
	 * @generated
	 * @ordered
	 */
	protected ContainerTypesType containerTypes;

	/**
	 * The cached value of the '{@link #getSupportedPackages() <em>Supported Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPackages()
	 * @generated
	 * @ordered
	 */
	protected SupportedPackagesType supportedPackages;

	/**
	 * The cached value of the '{@link #getContainerResources() <em>Container Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerResources()
	 * @generated
	 * @ordered
	 */
	protected ContainerResourcesType containerResources;

	/**
	 * The cached value of the '{@link #getContainerProperties() <em>Container Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerProperties()
	 * @generated
	 * @ordered
	 */
	protected ContainerPropertiesType containerProperties;

	/**
	 * The cached value of the '{@link #getRuntimeUnits() <em>Runtime Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeUnits()
	 * @generated
	 * @ordered
	 */
	protected RuntimeUnitsType runtimeUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.CONTAINER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTypesType getContainerTypes() {
		return containerTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerTypes(ContainerTypesType newContainerTypes, NotificationChain msgs) {
		ContainerTypesType oldContainerTypes = containerTypes;
		containerTypes = newContainerTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES, oldContainerTypes, newContainerTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerTypes(ContainerTypesType newContainerTypes) {
		if (newContainerTypes != containerTypes) {
			NotificationChain msgs = null;
			if (containerTypes != null)
				msgs = ((InternalEObject)containerTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES, null, msgs);
			if (newContainerTypes != null)
				msgs = ((InternalEObject)newContainerTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES, null, msgs);
			msgs = basicSetContainerTypes(newContainerTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES, newContainerTypes, newContainerTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedPackagesType getSupportedPackages() {
		return supportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedPackages(SupportedPackagesType newSupportedPackages, NotificationChain msgs) {
		SupportedPackagesType oldSupportedPackages = supportedPackages;
		supportedPackages = newSupportedPackages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES, oldSupportedPackages, newSupportedPackages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedPackages(SupportedPackagesType newSupportedPackages) {
		if (newSupportedPackages != supportedPackages) {
			NotificationChain msgs = null;
			if (supportedPackages != null)
				msgs = ((InternalEObject)supportedPackages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES, null, msgs);
			if (newSupportedPackages != null)
				msgs = ((InternalEObject)newSupportedPackages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES, null, msgs);
			msgs = basicSetSupportedPackages(newSupportedPackages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES, newSupportedPackages, newSupportedPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerResourcesType getContainerResources() {
		return containerResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerResources(ContainerResourcesType newContainerResources, NotificationChain msgs) {
		ContainerResourcesType oldContainerResources = containerResources;
		containerResources = newContainerResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES, oldContainerResources, newContainerResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerResources(ContainerResourcesType newContainerResources) {
		if (newContainerResources != containerResources) {
			NotificationChain msgs = null;
			if (containerResources != null)
				msgs = ((InternalEObject)containerResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES, null, msgs);
			if (newContainerResources != null)
				msgs = ((InternalEObject)newContainerResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES, null, msgs);
			msgs = basicSetContainerResources(newContainerResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES, newContainerResources, newContainerResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerPropertiesType getContainerProperties() {
		return containerProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerProperties(ContainerPropertiesType newContainerProperties, NotificationChain msgs) {
		ContainerPropertiesType oldContainerProperties = containerProperties;
		containerProperties = newContainerProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES, oldContainerProperties, newContainerProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerProperties(ContainerPropertiesType newContainerProperties) {
		if (newContainerProperties != containerProperties) {
			NotificationChain msgs = null;
			if (containerProperties != null)
				msgs = ((InternalEObject)containerProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES, null, msgs);
			if (newContainerProperties != null)
				msgs = ((InternalEObject)newContainerProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES, null, msgs);
			msgs = basicSetContainerProperties(newContainerProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES, newContainerProperties, newContainerProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeUnitsType getRuntimeUnits() {
		return runtimeUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeUnits(RuntimeUnitsType newRuntimeUnits, NotificationChain msgs) {
		RuntimeUnitsType oldRuntimeUnits = runtimeUnits;
		runtimeUnits = newRuntimeUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS, oldRuntimeUnits, newRuntimeUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeUnits(RuntimeUnitsType newRuntimeUnits) {
		if (newRuntimeUnits != runtimeUnits) {
			NotificationChain msgs = null;
			if (runtimeUnits != null)
				msgs = ((InternalEObject)runtimeUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS, null, msgs);
			if (newRuntimeUnits != null)
				msgs = ((InternalEObject)newRuntimeUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS, null, msgs);
			msgs = basicSetRuntimeUnits(newRuntimeUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS, newRuntimeUnits, newRuntimeUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES:
				return basicSetContainerTypes(null, msgs);
			case TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES:
				return basicSetSupportedPackages(null, msgs);
			case TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES:
				return basicSetContainerResources(null, msgs);
			case TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES:
				return basicSetContainerProperties(null, msgs);
			case TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS:
				return basicSetRuntimeUnits(null, msgs);
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
			case TargetPackage.CONTAINER_TYPE__NAME:
				return getName();
			case TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES:
				return getContainerTypes();
			case TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES:
				return getSupportedPackages();
			case TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES:
				return getContainerResources();
			case TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES:
				return getContainerProperties();
			case TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS:
				return getRuntimeUnits();
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
			case TargetPackage.CONTAINER_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES:
				setContainerTypes((ContainerTypesType)newValue);
				return;
			case TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES:
				setSupportedPackages((SupportedPackagesType)newValue);
				return;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES:
				setContainerResources((ContainerResourcesType)newValue);
				return;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES:
				setContainerProperties((ContainerPropertiesType)newValue);
				return;
			case TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS:
				setRuntimeUnits((RuntimeUnitsType)newValue);
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
			case TargetPackage.CONTAINER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES:
				setContainerTypes((ContainerTypesType)null);
				return;
			case TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES:
				setSupportedPackages((SupportedPackagesType)null);
				return;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES:
				setContainerResources((ContainerResourcesType)null);
				return;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES:
				setContainerProperties((ContainerPropertiesType)null);
				return;
			case TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS:
				setRuntimeUnits((RuntimeUnitsType)null);
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
			case TargetPackage.CONTAINER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.CONTAINER_TYPE__CONTAINER_TYPES:
				return containerTypes != null;
			case TargetPackage.CONTAINER_TYPE__SUPPORTED_PACKAGES:
				return supportedPackages != null;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_RESOURCES:
				return containerResources != null;
			case TargetPackage.CONTAINER_TYPE__CONTAINER_PROPERTIES:
				return containerProperties != null;
			case TargetPackage.CONTAINER_TYPE__RUNTIME_UNITS:
				return runtimeUnits != null;
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

} //ContainerTypeImpl

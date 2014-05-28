/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationPackage;
import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.configuration.ContainersType;
import es.itecban.deployment.model.configuration.EnvironmentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentTypeImpl extends EObjectImpl implements EnvironmentType {
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
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected ContainersType containers;

	/**
	 * The cached value of the '{@link #getConfigurationProperties() <em>Configuration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationProperties()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationPropertiesType configurationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ENVIRONMENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersType getContainers() {
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainers(ContainersType newContainers, NotificationChain msgs) {
		ContainersType oldContainers = containers;
		containers = newContainers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS, oldContainers, newContainers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainers(ContainersType newContainers) {
		if (newContainers != containers) {
			NotificationChain msgs = null;
			if (containers != null)
				msgs = ((InternalEObject)containers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS, null, msgs);
			if (newContainers != null)
				msgs = ((InternalEObject)newContainers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS, null, msgs);
			msgs = basicSetContainers(newContainers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS, newContainers, newContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertiesType getConfigurationProperties() {
		return configurationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationProperties(ConfigurationPropertiesType newConfigurationProperties, NotificationChain msgs) {
		ConfigurationPropertiesType oldConfigurationProperties = configurationProperties;
		configurationProperties = newConfigurationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES, oldConfigurationProperties, newConfigurationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationProperties(ConfigurationPropertiesType newConfigurationProperties) {
		if (newConfigurationProperties != configurationProperties) {
			NotificationChain msgs = null;
			if (configurationProperties != null)
				msgs = ((InternalEObject)configurationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES, null, msgs);
			if (newConfigurationProperties != null)
				msgs = ((InternalEObject)newConfigurationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES, null, msgs);
			msgs = basicSetConfigurationProperties(newConfigurationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES, newConfigurationProperties, newConfigurationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS:
				return basicSetContainers(null, msgs);
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES:
				return basicSetConfigurationProperties(null, msgs);
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
			case ConfigurationPackage.ENVIRONMENT_TYPE__NAME:
				return getName();
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS:
				return getContainers();
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES:
				return getConfigurationProperties();
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
			case ConfigurationPackage.ENVIRONMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS:
				setContainers((ContainersType)newValue);
				return;
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES:
				setConfigurationProperties((ConfigurationPropertiesType)newValue);
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
			case ConfigurationPackage.ENVIRONMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS:
				setContainers((ContainersType)null);
				return;
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES:
				setConfigurationProperties((ConfigurationPropertiesType)null);
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
			case ConfigurationPackage.ENVIRONMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONTAINERS:
				return containers != null;
			case ConfigurationPackage.ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES:
				return configurationProperties != null;
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

} //EnvironmentTypeImpl

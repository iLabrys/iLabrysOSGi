/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType;
import es.itecban.deployment.model.deployment.plan.PlanPackage;
import es.itecban.deployment.model.deployment.plan.ResourceConfigurationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ResourceConfigurationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ResourceConfigurationTypeImpl#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceConfigurationTypeImpl extends EObjectImpl implements ResourceConfigurationType {
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
	protected ResourceConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanPackage.Literals.RESOURCE_CONFIGURATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.RESOURCE_CONFIGURATION_TYPE__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES, oldConfigurationProperties, newConfigurationProperties);
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
				msgs = ((InternalEObject)configurationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES, null, msgs);
			if (newConfigurationProperties != null)
				msgs = ((InternalEObject)newConfigurationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES, null, msgs);
			msgs = basicSetConfigurationProperties(newConfigurationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES, newConfigurationProperties, newConfigurationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES:
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
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__NAME:
				return getName();
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES:
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
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES:
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
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES:
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
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES:
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

} //ResourceConfigurationTypeImpl

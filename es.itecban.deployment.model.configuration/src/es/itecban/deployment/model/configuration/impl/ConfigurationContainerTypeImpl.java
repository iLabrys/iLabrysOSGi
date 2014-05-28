/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationContainerType;
import es.itecban.deployment.model.configuration.ConfigurationFilesType;
import es.itecban.deployment.model.configuration.ConfigurationPackage;

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
 *   <li>{@link es.itecban.deployment.model.configuration.impl.ConfigurationContainerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.ConfigurationContainerTypeImpl#getConfigurationFiles <em>Configuration Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationContainerTypeImpl extends EObjectImpl implements ConfigurationContainerType {
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
	 * The cached value of the '{@link #getConfigurationFiles() <em>Configuration Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationFiles()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationFilesType configurationFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION_CONTAINER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFilesType getConfigurationFiles() {
		return configurationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationFiles(ConfigurationFilesType newConfigurationFiles, NotificationChain msgs) {
		ConfigurationFilesType oldConfigurationFiles = configurationFiles;
		configurationFiles = newConfigurationFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES, oldConfigurationFiles, newConfigurationFiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationFiles(ConfigurationFilesType newConfigurationFiles) {
		if (newConfigurationFiles != configurationFiles) {
			NotificationChain msgs = null;
			if (configurationFiles != null)
				msgs = ((InternalEObject)configurationFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES, null, msgs);
			if (newConfigurationFiles != null)
				msgs = ((InternalEObject)newConfigurationFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES, null, msgs);
			msgs = basicSetConfigurationFiles(newConfigurationFiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES, newConfigurationFiles, newConfigurationFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES:
				return basicSetConfigurationFiles(null, msgs);
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
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__NAME:
				return getName();
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES:
				return getConfigurationFiles();
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
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES:
				setConfigurationFiles((ConfigurationFilesType)newValue);
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
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES:
				setConfigurationFiles((ConfigurationFilesType)null);
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
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES:
				return configurationFiles != null;
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

} //ConfigurationContainerTypeImpl

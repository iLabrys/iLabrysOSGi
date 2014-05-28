/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationFileType;
import es.itecban.deployment.model.configuration.ConfigurationFilesType;
import es.itecban.deployment.model.configuration.ConfigurationPackage;

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
 * An implementation of the model object '<em><b>Files Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.ConfigurationFilesTypeImpl#getConfigurationFile <em>Configuration File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationFilesTypeImpl extends EObjectImpl implements ConfigurationFilesType {
	/**
	 * The cached value of the '{@link #getConfigurationFile() <em>Configuration File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationFile()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationFileType> configurationFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationFilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION_FILES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationFileType> getConfigurationFile() {
		if (configurationFile == null) {
			configurationFile = new EObjectContainmentEList<ConfigurationFileType>(ConfigurationFileType.class, this, ConfigurationPackage.CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE);
		}
		return configurationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE:
				return ((InternalEList<?>)getConfigurationFile()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE:
				return getConfigurationFile();
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
			case ConfigurationPackage.CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE:
				getConfigurationFile().clear();
				getConfigurationFile().addAll((Collection<? extends ConfigurationFileType>)newValue);
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
			case ConfigurationPackage.CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE:
				getConfigurationFile().clear();
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
			case ConfigurationPackage.CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE:
				return configurationFile != null && !configurationFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationFilesTypeImpl

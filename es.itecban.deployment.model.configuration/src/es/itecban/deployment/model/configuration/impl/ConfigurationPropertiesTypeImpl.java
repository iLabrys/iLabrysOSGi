/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationPackage;
import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;

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
 * An implementation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.ConfigurationPropertiesTypeImpl#getEnvironmentProperties <em>Environment Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationPropertiesTypeImpl extends EObjectImpl implements ConfigurationPropertiesType {
	/**
	 * The cached value of the '{@link #getEnvironmentProperties() <em>Environment Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentPropertyType> environmentProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentPropertyType> getEnvironmentProperties() {
		if (environmentProperties == null) {
			environmentProperties = new EObjectContainmentEList<EnvironmentPropertyType>(EnvironmentPropertyType.class, this, ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES);
		}
		return environmentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES:
				return ((InternalEList<?>)getEnvironmentProperties()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES:
				return getEnvironmentProperties();
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
			case ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES:
				getEnvironmentProperties().clear();
				getEnvironmentProperties().addAll((Collection<? extends EnvironmentPropertyType>)newValue);
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
			case ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES:
				getEnvironmentProperties().clear();
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
			case ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES:
				return environmentProperties != null && !environmentProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationPropertiesTypeImpl

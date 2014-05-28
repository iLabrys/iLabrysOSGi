/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType;
import es.itecban.deployment.model.deployment.plan.PlanPackage;

import es.itecban.deployment.model.deployment.unit.PropertyType;

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
 * An implementation of the model object '<em><b>Configuration Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationPropertiesTypeImpl#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationPropertiesTypeImpl extends EObjectImpl implements ConfigurationPropertiesType {
	/**
	 * The cached value of the '{@link #getConfigurationProperties() <em>Configuration Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> configurationProperties;

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
		return PlanPackage.Literals.CONFIGURATION_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getConfigurationProperties() {
		if (configurationProperties == null) {
			configurationProperties = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, PlanPackage.CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES);
		}
		return configurationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanPackage.CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES:
				return ((InternalEList<?>)getConfigurationProperties()).basicRemove(otherEnd, msgs);
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
			case PlanPackage.CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES:
				return getConfigurationProperties();
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
			case PlanPackage.CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES:
				getConfigurationProperties().clear();
				getConfigurationProperties().addAll((Collection<? extends PropertyType>)newValue);
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
			case PlanPackage.CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES:
				getConfigurationProperties().clear();
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
			case PlanPackage.CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES:
				return configurationProperties != null && !configurationProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationPropertiesTypeImpl

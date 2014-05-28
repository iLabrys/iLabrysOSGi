/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

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
 * An implementation of the model object '<em><b>Runtime Resource Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourcePropertiesTypeImpl#getResourceProperty <em>Resource Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeResourcePropertiesTypeImpl extends EObjectImpl implements RuntimeResourcePropertiesType {
	/**
	 * The cached value of the '{@link #getResourceProperty() <em>Resource Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> resourceProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeResourcePropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.RUNTIME_RESOURCE_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getResourceProperty() {
		if (resourceProperty == null) {
			resourceProperty = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY);
		}
		return resourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY:
				return ((InternalEList<?>)getResourceProperty()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY:
				return getResourceProperty();
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
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY:
				getResourceProperty().clear();
				getResourceProperty().addAll((Collection<? extends PropertyType>)newValue);
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
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY:
				getResourceProperty().clear();
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
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY:
				return resourceProperty != null && !resourceProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuntimeResourcePropertiesTypeImpl

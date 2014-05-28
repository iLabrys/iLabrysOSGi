/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.ContainerPropertiesType;
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
 * An implementation of the model object '<em><b>Container Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.ContainerPropertiesTypeImpl#getContainerProperty <em>Container Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerPropertiesTypeImpl extends EObjectImpl implements ContainerPropertiesType {
	/**
	 * The cached value of the '{@link #getContainerProperty() <em>Container Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> containerProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.CONTAINER_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getContainerProperty() {
		if (containerProperty == null) {
			containerProperty = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, TargetPackage.CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY);
		}
		return containerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY:
				return ((InternalEList<?>)getContainerProperty()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY:
				return getContainerProperty();
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
			case TargetPackage.CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY:
				getContainerProperty().clear();
				getContainerProperty().addAll((Collection<? extends PropertyType>)newValue);
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
			case TargetPackage.CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY:
				getContainerProperty().clear();
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
			case TargetPackage.CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY:
				return containerProperty != null && !containerProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerPropertiesTypeImpl

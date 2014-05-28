/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.NodePropertiesType;
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
 * An implementation of the model object '<em><b>Node Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodePropertiesTypeImpl#getNodeProperty <em>Node Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodePropertiesTypeImpl extends EObjectImpl implements NodePropertiesType {
	/**
	 * The cached value of the '{@link #getNodeProperty() <em>Node Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> nodeProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodePropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.NODE_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getNodeProperty() {
		if (nodeProperty == null) {
			nodeProperty = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, TargetPackage.NODE_PROPERTIES_TYPE__NODE_PROPERTY);
		}
		return nodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.NODE_PROPERTIES_TYPE__NODE_PROPERTY:
				return ((InternalEList<?>)getNodeProperty()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.NODE_PROPERTIES_TYPE__NODE_PROPERTY:
				return getNodeProperty();
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
			case TargetPackage.NODE_PROPERTIES_TYPE__NODE_PROPERTY:
				getNodeProperty().clear();
				getNodeProperty().addAll((Collection<? extends PropertyType>)newValue);
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
			case TargetPackage.NODE_PROPERTIES_TYPE__NODE_PROPERTY:
				getNodeProperty().clear();
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
			case TargetPackage.NODE_PROPERTIES_TYPE__NODE_PROPERTY:
				return nodeProperty != null && !nodeProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodePropertiesTypeImpl

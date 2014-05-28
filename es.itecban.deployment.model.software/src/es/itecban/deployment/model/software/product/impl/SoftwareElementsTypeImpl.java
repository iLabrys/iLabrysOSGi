/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.SoftwareElementsType;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareElementsTypeImpl#getSoftwareElementList <em>Software Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareElementsTypeImpl extends EObjectImpl implements SoftwareElementsType {
	/**
	 * The cached value of the '{@link #getSoftwareElementList() <em>Software Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementList()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentUnitType> softwareElement;

	/**
	 * The empty value for the '{@link #getSoftwareElement() <em>Software Element</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElement()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentUnitType[] SOFTWARE_ELEMENT_EEMPTY_ARRAY = new DeploymentUnitType [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.SOFTWARE_ELEMENTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public DeploymentUnitType[] getSoftwareElement() {
		if (softwareElement == null || softwareElement.isEmpty()) return SOFTWARE_ELEMENT_EEMPTY_ARRAY;
		BasicEList<DeploymentUnitType> list = (BasicEList<DeploymentUnitType>)softwareElement;
		list.shrink();
		return (DeploymentUnitType[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentUnitType getSoftwareElement(int index) {
		return getSoftwareElementList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoftwareElementLength() {
		return softwareElement == null ? 0 : softwareElement.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareElement(DeploymentUnitType[] newSoftwareElement) {
		((BasicEList<DeploymentUnitType>)getSoftwareElementList()).setData(newSoftwareElement.length, newSoftwareElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareElement(int index, DeploymentUnitType element) {
		getSoftwareElementList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DeploymentUnitType> getSoftwareElementList() {
		if (softwareElement == null) {
			softwareElement = new EObjectResolvingEList<DeploymentUnitType>(DeploymentUnitType.class, this, ProductPackage.SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT);
		}
		return softwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT:
				return getSoftwareElementList();
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
			case ProductPackage.SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT:
				getSoftwareElementList().clear();
				getSoftwareElementList().addAll((Collection<? extends DeploymentUnitType>)newValue);
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
			case ProductPackage.SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT:
				getSoftwareElementList().clear();
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
			case ProductPackage.SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT:
				return softwareElement != null && !softwareElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareElementsTypeImpl

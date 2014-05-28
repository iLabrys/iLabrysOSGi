/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.SupportedPackageType;
import es.itecban.deployment.model.deployment.target.SupportedPackagesType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

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
 * An implementation of the model object '<em><b>Supported Packages Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.SupportedPackagesTypeImpl#getContainerPackage <em>Container Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedPackagesTypeImpl extends EObjectImpl implements SupportedPackagesType {
	/**
	 * The cached value of the '{@link #getContainerPackage() <em>Container Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedPackageType> containerPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedPackagesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.SUPPORTED_PACKAGES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedPackageType> getContainerPackage() {
		if (containerPackage == null) {
			containerPackage = new EObjectContainmentEList<SupportedPackageType>(SupportedPackageType.class, this, TargetPackage.SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE);
		}
		return containerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE:
				return ((InternalEList<?>)getContainerPackage()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE:
				return getContainerPackage();
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
			case TargetPackage.SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE:
				getContainerPackage().clear();
				getContainerPackage().addAll((Collection<? extends SupportedPackageType>)newValue);
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
			case TargetPackage.SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE:
				getContainerPackage().clear();
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
			case TargetPackage.SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE:
				return containerPackage != null && !containerPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupportedPackagesTypeImpl

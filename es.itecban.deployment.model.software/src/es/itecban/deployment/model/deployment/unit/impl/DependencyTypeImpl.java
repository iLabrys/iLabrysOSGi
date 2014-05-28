/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.DependencyType;
import es.itecban.deployment.model.deployment.unit.LocalityConstraintType;
import es.itecban.deployment.model.deployment.unit.PackageType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl#getRequiredPackage <em>Required Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyTypeImpl extends EObjectImpl implements DependencyType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected static final LocalityConstraintType LOCALITY_EDEFAULT = LocalityConstraintType.SAMENODE;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected LocalityConstraintType locality = LOCALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredResource() <em>Required Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResource()
	 * @generated
	 * @ordered
	 */
	protected RequiredResourceType requiredResource;

	/**
	 * The cached value of the '{@link #getRequiredPackage() <em>Required Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageType requiredPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.DEPENDENCY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityConstraintType getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality(LocalityConstraintType newLocality) {
		locality = newLocality == null ? LOCALITY_EDEFAULT : newLocality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourceType getRequiredResource() {
		return requiredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredResource(RequiredResourceType newRequiredResource, NotificationChain msgs) {
		RequiredResourceType oldRequiredResource = requiredResource;
		requiredResource = newRequiredResource;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResource(RequiredResourceType newRequiredResource) {
		if (newRequiredResource != requiredResource) {
			NotificationChain msgs = null;
			if (requiredResource != null)
				msgs = ((InternalEObject)requiredResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE, null, msgs);
			if (newRequiredResource != null)
				msgs = ((InternalEObject)newRequiredResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE, null, msgs);
			msgs = basicSetRequiredResource(newRequiredResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getRequiredPackage() {
		return requiredPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredPackage(PackageType newRequiredPackage, NotificationChain msgs) {
		PackageType oldRequiredPackage = requiredPackage;
		requiredPackage = newRequiredPackage;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPackage(PackageType newRequiredPackage) {
		if (newRequiredPackage != requiredPackage) {
			NotificationChain msgs = null;
			if (requiredPackage != null)
				msgs = ((InternalEObject)requiredPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE, null, msgs);
			if (newRequiredPackage != null)
				msgs = ((InternalEObject)newRequiredPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE, null, msgs);
			msgs = basicSetRequiredPackage(newRequiredPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE:
				return basicSetRequiredResource(null, msgs);
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE:
				return basicSetRequiredPackage(null, msgs);
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
			case UnitPackage.DEPENDENCY_TYPE__ID:
				return getId();
			case UnitPackage.DEPENDENCY_TYPE__LOCALITY:
				return getLocality();
			case UnitPackage.DEPENDENCY_TYPE__DESCRIPTION:
				return getDescription();
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE:
				return getRequiredResource();
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE:
				return getRequiredPackage();
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
			case UnitPackage.DEPENDENCY_TYPE__ID:
				setId((String)newValue);
				return;
			case UnitPackage.DEPENDENCY_TYPE__LOCALITY:
				setLocality((LocalityConstraintType)newValue);
				return;
			case UnitPackage.DEPENDENCY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE:
				setRequiredResource((RequiredResourceType)newValue);
				return;
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE:
				setRequiredPackage((PackageType)newValue);
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
			case UnitPackage.DEPENDENCY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case UnitPackage.DEPENDENCY_TYPE__LOCALITY:
				setLocality(LOCALITY_EDEFAULT);
				return;
			case UnitPackage.DEPENDENCY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE:
				setRequiredResource((RequiredResourceType)null);
				return;
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE:
				setRequiredPackage((PackageType)null);
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
			case UnitPackage.DEPENDENCY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UnitPackage.DEPENDENCY_TYPE__LOCALITY:
				return locality != LOCALITY_EDEFAULT;
			case UnitPackage.DEPENDENCY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_RESOURCE:
				return requiredResource != null;
			case UnitPackage.DEPENDENCY_TYPE__REQUIRED_PACKAGE:
				return requiredPackage != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", locality: ");
		result.append(locality);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DependencyTypeImpl

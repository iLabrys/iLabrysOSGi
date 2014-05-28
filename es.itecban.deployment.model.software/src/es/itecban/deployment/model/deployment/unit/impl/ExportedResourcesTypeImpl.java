/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.ExportedResourcesType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exported Resources Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ExportedResourcesTypeImpl#getExportedResource <em>Exported Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExportedResourcesTypeImpl extends EObjectImpl implements ExportedResourcesType {
	/**
	 * The cached value of the '{@link #getExportedResource() <em>Exported Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> exportedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportedResourcesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.EXPORTED_RESOURCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ResourceType> getExportedResource() {
		if (exportedResource == null) {
			exportedResource = new BasicInternalEList<ResourceType>(ResourceType.class);
		}
		return exportedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE:
				return ((InternalEList<?>)getExportedResource()).basicRemove(otherEnd, msgs);
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
			case UnitPackage.EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE:
				return getExportedResource();
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
			case UnitPackage.EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE:
				getExportedResource().clear();
				getExportedResource().addAll((Collection<? extends ResourceType>)newValue);
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
			case UnitPackage.EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE:
				getExportedResource().clear();
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
			case UnitPackage.EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE:
				return exportedResource != null && !exportedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExportedResourcesTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.software.product.FeaturesType;
import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.SoftwareFeatureType;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Features Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.FeaturesTypeImpl#getFeatureList <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeaturesTypeImpl extends EObjectImpl implements FeaturesType {
	/**
	 * The cached value of the '{@link #getFeatureList() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureList()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareFeatureType> feature;

	/**
	 * The empty value for the '{@link #getFeature() <em>Feature</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final SoftwareFeatureType[] FEATURE_EEMPTY_ARRAY = new SoftwareFeatureType [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.FEATURES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SoftwareFeatureType[] getFeature() {
		if (feature == null || feature.isEmpty()) return FEATURE_EEMPTY_ARRAY;
		BasicEList<SoftwareFeatureType> list = (BasicEList<SoftwareFeatureType>)feature;
		list.shrink();
		return (SoftwareFeatureType[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFeatureType getFeature(int index) {
		return getFeatureList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureLength() {
		return feature == null ? 0 : feature.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(SoftwareFeatureType[] newFeature) {
		((BasicEList<SoftwareFeatureType>)getFeatureList()).setData(newFeature.length, newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(int index, SoftwareFeatureType element) {
		getFeatureList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SoftwareFeatureType> getFeatureList() {
		if (feature == null) {
			feature = new EObjectContainmentEList<SoftwareFeatureType>(SoftwareFeatureType.class, this, ProductPackage.FEATURES_TYPE__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.FEATURES_TYPE__FEATURE:
				return ((InternalEList<?>)getFeatureList()).basicRemove(otherEnd, msgs);
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
			case ProductPackage.FEATURES_TYPE__FEATURE:
				return getFeatureList();
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
			case ProductPackage.FEATURES_TYPE__FEATURE:
				getFeatureList().clear();
				getFeatureList().addAll((Collection<? extends SoftwareFeatureType>)newValue);
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
			case ProductPackage.FEATURES_TYPE__FEATURE:
				getFeatureList().clear();
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
			case ProductPackage.FEATURES_TYPE__FEATURE:
				return feature != null && !feature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeaturesTypeImpl

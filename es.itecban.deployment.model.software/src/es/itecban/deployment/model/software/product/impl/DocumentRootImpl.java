/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.software.product.DocumentRoot;
import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.SoftwareFeatureType;
import es.itecban.deployment.model.software.product.SoftwareProductType;

import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl#getSoftwareFeature <em>Software Feature</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl#getSoftwareProduct <em>Software Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ProductPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ProductPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ProductPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFeatureType getSoftwareFeature() {
		return (SoftwareFeatureType)getMixed().get(ProductPackage.Literals.DOCUMENT_ROOT__SOFTWARE_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareFeature(SoftwareFeatureType newSoftwareFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProductPackage.Literals.DOCUMENT_ROOT__SOFTWARE_FEATURE, newSoftwareFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareFeature(SoftwareFeatureType newSoftwareFeature) {
		((FeatureMap.Internal)getMixed()).set(ProductPackage.Literals.DOCUMENT_ROOT__SOFTWARE_FEATURE, newSoftwareFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareProductType getSoftwareProduct() {
		return (SoftwareProductType)getMixed().get(ProductPackage.Literals.DOCUMENT_ROOT__SOFTWARE_PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareProduct(SoftwareProductType newSoftwareProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProductPackage.Literals.DOCUMENT_ROOT__SOFTWARE_PRODUCT, newSoftwareProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareProduct(SoftwareProductType newSoftwareProduct) {
		((FeatureMap.Internal)getMixed()).set(ProductPackage.Literals.DOCUMENT_ROOT__SOFTWARE_PRODUCT, newSoftwareProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ProductPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).basicRemove(otherEnd, msgs);
			case ProductPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).basicRemove(otherEnd, msgs);
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_FEATURE:
				return basicSetSoftwareFeature(null, msgs);
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_PRODUCT:
				return basicSetSoftwareProduct(null, msgs);
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
			case ProductPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ProductPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return ((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap();
				else return getXMLNSPrefixMap();
			case ProductPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return ((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap();
				else return getXSISchemaLocation();
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_FEATURE:
				return getSoftwareFeature();
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_PRODUCT:
				return getSoftwareProduct();
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
			case ProductPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ProductPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).set(newValue);
				return;
			case ProductPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).set(newValue);
				return;
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_FEATURE:
				setSoftwareFeature((SoftwareFeatureType)newValue);
				return;
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_PRODUCT:
				setSoftwareProduct((SoftwareProductType)newValue);
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
			case ProductPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ProductPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ProductPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_FEATURE:
				setSoftwareFeature((SoftwareFeatureType)null);
				return;
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_PRODUCT:
				setSoftwareProduct((SoftwareProductType)null);
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
			case ProductPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ProductPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ProductPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_FEATURE:
				return getSoftwareFeature() != null;
			case ProductPackage.DOCUMENT_ROOT__SOFTWARE_PRODUCT:
				return getSoftwareProduct() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

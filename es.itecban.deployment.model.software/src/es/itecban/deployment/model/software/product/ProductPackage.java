/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.software.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/SoftwareProduct";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = es.itecban.deployment.model.software.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Software Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWARE_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Software Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWARE_PRODUCT = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.FeaturesTypeImpl <em>Features Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.FeaturesTypeImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getFeaturesType()
	 * @generated
	 */
	int FEATURES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_TYPE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Features Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.ProductDependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.ProductDependenciesTypeImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getProductDependenciesType()
	 * @generated
	 */
	int PRODUCT_DEPENDENCIES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEPENDENCIES_TYPE__PRODUCT = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DEPENDENCIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.SoftwareElementsTypeImpl <em>Software Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.SoftwareElementsTypeImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getSoftwareElementsType()
	 * @generated
	 */
	int SOFTWARE_ELEMENTS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Software Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Software Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ELEMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.SoftwareFeatureTypeImpl <em>Software Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.SoftwareFeatureTypeImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getSoftwareFeatureType()
	 * @generated
	 */
	int SOFTWARE_FEATURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Software Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Software Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl <em>Software Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getSoftwareProductType()
	 * @generated
	 */
	int SOFTWARE_PRODUCT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Warranty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__WARRANTY = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Product Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>SK Unumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__SK_UNUMBER = 5;

	/**
	 * The feature id for the '<em><b>Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER = 6;

	/**
	 * The number of structural features of the '<em>Software Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.software.product.impl.WarrantyTypeImpl <em>Warranty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.software.product.impl.WarrantyTypeImpl
	 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getWarrantyType()
	 * @generated
	 */
	int WARRANTY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Warranty Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANTY_TYPE__WARRANTY_DURATION = 0;

	/**
	 * The feature id for the '<em><b>Warranty Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANTY_TYPE__WARRANTY_START_DATE = 1;

	/**
	 * The number of structural features of the '<em>Warranty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANTY_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.software.product.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.software.product.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.software.product.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareFeature <em>Software Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Feature</em>'.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SoftwareFeature();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareProduct <em>Software Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Product</em>'.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareProduct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SoftwareProduct();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.FeaturesType <em>Features Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Type</em>'.
	 * @see es.itecban.deployment.model.software.product.FeaturesType
	 * @generated
	 */
	EClass getFeaturesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.software.product.FeaturesType#getFeatureList <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see es.itecban.deployment.model.software.product.FeaturesType#getFeatureList()
	 * @see #getFeaturesType()
	 * @generated
	 */
	EReference getFeaturesType_Feature();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.ProductDependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see es.itecban.deployment.model.software.product.ProductDependenciesType
	 * @generated
	 */
	EClass getProductDependenciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.software.product.ProductDependenciesType#getProductList <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see es.itecban.deployment.model.software.product.ProductDependenciesType#getProductList()
	 * @see #getProductDependenciesType()
	 * @generated
	 */
	EReference getProductDependenciesType_Product();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.SoftwareElementsType <em>Software Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Elements Type</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareElementsType
	 * @generated
	 */
	EClass getSoftwareElementsType();

	/**
	 * Returns the meta object for the reference list '{@link es.itecban.deployment.model.software.product.SoftwareElementsType#getSoftwareElementList <em>Software Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Software Element</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareElementsType#getSoftwareElementList()
	 * @see #getSoftwareElementsType()
	 * @generated
	 */
	EReference getSoftwareElementsType_SoftwareElement();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.SoftwareFeatureType <em>Software Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Feature Type</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareFeatureType
	 * @generated
	 */
	EClass getSoftwareFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.SoftwareFeatureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareFeatureType#getName()
	 * @see #getSoftwareFeatureType()
	 * @generated
	 */
	EAttribute getSoftwareFeatureType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.software.product.SoftwareFeatureType#getSoftwareElements <em>Software Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Elements</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareFeatureType#getSoftwareElements()
	 * @see #getSoftwareFeatureType()
	 * @generated
	 */
	EReference getSoftwareFeatureType_SoftwareElements();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.SoftwareProductType <em>Software Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Product Type</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType
	 * @generated
	 */
	EClass getSoftwareProductType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getName()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EAttribute getSoftwareProductType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getVersion()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EAttribute getSoftwareProductType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getWarranty <em>Warranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warranty</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getWarranty()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EReference getSoftwareProductType_Warranty();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getFeatures()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EReference getSoftwareProductType_Features();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getProductDependencies <em>Product Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Dependencies</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getProductDependencies()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EReference getSoftwareProductType_ProductDependencies();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getSKUnumber <em>SK Unumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SK Unumber</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getSKUnumber()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EAttribute getSoftwareProductType_SKUnumber();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getIdentifyingNumber <em>Identifying Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifying Number</em>'.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType#getIdentifyingNumber()
	 * @see #getSoftwareProductType()
	 * @generated
	 */
	EAttribute getSoftwareProductType_IdentifyingNumber();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.software.product.WarrantyType <em>Warranty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warranty Type</em>'.
	 * @see es.itecban.deployment.model.software.product.WarrantyType
	 * @generated
	 */
	EClass getWarrantyType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.WarrantyType#getWarrantyDuration <em>Warranty Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warranty Duration</em>'.
	 * @see es.itecban.deployment.model.software.product.WarrantyType#getWarrantyDuration()
	 * @see #getWarrantyType()
	 * @generated
	 */
	EAttribute getWarrantyType_WarrantyDuration();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.software.product.WarrantyType#getWarrantyStartDate <em>Warranty Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warranty Start Date</em>'.
	 * @see es.itecban.deployment.model.software.product.WarrantyType#getWarrantyStartDate()
	 * @see #getWarrantyType()
	 * @generated
	 */
	EAttribute getWarrantyType_WarrantyStartDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Software Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOFTWARE_FEATURE = eINSTANCE.getDocumentRoot_SoftwareFeature();

		/**
		 * The meta object literal for the '<em><b>Software Product</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOFTWARE_PRODUCT = eINSTANCE.getDocumentRoot_SoftwareProduct();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.FeaturesTypeImpl <em>Features Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.FeaturesTypeImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getFeaturesType()
		 * @generated
		 */
		EClass FEATURES_TYPE = eINSTANCE.getFeaturesType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_TYPE__FEATURE = eINSTANCE.getFeaturesType_Feature();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.ProductDependenciesTypeImpl <em>Dependencies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.ProductDependenciesTypeImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getProductDependenciesType()
		 * @generated
		 */
		EClass PRODUCT_DEPENDENCIES_TYPE = eINSTANCE.getProductDependenciesType();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DEPENDENCIES_TYPE__PRODUCT = eINSTANCE.getProductDependenciesType_Product();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.SoftwareElementsTypeImpl <em>Software Elements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.SoftwareElementsTypeImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getSoftwareElementsType()
		 * @generated
		 */
		EClass SOFTWARE_ELEMENTS_TYPE = eINSTANCE.getSoftwareElementsType();

		/**
		 * The meta object literal for the '<em><b>Software Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT = eINSTANCE.getSoftwareElementsType_SoftwareElement();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.SoftwareFeatureTypeImpl <em>Software Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.SoftwareFeatureTypeImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getSoftwareFeatureType()
		 * @generated
		 */
		EClass SOFTWARE_FEATURE_TYPE = eINSTANCE.getSoftwareFeatureType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_FEATURE_TYPE__NAME = eINSTANCE.getSoftwareFeatureType_Name();

		/**
		 * The meta object literal for the '<em><b>Software Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS = eINSTANCE.getSoftwareFeatureType_SoftwareElements();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl <em>Software Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getSoftwareProductType()
		 * @generated
		 */
		EClass SOFTWARE_PRODUCT_TYPE = eINSTANCE.getSoftwareProductType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_PRODUCT_TYPE__NAME = eINSTANCE.getSoftwareProductType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_PRODUCT_TYPE__VERSION = eINSTANCE.getSoftwareProductType_Version();

		/**
		 * The meta object literal for the '<em><b>Warranty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_TYPE__WARRANTY = eINSTANCE.getSoftwareProductType_Warranty();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_TYPE__FEATURES = eINSTANCE.getSoftwareProductType_Features();

		/**
		 * The meta object literal for the '<em><b>Product Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES = eINSTANCE.getSoftwareProductType_ProductDependencies();

		/**
		 * The meta object literal for the '<em><b>SK Unumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_PRODUCT_TYPE__SK_UNUMBER = eINSTANCE.getSoftwareProductType_SKUnumber();

		/**
		 * The meta object literal for the '<em><b>Identifying Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER = eINSTANCE.getSoftwareProductType_IdentifyingNumber();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.software.product.impl.WarrantyTypeImpl <em>Warranty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.software.product.impl.WarrantyTypeImpl
		 * @see es.itecban.deployment.model.software.product.impl.ProductPackageImpl#getWarrantyType()
		 * @generated
		 */
		EClass WARRANTY_TYPE = eINSTANCE.getWarrantyType();

		/**
		 * The meta object literal for the '<em><b>Warranty Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARRANTY_TYPE__WARRANTY_DURATION = eINSTANCE.getWarrantyType_WarrantyDuration();

		/**
		 * The meta object literal for the '<em><b>Warranty Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARRANTY_TYPE__WARRANTY_START_DATE = eINSTANCE.getWarrantyType_WarrantyStartDate();

	}

} //ProductPackage

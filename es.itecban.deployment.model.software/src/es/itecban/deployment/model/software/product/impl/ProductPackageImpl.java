/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.deployment.unit.UnitPackage;

import es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl;

import es.itecban.deployment.model.software.product.DocumentRoot;
import es.itecban.deployment.model.software.product.FeaturesType;
import es.itecban.deployment.model.software.product.ProductDependenciesType;
import es.itecban.deployment.model.software.product.ProductFactory;
import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.SoftwareElementsType;
import es.itecban.deployment.model.software.product.SoftwareFeatureType;
import es.itecban.deployment.model.software.product.SoftwareProductType;
import es.itecban.deployment.model.software.product.WarrantyType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDependenciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareElementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warrantyTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.itecban.deployment.model.software.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ProductPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theProductPackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductPackage.freeze();

		return theProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SoftwareFeature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SoftwareProduct() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesType() {
		return featuresTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturesType_Feature() {
		return (EReference)featuresTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDependenciesType() {
		return productDependenciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDependenciesType_Product() {
		return (EReference)productDependenciesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareElementsType() {
		return softwareElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareElementsType_SoftwareElement() {
		return (EReference)softwareElementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareFeatureType() {
		return softwareFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareFeatureType_Name() {
		return (EAttribute)softwareFeatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareFeatureType_SoftwareElements() {
		return (EReference)softwareFeatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareProductType() {
		return softwareProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareProductType_Name() {
		return (EAttribute)softwareProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareProductType_Version() {
		return (EAttribute)softwareProductTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductType_Warranty() {
		return (EReference)softwareProductTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductType_Features() {
		return (EReference)softwareProductTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductType_ProductDependencies() {
		return (EReference)softwareProductTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareProductType_SKUnumber() {
		return (EAttribute)softwareProductTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareProductType_IdentifyingNumber() {
		return (EAttribute)softwareProductTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarrantyType() {
		return warrantyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWarrantyType_WarrantyDuration() {
		return (EAttribute)warrantyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWarrantyType_WarrantyStartDate() {
		return (EAttribute)warrantyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOFTWARE_FEATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOFTWARE_PRODUCT);

		featuresTypeEClass = createEClass(FEATURES_TYPE);
		createEReference(featuresTypeEClass, FEATURES_TYPE__FEATURE);

		productDependenciesTypeEClass = createEClass(PRODUCT_DEPENDENCIES_TYPE);
		createEReference(productDependenciesTypeEClass, PRODUCT_DEPENDENCIES_TYPE__PRODUCT);

		softwareElementsTypeEClass = createEClass(SOFTWARE_ELEMENTS_TYPE);
		createEReference(softwareElementsTypeEClass, SOFTWARE_ELEMENTS_TYPE__SOFTWARE_ELEMENT);

		softwareFeatureTypeEClass = createEClass(SOFTWARE_FEATURE_TYPE);
		createEAttribute(softwareFeatureTypeEClass, SOFTWARE_FEATURE_TYPE__NAME);
		createEReference(softwareFeatureTypeEClass, SOFTWARE_FEATURE_TYPE__SOFTWARE_ELEMENTS);

		softwareProductTypeEClass = createEClass(SOFTWARE_PRODUCT_TYPE);
		createEAttribute(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__NAME);
		createEAttribute(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__VERSION);
		createEReference(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__WARRANTY);
		createEReference(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__FEATURES);
		createEReference(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES);
		createEAttribute(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__SK_UNUMBER);
		createEAttribute(softwareProductTypeEClass, SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER);

		warrantyTypeEClass = createEClass(WARRANTY_TYPE);
		createEAttribute(warrantyTypeEClass, WARRANTY_TYPE__WARRANTY_DURATION);
		createEAttribute(warrantyTypeEClass, WARRANTY_TYPE__WARRANTY_START_DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SoftwareFeature(), this.getSoftwareFeatureType(), null, "softwareFeature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SoftwareProduct(), this.getSoftwareProductType(), null, "softwareProduct", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featuresTypeEClass, FeaturesType.class, "FeaturesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturesType_Feature(), this.getSoftwareFeatureType(), null, "feature", null, 0, -1, FeaturesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDependenciesTypeEClass, ProductDependenciesType.class, "ProductDependenciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDependenciesType_Product(), this.getSoftwareProductType(), null, "product", null, 0, -1, ProductDependenciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareElementsTypeEClass, SoftwareElementsType.class, "SoftwareElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareElementsType_SoftwareElement(), theUnitPackage.getDeploymentUnitType(), null, "softwareElement", null, 1, -1, SoftwareElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareFeatureTypeEClass, SoftwareFeatureType.class, "SoftwareFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareFeatureType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SoftwareFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareFeatureType_SoftwareElements(), this.getSoftwareElementsType(), null, "softwareElements", null, 1, 1, SoftwareFeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareProductTypeEClass, SoftwareProductType.class, "SoftwareProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareProductType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareProductType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductType_Warranty(), this.getWarrantyType(), null, "warranty", null, 0, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductType_Features(), this.getFeaturesType(), null, "features", null, 1, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductType_ProductDependencies(), this.getProductDependenciesType(), null, "productDependencies", null, 0, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareProductType_SKUnumber(), theXMLTypePackage.getString(), "sKUnumber", null, 0, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareProductType_IdentifyingNumber(), theXMLTypePackage.getString(), "identifyingNumber", null, 0, 1, SoftwareProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(warrantyTypeEClass, WarrantyType.class, "WarrantyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWarrantyType_WarrantyDuration(), theXMLTypePackage.getString(), "warrantyDuration", null, 1, 1, WarrantyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWarrantyType_WarrantyStartDate(), theXMLTypePackage.getString(), "warrantyStartDate", null, 1, 1, WarrantyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_SoftwareFeature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "softwareFeature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SoftwareProduct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "softwareProduct",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (featuresTypeEClass, 
		   source, 
		   new String[] {
			 "name", "features_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFeaturesType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feature"
		   });		
		addAnnotation
		  (productDependenciesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "productDependencies_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProductDependenciesType_Product(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "product"
		   });		
		addAnnotation
		  (softwareElementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "softwareElements_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSoftwareElementsType_SoftwareElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "softwareElement"
		   });		
		addAnnotation
		  (softwareFeatureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SoftwareFeatureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSoftwareFeatureType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getSoftwareFeatureType_SoftwareElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "softwareElements"
		   });		
		addAnnotation
		  (softwareProductTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SoftwareProductType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSoftwareProductType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getSoftwareProductType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (getSoftwareProductType_Warranty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warranty"
		   });		
		addAnnotation
		  (getSoftwareProductType_Features(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "features"
		   });		
		addAnnotation
		  (getSoftwareProductType_ProductDependencies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "productDependencies"
		   });		
		addAnnotation
		  (getSoftwareProductType_SKUnumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SKUnumber"
		   });		
		addAnnotation
		  (getSoftwareProductType_IdentifyingNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifyingNumber"
		   });		
		addAnnotation
		  (warrantyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "warranty_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWarrantyType_WarrantyDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warrantyDuration"
		   });		
		addAnnotation
		  (getWarrantyType_WarrantyStartDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warrantyStartDate"
		   });
	}

} //ProductPackageImpl

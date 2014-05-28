/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationContainerType;
import es.itecban.deployment.model.configuration.ConfigurationFactory;
import es.itecban.deployment.model.configuration.ConfigurationFileType;
import es.itecban.deployment.model.configuration.ConfigurationFilesType;
import es.itecban.deployment.model.configuration.ConfigurationPackage;
import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.configuration.ContainersType;
import es.itecban.deployment.model.configuration.DocumentRoot;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.configuration.EnvironmentType;
import es.itecban.deployment.model.configuration.IsMandatory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationFilesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationFileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containersTypeEClass = null;

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
	private EClass environmentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isMandatoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isMandatoryObjectEDataType = null;

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
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationContainerType() {
		return configurationContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationContainerType_Name() {
		return (EAttribute)configurationContainerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationContainerType_ConfigurationFiles() {
		return (EReference)configurationContainerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationFilesType() {
		return configurationFilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationFilesType_ConfigurationFile() {
		return (EReference)configurationFilesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationFileType() {
		return configurationFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationFileType_FileName() {
		return (EAttribute)configurationFileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationFileType_ConfigFile() {
		return (EAttribute)configurationFileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPropertiesType() {
		return configurationPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationPropertiesType_EnvironmentProperties() {
		return (EReference)configurationPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainersType() {
		return containersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainersType_Container() {
		return (EReference)containersTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_ConfigurationFile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Container() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Environment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnvironmentProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentPropertyType() {
		return environmentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentPropertyType_Key() {
		return (EAttribute)environmentPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentPropertyType_Value() {
		return (EAttribute)environmentPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentPropertyType_Description() {
		return (EAttribute)environmentPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentPropertyType_Mandatory() {
		return (EAttribute)environmentPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentType() {
		return environmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Name() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentType_Containers() {
		return (EReference)environmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentType_ConfigurationProperties() {
		return (EReference)environmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsMandatory() {
		return isMandatoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIsMandatoryObject() {
		return isMandatoryObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		configurationContainerTypeEClass = createEClass(CONFIGURATION_CONTAINER_TYPE);
		createEAttribute(configurationContainerTypeEClass, CONFIGURATION_CONTAINER_TYPE__NAME);
		createEReference(configurationContainerTypeEClass, CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES);

		configurationFilesTypeEClass = createEClass(CONFIGURATION_FILES_TYPE);
		createEReference(configurationFilesTypeEClass, CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE);

		configurationFileTypeEClass = createEClass(CONFIGURATION_FILE_TYPE);
		createEAttribute(configurationFileTypeEClass, CONFIGURATION_FILE_TYPE__FILE_NAME);
		createEAttribute(configurationFileTypeEClass, CONFIGURATION_FILE_TYPE__CONFIG_FILE);

		configurationPropertiesTypeEClass = createEClass(CONFIGURATION_PROPERTIES_TYPE);
		createEReference(configurationPropertiesTypeEClass, CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES);

		containersTypeEClass = createEClass(CONTAINERS_TYPE);
		createEReference(containersTypeEClass, CONTAINERS_TYPE__CONTAINER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFIGURATION_FILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTAINER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENVIRONMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENVIRONMENT_PROPERTY);

		environmentPropertyTypeEClass = createEClass(ENVIRONMENT_PROPERTY_TYPE);
		createEAttribute(environmentPropertyTypeEClass, ENVIRONMENT_PROPERTY_TYPE__KEY);
		createEAttribute(environmentPropertyTypeEClass, ENVIRONMENT_PROPERTY_TYPE__VALUE);
		createEAttribute(environmentPropertyTypeEClass, ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION);
		createEAttribute(environmentPropertyTypeEClass, ENVIRONMENT_PROPERTY_TYPE__MANDATORY);

		environmentTypeEClass = createEClass(ENVIRONMENT_TYPE);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__NAME);
		createEReference(environmentTypeEClass, ENVIRONMENT_TYPE__CONTAINERS);
		createEReference(environmentTypeEClass, ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES);

		// Create enums
		isMandatoryEEnum = createEEnum(IS_MANDATORY);

		// Create data types
		isMandatoryObjectEDataType = createEDataType(IS_MANDATORY_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(configurationContainerTypeEClass, ConfigurationContainerType.class, "ConfigurationContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationContainerType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ConfigurationContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationContainerType_ConfigurationFiles(), this.getConfigurationFilesType(), null, "configurationFiles", null, 0, 1, ConfigurationContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationFilesTypeEClass, ConfigurationFilesType.class, "ConfigurationFilesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationFilesType_ConfigurationFile(), this.getConfigurationFileType(), null, "configurationFile", null, 0, -1, ConfigurationFilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationFileTypeEClass, ConfigurationFileType.class, "ConfigurationFileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationFileType_FileName(), theXMLTypePackage.getString(), "fileName", null, 1, 1, ConfigurationFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationFileType_ConfigFile(), theXMLTypePackage.getBase64Binary(), "configFile", null, 1, 1, ConfigurationFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertiesTypeEClass, ConfigurationPropertiesType.class, "ConfigurationPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationPropertiesType_EnvironmentProperties(), this.getEnvironmentPropertyType(), null, "environmentProperties", null, 0, -1, ConfigurationPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containersTypeEClass, ContainersType.class, "ContainersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainersType_Container(), this.getConfigurationContainerType(), null, "container", null, 0, -1, ContainersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConfigurationFile(), this.getConfigurationFileType(), null, "configurationFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Container(), this.getConfigurationContainerType(), null, "container", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Environment(), this.getEnvironmentType(), null, "environment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EnvironmentProperty(), this.getEnvironmentPropertyType(), null, "environmentProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(environmentPropertyTypeEClass, EnvironmentPropertyType.class, "EnvironmentPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentPropertyType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, EnvironmentPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, EnvironmentPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentPropertyType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, EnvironmentPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentPropertyType_Mandatory(), this.getIsMandatory(), "mandatory", null, 1, 1, EnvironmentPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentTypeEClass, EnvironmentType.class, "EnvironmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentType_Containers(), this.getContainersType(), null, "containers", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentType_ConfigurationProperties(), this.getConfigurationPropertiesType(), null, "configurationProperties", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(isMandatoryEEnum, IsMandatory.class, "IsMandatory");
		addEEnumLiteral(isMandatoryEEnum, IsMandatory.OPTIONAL);
		addEEnumLiteral(isMandatoryEEnum, IsMandatory.MANDATORY);

		// Initialize data types
		initEDataType(isMandatoryObjectEDataType, IsMandatory.class, "IsMandatoryObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
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
		  (configurationContainerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConfigurationContainerType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationContainerType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getConfigurationContainerType_ConfigurationFiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configurationFiles"
		   });		
		addAnnotation
		  (configurationFilesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "configurationFiles_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationFilesType_ConfigurationFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configurationFile"
		   });		
		addAnnotation
		  (configurationFileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConfigurationFileType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationFileType_FileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fileName"
		   });			
		addAnnotation
		  (getConfigurationFileType_ConfigFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configFile"
		   });		
		addAnnotation
		  (configurationPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "configurationProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationPropertiesType_EnvironmentProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environmentProperties"
		   });		
		addAnnotation
		  (containersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "containers_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainersType_Container(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "container"
		   });		
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
		  (getDocumentRoot_ConfigurationFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configurationFile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Container(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "container",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EnvironmentProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environmentProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (environmentPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EnvironmentPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnvironmentPropertyType_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key"
		   });		
		addAnnotation
		  (getEnvironmentPropertyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (getEnvironmentPropertyType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getEnvironmentPropertyType_Mandatory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mandatory"
		   });		
		addAnnotation
		  (environmentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EnvironmentType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnvironmentType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getEnvironmentType_Containers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containers"
		   });		
		addAnnotation
		  (getEnvironmentType_ConfigurationProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configurationProperties"
		   });		
		addAnnotation
		  (isMandatoryEEnum, 
		   source, 
		   new String[] {
			 "name", "isMandatory"
		   });		
		addAnnotation
		  (isMandatoryObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "isMandatory:Object",
			 "baseType", "isMandatory"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";									
		addAnnotation
		  (getConfigurationFileType_ConfigFile(), 
		   source, 
		   new String[] {
			 "appinfo", "\r\n    \t\t\t\t\t@Lob\r\n    \t\t\t\t\t@Column(length=1048576)\r\n    \t\t\t\t"
		   });																								
	}

} //ConfigurationPackageImpl

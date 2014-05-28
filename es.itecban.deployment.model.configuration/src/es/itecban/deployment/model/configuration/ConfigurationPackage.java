/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.itecban.deployment.model.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/Configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationContainerTypeImpl <em>Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationContainerTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationContainerType()
	 * @generated
	 */
	int CONFIGURATION_CONTAINER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CONTAINER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES = 1;

	/**
	 * The number of structural features of the '<em>Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CONTAINER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationFilesTypeImpl <em>Files Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationFilesTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationFilesType()
	 * @generated
	 */
	int CONFIGURATION_FILES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Configuration File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE = 0;

	/**
	 * The number of structural features of the '<em>Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationFileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationFileTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationFileType()
	 * @generated
	 */
	int CONFIGURATION_FILE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILE_TYPE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILE_TYPE__CONFIG_FILE = 1;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationPropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPropertiesTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationPropertiesType()
	 * @generated
	 */
	int CONFIGURATION_PROPERTIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Environment Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.ContainersTypeImpl <em>Containers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.ContainersTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getContainersType()
	 * @generated
	 */
	int CONTAINERS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_TYPE__CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Containers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Configuration File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIGURATION_FILE = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Environment Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENVIRONMENT_PROPERTY = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl <em>Environment Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getEnvironmentPropertyType()
	 * @generated
	 */
	int ENVIRONMENT_PROPERTY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE__MANDATORY = 3;

	/**
	 * The number of structural features of the '<em>Environment Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_PROPERTY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__CONTAINERS = 1;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.configuration.IsMandatory <em>Is Mandatory</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.IsMandatory
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getIsMandatory()
	 * @generated
	 */
	int IS_MANDATORY = 8;

	/**
	 * The meta object id for the '<em>Is Mandatory Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.configuration.IsMandatory
	 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getIsMandatoryObject()
	 * @generated
	 */
	int IS_MANDATORY_OBJECT = 9;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.ConfigurationContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Type</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationContainerType
	 * @generated
	 */
	EClass getConfigurationContainerType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.ConfigurationContainerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationContainerType#getName()
	 * @see #getConfigurationContainerType()
	 * @generated
	 */
	EAttribute getConfigurationContainerType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.ConfigurationContainerType#getConfigurationFiles <em>Configuration Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Files</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationContainerType#getConfigurationFiles()
	 * @see #getConfigurationContainerType()
	 * @generated
	 */
	EReference getConfigurationContainerType_ConfigurationFiles();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.ConfigurationFilesType <em>Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files Type</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationFilesType
	 * @generated
	 */
	EClass getConfigurationFilesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.configuration.ConfigurationFilesType#getConfigurationFile <em>Configuration File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration File</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationFilesType#getConfigurationFile()
	 * @see #getConfigurationFilesType()
	 * @generated
	 */
	EReference getConfigurationFilesType_ConfigurationFile();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.ConfigurationFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationFileType
	 * @generated
	 */
	EClass getConfigurationFileType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.ConfigurationFileType#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationFileType#getFileName()
	 * @see #getConfigurationFileType()
	 * @generated
	 */
	EAttribute getConfigurationFileType_FileName();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.ConfigurationFileType#getConfigFile <em>Config File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config File</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationFileType#getConfigFile()
	 * @see #getConfigurationFileType()
	 * @generated
	 */
	EAttribute getConfigurationFileType_ConfigFile();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.ConfigurationPropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationPropertiesType
	 * @generated
	 */
	EClass getConfigurationPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.configuration.ConfigurationPropertiesType#getEnvironmentProperties <em>Environment Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Properties</em>'.
	 * @see es.itecban.deployment.model.configuration.ConfigurationPropertiesType#getEnvironmentProperties()
	 * @see #getConfigurationPropertiesType()
	 * @generated
	 */
	EReference getConfigurationPropertiesType_EnvironmentProperties();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.ContainersType <em>Containers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containers Type</em>'.
	 * @see es.itecban.deployment.model.configuration.ContainersType
	 * @generated
	 */
	EClass getContainersType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.configuration.ContainersType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see es.itecban.deployment.model.configuration.ContainersType#getContainer()
	 * @see #getContainersType()
	 * @generated
	 */
	EReference getContainersType_Container();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.configuration.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.DocumentRoot#getConfigurationFile <em>Configuration File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration File</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getConfigurationFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConfigurationFile();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.DocumentRoot#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Container();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.DocumentRoot#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getEnvironment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.DocumentRoot#getEnvironmentProperty <em>Environment Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment Property</em>'.
	 * @see es.itecban.deployment.model.configuration.DocumentRoot#getEnvironmentProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvironmentProperty();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType <em>Environment Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Property Type</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentPropertyType
	 * @generated
	 */
	EClass getEnvironmentPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentPropertyType#getKey()
	 * @see #getEnvironmentPropertyType()
	 * @generated
	 */
	EAttribute getEnvironmentPropertyType_Key();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentPropertyType#getValue()
	 * @see #getEnvironmentPropertyType()
	 * @generated
	 */
	EAttribute getEnvironmentPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentPropertyType#getDescription()
	 * @see #getEnvironmentPropertyType()
	 * @generated
	 */
	EAttribute getEnvironmentPropertyType_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentPropertyType#getMandatory()
	 * @see #getEnvironmentPropertyType()
	 * @generated
	 */
	EAttribute getEnvironmentPropertyType_Mandatory();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.configuration.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Type</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentType
	 * @generated
	 */
	EClass getEnvironmentType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.configuration.EnvironmentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentType#getName()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.EnvironmentType#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containers</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentType#getContainers()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EReference getEnvironmentType_Containers();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.configuration.EnvironmentType#getConfigurationProperties <em>Configuration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Properties</em>'.
	 * @see es.itecban.deployment.model.configuration.EnvironmentType#getConfigurationProperties()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EReference getEnvironmentType_ConfigurationProperties();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.configuration.IsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Is Mandatory</em>'.
	 * @see es.itecban.deployment.model.configuration.IsMandatory
	 * @generated
	 */
	EEnum getIsMandatory();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.configuration.IsMandatory <em>Is Mandatory Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Is Mandatory Object</em>'.
	 * @see es.itecban.deployment.model.configuration.IsMandatory
	 * @model instanceClass="es.itecban.deployment.model.configuration.IsMandatory"
	 *        extendedMetaData="name='isMandatory:Object' baseType='isMandatory'"
	 * @generated
	 */
	EDataType getIsMandatoryObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationContainerTypeImpl <em>Container Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationContainerTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationContainerType()
		 * @generated
		 */
		EClass CONFIGURATION_CONTAINER_TYPE = eINSTANCE.getConfigurationContainerType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_CONTAINER_TYPE__NAME = eINSTANCE.getConfigurationContainerType_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CONTAINER_TYPE__CONFIGURATION_FILES = eINSTANCE.getConfigurationContainerType_ConfigurationFiles();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationFilesTypeImpl <em>Files Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationFilesTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationFilesType()
		 * @generated
		 */
		EClass CONFIGURATION_FILES_TYPE = eINSTANCE.getConfigurationFilesType();

		/**
		 * The meta object literal for the '<em><b>Configuration File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_FILES_TYPE__CONFIGURATION_FILE = eINSTANCE.getConfigurationFilesType_ConfigurationFile();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationFileTypeImpl <em>File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationFileTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationFileType()
		 * @generated
		 */
		EClass CONFIGURATION_FILE_TYPE = eINSTANCE.getConfigurationFileType();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_FILE_TYPE__FILE_NAME = eINSTANCE.getConfigurationFileType_FileName();

		/**
		 * The meta object literal for the '<em><b>Config File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_FILE_TYPE__CONFIG_FILE = eINSTANCE.getConfigurationFileType_ConfigFile();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.ConfigurationPropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPropertiesTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getConfigurationPropertiesType()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTIES_TYPE = eINSTANCE.getConfigurationPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Environment Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROPERTIES_TYPE__ENVIRONMENT_PROPERTIES = eINSTANCE.getConfigurationPropertiesType_EnvironmentProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.ContainersTypeImpl <em>Containers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.ContainersTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getContainersType()
		 * @generated
		 */
		EClass CONTAINERS_TYPE = eINSTANCE.getContainersType();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS_TYPE__CONTAINER = eINSTANCE.getContainersType_Container();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Configuration File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIGURATION_FILE = eINSTANCE.getDocumentRoot_ConfigurationFile();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTAINER = eINSTANCE.getDocumentRoot_Container();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENVIRONMENT = eINSTANCE.getDocumentRoot_Environment();

		/**
		 * The meta object literal for the '<em><b>Environment Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENVIRONMENT_PROPERTY = eINSTANCE.getDocumentRoot_EnvironmentProperty();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl <em>Environment Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getEnvironmentPropertyType()
		 * @generated
		 */
		EClass ENVIRONMENT_PROPERTY_TYPE = eINSTANCE.getEnvironmentPropertyType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_PROPERTY_TYPE__KEY = eINSTANCE.getEnvironmentPropertyType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_PROPERTY_TYPE__VALUE = eINSTANCE.getEnvironmentPropertyType_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION = eINSTANCE.getEnvironmentPropertyType_Description();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_PROPERTY_TYPE__MANDATORY = eINSTANCE.getEnvironmentPropertyType_Mandatory();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.impl.EnvironmentTypeImpl
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getEnvironmentType()
		 * @generated
		 */
		EClass ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__NAME = eINSTANCE.getEnvironmentType_Name();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_TYPE__CONTAINERS = eINSTANCE.getEnvironmentType_Containers();

		/**
		 * The meta object literal for the '<em><b>Configuration Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_TYPE__CONFIGURATION_PROPERTIES = eINSTANCE.getEnvironmentType_ConfigurationProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.configuration.IsMandatory <em>Is Mandatory</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.IsMandatory
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getIsMandatory()
		 * @generated
		 */
		EEnum IS_MANDATORY = eINSTANCE.getIsMandatory();

		/**
		 * The meta object literal for the '<em>Is Mandatory Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.configuration.IsMandatory
		 * @see es.itecban.deployment.model.configuration.impl.ConfigurationPackageImpl#getIsMandatoryObject()
		 * @generated
		 */
		EDataType IS_MANDATORY_OBJECT = eINSTANCE.getIsMandatoryObject();

	}

} //ConfigurationPackage

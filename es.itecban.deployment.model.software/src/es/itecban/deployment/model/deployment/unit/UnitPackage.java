/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

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
 * @see es.itecban.deployment.model.deployment.unit.UnitFactory
 * @model kind="package"
 * @generated
 */
public interface UnitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/DeploymentUnit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitPackage eINSTANCE = es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.ConstraintsTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getConstraintsType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.DependenciesTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDependenciesType()
	 * @generated
	 */
	int DEPENDENCIES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Dependency Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE__DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__LOCALITY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Required Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__REQUIRED_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Required Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__REQUIRED_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl <em>Deployment Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDeploymentUnitType()
	 * @generated
	 */
	int DEPLOYMENT_UNIT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Exported Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__DEPENDENCIES = 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Unit Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES = 8;

	/**
	 * The number of structural features of the '<em>Deployment Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_UNIT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Deployment Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPLOYMENT_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Locality Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALITY_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Property Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_KIND = 8;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROVIDER = 9;

	/**
	 * The feature id for the '<em><b>Required Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRED_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Required Resource Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = 12;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.ExportedResourcesTypeImpl <em>Exported Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.ExportedResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getExportedResourcesType()
	 * @generated
	 */
	int EXPORTED_RESOURCES_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Exported Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Exported Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.PackageTypeImpl <em>Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.PackageTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.PropertyTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl <em>Provider Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getProviderType()
	 * @generated
	 */
	int PROVIDER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Home Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_TYPE__HOME_URL = 2;

	/**
	 * The number of structural features of the '<em>Provider Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertiesTypeImpl <em>Required Resource Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getRequiredResourcePropertiesType()
	 * @generated
	 */
	int REQUIRED_RESOURCE_PROPERTIES_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_PROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Required Resource Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertyTypeImpl <em>Required Resource Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertyTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getRequiredResourcePropertyType()
	 * @generated
	 */
	int REQUIRED_RESOURCE_PROPERTY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_PROPERTY_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_PROPERTY_TYPE__KIND = 2;

	/**
	 * The number of structural features of the '<em>Required Resource Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl <em>Required Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getRequiredResourceType()
	 * @generated
	 */
	int REQUIRED_RESOURCE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Required Resource Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Required Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.ResourcePropertiesTypeImpl <em>Resource Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.ResourcePropertiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getResourcePropertiesType()
	 * @generated
	 */
	int RESOURCE_PROPERTIES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Resource Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Resource Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TYPES = 2;

	/**
	 * The feature id for the '<em><b>Resource Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RESOURCE_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.TypesTypeImpl <em>Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.TypesTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getTypesType()
	 * @generated
	 */
	int TYPES_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.impl.UnitRepositoriesTypeImpl <em>Repositories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitRepositoriesTypeImpl
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getUnitRepositoriesType()
	 * @generated
	 */
	int UNIT_REPOSITORIES_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORIES_TYPE__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Repositories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.LocalityConstraintType <em>Locality Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getLocalityConstraintType()
	 * @generated
	 */
	int LOCALITY_CONSTRAINT_TYPE = 16;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.unit.PropertyKindType <em>Property Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPropertyKindType()
	 * @generated
	 */
	int PROPERTY_KIND_TYPE = 17;

	/**
	 * The meta object id for the '<em>Locality Constraint Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getLocalityConstraintTypeObject()
	 * @generated
	 */
	int LOCALITY_CONSTRAINT_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Property Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPropertyKindTypeObject()
	 * @generated
	 */
	int PROPERTY_KIND_TYPE_OBJECT = 19;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ConstraintsType
	 * @generated
	 */
	EClass getConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.unit.ConstraintsType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ConstraintsType#getConstraint()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EReference getConstraintsType_Constraint();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependenciesType
	 * @generated
	 */
	EClass getDependenciesType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DependenciesType#getDependencyExpression <em>Dependency Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Expression</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependenciesType#getDependencyExpression()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EAttribute getDependenciesType_DependencyExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.unit.DependenciesType#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependenciesType#getDependency()
	 * @see #getDependenciesType()
	 * @generated
	 */
	EReference getDependenciesType_Dependency();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType
	 * @generated
	 */
	EClass getDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType#getId()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType#getLocality()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Locality();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType#getDescription()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredResource <em>Required Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredResource()
	 * @see #getDependencyType()
	 * @generated
	 */
	EReference getDependencyType_RequiredResource();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredPackage <em>Required Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Package</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredPackage()
	 * @see #getDependencyType()
	 * @generated
	 */
	EReference getDependencyType_RequiredPackage();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType <em>Deployment Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Unit Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType
	 * @generated
	 */
	EClass getDeploymentUnitType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getName()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EAttribute getDeploymentUnitType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getVersion()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EAttribute getDeploymentUnitType_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDescription()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EAttribute getDeploymentUnitType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getProvider()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EReference getDeploymentUnitType_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getPackage()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EReference getDeploymentUnitType_Package();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getExportedResources <em>Exported Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exported Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getExportedResources()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EReference getDeploymentUnitType_ExportedResources();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDependencies()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EReference getDeploymentUnitType_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getConstraints()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EReference getDeploymentUnitType_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getUnitRepositories <em>Unit Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Repositories</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getUnitRepositories()
	 * @see #getDeploymentUnitType()
	 * @generated
	 */
	EReference getDeploymentUnitType_UnitRepositories();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getDependency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dependency();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getDeploymentUnit <em>Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Unit</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getDeploymentUnit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeploymentUnit();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getLocalityConstraint <em>Locality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality Constraint</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getLocalityConstraint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LocalityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Package();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getPropertyKind <em>Property Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Kind</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getPropertyKind()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PropertyKind();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getProvider()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResource <em>Required Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequiredResource();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResourceProperty <em>Required Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Resource Property</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResourceProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequiredResourceProperty();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot#getResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Resource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.ExportedResourcesType <em>Exported Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ExportedResourcesType
	 * @generated
	 */
	EClass getExportedResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.unit.ExportedResourcesType#getExportedResource <em>Exported Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exported Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ExportedResourcesType#getExportedResource()
	 * @see #getExportedResourcesType()
	 * @generated
	 */
	EReference getExportedResourcesType_ExportedResource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PackageType
	 * @generated
	 */
	EClass getPackageType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.PackageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PackageType#getName()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.PackageType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PackageType#getVersion()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.PackageType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PackageType#getType()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Type();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.ProviderType <em>Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ProviderType
	 * @generated
	 */
	EClass getProviderType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.ProviderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ProviderType#getName()
	 * @see #getProviderType()
	 * @generated
	 */
	EAttribute getProviderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.ProviderType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ProviderType#getId()
	 * @see #getProviderType()
	 * @generated
	 */
	EAttribute getProviderType_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.ProviderType#getHomeUrl <em>Home Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Url</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ProviderType#getHomeUrl()
	 * @see #getProviderType()
	 * @generated
	 */
	EAttribute getProviderType_HomeUrl();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType <em>Required Resource Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Resource Properties Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType
	 * @generated
	 */
	EClass getRequiredResourcePropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType#getProperty()
	 * @see #getRequiredResourcePropertiesType()
	 * @generated
	 */
	EReference getRequiredResourcePropertiesType_Property();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType <em>Required Resource Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Resource Property Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType
	 * @generated
	 */
	EClass getRequiredResourcePropertyType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getName()
	 * @see #getRequiredResourcePropertyType()
	 * @generated
	 */
	EAttribute getRequiredResourcePropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getValue()
	 * @see #getRequiredResourcePropertyType()
	 * @generated
	 */
	EAttribute getRequiredResourcePropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getKind()
	 * @see #getRequiredResourcePropertyType()
	 * @generated
	 */
	EAttribute getRequiredResourcePropertyType_Kind();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType <em>Required Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Resource Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourceType
	 * @generated
	 */
	EClass getRequiredResourceType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourceType#getName()
	 * @see #getRequiredResourceType()
	 * @generated
	 */
	EAttribute getRequiredResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourceType#getVersion()
	 * @see #getRequiredResourceType()
	 * @generated
	 */
	EAttribute getRequiredResourceType_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourceType#getType()
	 * @see #getRequiredResourceType()
	 * @generated
	 */
	EAttribute getRequiredResourceType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getRequiredResourceProperties <em>Required Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Resource Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourceType#getRequiredResourceProperties()
	 * @see #getRequiredResourceType()
	 * @generated
	 */
	EReference getRequiredResourceType_RequiredResourceProperties();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.ResourcePropertiesType <em>Resource Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Properties Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourcePropertiesType
	 * @generated
	 */
	EClass getResourcePropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.unit.ResourcePropertiesType#getResourceProperty <em>Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Property</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourcePropertiesType#getResourceProperty()
	 * @see #getResourcePropertiesType()
	 * @generated
	 */
	EReference getResourcePropertiesType_ResourceProperty();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourceType#getVersion()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourceType#getTypes()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Types();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getResourceProperties <em>Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.ResourceType#getResourceProperties()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_ResourceProperties();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.TypesType
	 * @generated
	 */
	EClass getTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.unit.TypesType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.TypesType#getType()
	 * @see #getTypesType()
	 * @generated
	 */
	EAttribute getTypesType_Type();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.unit.UnitRepositoriesType <em>Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repositories Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.UnitRepositoriesType
	 * @generated
	 */
	EClass getUnitRepositoriesType();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.unit.UnitRepositoriesType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repository</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.UnitRepositoriesType#getRepository()
	 * @see #getUnitRepositoriesType()
	 * @generated
	 */
	EAttribute getUnitRepositoriesType_Repository();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.unit.LocalityConstraintType <em>Locality Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Locality Constraint Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @generated
	 */
	EEnum getLocalityConstraintType();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.unit.PropertyKindType <em>Property Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @generated
	 */
	EEnum getPropertyKindType();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.unit.LocalityConstraintType <em>Locality Constraint Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locality Constraint Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @model instanceClass="es.itecban.deployment.model.deployment.unit.LocalityConstraintType"
	 *        extendedMetaData="name='LocalityConstraintType:Object' baseType='LocalityConstraintType'"
	 * @generated
	 */
	EDataType getLocalityConstraintTypeObject();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.unit.PropertyKindType <em>Property Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.unit.PropertyKindType"
	 *        extendedMetaData="name='PropertyKindType:Object' baseType='PropertyKindType'"
	 * @generated
	 */
	EDataType getPropertyKindTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitFactory getUnitFactory();

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
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.ConstraintsTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getConstraintsType()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE = eINSTANCE.getConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE__CONSTRAINT = eINSTANCE.getConstraintsType_Constraint();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.DependenciesTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDependenciesType()
		 * @generated
		 */
		EClass DEPENDENCIES_TYPE = eINSTANCE.getDependenciesType();

		/**
		 * The meta object literal for the '<em><b>Dependency Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION = eINSTANCE.getDependenciesType_DependencyExpression();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_TYPE__DEPENDENCY = eINSTANCE.getDependenciesType_Dependency();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.DependencyTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDependencyType()
		 * @generated
		 */
		EClass DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__ID = eINSTANCE.getDependencyType_Id();

		/**
		 * The meta object literal for the '<em><b>Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__LOCALITY = eINSTANCE.getDependencyType_Locality();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__DESCRIPTION = eINSTANCE.getDependencyType_Description();

		/**
		 * The meta object literal for the '<em><b>Required Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_TYPE__REQUIRED_RESOURCE = eINSTANCE.getDependencyType_RequiredResource();

		/**
		 * The meta object literal for the '<em><b>Required Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_TYPE__REQUIRED_PACKAGE = eINSTANCE.getDependencyType_RequiredPackage();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl <em>Deployment Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDeploymentUnitType()
		 * @generated
		 */
		EClass DEPLOYMENT_UNIT_TYPE = eINSTANCE.getDeploymentUnitType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_UNIT_TYPE__NAME = eINSTANCE.getDeploymentUnitType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_UNIT_TYPE__VERSION = eINSTANCE.getDeploymentUnitType_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_UNIT_TYPE__DESCRIPTION = eINSTANCE.getDeploymentUnitType_Description();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT_TYPE__PROVIDER = eINSTANCE.getDeploymentUnitType_Provider();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT_TYPE__PACKAGE = eINSTANCE.getDeploymentUnitType_Package();

		/**
		 * The meta object literal for the '<em><b>Exported Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES = eINSTANCE.getDeploymentUnitType_ExportedResources();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT_TYPE__DEPENDENCIES = eINSTANCE.getDeploymentUnitType_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT_TYPE__CONSTRAINTS = eINSTANCE.getDeploymentUnitType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Unit Repositories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES = eINSTANCE.getDeploymentUnitType_UnitRepositories();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPENDENCY = eINSTANCE.getDocumentRoot_Dependency();

		/**
		 * The meta object literal for the '<em><b>Deployment Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPLOYMENT_UNIT = eINSTANCE.getDocumentRoot_DeploymentUnit();

		/**
		 * The meta object literal for the '<em><b>Locality Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LOCALITY_CONSTRAINT = eINSTANCE.getDocumentRoot_LocalityConstraint();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGE = eINSTANCE.getDocumentRoot_Package();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Property Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROPERTY_KIND = eINSTANCE.getDocumentRoot_PropertyKind();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROVIDER = eINSTANCE.getDocumentRoot_Provider();

		/**
		 * The meta object literal for the '<em><b>Required Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRED_RESOURCE = eINSTANCE.getDocumentRoot_RequiredResource();

		/**
		 * The meta object literal for the '<em><b>Required Resource Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY = eINSTANCE.getDocumentRoot_RequiredResourceProperty();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.ExportedResourcesTypeImpl <em>Exported Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.ExportedResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getExportedResourcesType()
		 * @generated
		 */
		EClass EXPORTED_RESOURCES_TYPE = eINSTANCE.getExportedResourcesType();

		/**
		 * The meta object literal for the '<em><b>Exported Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE = eINSTANCE.getExportedResourcesType_ExportedResource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.PackageTypeImpl <em>Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.PackageTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPackageType()
		 * @generated
		 */
		EClass PACKAGE_TYPE = eINSTANCE.getPackageType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__NAME = eINSTANCE.getPackageType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__VERSION = eINSTANCE.getPackageType_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__TYPE = eINSTANCE.getPackageType_Type();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.PropertyTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl <em>Provider Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getProviderType()
		 * @generated
		 */
		EClass PROVIDER_TYPE = eINSTANCE.getProviderType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_TYPE__NAME = eINSTANCE.getProviderType_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_TYPE__ID = eINSTANCE.getProviderType_Id();

		/**
		 * The meta object literal for the '<em><b>Home Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_TYPE__HOME_URL = eINSTANCE.getProviderType_HomeUrl();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertiesTypeImpl <em>Required Resource Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getRequiredResourcePropertiesType()
		 * @generated
		 */
		EClass REQUIRED_RESOURCE_PROPERTIES_TYPE = eINSTANCE.getRequiredResourcePropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_RESOURCE_PROPERTIES_TYPE__PROPERTY = eINSTANCE.getRequiredResourcePropertiesType_Property();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertyTypeImpl <em>Required Resource Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.RequiredResourcePropertyTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getRequiredResourcePropertyType()
		 * @generated
		 */
		EClass REQUIRED_RESOURCE_PROPERTY_TYPE = eINSTANCE.getRequiredResourcePropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_RESOURCE_PROPERTY_TYPE__NAME = eINSTANCE.getRequiredResourcePropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_RESOURCE_PROPERTY_TYPE__VALUE = eINSTANCE.getRequiredResourcePropertyType_Value();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_RESOURCE_PROPERTY_TYPE__KIND = eINSTANCE.getRequiredResourcePropertyType_Kind();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl <em>Required Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.RequiredResourceTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getRequiredResourceType()
		 * @generated
		 */
		EClass REQUIRED_RESOURCE_TYPE = eINSTANCE.getRequiredResourceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_RESOURCE_TYPE__NAME = eINSTANCE.getRequiredResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_RESOURCE_TYPE__VERSION = eINSTANCE.getRequiredResourceType_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_RESOURCE_TYPE__TYPE = eINSTANCE.getRequiredResourceType_Type();

		/**
		 * The meta object literal for the '<em><b>Required Resource Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES = eINSTANCE.getRequiredResourceType_RequiredResourceProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.ResourcePropertiesTypeImpl <em>Resource Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.ResourcePropertiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getResourcePropertiesType()
		 * @generated
		 */
		EClass RESOURCE_PROPERTIES_TYPE = eINSTANCE.getResourcePropertiesType();

		/**
		 * The meta object literal for the '<em><b>Resource Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY = eINSTANCE.getResourcePropertiesType_ResourceProperty();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__VERSION = eINSTANCE.getResourceType_Version();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__TYPES = eINSTANCE.getResourceType_Types();

		/**
		 * The meta object literal for the '<em><b>Resource Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RESOURCE_PROPERTIES = eINSTANCE.getResourceType_ResourceProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.TypesTypeImpl <em>Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.TypesTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getTypesType()
		 * @generated
		 */
		EClass TYPES_TYPE = eINSTANCE.getTypesType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_TYPE__TYPE = eINSTANCE.getTypesType_Type();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.impl.UnitRepositoriesTypeImpl <em>Repositories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitRepositoriesTypeImpl
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getUnitRepositoriesType()
		 * @generated
		 */
		EClass UNIT_REPOSITORIES_TYPE = eINSTANCE.getUnitRepositoriesType();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_REPOSITORIES_TYPE__REPOSITORY = eINSTANCE.getUnitRepositoriesType_Repository();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.LocalityConstraintType <em>Locality Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getLocalityConstraintType()
		 * @generated
		 */
		EEnum LOCALITY_CONSTRAINT_TYPE = eINSTANCE.getLocalityConstraintType();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.unit.PropertyKindType <em>Property Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPropertyKindType()
		 * @generated
		 */
		EEnum PROPERTY_KIND_TYPE = eINSTANCE.getPropertyKindType();

		/**
		 * The meta object literal for the '<em>Locality Constraint Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getLocalityConstraintTypeObject()
		 * @generated
		 */
		EDataType LOCALITY_CONSTRAINT_TYPE_OBJECT = eINSTANCE.getLocalityConstraintTypeObject();

		/**
		 * The meta object literal for the '<em>Property Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
		 * @see es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl#getPropertyKindTypeObject()
		 * @generated
		 */
		EDataType PROPERTY_KIND_TYPE_OBJECT = eINSTANCE.getPropertyKindTypeObject();

	}

} //UnitPackage

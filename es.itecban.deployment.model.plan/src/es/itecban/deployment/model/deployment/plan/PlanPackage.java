/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

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
 * @see es.itecban.deployment.model.deployment.plan.PlanFactory
 * @model kind="package"
 * @generated
 */
public interface PlanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/DeploymentPlan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "plan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlanPackage eINSTANCE = es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ActivitiesTypeImpl <em>Activities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ActivitiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivitiesType()
	 * @generated
	 */
	int ACTIVITIES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES_TYPE__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Activities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__ACTIVITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationActivityTypeImpl <em>Configuration Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ConfigurationActivityTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationActivityType()
	 * @generated
	 */
	int CONFIGURATION_ACTIVITY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTIVITY_TYPE__ACTIVITY_ID = ACTIVITY_TYPE__ACTIVITY_ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTIVITY_TYPE__TARGET = ACTIVITY_TYPE__TARGET;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTIVITY_TYPE__DEPENDENCY = ACTIVITY_TYPE__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTIVITY_TYPE__TYPE = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTIVITY_TYPE__CONFIGURATION = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ACTIVITY_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationPropertiesTypeImpl <em>Configuration Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ConfigurationPropertiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationPropertiesType()
	 * @generated
	 */
	int CONFIGURATION_PROPERTIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Configuration Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ConfigurationTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl <em>Deployment Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentActivityType()
	 * @generated
	 */
	int DEPLOYMENT_ACTIVITY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__ACTIVITY_ID = ACTIVITY_TYPE__ACTIVITY_ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__TARGET = ACTIVITY_TYPE__TARGET;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__DEPENDENCY = ACTIVITY_TYPE__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__TYPE = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION = ACTIVITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION = ACTIVITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Previous Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME = ACTIVITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Previous Unit Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION = ACTIVITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Deployment Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ACTIVITY_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl <em>Deployment Plan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentPlanType()
	 * @generated
	 */
	int DEPLOYMENT_PLAN_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_PLAN_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_PLAN_TYPE__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_PLAN_TYPE__ACTIVITIES = 2;

	/**
	 * The feature id for the '<em><b>Schedule Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Plan Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_PLAN_TYPE__PLAN_STATUS = 4;

	/**
	 * The number of structural features of the '<em>Deployment Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_PLAN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

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
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAN = 4;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEDULE = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.InitialConfigurationTypeImpl <em>Initial Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.InitialConfigurationTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getInitialConfigurationType()
	 * @generated
	 */
	int INITIAL_CONFIGURATION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONFIGURATION_TYPE__CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Initial Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONFIGURATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ResourceActivityTypeImpl <em>Resource Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ResourceActivityTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceActivityType()
	 * @generated
	 */
	int RESOURCE_ACTIVITY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_TYPE__ACTIVITY_ID = ACTIVITY_TYPE__ACTIVITY_ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_TYPE__TARGET = ACTIVITY_TYPE__TARGET;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_TYPE__DEPENDENCY = ACTIVITY_TYPE__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_TYPE__TYPE = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_TYPE__RESOURCE = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ResourceConfigurationTypeImpl <em>Resource Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ResourceConfigurationTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceConfigurationType()
	 * @generated
	 */
	int RESOURCE_CONFIGURATION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIGURATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Resource Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONFIGURATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl <em>Schedule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getScheduleType()
	 * @generated
	 */
	int SCHEDULE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TYPE__CREATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Scheduled Launch Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE = 1;

	/**
	 * The feature id for the '<em><b>Last Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TYPE__LAST_MODIFICATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Schedule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.ActivityKindType <em>Activity Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.ActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivityKindType()
	 * @generated
	 */
	int ACTIVITY_KIND_TYPE = 12;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType <em>Configuration Activity Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationActivityKindType()
	 * @generated
	 */
	int CONFIGURATION_ACTIVITY_KIND_TYPE = 13;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType <em>Deployment Activity Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentActivityKindType()
	 * @generated
	 */
	int DEPLOYMENT_ACTIVITY_KIND_TYPE = 14;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityKindType <em>Resource Activity Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceActivityKindType()
	 * @generated
	 */
	int RESOURCE_ACTIVITY_KIND_TYPE = 15;

	/**
	 * The meta object id for the '<em>Activity Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.ActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivityKindTypeObject()
	 * @generated
	 */
	int ACTIVITY_KIND_TYPE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Configuration Activity Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationActivityKindTypeObject()
	 * @generated
	 */
	int CONFIGURATION_ACTIVITY_KIND_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Deployment Activity Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentActivityKindTypeObject()
	 * @generated
	 */
	int DEPLOYMENT_ACTIVITY_KIND_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Resource Activity Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
	 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceActivityKindTypeObject()
	 * @generated
	 */
	int RESOURCE_ACTIVITY_KIND_TYPE_OBJECT = 19;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ActivitiesType <em>Activities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activities Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivitiesType
	 * @generated
	 */
	EClass getActivitiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.plan.ActivitiesType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivitiesType#getActivity()
	 * @see #getActivitiesType()
	 * @generated
	 */
	EReference getActivitiesType_Activity();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityType
	 * @generated
	 */
	EClass getActivityType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getActivityId <em>Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Id</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityType#getActivityId()
	 * @see #getActivityType()
	 * @generated
	 */
	EAttribute getActivityType_ActivityId();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityType#getTarget()
	 * @see #getActivityType()
	 * @generated
	 */
	EAttribute getActivityType_Target();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityType#getDependency()
	 * @see #getActivityType()
	 * @generated
	 */
	EAttribute getActivityType_Dependency();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType <em>Configuration Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Activity Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityType
	 * @generated
	 */
	EClass getConfigurationActivityType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getType()
	 * @see #getConfigurationActivityType()
	 * @generated
	 */
	EAttribute getConfigurationActivityType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getConfiguration()
	 * @see #getConfigurationActivityType()
	 * @generated
	 */
	EReference getConfigurationActivityType_Configuration();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType <em>Configuration Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Properties Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType
	 * @generated
	 */
	EClass getConfigurationPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType#getConfigurationProperties <em>Configuration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType#getConfigurationProperties()
	 * @see #getConfigurationPropertiesType()
	 * @generated
	 */
	EReference getConfigurationPropertiesType_ConfigurationProperties();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.plan.ConfigurationType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationType#getProperty()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Property();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType <em>Deployment Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Activity Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType
	 * @generated
	 */
	EClass getDeploymentActivityType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getType()
	 * @see #getDeploymentActivityType()
	 * @generated
	 */
	EAttribute getDeploymentActivityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitName()
	 * @see #getDeploymentActivityType()
	 * @generated
	 */
	EAttribute getDeploymentActivityType_UnitName();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitVersion <em>Unit Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Version</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitVersion()
	 * @see #getDeploymentActivityType()
	 * @generated
	 */
	EAttribute getDeploymentActivityType_UnitVersion();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getInitialConfiguration <em>Initial Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Configuration</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getInitialConfiguration()
	 * @see #getDeploymentActivityType()
	 * @generated
	 */
	EReference getDeploymentActivityType_InitialConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitName <em>Previous Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Unit Name</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitName()
	 * @see #getDeploymentActivityType()
	 * @generated
	 */
	EAttribute getDeploymentActivityType_PreviousUnitName();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitVersion <em>Previous Unit Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Unit Version</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitVersion()
	 * @see #getDeploymentActivityType()
	 * @generated
	 */
	EAttribute getDeploymentActivityType_PreviousUnitVersion();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType <em>Deployment Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Plan Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType
	 * @generated
	 */
	EClass getDeploymentPlanType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getName()
	 * @see #getDeploymentPlanType()
	 * @generated
	 */
	EAttribute getDeploymentPlanType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getEnvironment()
	 * @see #getDeploymentPlanType()
	 * @generated
	 */
	EAttribute getDeploymentPlanType_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activities</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getActivities()
	 * @see #getDeploymentPlanType()
	 * @generated
	 */
	EReference getDeploymentPlanType_Activities();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getScheduleData <em>Schedule Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule Data</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getScheduleData()
	 * @see #getDeploymentPlanType()
	 * @generated
	 */
	EReference getDeploymentPlanType_ScheduleData();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getPlanStatus <em>Plan Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Status</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getPlanStatus()
	 * @see #getDeploymentPlanType()
	 * @generated
	 */
	EAttribute getDeploymentPlanType_PlanStatus();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot#getActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot#getPlan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plan();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot#getSchedule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Schedule();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.InitialConfigurationType <em>Initial Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Configuration Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.InitialConfigurationType
	 * @generated
	 */
	EClass getInitialConfigurationType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.plan.InitialConfigurationType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.InitialConfigurationType#getConfiguration()
	 * @see #getInitialConfigurationType()
	 * @generated
	 */
	EReference getInitialConfigurationType_Configuration();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType <em>Resource Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Activity Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityType
	 * @generated
	 */
	EClass getResourceActivityType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityType#getType()
	 * @see #getResourceActivityType()
	 * @generated
	 */
	EAttribute getResourceActivityType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityType#getResource()
	 * @see #getResourceActivityType()
	 * @generated
	 */
	EReference getResourceActivityType_Resource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType <em>Resource Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Configuration Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceConfigurationType
	 * @generated
	 */
	EClass getResourceConfigurationType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getName()
	 * @see #getResourceConfigurationType()
	 * @generated
	 */
	EAttribute getResourceConfigurationType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getConfigurationProperties <em>Configuration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getConfigurationProperties()
	 * @see #getResourceConfigurationType()
	 * @generated
	 */
	EReference getResourceConfigurationType_ConfigurationProperties();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.ScheduleType <em>Schedule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ScheduleType
	 * @generated
	 */
	EClass getScheduleType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ScheduleType#getCreationDate()
	 * @see #getScheduleType()
	 * @generated
	 */
	EAttribute getScheduleType_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getScheduledLaunchDate <em>Scheduled Launch Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Launch Date</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ScheduleType#getScheduledLaunchDate()
	 * @see #getScheduleType()
	 * @generated
	 */
	EAttribute getScheduleType_ScheduledLaunchDate();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getLastModificationDate <em>Last Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modification Date</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ScheduleType#getLastModificationDate()
	 * @see #getScheduleType()
	 * @generated
	 */
	EAttribute getScheduleType_LastModificationDate();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.plan.ActivityKindType <em>Activity Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityKindType
	 * @generated
	 */
	EEnum getActivityKindType();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType <em>Configuration Activity Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Configuration Activity Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
	 * @generated
	 */
	EEnum getConfigurationActivityKindType();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType <em>Deployment Activity Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Activity Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
	 * @generated
	 */
	EEnum getDeploymentActivityKindType();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityKindType <em>Resource Activity Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Activity Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
	 * @generated
	 */
	EEnum getResourceActivityKindType();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.plan.ActivityKindType <em>Activity Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.plan.ActivityKindType"
	 *        extendedMetaData="name='ActivityKindType:Object' baseType='ActivityKindType'"
	 * @generated
	 */
	EDataType getActivityKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType <em>Configuration Activity Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Configuration Activity Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType"
	 *        extendedMetaData="name='ConfigurationActivityKindType:Object' baseType='ConfigurationActivityKindType'"
	 * @generated
	 */
	EDataType getConfigurationActivityKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType <em>Deployment Activity Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Deployment Activity Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType"
	 *        extendedMetaData="name='DeploymentActivityKindType:Object' baseType='DeploymentActivityKindType'"
	 * @generated
	 */
	EDataType getDeploymentActivityKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityKindType <em>Resource Activity Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource Activity Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.plan.ResourceActivityKindType"
	 *        extendedMetaData="name='ResourceActivityKindType:Object' baseType='ResourceActivityKindType'"
	 * @generated
	 */
	EDataType getResourceActivityKindTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlanFactory getPlanFactory();

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
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ActivitiesTypeImpl <em>Activities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ActivitiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivitiesType()
		 * @generated
		 */
		EClass ACTIVITIES_TYPE = eINSTANCE.getActivitiesType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITIES_TYPE__ACTIVITY = eINSTANCE.getActivitiesType_Activity();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivityType()
		 * @generated
		 */
		EClass ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '<em><b>Activity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TYPE__ACTIVITY_ID = eINSTANCE.getActivityType_ActivityId();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TYPE__TARGET = eINSTANCE.getActivityType_Target();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TYPE__DEPENDENCY = eINSTANCE.getActivityType_Dependency();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationActivityTypeImpl <em>Configuration Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ConfigurationActivityTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationActivityType()
		 * @generated
		 */
		EClass CONFIGURATION_ACTIVITY_TYPE = eINSTANCE.getConfigurationActivityType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_ACTIVITY_TYPE__TYPE = eINSTANCE.getConfigurationActivityType_Type();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_ACTIVITY_TYPE__CONFIGURATION = eINSTANCE.getConfigurationActivityType_Configuration();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationPropertiesTypeImpl <em>Configuration Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ConfigurationPropertiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationPropertiesType()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTIES_TYPE = eINSTANCE.getConfigurationPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Configuration Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES = eINSTANCE.getConfigurationPropertiesType_ConfigurationProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ConfigurationTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationType()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE = eINSTANCE.getConfigurationType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_TYPE__PROPERTY = eINSTANCE.getConfigurationType_Property();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl <em>Deployment Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentActivityType()
		 * @generated
		 */
		EClass DEPLOYMENT_ACTIVITY_TYPE = eINSTANCE.getDeploymentActivityType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_ACTIVITY_TYPE__TYPE = eINSTANCE.getDeploymentActivityType_Type();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME = eINSTANCE.getDeploymentActivityType_UnitName();

		/**
		 * The meta object literal for the '<em><b>Unit Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION = eINSTANCE.getDeploymentActivityType_UnitVersion();

		/**
		 * The meta object literal for the '<em><b>Initial Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION = eINSTANCE.getDeploymentActivityType_InitialConfiguration();

		/**
		 * The meta object literal for the '<em><b>Previous Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME = eINSTANCE.getDeploymentActivityType_PreviousUnitName();

		/**
		 * The meta object literal for the '<em><b>Previous Unit Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION = eINSTANCE.getDeploymentActivityType_PreviousUnitVersion();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl <em>Deployment Plan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentPlanType()
		 * @generated
		 */
		EClass DEPLOYMENT_PLAN_TYPE = eINSTANCE.getDeploymentPlanType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_PLAN_TYPE__NAME = eINSTANCE.getDeploymentPlanType_Name();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_PLAN_TYPE__ENVIRONMENT = eINSTANCE.getDeploymentPlanType_Environment();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_PLAN_TYPE__ACTIVITIES = eINSTANCE.getDeploymentPlanType_Activities();

		/**
		 * The meta object literal for the '<em><b>Schedule Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA = eINSTANCE.getDeploymentPlanType_ScheduleData();

		/**
		 * The meta object literal for the '<em><b>Plan Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_PLAN_TYPE__PLAN_STATUS = eINSTANCE.getDeploymentPlanType_PlanStatus();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTIVITY = eINSTANCE.getDocumentRoot_Activity();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLAN = eINSTANCE.getDocumentRoot_Plan();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEDULE = eINSTANCE.getDocumentRoot_Schedule();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.InitialConfigurationTypeImpl <em>Initial Configuration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.InitialConfigurationTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getInitialConfigurationType()
		 * @generated
		 */
		EClass INITIAL_CONFIGURATION_TYPE = eINSTANCE.getInitialConfigurationType();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_CONFIGURATION_TYPE__CONFIGURATION = eINSTANCE.getInitialConfigurationType_Configuration();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ResourceActivityTypeImpl <em>Resource Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ResourceActivityTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceActivityType()
		 * @generated
		 */
		EClass RESOURCE_ACTIVITY_TYPE = eINSTANCE.getResourceActivityType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACTIVITY_TYPE__TYPE = eINSTANCE.getResourceActivityType_Type();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACTIVITY_TYPE__RESOURCE = eINSTANCE.getResourceActivityType_Resource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ResourceConfigurationTypeImpl <em>Resource Configuration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ResourceConfigurationTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceConfigurationType()
		 * @generated
		 */
		EClass RESOURCE_CONFIGURATION_TYPE = eINSTANCE.getResourceConfigurationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONFIGURATION_TYPE__NAME = eINSTANCE.getResourceConfigurationType_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES = eINSTANCE.getResourceConfigurationType_ConfigurationProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl <em>Schedule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getScheduleType()
		 * @generated
		 */
		EClass SCHEDULE_TYPE = eINSTANCE.getScheduleType();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TYPE__CREATION_DATE = eINSTANCE.getScheduleType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Scheduled Launch Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE = eINSTANCE.getScheduleType_ScheduledLaunchDate();

		/**
		 * The meta object literal for the '<em><b>Last Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TYPE__LAST_MODIFICATION_DATE = eINSTANCE.getScheduleType_LastModificationDate();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.ActivityKindType <em>Activity Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.ActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivityKindType()
		 * @generated
		 */
		EEnum ACTIVITY_KIND_TYPE = eINSTANCE.getActivityKindType();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType <em>Configuration Activity Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationActivityKindType()
		 * @generated
		 */
		EEnum CONFIGURATION_ACTIVITY_KIND_TYPE = eINSTANCE.getConfigurationActivityKindType();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType <em>Deployment Activity Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentActivityKindType()
		 * @generated
		 */
		EEnum DEPLOYMENT_ACTIVITY_KIND_TYPE = eINSTANCE.getDeploymentActivityKindType();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityKindType <em>Resource Activity Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceActivityKindType()
		 * @generated
		 */
		EEnum RESOURCE_ACTIVITY_KIND_TYPE = eINSTANCE.getResourceActivityKindType();

		/**
		 * The meta object literal for the '<em>Activity Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.ActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getActivityKindTypeObject()
		 * @generated
		 */
		EDataType ACTIVITY_KIND_TYPE_OBJECT = eINSTANCE.getActivityKindTypeObject();

		/**
		 * The meta object literal for the '<em>Configuration Activity Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getConfigurationActivityKindTypeObject()
		 * @generated
		 */
		EDataType CONFIGURATION_ACTIVITY_KIND_TYPE_OBJECT = eINSTANCE.getConfigurationActivityKindTypeObject();

		/**
		 * The meta object literal for the '<em>Deployment Activity Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getDeploymentActivityKindTypeObject()
		 * @generated
		 */
		EDataType DEPLOYMENT_ACTIVITY_KIND_TYPE_OBJECT = eINSTANCE.getDeploymentActivityKindTypeObject();

		/**
		 * The meta object literal for the '<em>Resource Activity Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
		 * @see es.itecban.deployment.model.deployment.plan.impl.PlanPackageImpl#getResourceActivityKindTypeObject()
		 * @generated
		 */
		EDataType RESOURCE_ACTIVITY_KIND_TYPE_OBJECT = eINSTANCE.getResourceActivityKindTypeObject();

	}

} //PlanPackage

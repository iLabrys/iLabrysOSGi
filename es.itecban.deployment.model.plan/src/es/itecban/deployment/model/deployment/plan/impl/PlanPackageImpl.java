/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.ActivitiesType;
import es.itecban.deployment.model.deployment.plan.ActivityKindType;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType;
import es.itecban.deployment.model.deployment.plan.ConfigurationType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.InitialConfigurationType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.PlanPackage;
import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.plan.ResourceConfigurationType;
import es.itecban.deployment.model.deployment.plan.ScheduleType;

import es.itecban.deployment.model.deployment.target.TargetPackage;

import es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl;

import es.itecban.deployment.model.deployment.unit.UnitPackage;

import es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl;

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
public class PlanPackageImpl extends EPackageImpl implements PlanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationActivityTypeEClass = null;

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
	private EClass configurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentPlanTypeEClass = null;

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
	private EClass initialConfigurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConfigurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum configurationActivityKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentActivityKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceActivityKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activityKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType configurationActivityKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deploymentActivityKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceActivityKindTypeObjectEDataType = null;

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
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlanPackageImpl() {
		super(eNS_URI, PlanFactory.eINSTANCE);
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
	public static PlanPackage init() {
		if (isInited) return (PlanPackage)EPackage.Registry.INSTANCE.getEPackage(PlanPackage.eNS_URI);

		// Obtain or create and register package
		PlanPackageImpl thePlanPackage = (PlanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PlanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PlanPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);
		TargetPackageImpl theTargetPackage = (TargetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI) instanceof TargetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI) : TargetPackage.eINSTANCE);

		// Create package meta-data objects
		thePlanPackage.createPackageContents();
		theUnitPackage.createPackageContents();
		theTargetPackage.createPackageContents();

		// Initialize created meta-data
		thePlanPackage.initializePackageContents();
		theUnitPackage.initializePackageContents();
		theTargetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlanPackage.freeze();

		return thePlanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitiesType() {
		return activitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitiesType_Activity() {
		return (EReference)activitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityType() {
		return activityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_ActivityId() {
		return (EAttribute)activityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_Target() {
		return (EAttribute)activityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityType_Dependency() {
		return (EAttribute)activityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationActivityType() {
		return configurationActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationActivityType_Type() {
		return (EAttribute)configurationActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationActivityType_Configuration() {
		return (EReference)configurationActivityTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getConfigurationPropertiesType_ConfigurationProperties() {
		return (EReference)configurationPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationType() {
		return configurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationType_Property() {
		return (EReference)configurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentActivityType() {
		return deploymentActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentActivityType_Type() {
		return (EAttribute)deploymentActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentActivityType_UnitName() {
		return (EAttribute)deploymentActivityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentActivityType_UnitVersion() {
		return (EAttribute)deploymentActivityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentActivityType_InitialConfiguration() {
		return (EReference)deploymentActivityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentActivityType_PreviousUnitName() {
		return (EAttribute)deploymentActivityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentActivityType_PreviousUnitVersion() {
		return (EAttribute)deploymentActivityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentPlanType() {
		return deploymentPlanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentPlanType_Name() {
		return (EAttribute)deploymentPlanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentPlanType_Environment() {
		return (EAttribute)deploymentPlanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentPlanType_Activities() {
		return (EReference)deploymentPlanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentPlanType_ScheduleData() {
		return (EReference)deploymentPlanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentPlanType_PlanStatus() {
		return (EAttribute)deploymentPlanTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_Activity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Plan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Schedule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialConfigurationType() {
		return initialConfigurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialConfigurationType_Configuration() {
		return (EReference)initialConfigurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceActivityType() {
		return resourceActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceActivityType_Type() {
		return (EAttribute)resourceActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceActivityType_Resource() {
		return (EReference)resourceActivityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConfigurationType() {
		return resourceConfigurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceConfigurationType_Name() {
		return (EAttribute)resourceConfigurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConfigurationType_ConfigurationProperties() {
		return (EReference)resourceConfigurationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleType() {
		return scheduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleType_CreationDate() {
		return (EAttribute)scheduleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleType_ScheduledLaunchDate() {
		return (EAttribute)scheduleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleType_LastModificationDate() {
		return (EAttribute)scheduleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityKindType() {
		return activityKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfigurationActivityKindType() {
		return configurationActivityKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeploymentActivityKindType() {
		return deploymentActivityKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceActivityKindType() {
		return resourceActivityKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActivityKindTypeObject() {
		return activityKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConfigurationActivityKindTypeObject() {
		return configurationActivityKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeploymentActivityKindTypeObject() {
		return deploymentActivityKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResourceActivityKindTypeObject() {
		return resourceActivityKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanFactory getPlanFactory() {
		return (PlanFactory)getEFactoryInstance();
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
		activitiesTypeEClass = createEClass(ACTIVITIES_TYPE);
		createEReference(activitiesTypeEClass, ACTIVITIES_TYPE__ACTIVITY);

		activityTypeEClass = createEClass(ACTIVITY_TYPE);
		createEAttribute(activityTypeEClass, ACTIVITY_TYPE__ACTIVITY_ID);
		createEAttribute(activityTypeEClass, ACTIVITY_TYPE__TARGET);
		createEAttribute(activityTypeEClass, ACTIVITY_TYPE__DEPENDENCY);

		configurationActivityTypeEClass = createEClass(CONFIGURATION_ACTIVITY_TYPE);
		createEAttribute(configurationActivityTypeEClass, CONFIGURATION_ACTIVITY_TYPE__TYPE);
		createEReference(configurationActivityTypeEClass, CONFIGURATION_ACTIVITY_TYPE__CONFIGURATION);

		configurationPropertiesTypeEClass = createEClass(CONFIGURATION_PROPERTIES_TYPE);
		createEReference(configurationPropertiesTypeEClass, CONFIGURATION_PROPERTIES_TYPE__CONFIGURATION_PROPERTIES);

		configurationTypeEClass = createEClass(CONFIGURATION_TYPE);
		createEReference(configurationTypeEClass, CONFIGURATION_TYPE__PROPERTY);

		deploymentActivityTypeEClass = createEClass(DEPLOYMENT_ACTIVITY_TYPE);
		createEAttribute(deploymentActivityTypeEClass, DEPLOYMENT_ACTIVITY_TYPE__TYPE);
		createEAttribute(deploymentActivityTypeEClass, DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME);
		createEAttribute(deploymentActivityTypeEClass, DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION);
		createEReference(deploymentActivityTypeEClass, DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION);
		createEAttribute(deploymentActivityTypeEClass, DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME);
		createEAttribute(deploymentActivityTypeEClass, DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION);

		deploymentPlanTypeEClass = createEClass(DEPLOYMENT_PLAN_TYPE);
		createEAttribute(deploymentPlanTypeEClass, DEPLOYMENT_PLAN_TYPE__NAME);
		createEAttribute(deploymentPlanTypeEClass, DEPLOYMENT_PLAN_TYPE__ENVIRONMENT);
		createEReference(deploymentPlanTypeEClass, DEPLOYMENT_PLAN_TYPE__ACTIVITIES);
		createEReference(deploymentPlanTypeEClass, DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA);
		createEAttribute(deploymentPlanTypeEClass, DEPLOYMENT_PLAN_TYPE__PLAN_STATUS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEDULE);

		initialConfigurationTypeEClass = createEClass(INITIAL_CONFIGURATION_TYPE);
		createEReference(initialConfigurationTypeEClass, INITIAL_CONFIGURATION_TYPE__CONFIGURATION);

		resourceActivityTypeEClass = createEClass(RESOURCE_ACTIVITY_TYPE);
		createEAttribute(resourceActivityTypeEClass, RESOURCE_ACTIVITY_TYPE__TYPE);
		createEReference(resourceActivityTypeEClass, RESOURCE_ACTIVITY_TYPE__RESOURCE);

		resourceConfigurationTypeEClass = createEClass(RESOURCE_CONFIGURATION_TYPE);
		createEAttribute(resourceConfigurationTypeEClass, RESOURCE_CONFIGURATION_TYPE__NAME);
		createEReference(resourceConfigurationTypeEClass, RESOURCE_CONFIGURATION_TYPE__CONFIGURATION_PROPERTIES);

		scheduleTypeEClass = createEClass(SCHEDULE_TYPE);
		createEAttribute(scheduleTypeEClass, SCHEDULE_TYPE__CREATION_DATE);
		createEAttribute(scheduleTypeEClass, SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE);
		createEAttribute(scheduleTypeEClass, SCHEDULE_TYPE__LAST_MODIFICATION_DATE);

		// Create enums
		activityKindTypeEEnum = createEEnum(ACTIVITY_KIND_TYPE);
		configurationActivityKindTypeEEnum = createEEnum(CONFIGURATION_ACTIVITY_KIND_TYPE);
		deploymentActivityKindTypeEEnum = createEEnum(DEPLOYMENT_ACTIVITY_KIND_TYPE);
		resourceActivityKindTypeEEnum = createEEnum(RESOURCE_ACTIVITY_KIND_TYPE);

		// Create data types
		activityKindTypeObjectEDataType = createEDataType(ACTIVITY_KIND_TYPE_OBJECT);
		configurationActivityKindTypeObjectEDataType = createEDataType(CONFIGURATION_ACTIVITY_KIND_TYPE_OBJECT);
		deploymentActivityKindTypeObjectEDataType = createEDataType(DEPLOYMENT_ACTIVITY_KIND_TYPE_OBJECT);
		resourceActivityKindTypeObjectEDataType = createEDataType(RESOURCE_ACTIVITY_KIND_TYPE_OBJECT);
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
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationActivityTypeEClass.getESuperTypes().add(this.getActivityType());
		deploymentActivityTypeEClass.getESuperTypes().add(this.getActivityType());
		resourceActivityTypeEClass.getESuperTypes().add(this.getActivityType());

		// Initialize classes and features; add operations and parameters
		initEClass(activitiesTypeEClass, ActivitiesType.class, "ActivitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitiesType_Activity(), this.getActivityType(), null, "activity", null, 1, -1, ActivitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityTypeEClass, ActivityType.class, "ActivityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityType_ActivityId(), theXMLTypePackage.getInt(), "activityId", null, 1, 1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityType_Target(), theXMLTypePackage.getString(), "target", null, 1, 1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityType_Dependency(), theXMLTypePackage.getInt(), "dependency", null, 0, -1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationActivityTypeEClass, ConfigurationActivityType.class, "ConfigurationActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationActivityType_Type(), this.getConfigurationActivityKindType(), "type", null, 1, 1, ConfigurationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationActivityType_Configuration(), this.getConfigurationType(), null, "configuration", null, 1, 1, ConfigurationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertiesTypeEClass, ConfigurationPropertiesType.class, "ConfigurationPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationPropertiesType_ConfigurationProperties(), theUnitPackage.getPropertyType(), null, "configurationProperties", null, 1, -1, ConfigurationPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationTypeEClass, ConfigurationType.class, "ConfigurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationType_Property(), theUnitPackage.getPropertyType(), null, "property", null, 1, -1, ConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentActivityTypeEClass, DeploymentActivityType.class, "DeploymentActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentActivityType_Type(), this.getDeploymentActivityKindType(), "type", null, 1, 1, DeploymentActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentActivityType_UnitName(), theXMLTypePackage.getString(), "unitName", null, 1, 1, DeploymentActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentActivityType_UnitVersion(), theXMLTypePackage.getString(), "unitVersion", null, 1, 1, DeploymentActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentActivityType_InitialConfiguration(), this.getInitialConfigurationType(), null, "initialConfiguration", null, 0, 1, DeploymentActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentActivityType_PreviousUnitName(), theXMLTypePackage.getString(), "previousUnitName", null, 0, 1, DeploymentActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentActivityType_PreviousUnitVersion(), theXMLTypePackage.getString(), "previousUnitVersion", null, 0, 1, DeploymentActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentPlanTypeEClass, DeploymentPlanType.class, "DeploymentPlanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentPlanType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DeploymentPlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPlanType_Environment(), theXMLTypePackage.getString(), "environment", null, 1, 1, DeploymentPlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentPlanType_Activities(), this.getActivitiesType(), null, "activities", null, 1, 1, DeploymentPlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentPlanType_ScheduleData(), this.getScheduleType(), null, "scheduleData", null, 1, 1, DeploymentPlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentPlanType_PlanStatus(), theXMLTypePackage.getString(), "planStatus", null, 1, 1, DeploymentPlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Activity(), this.getDeploymentActivityType(), null, "activity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Plan(), this.getDeploymentPlanType(), null, "plan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Schedule(), this.getScheduleType(), null, "schedule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(initialConfigurationTypeEClass, InitialConfigurationType.class, "InitialConfigurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialConfigurationType_Configuration(), this.getResourceConfigurationType(), null, "configuration", null, 1, -1, InitialConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceActivityTypeEClass, ResourceActivityType.class, "ResourceActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceActivityType_Type(), this.getResourceActivityKindType(), "type", null, 1, 1, ResourceActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceActivityType_Resource(), theUnitPackage.getResourceType(), null, "resource", null, 1, 1, ResourceActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceConfigurationTypeEClass, ResourceConfigurationType.class, "ResourceConfigurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConfigurationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ResourceConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConfigurationType_ConfigurationProperties(), this.getConfigurationPropertiesType(), null, "configurationProperties", null, 1, 1, ResourceConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleTypeEClass, ScheduleType.class, "ScheduleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduleType_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 1, 1, ScheduleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleType_ScheduledLaunchDate(), theXMLTypePackage.getDateTime(), "scheduledLaunchDate", null, 0, 1, ScheduleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleType_LastModificationDate(), theXMLTypePackage.getDateTime(), "lastModificationDate", null, 0, 1, ScheduleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activityKindTypeEEnum, ActivityKindType.class, "ActivityKindType");
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.INSTALLDEPLOYMENTUNIT);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.UPDATEDEPLOYMENTUNIT);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.CONFIGUREDEPLOYMENTUNIT);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.UNINSTALLDEPLOYMENTUNIT);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.STARTDEPLOYMENTUNIT);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.STOPDEPLOYMENTUNIT);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.ADDCONTAINERRESOURCE);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.REMOVECONTAINERRESOURCE);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.CONFIGURECONTAINERRESOURCE);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.CONFIGURECONTAINERPROPERTY);
		addEEnumLiteral(activityKindTypeEEnum, ActivityKindType.CONFIGUREUNITRESOURCE);

		initEEnum(configurationActivityKindTypeEEnum, ConfigurationActivityKindType.class, "ConfigurationActivityKindType");
		addEEnumLiteral(configurationActivityKindTypeEEnum, ConfigurationActivityKindType.CONFIGURECONTAINERRESOURCE);
		addEEnumLiteral(configurationActivityKindTypeEEnum, ConfigurationActivityKindType.CONFIGURECONTAINERPROPERTY);
		addEEnumLiteral(configurationActivityKindTypeEEnum, ConfigurationActivityKindType.CONFIGUREUNITRESOURCE);

		initEEnum(deploymentActivityKindTypeEEnum, DeploymentActivityKindType.class, "DeploymentActivityKindType");
		addEEnumLiteral(deploymentActivityKindTypeEEnum, DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT);
		addEEnumLiteral(deploymentActivityKindTypeEEnum, DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT);
		addEEnumLiteral(deploymentActivityKindTypeEEnum, DeploymentActivityKindType.UNINSTALLDEPLOYMENTUNIT);
		addEEnumLiteral(deploymentActivityKindTypeEEnum, DeploymentActivityKindType.STARTDEPLOYMENTUNIT);
		addEEnumLiteral(deploymentActivityKindTypeEEnum, DeploymentActivityKindType.STOPDEPLOYMENTUNIT);

		initEEnum(resourceActivityKindTypeEEnum, ResourceActivityKindType.class, "ResourceActivityKindType");
		addEEnumLiteral(resourceActivityKindTypeEEnum, ResourceActivityKindType.ADDCONTAINERRESOURCE);
		addEEnumLiteral(resourceActivityKindTypeEEnum, ResourceActivityKindType.REMOVECONTAINERRESOURCE);

		// Initialize data types
		initEDataType(activityKindTypeObjectEDataType, ActivityKindType.class, "ActivityKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(configurationActivityKindTypeObjectEDataType, ConfigurationActivityKindType.class, "ConfigurationActivityKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deploymentActivityKindTypeObjectEDataType, DeploymentActivityKindType.class, "DeploymentActivityKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceActivityKindTypeObjectEDataType, ResourceActivityKindType.class, "ResourceActivityKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (activitiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "activities_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActivitiesType_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity"
		   });		
		addAnnotation
		  (activityKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ActivityKindType"
		   });		
		addAnnotation
		  (activityKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ActivityKindType:Object",
			 "baseType", "ActivityKindType"
		   });		
		addAnnotation
		  (activityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActivityType_ActivityId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activityId"
		   });		
		addAnnotation
		  (getActivityType_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "target"
		   });		
		addAnnotation
		  (getActivityType_Dependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dependency"
		   });		
		addAnnotation
		  (configurationActivityKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ConfigurationActivityKindType"
		   });		
		addAnnotation
		  (configurationActivityKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ConfigurationActivityKindType:Object",
			 "baseType", "ConfigurationActivityKindType"
		   });		
		addAnnotation
		  (configurationActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConfigurationActivityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationActivityType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (getConfigurationActivityType_Configuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configuration"
		   });		
		addAnnotation
		  (configurationPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "configurationProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationPropertiesType_ConfigurationProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configurationProperties"
		   });		
		addAnnotation
		  (configurationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "configuration_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property"
		   });		
		addAnnotation
		  (deploymentActivityKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DeploymentActivityKindType"
		   });		
		addAnnotation
		  (deploymentActivityKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DeploymentActivityKindType:Object",
			 "baseType", "DeploymentActivityKindType"
		   });		
		addAnnotation
		  (deploymentActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeploymentActivityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeploymentActivityType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (getDeploymentActivityType_UnitName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unitName"
		   });		
		addAnnotation
		  (getDeploymentActivityType_UnitVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unitVersion"
		   });			
		addAnnotation
		  (getDeploymentActivityType_InitialConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initialConfiguration"
		   });		
		addAnnotation
		  (getDeploymentActivityType_PreviousUnitName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "previousUnitName"
		   });		
		addAnnotation
		  (getDeploymentActivityType_PreviousUnitVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "previousUnitVersion"
		   });		
		addAnnotation
		  (deploymentPlanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeploymentPlanType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeploymentPlanType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getDeploymentPlanType_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environment"
		   });		
		addAnnotation
		  (getDeploymentPlanType_Activities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activities"
		   });		
		addAnnotation
		  (getDeploymentPlanType_ScheduleData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scheduleData"
		   });		
		addAnnotation
		  (getDeploymentPlanType_PlanStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "planStatus"
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
		  (getDocumentRoot_Activity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Plan(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plan",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Schedule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schedule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (initialConfigurationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "initialConfiguration_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getInitialConfigurationType_Configuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configuration"
		   });		
		addAnnotation
		  (resourceActivityKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ResourceActivityKindType"
		   });		
		addAnnotation
		  (resourceActivityKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ResourceActivityKindType:Object",
			 "baseType", "ResourceActivityKindType"
		   });		
		addAnnotation
		  (resourceActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceActivityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResourceActivityType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (getResourceActivityType_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource"
		   });			
		addAnnotation
		  (resourceConfigurationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceConfigurationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResourceConfigurationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getResourceConfigurationType_ConfigurationProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configurationProperties"
		   });		
		addAnnotation
		  (scheduleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScheduleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScheduleType_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate"
		   });		
		addAnnotation
		  (getScheduleType_ScheduledLaunchDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scheduledLaunchDate"
		   });		
		addAnnotation
		  (getScheduleType_LastModificationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastModificationDate"
		   });
	}

} //PlanPackageImpl

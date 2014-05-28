/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report.impl;

import es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.plan.report.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.PlanResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.plan.report.ReportPackage;

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
public class ReportPackageImpl extends EPackageImpl implements ReportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitiesExecutionReportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExecReportTypeEClass = null;

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
	private EClass executionReportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityResultKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planResultKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activityResultKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType planResultKindTypeObjectEDataType = null;

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
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportPackageImpl() {
		super(eNS_URI, ReportFactory.eINSTANCE);
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
	public static ReportPackage init() {
		if (isInited) return (ReportPackage)EPackage.Registry.INSTANCE.getEPackage(ReportPackage.eNS_URI);

		// Obtain or create and register package
		ReportPackageImpl theReportPackage = (ReportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ReportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ReportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReportPackage.createPackageContents();

		// Initialize created meta-data
		theReportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReportPackage.freeze();

		return theReportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitiesExecutionReportType() {
		return activitiesExecutionReportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitiesExecutionReportType_ActivityExecutionReport() {
		return (EReference)activitiesExecutionReportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecReportType() {
		return activityExecReportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_ActivityId() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_StartTime() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_EndTime() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_Description() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_ResultCode() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_Result() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityExecReportType_TechnicalActivityExecReport() {
		return (EAttribute)activityExecReportTypeEClass.getEStructuralFeatures().get(6);
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
	public EReference getDocumentRoot_ExecutionReport() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionReportType() {
		return executionReportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_PlanId() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_StartTime() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_EndTime() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_CreationUserId() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_LauncherUserId() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_Environment() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_TechnicalExecutionReport() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_Result() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionReportType_Message() {
		return (EAttribute)executionReportTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionReportType_ActivitiesExecutionReport() {
		return (EReference)executionReportTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityResultKindType() {
		return activityResultKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanResultKindType() {
		return planResultKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActivityResultKindTypeObject() {
		return activityResultKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlanResultKindTypeObject() {
		return planResultKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFactory getReportFactory() {
		return (ReportFactory)getEFactoryInstance();
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
		activitiesExecutionReportTypeEClass = createEClass(ACTIVITIES_EXECUTION_REPORT_TYPE);
		createEReference(activitiesExecutionReportTypeEClass, ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT);

		activityExecReportTypeEClass = createEClass(ACTIVITY_EXEC_REPORT_TYPE);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__START_TIME);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__END_TIME);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__RESULT);
		createEAttribute(activityExecReportTypeEClass, ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXECUTION_REPORT);

		executionReportTypeEClass = createEClass(EXECUTION_REPORT_TYPE);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__PLAN_ID);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__START_TIME);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__END_TIME);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__CREATION_USER_ID);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__ENVIRONMENT);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__RESULT);
		createEAttribute(executionReportTypeEClass, EXECUTION_REPORT_TYPE__MESSAGE);
		createEReference(executionReportTypeEClass, EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT);

		// Create enums
		activityResultKindTypeEEnum = createEEnum(ACTIVITY_RESULT_KIND_TYPE);
		planResultKindTypeEEnum = createEEnum(PLAN_RESULT_KIND_TYPE);

		// Create data types
		activityResultKindTypeObjectEDataType = createEDataType(ACTIVITY_RESULT_KIND_TYPE_OBJECT);
		planResultKindTypeObjectEDataType = createEDataType(PLAN_RESULT_KIND_TYPE_OBJECT);
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
		initEClass(activitiesExecutionReportTypeEClass, ActivitiesExecutionReportType.class, "ActivitiesExecutionReportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitiesExecutionReportType_ActivityExecutionReport(), this.getActivityExecReportType(), null, "activityExecutionReport", null, 1, -1, ActivitiesExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityExecReportTypeEClass, ActivityExecReportType.class, "ActivityExecReportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityExecReportType_ActivityId(), theXMLTypePackage.getString(), "activityId", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecReportType_StartTime(), theXMLTypePackage.getDateTime(), "startTime", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecReportType_EndTime(), theXMLTypePackage.getDateTime(), "endTime", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecReportType_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecReportType_ResultCode(), theXMLTypePackage.getString(), "resultCode", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecReportType_Result(), this.getActivityResultKindType(), "result", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityExecReportType_TechnicalActivityExecReport(), theXMLTypePackage.getString(), "technicalActivityExecReport", null, 1, 1, ActivityExecReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Activity(), this.getActivityExecReportType(), null, "activity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExecutionReport(), this.getExecutionReportType(), null, "executionReport", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executionReportTypeEClass, ExecutionReportType.class, "ExecutionReportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionReportType_PlanId(), theXMLTypePackage.getString(), "planId", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_StartTime(), theXMLTypePackage.getDateTime(), "startTime", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_EndTime(), theXMLTypePackage.getDateTime(), "endTime", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_CreationUserId(), theXMLTypePackage.getString(), "creationUserId", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_LauncherUserId(), theXMLTypePackage.getString(), "launcherUserId", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_Environment(), theXMLTypePackage.getString(), "environment", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_TechnicalExecutionReport(), theXMLTypePackage.getString(), "technicalExecutionReport", null, 0, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_Result(), this.getPlanResultKindType(), "result", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionReportType_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionReportType_ActivitiesExecutionReport(), this.getActivitiesExecutionReportType(), null, "activitiesExecutionReport", null, 1, 1, ExecutionReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activityResultKindTypeEEnum, ActivityResultKindType.class, "ActivityResultKindType");
		addEEnumLiteral(activityResultKindTypeEEnum, ActivityResultKindType.OK);
		addEEnumLiteral(activityResultKindTypeEEnum, ActivityResultKindType.TIMEOUT);
		addEEnumLiteral(activityResultKindTypeEEnum, ActivityResultKindType.CONNECTIONPROBLEM);
		addEEnumLiteral(activityResultKindTypeEEnum, ActivityResultKindType.CONFIGURATIONPROBLEM);
		addEEnumLiteral(activityResultKindTypeEEnum, ActivityResultKindType.UNAVAILABLEUNITS);
		addEEnumLiteral(activityResultKindTypeEEnum, ActivityResultKindType.UNKNOWN);

		initEEnum(planResultKindTypeEEnum, PlanResultKindType.class, "PlanResultKindType");
		addEEnumLiteral(planResultKindTypeEEnum, PlanResultKindType.OK);
		addEEnumLiteral(planResultKindTypeEEnum, PlanResultKindType.FAILED);
		addEEnumLiteral(planResultKindTypeEEnum, PlanResultKindType.ROLLBACKED);

		// Initialize data types
		initEDataType(activityResultKindTypeObjectEDataType, ActivityResultKindType.class, "ActivityResultKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(planResultKindTypeObjectEDataType, PlanResultKindType.class, "PlanResultKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (activitiesExecutionReportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "activitiesExecutionReport_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActivitiesExecutionReportType_ActivityExecutionReport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activityExecutionReport"
		   });		
		addAnnotation
		  (activityExecReportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActivityExecReportType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActivityExecReportType_ActivityId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activityId"
		   });		
		addAnnotation
		  (getActivityExecReportType_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startTime"
		   });		
		addAnnotation
		  (getActivityExecReportType_EndTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "endTime"
		   });		
		addAnnotation
		  (getActivityExecReportType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getActivityExecReportType_ResultCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resultCode"
		   });		
		addAnnotation
		  (getActivityExecReportType_Result(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result"
		   });		
		addAnnotation
		  (getActivityExecReportType_TechnicalActivityExecReport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "technicalActivityExecReport"
		   });		
		addAnnotation
		  (activityResultKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ActivityResultKindType"
		   });		
		addAnnotation
		  (activityResultKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ActivityResultKindType:Object",
			 "baseType", "ActivityResultKindType"
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
		  (getDocumentRoot_ExecutionReport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "executionReport",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (executionReportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExecutionReportType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExecutionReportType_PlanId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "planId"
		   });		
		addAnnotation
		  (getExecutionReportType_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startTime"
		   });		
		addAnnotation
		  (getExecutionReportType_EndTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "endTime"
		   });		
		addAnnotation
		  (getExecutionReportType_CreationUserId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationUserId"
		   });		
		addAnnotation
		  (getExecutionReportType_LauncherUserId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "launcherUserId"
		   });		
		addAnnotation
		  (getExecutionReportType_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environment"
		   });		
		addAnnotation
		  (getExecutionReportType_TechnicalExecutionReport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "technicalExecutionReport"
		   });		
		addAnnotation
		  (getExecutionReportType_Result(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result"
		   });		
		addAnnotation
		  (getExecutionReportType_Message(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "message"
		   });		
		addAnnotation
		  (getExecutionReportType_ActivitiesExecutionReport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "activitiesExecutionReport"
		   });		
		addAnnotation
		  (planResultKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PlanResultKindType"
		   });		
		addAnnotation
		  (planResultKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PlanResultKindType:Object",
			 "baseType", "PlanResultKindType"
		   });
	}

} //ReportPackageImpl

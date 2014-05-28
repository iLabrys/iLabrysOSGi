/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report;

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
 * @see es.itecban.deployment.model.deployment.plan.report.ReportFactory
 * @model kind="package"
 * @generated
 */
public interface ReportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "report";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/DeploymentPlanReport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "report";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportPackage eINSTANCE = es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivitiesExecutionReportTypeImpl <em>Activities Execution Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ActivitiesExecutionReportTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivitiesExecutionReportType()
	 * @generated
	 */
	int ACTIVITIES_EXECUTION_REPORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Activity Execution Report</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT = 0;

	/**
	 * The number of structural features of the '<em>Activities Execution Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITIES_EXECUTION_REPORT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl <em>Activity Exec Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivityExecReportType()
	 * @generated
	 */
	int ACTIVITY_EXEC_REPORT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE = 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__RESULT = 5;

	/**
	 * The feature id for the '<em><b>Technical Activity Exec Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT = 6;

	/**
	 * The number of structural features of the '<em>Activity Exec Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXEC_REPORT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Execution Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXECUTION_REPORT = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl <em>Execution Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getExecutionReportType()
	 * @generated
	 */
	int EXECUTION_REPORT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Plan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__PLAN_ID = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Creation User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__CREATION_USER_ID = 3;

	/**
	 * The feature id for the '<em><b>Launcher User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Technical Execution Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__RESULT = 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Activities Execution Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT = 9;

	/**
	 * The number of structural features of the '<em>Execution Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REPORT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType <em>Activity Result Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivityResultKindType()
	 * @generated
	 */
	int ACTIVITY_RESULT_KIND_TYPE = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.plan.report.PlanResultKindType <em>Plan Result Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getPlanResultKindType()
	 * @generated
	 */
	int PLAN_RESULT_KIND_TYPE = 5;

	/**
	 * The meta object id for the '<em>Activity Result Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivityResultKindTypeObject()
	 * @generated
	 */
	int ACTIVITY_RESULT_KIND_TYPE_OBJECT = 6;

	/**
	 * The meta object id for the '<em>Plan Result Kind Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
	 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getPlanResultKindTypeObject()
	 * @generated
	 */
	int PLAN_RESULT_KIND_TYPE_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType <em>Activities Execution Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activities Execution Report Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType
	 * @generated
	 */
	EClass getActivitiesExecutionReportType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType#getActivityExecutionReport <em>Activity Execution Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Execution Report</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType#getActivityExecutionReport()
	 * @see #getActivitiesExecutionReportType()
	 * @generated
	 */
	EReference getActivitiesExecutionReportType_ActivityExecutionReport();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType <em>Activity Exec Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Exec Report Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType
	 * @generated
	 */
	EClass getActivityExecReportType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getActivityId <em>Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Id</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getActivityId()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_ActivityId();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getStartTime()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getEndTime()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getDescription()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResultCode <em>Result Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Code</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResultCode()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_ResultCode();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResult()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_Result();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getTechnicalActivityExecReport <em>Technical Activity Exec Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Activity Exec Report</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getTechnicalActivityExecReport()
	 * @see #getActivityExecReportType()
	 * @generated
	 */
	EAttribute getActivityExecReportType_TechnicalActivityExecReport();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.report.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getExecutionReport <em>Execution Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Report</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.DocumentRoot#getExecutionReport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExecutionReport();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType <em>Execution Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Report Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType
	 * @generated
	 */
	EClass getExecutionReportType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getPlanId <em>Plan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Id</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getPlanId()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_PlanId();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getStartTime()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEndTime()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getCreationUserId <em>Creation User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation User Id</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getCreationUserId()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_CreationUserId();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getLauncherUserId <em>Launcher User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launcher User Id</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getLauncherUserId()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_LauncherUserId();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEnvironment()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_Environment();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getTechnicalExecutionReport <em>Technical Execution Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Execution Report</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getTechnicalExecutionReport()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_TechnicalExecutionReport();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getResult()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_Result();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getMessage()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EAttribute getExecutionReportType_Message();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getActivitiesExecutionReport <em>Activities Execution Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activities Execution Report</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getActivitiesExecutionReport()
	 * @see #getExecutionReportType()
	 * @generated
	 */
	EReference getExecutionReportType_ActivitiesExecutionReport();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType <em>Activity Result Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Result Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
	 * @generated
	 */
	EEnum getActivityResultKindType();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.plan.report.PlanResultKindType <em>Plan Result Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Result Kind Type</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
	 * @generated
	 */
	EEnum getPlanResultKindType();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType <em>Activity Result Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Result Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType"
	 *        extendedMetaData="name='ActivityResultKindType:Object' baseType='ActivityResultKindType'"
	 * @generated
	 */
	EDataType getActivityResultKindTypeObject();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.plan.report.PlanResultKindType <em>Plan Result Kind Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plan Result Kind Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
	 * @model instanceClass="es.itecban.deployment.model.deployment.plan.report.PlanResultKindType"
	 *        extendedMetaData="name='PlanResultKindType:Object' baseType='PlanResultKindType'"
	 * @generated
	 */
	EDataType getPlanResultKindTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportFactory getReportFactory();

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
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivitiesExecutionReportTypeImpl <em>Activities Execution Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ActivitiesExecutionReportTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivitiesExecutionReportType()
		 * @generated
		 */
		EClass ACTIVITIES_EXECUTION_REPORT_TYPE = eINSTANCE.getActivitiesExecutionReportType();

		/**
		 * The meta object literal for the '<em><b>Activity Execution Report</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT = eINSTANCE.getActivitiesExecutionReportType_ActivityExecutionReport();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl <em>Activity Exec Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivityExecReportType()
		 * @generated
		 */
		EClass ACTIVITY_EXEC_REPORT_TYPE = eINSTANCE.getActivityExecReportType();

		/**
		 * The meta object literal for the '<em><b>Activity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID = eINSTANCE.getActivityExecReportType_ActivityId();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__START_TIME = eINSTANCE.getActivityExecReportType_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__END_TIME = eINSTANCE.getActivityExecReportType_EndTime();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION = eINSTANCE.getActivityExecReportType_Description();

		/**
		 * The meta object literal for the '<em><b>Result Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE = eINSTANCE.getActivityExecReportType_ResultCode();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__RESULT = eINSTANCE.getActivityExecReportType_Result();

		/**
		 * The meta object literal for the '<em><b>Technical Activity Exec Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT = eINSTANCE.getActivityExecReportType_TechnicalActivityExecReport();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Execution Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXECUTION_REPORT = eINSTANCE.getDocumentRoot_ExecutionReport();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl <em>Execution Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getExecutionReportType()
		 * @generated
		 */
		EClass EXECUTION_REPORT_TYPE = eINSTANCE.getExecutionReportType();

		/**
		 * The meta object literal for the '<em><b>Plan Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__PLAN_ID = eINSTANCE.getExecutionReportType_PlanId();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__START_TIME = eINSTANCE.getExecutionReportType_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__END_TIME = eINSTANCE.getExecutionReportType_EndTime();

		/**
		 * The meta object literal for the '<em><b>Creation User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__CREATION_USER_ID = eINSTANCE.getExecutionReportType_CreationUserId();

		/**
		 * The meta object literal for the '<em><b>Launcher User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID = eINSTANCE.getExecutionReportType_LauncherUserId();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__ENVIRONMENT = eINSTANCE.getExecutionReportType_Environment();

		/**
		 * The meta object literal for the '<em><b>Technical Execution Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT = eINSTANCE.getExecutionReportType_TechnicalExecutionReport();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__RESULT = eINSTANCE.getExecutionReportType_Result();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_REPORT_TYPE__MESSAGE = eINSTANCE.getExecutionReportType_Message();

		/**
		 * The meta object literal for the '<em><b>Activities Execution Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT = eINSTANCE.getExecutionReportType_ActivitiesExecutionReport();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType <em>Activity Result Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivityResultKindType()
		 * @generated
		 */
		EEnum ACTIVITY_RESULT_KIND_TYPE = eINSTANCE.getActivityResultKindType();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.plan.report.PlanResultKindType <em>Plan Result Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getPlanResultKindType()
		 * @generated
		 */
		EEnum PLAN_RESULT_KIND_TYPE = eINSTANCE.getPlanResultKindType();

		/**
		 * The meta object literal for the '<em>Activity Result Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getActivityResultKindTypeObject()
		 * @generated
		 */
		EDataType ACTIVITY_RESULT_KIND_TYPE_OBJECT = eINSTANCE.getActivityResultKindTypeObject();

		/**
		 * The meta object literal for the '<em>Plan Result Kind Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
		 * @see es.itecban.deployment.model.deployment.plan.report.impl.ReportPackageImpl#getPlanResultKindTypeObject()
		 * @generated
		 */
		EDataType PLAN_RESULT_KIND_TYPE_OBJECT = eINSTANCE.getPlanResultKindTypeObject();

	}

} //ReportPackage

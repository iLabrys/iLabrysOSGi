/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report.impl;

import es.itecban.deployment.model.deployment.plan.report.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportFactoryImpl extends EFactoryImpl implements ReportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportFactory init() {
		try {
			ReportFactory theReportFactory = (ReportFactory)EPackage.Registry.INSTANCE.getEFactory("http://model.deployment.itecban.es/DeploymentPlanReport"); 
			if (theReportFactory != null) {
				return theReportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE: return createActivitiesExecutionReportType();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE: return createActivityExecReportType();
			case ReportPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ReportPackage.EXECUTION_REPORT_TYPE: return createExecutionReportType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ReportPackage.ACTIVITY_RESULT_KIND_TYPE:
				return createActivityResultKindTypeFromString(eDataType, initialValue);
			case ReportPackage.PLAN_RESULT_KIND_TYPE:
				return createPlanResultKindTypeFromString(eDataType, initialValue);
			case ReportPackage.ACTIVITY_RESULT_KIND_TYPE_OBJECT:
				return createActivityResultKindTypeObjectFromString(eDataType, initialValue);
			case ReportPackage.PLAN_RESULT_KIND_TYPE_OBJECT:
				return createPlanResultKindTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ReportPackage.ACTIVITY_RESULT_KIND_TYPE:
				return convertActivityResultKindTypeToString(eDataType, instanceValue);
			case ReportPackage.PLAN_RESULT_KIND_TYPE:
				return convertPlanResultKindTypeToString(eDataType, instanceValue);
			case ReportPackage.ACTIVITY_RESULT_KIND_TYPE_OBJECT:
				return convertActivityResultKindTypeObjectToString(eDataType, instanceValue);
			case ReportPackage.PLAN_RESULT_KIND_TYPE_OBJECT:
				return convertPlanResultKindTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesExecutionReportType createActivitiesExecutionReportType() {
		ActivitiesExecutionReportTypeImpl activitiesExecutionReportType = new ActivitiesExecutionReportTypeImpl();
		return activitiesExecutionReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecReportType createActivityExecReportType() {
		ActivityExecReportTypeImpl activityExecReportType = new ActivityExecReportTypeImpl();
		return activityExecReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionReportType createExecutionReportType() {
		ExecutionReportTypeImpl executionReportType = new ExecutionReportTypeImpl();
		return executionReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityResultKindType createActivityResultKindTypeFromString(EDataType eDataType, String initialValue) {
		ActivityResultKindType result = ActivityResultKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityResultKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanResultKindType createPlanResultKindTypeFromString(EDataType eDataType, String initialValue) {
		PlanResultKindType result = PlanResultKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanResultKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityResultKindType createActivityResultKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActivityResultKindTypeFromString(ReportPackage.Literals.ACTIVITY_RESULT_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityResultKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActivityResultKindTypeToString(ReportPackage.Literals.ACTIVITY_RESULT_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanResultKindType createPlanResultKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanResultKindTypeFromString(ReportPackage.Literals.PLAN_RESULT_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanResultKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanResultKindTypeToString(ReportPackage.Literals.PLAN_RESULT_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportPackage getReportPackage() {
		return (ReportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReportPackage getPackage() {
		return ReportPackage.eINSTANCE;
	}

} //ReportFactoryImpl

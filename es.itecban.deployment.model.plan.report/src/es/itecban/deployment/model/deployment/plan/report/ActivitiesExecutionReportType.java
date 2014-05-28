/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activities Execution Report Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType#getActivityExecutionReport <em>Activity Execution Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivitiesExecutionReportType()
 * @model extendedMetaData="name='activitiesExecutionReport_._type' kind='elementOnly'"
 * @generated
 */
public interface ActivitiesExecutionReportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Execution Report</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution Report</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution Report</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivitiesExecutionReportType_ActivityExecutionReport()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activityExecutionReport'"
	 * @generated
	 */
	EList<ActivityExecReportType> getActivityExecutionReport();

} // ActivitiesExecutionReportType

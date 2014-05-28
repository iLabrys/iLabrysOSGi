/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Exec Report Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getActivityId <em>Activity Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResultCode <em>Result Code</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResult <em>Result</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getTechnicalActivityExecReport <em>Technical Activity Exec Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType()
 * @model extendedMetaData="name='ActivityExecReportType' kind='elementOnly'"
 * @generated
 */
public interface ActivityExecReportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Id</em>' attribute.
	 * @see #setActivityId(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_ActivityId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='activityId'"
	 * @generated
	 */
	String getActivityId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getActivityId <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Id</em>' attribute.
	 * @see #getActivityId()
	 * @generated
	 */
	void setActivityId(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(XMLGregorianCalendar)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='startTime'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(XMLGregorianCalendar)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='endTime'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Code</em>' attribute.
	 * @see #setResultCode(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_ResultCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='resultCode'"
	 * @generated
	 */
	String getResultCode();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResultCode <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Code</em>' attribute.
	 * @see #getResultCode()
	 * @generated
	 */
	void setResultCode(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(ActivityResultKindType)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_Result()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='result'"
	 * @generated
	 */
	ActivityResultKindType getResult();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ActivityResultKindType value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(ActivityResultKindType)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getResult <em>Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result</em>' attribute is set.
	 * @see #unsetResult()
	 * @see #getResult()
	 * @see #setResult(ActivityResultKindType)
	 * @generated
	 */
	boolean isSetResult();

	/**
	 * Returns the value of the '<em><b>Technical Activity Exec Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Activity Exec Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Activity Exec Report</em>' attribute.
	 * @see #setTechnicalActivityExecReport(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityExecReportType_TechnicalActivityExecReport()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='technicalActivityExecReport'"
	 * @generated
	 */
	String getTechnicalActivityExecReport();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType#getTechnicalActivityExecReport <em>Technical Activity Exec Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Activity Exec Report</em>' attribute.
	 * @see #getTechnicalActivityExecReport()
	 * @generated
	 */
	void setTechnicalActivityExecReport(String value);

} // ActivityExecReportType

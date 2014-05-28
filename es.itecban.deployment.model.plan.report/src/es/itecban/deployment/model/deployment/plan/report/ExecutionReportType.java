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
 * A representation of the model object '<em><b>Execution Report Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getCreationUserId <em>Creation User Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getLauncherUserId <em>Launcher User Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getTechnicalExecutionReport <em>Technical Execution Report</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getResult <em>Result</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getMessage <em>Message</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getActivitiesExecutionReport <em>Activities Execution Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType()
 * @model extendedMetaData="name='ExecutionReportType' kind='elementOnly'"
 * @generated
 */
public interface ExecutionReportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Id</em>' attribute.
	 * @see #setPlanId(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_PlanId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='planId'"
	 * @generated
	 */
	String getPlanId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getPlanId <em>Plan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Id</em>' attribute.
	 * @see #getPlanId()
	 * @generated
	 */
	void setPlanId(String value);

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
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_StartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='startTime'"
	 * @generated
	 */
	XMLGregorianCalendar getStartTime();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_EndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='endTime'"
	 * @generated
	 */
	XMLGregorianCalendar getEndTime();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Creation User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation User Id</em>' attribute.
	 * @see #setCreationUserId(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_CreationUserId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='creationUserId'"
	 * @generated
	 */
	String getCreationUserId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getCreationUserId <em>Creation User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation User Id</em>' attribute.
	 * @see #getCreationUserId()
	 * @generated
	 */
	void setCreationUserId(String value);

	/**
	 * Returns the value of the '<em><b>Launcher User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launcher User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher User Id</em>' attribute.
	 * @see #setLauncherUserId(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_LauncherUserId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='launcherUserId'"
	 * @generated
	 */
	String getLauncherUserId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getLauncherUserId <em>Launcher User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher User Id</em>' attribute.
	 * @see #getLauncherUserId()
	 * @generated
	 */
	void setLauncherUserId(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_Environment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='environment'"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Technical Execution Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Execution Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Execution Report</em>' attribute.
	 * @see #setTechnicalExecutionReport(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_TechnicalExecutionReport()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='technicalExecutionReport'"
	 * @generated
	 */
	String getTechnicalExecutionReport();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getTechnicalExecutionReport <em>Technical Execution Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Execution Report</em>' attribute.
	 * @see #getTechnicalExecutionReport()
	 * @generated
	 */
	void setTechnicalExecutionReport(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.plan.report.PlanResultKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(PlanResultKindType)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_Result()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='result'"
	 * @generated
	 */
	PlanResultKindType getResult();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.report.PlanResultKindType
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(PlanResultKindType value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(PlanResultKindType)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getResult <em>Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result</em>' attribute is set.
	 * @see #unsetResult()
	 * @see #getResult()
	 * @see #setResult(PlanResultKindType)
	 * @generated
	 */
	boolean isSetResult();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Activities Execution Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities Execution Report</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities Execution Report</em>' containment reference.
	 * @see #setActivitiesExecutionReport(ActivitiesExecutionReportType)
	 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getExecutionReportType_ActivitiesExecutionReport()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activitiesExecutionReport'"
	 * @generated
	 */
	ActivitiesExecutionReportType getActivitiesExecutionReport();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.report.ExecutionReportType#getActivitiesExecutionReport <em>Activities Execution Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activities Execution Report</em>' containment reference.
	 * @see #getActivitiesExecutionReport()
	 * @generated
	 */
	void setActivitiesExecutionReport(ActivitiesExecutionReportType value);

} // ExecutionReportType

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report.impl;

import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ReportPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Exec Report Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getActivityId <em>Activity Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getResultCode <em>Result Code</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivityExecReportTypeImpl#getTechnicalActivityExecReport <em>Technical Activity Exec Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityExecReportTypeImpl extends EObjectImpl implements ActivityExecReportType {
	/**
	 * The default value of the '{@link #getActivityId() <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityId() <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityId()
	 * @generated
	 * @ordered
	 */
	protected String activityId = ACTIVITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultCode() <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultCode() <em>Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCode()
	 * @generated
	 * @ordered
	 */
	protected String resultCode = RESULT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityResultKindType RESULT_EDEFAULT = ActivityResultKindType.OK;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected ActivityResultKindType result = RESULT_EDEFAULT;

	/**
	 * This is true if the Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultESet;

	/**
	 * The default value of the '{@link #getTechnicalActivityExecReport() <em>Technical Activity Exec Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalActivityExecReport()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_ACTIVITY_EXEC_REPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalActivityExecReport() <em>Technical Activity Exec Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalActivityExecReport()
	 * @generated
	 * @ordered
	 */
	protected String technicalActivityExecReport = TECHNICAL_ACTIVITY_EXEC_REPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExecReportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.ACTIVITY_EXEC_REPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityId() {
		return activityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityId(String newActivityId) {
		String oldActivityId = activityId;
		activityId = newActivityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID, oldActivityId, activityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(XMLGregorianCalendar newEndTime) {
		XMLGregorianCalendar oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultCode() {
		return resultCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultCode(String newResultCode) {
		String oldResultCode = resultCode;
		resultCode = newResultCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE, oldResultCode, resultCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityResultKindType getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(ActivityResultKindType newResult) {
		ActivityResultKindType oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		boolean oldResultESet = resultESet;
		resultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT, oldResult, result, !oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResult() {
		ActivityResultKindType oldResult = result;
		boolean oldResultESet = resultESet;
		result = RESULT_EDEFAULT;
		resultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT, oldResult, RESULT_EDEFAULT, oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResult() {
		return resultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalActivityExecReport() {
		return technicalActivityExecReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalActivityExecReport(String newTechnicalActivityExecReport) {
		String oldTechnicalActivityExecReport = technicalActivityExecReport;
		technicalActivityExecReport = newTechnicalActivityExecReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT, oldTechnicalActivityExecReport, technicalActivityExecReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID:
				return getActivityId();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__START_TIME:
				return getStartTime();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__END_TIME:
				return getEndTime();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION:
				return getDescription();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE:
				return getResultCode();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT:
				return getResult();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT:
				return getTechnicalActivityExecReport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID:
				setActivityId((String)newValue);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE:
				setResultCode((String)newValue);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT:
				setResult((ActivityResultKindType)newValue);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT:
				setTechnicalActivityExecReport((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID:
				setActivityId(ACTIVITY_ID_EDEFAULT);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE:
				setResultCode(RESULT_CODE_EDEFAULT);
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT:
				unsetResult();
				return;
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT:
				setTechnicalActivityExecReport(TECHNICAL_ACTIVITY_EXEC_REPORT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__ACTIVITY_ID:
				return ACTIVITY_ID_EDEFAULT == null ? activityId != null : !ACTIVITY_ID_EDEFAULT.equals(activityId);
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT_CODE:
				return RESULT_CODE_EDEFAULT == null ? resultCode != null : !RESULT_CODE_EDEFAULT.equals(resultCode);
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__RESULT:
				return isSetResult();
			case ReportPackage.ACTIVITY_EXEC_REPORT_TYPE__TECHNICAL_ACTIVITY_EXEC_REPORT:
				return TECHNICAL_ACTIVITY_EXEC_REPORT_EDEFAULT == null ? technicalActivityExecReport != null : !TECHNICAL_ACTIVITY_EXEC_REPORT_EDEFAULT.equals(technicalActivityExecReport);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (activityId: ");
		result.append(activityId);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", description: ");
		result.append(description);
		result.append(", resultCode: ");
		result.append(resultCode);
		result.append(", result: ");
		if (resultESet) result.append(result); else result.append("<unset>");
		result.append(", technicalActivityExecReport: ");
		result.append(technicalActivityExecReport);
		result.append(')');
		return result.toString();
	}

} //ActivityExecReportTypeImpl

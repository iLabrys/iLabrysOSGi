/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report.impl;

import es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.PlanResultKindType;
import es.itecban.deployment.model.deployment.plan.report.ReportPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Report Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getCreationUserId <em>Creation User Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getLauncherUserId <em>Launcher User Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getTechnicalExecutionReport <em>Technical Execution Report</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ExecutionReportTypeImpl#getActivitiesExecutionReport <em>Activities Execution Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionReportTypeImpl extends EObjectImpl implements ExecutionReportType {
	/**
	 * The default value of the '{@link #getPlanId() <em>Plan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanId() <em>Plan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanId()
	 * @generated
	 * @ordered
	 */
	protected String planId = PLAN_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCreationUserId() <em>Creation User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationUserId() <em>Creation User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationUserId()
	 * @generated
	 * @ordered
	 */
	protected String creationUserId = CREATION_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLauncherUserId() <em>Launcher User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncherUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCHER_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLauncherUserId() <em>Launcher User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncherUserId()
	 * @generated
	 * @ordered
	 */
	protected String launcherUserId = LAUNCHER_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnicalExecutionReport() <em>Technical Execution Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalExecutionReport()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_EXECUTION_REPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalExecutionReport() <em>Technical Execution Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalExecutionReport()
	 * @generated
	 * @ordered
	 */
	protected String technicalExecutionReport = TECHNICAL_EXECUTION_REPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final PlanResultKindType RESULT_EDEFAULT = PlanResultKindType.OK;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected PlanResultKindType result = RESULT_EDEFAULT;

	/**
	 * This is true if the Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultESet;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivitiesExecutionReport() <em>Activities Execution Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitiesExecutionReport()
	 * @generated
	 * @ordered
	 */
	protected ActivitiesExecutionReportType activitiesExecutionReport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionReportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.EXECUTION_REPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanId() {
		return planId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanId(String newPlanId) {
		String oldPlanId = planId;
		planId = newPlanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__PLAN_ID, oldPlanId, planId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__START_TIME, oldStartTime, startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationUserId() {
		return creationUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationUserId(String newCreationUserId) {
		String oldCreationUserId = creationUserId;
		creationUserId = newCreationUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__CREATION_USER_ID, oldCreationUserId, creationUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLauncherUserId() {
		return launcherUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLauncherUserId(String newLauncherUserId) {
		String oldLauncherUserId = launcherUserId;
		launcherUserId = newLauncherUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID, oldLauncherUserId, launcherUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnicalExecutionReport() {
		return technicalExecutionReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnicalExecutionReport(String newTechnicalExecutionReport) {
		String oldTechnicalExecutionReport = technicalExecutionReport;
		technicalExecutionReport = newTechnicalExecutionReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT, oldTechnicalExecutionReport, technicalExecutionReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanResultKindType getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(PlanResultKindType newResult) {
		PlanResultKindType oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		boolean oldResultESet = resultESet;
		resultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__RESULT, oldResult, result, !oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResult() {
		PlanResultKindType oldResult = result;
		boolean oldResultESet = resultESet;
		result = RESULT_EDEFAULT;
		resultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReportPackage.EXECUTION_REPORT_TYPE__RESULT, oldResult, RESULT_EDEFAULT, oldResultESet));
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
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesExecutionReportType getActivitiesExecutionReport() {
		return activitiesExecutionReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitiesExecutionReport(ActivitiesExecutionReportType newActivitiesExecutionReport, NotificationChain msgs) {
		ActivitiesExecutionReportType oldActivitiesExecutionReport = activitiesExecutionReport;
		activitiesExecutionReport = newActivitiesExecutionReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT, oldActivitiesExecutionReport, newActivitiesExecutionReport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitiesExecutionReport(ActivitiesExecutionReportType newActivitiesExecutionReport) {
		if (newActivitiesExecutionReport != activitiesExecutionReport) {
			NotificationChain msgs = null;
			if (activitiesExecutionReport != null)
				msgs = ((InternalEObject)activitiesExecutionReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT, null, msgs);
			if (newActivitiesExecutionReport != null)
				msgs = ((InternalEObject)newActivitiesExecutionReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT, null, msgs);
			msgs = basicSetActivitiesExecutionReport(newActivitiesExecutionReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT, newActivitiesExecutionReport, newActivitiesExecutionReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT:
				return basicSetActivitiesExecutionReport(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.EXECUTION_REPORT_TYPE__PLAN_ID:
				return getPlanId();
			case ReportPackage.EXECUTION_REPORT_TYPE__START_TIME:
				return getStartTime();
			case ReportPackage.EXECUTION_REPORT_TYPE__END_TIME:
				return getEndTime();
			case ReportPackage.EXECUTION_REPORT_TYPE__CREATION_USER_ID:
				return getCreationUserId();
			case ReportPackage.EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID:
				return getLauncherUserId();
			case ReportPackage.EXECUTION_REPORT_TYPE__ENVIRONMENT:
				return getEnvironment();
			case ReportPackage.EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT:
				return getTechnicalExecutionReport();
			case ReportPackage.EXECUTION_REPORT_TYPE__RESULT:
				return getResult();
			case ReportPackage.EXECUTION_REPORT_TYPE__MESSAGE:
				return getMessage();
			case ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT:
				return getActivitiesExecutionReport();
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
			case ReportPackage.EXECUTION_REPORT_TYPE__PLAN_ID:
				setPlanId((String)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__CREATION_USER_ID:
				setCreationUserId((String)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID:
				setLauncherUserId((String)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT:
				setTechnicalExecutionReport((String)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__RESULT:
				setResult((PlanResultKindType)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__MESSAGE:
				setMessage((String)newValue);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT:
				setActivitiesExecutionReport((ActivitiesExecutionReportType)newValue);
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
			case ReportPackage.EXECUTION_REPORT_TYPE__PLAN_ID:
				setPlanId(PLAN_ID_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__CREATION_USER_ID:
				setCreationUserId(CREATION_USER_ID_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID:
				setLauncherUserId(LAUNCHER_USER_ID_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT:
				setTechnicalExecutionReport(TECHNICAL_EXECUTION_REPORT_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__RESULT:
				unsetResult();
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT:
				setActivitiesExecutionReport((ActivitiesExecutionReportType)null);
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
			case ReportPackage.EXECUTION_REPORT_TYPE__PLAN_ID:
				return PLAN_ID_EDEFAULT == null ? planId != null : !PLAN_ID_EDEFAULT.equals(planId);
			case ReportPackage.EXECUTION_REPORT_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case ReportPackage.EXECUTION_REPORT_TYPE__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case ReportPackage.EXECUTION_REPORT_TYPE__CREATION_USER_ID:
				return CREATION_USER_ID_EDEFAULT == null ? creationUserId != null : !CREATION_USER_ID_EDEFAULT.equals(creationUserId);
			case ReportPackage.EXECUTION_REPORT_TYPE__LAUNCHER_USER_ID:
				return LAUNCHER_USER_ID_EDEFAULT == null ? launcherUserId != null : !LAUNCHER_USER_ID_EDEFAULT.equals(launcherUserId);
			case ReportPackage.EXECUTION_REPORT_TYPE__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case ReportPackage.EXECUTION_REPORT_TYPE__TECHNICAL_EXECUTION_REPORT:
				return TECHNICAL_EXECUTION_REPORT_EDEFAULT == null ? technicalExecutionReport != null : !TECHNICAL_EXECUTION_REPORT_EDEFAULT.equals(technicalExecutionReport);
			case ReportPackage.EXECUTION_REPORT_TYPE__RESULT:
				return isSetResult();
			case ReportPackage.EXECUTION_REPORT_TYPE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case ReportPackage.EXECUTION_REPORT_TYPE__ACTIVITIES_EXECUTION_REPORT:
				return activitiesExecutionReport != null;
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
		result.append(" (planId: ");
		result.append(planId);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", creationUserId: ");
		result.append(creationUserId);
		result.append(", launcherUserId: ");
		result.append(launcherUserId);
		result.append(", environment: ");
		result.append(environment);
		result.append(", technicalExecutionReport: ");
		result.append(technicalExecutionReport);
		result.append(", result: ");
		if (resultESet) result.append(result); else result.append("<unset>");
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //ExecutionReportTypeImpl

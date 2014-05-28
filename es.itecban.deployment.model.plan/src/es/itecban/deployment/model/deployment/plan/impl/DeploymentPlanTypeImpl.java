/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.ActivitiesType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.PlanPackage;
import es.itecban.deployment.model.deployment.plan.ScheduleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Plan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl#getScheduleData <em>Schedule Data</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentPlanTypeImpl#getPlanStatus <em>Plan Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentPlanTypeImpl extends EObjectImpl implements DeploymentPlanType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected ActivitiesType activities;

	/**
	 * The cached value of the '{@link #getScheduleData() <em>Schedule Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleData()
	 * @generated
	 * @ordered
	 */
	protected ScheduleType scheduleData;

	/**
	 * The default value of the '{@link #getPlanStatus() <em>Plan Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanStatus() <em>Plan Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanStatus()
	 * @generated
	 * @ordered
	 */
	protected String planStatus = PLAN_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentPlanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanPackage.Literals.DEPLOYMENT_PLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesType getActivities() {
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivities(ActivitiesType newActivities, NotificationChain msgs) {
		ActivitiesType oldActivities = activities;
		activities = newActivities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES, oldActivities, newActivities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivities(ActivitiesType newActivities) {
		if (newActivities != activities) {
			NotificationChain msgs = null;
			if (activities != null)
				msgs = ((InternalEObject)activities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES, null, msgs);
			if (newActivities != null)
				msgs = ((InternalEObject)newActivities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES, null, msgs);
			msgs = basicSetActivities(newActivities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES, newActivities, newActivities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType getScheduleData() {
		return scheduleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleData(ScheduleType newScheduleData, NotificationChain msgs) {
		ScheduleType oldScheduleData = scheduleData;
		scheduleData = newScheduleData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA, oldScheduleData, newScheduleData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleData(ScheduleType newScheduleData) {
		if (newScheduleData != scheduleData) {
			NotificationChain msgs = null;
			if (scheduleData != null)
				msgs = ((InternalEObject)scheduleData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA, null, msgs);
			if (newScheduleData != null)
				msgs = ((InternalEObject)newScheduleData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA, null, msgs);
			msgs = basicSetScheduleData(newScheduleData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA, newScheduleData, newScheduleData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanStatus() {
		return planStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanStatus(String newPlanStatus) {
		String oldPlanStatus = planStatus;
		planStatus = newPlanStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_PLAN_TYPE__PLAN_STATUS, oldPlanStatus, planStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES:
				return basicSetActivities(null, msgs);
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA:
				return basicSetScheduleData(null, msgs);
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
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__NAME:
				return getName();
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ENVIRONMENT:
				return getEnvironment();
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES:
				return getActivities();
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA:
				return getScheduleData();
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__PLAN_STATUS:
				return getPlanStatus();
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
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__NAME:
				setName((String)newValue);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES:
				setActivities((ActivitiesType)newValue);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA:
				setScheduleData((ScheduleType)newValue);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__PLAN_STATUS:
				setPlanStatus((String)newValue);
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
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES:
				setActivities((ActivitiesType)null);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA:
				setScheduleData((ScheduleType)null);
				return;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__PLAN_STATUS:
				setPlanStatus(PLAN_STATUS_EDEFAULT);
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
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__ACTIVITIES:
				return activities != null;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__SCHEDULE_DATA:
				return scheduleData != null;
			case PlanPackage.DEPLOYMENT_PLAN_TYPE__PLAN_STATUS:
				return PLAN_STATUS_EDEFAULT == null ? planStatus != null : !PLAN_STATUS_EDEFAULT.equals(planStatus);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", environment: ");
		result.append(environment);
		result.append(", planStatus: ");
		result.append(planStatus);
		result.append(')');
		return result.toString();
	}

} //DeploymentPlanTypeImpl

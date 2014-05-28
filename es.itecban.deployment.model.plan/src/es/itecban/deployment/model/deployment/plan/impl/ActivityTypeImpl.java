/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.PlanPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl#getActivityId <em>Activity Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ActivityTypeImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityTypeImpl extends EObjectImpl implements ActivityType {
	/**
	 * The default value of the '{@link #getActivityId() <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityId()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVITY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActivityId() <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityId()
	 * @generated
	 * @ordered
	 */
	protected int activityId = ACTIVITY_ID_EDEFAULT;

	/**
	 * This is true if the Activity Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityIdESet;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanPackage.Literals.ACTIVITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActivityId() {
		return activityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityId(int newActivityId) {
		int oldActivityId = activityId;
		activityId = newActivityId;
		boolean oldActivityIdESet = activityIdESet;
		activityIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY_TYPE__ACTIVITY_ID, oldActivityId, activityId, !oldActivityIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivityId() {
		int oldActivityId = activityId;
		boolean oldActivityIdESet = activityIdESet;
		activityId = ACTIVITY_ID_EDEFAULT;
		activityIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanPackage.ACTIVITY_TYPE__ACTIVITY_ID, oldActivityId, ACTIVITY_ID_EDEFAULT, oldActivityIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivityId() {
		return activityIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDependency() {
		if (dependency == null) {
			dependency = new EDataTypeEList<Integer>(Integer.class, this, PlanPackage.ACTIVITY_TYPE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanPackage.ACTIVITY_TYPE__ACTIVITY_ID:
				return new Integer(getActivityId());
			case PlanPackage.ACTIVITY_TYPE__TARGET:
				return getTarget();
			case PlanPackage.ACTIVITY_TYPE__DEPENDENCY:
				return getDependency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlanPackage.ACTIVITY_TYPE__ACTIVITY_ID:
				setActivityId(((Integer)newValue).intValue());
				return;
			case PlanPackage.ACTIVITY_TYPE__TARGET:
				setTarget((String)newValue);
				return;
			case PlanPackage.ACTIVITY_TYPE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Integer>)newValue);
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
			case PlanPackage.ACTIVITY_TYPE__ACTIVITY_ID:
				unsetActivityId();
				return;
			case PlanPackage.ACTIVITY_TYPE__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case PlanPackage.ACTIVITY_TYPE__DEPENDENCY:
				getDependency().clear();
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
			case PlanPackage.ACTIVITY_TYPE__ACTIVITY_ID:
				return isSetActivityId();
			case PlanPackage.ACTIVITY_TYPE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case PlanPackage.ACTIVITY_TYPE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
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
		if (activityIdESet) result.append(activityId); else result.append("<unset>");
		result.append(", target: ");
		result.append(target);
		result.append(", dependency: ");
		result.append(dependency);
		result.append(')');
		return result.toString();
	}

} //ActivityTypeImpl

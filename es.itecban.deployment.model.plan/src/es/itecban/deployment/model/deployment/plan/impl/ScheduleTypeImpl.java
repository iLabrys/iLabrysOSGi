/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.PlanPackage;
import es.itecban.deployment.model.deployment.plan.ScheduleType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl#getScheduledLaunchDate <em>Scheduled Launch Date</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.ScheduleTypeImpl#getLastModificationDate <em>Last Modification Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleTypeImpl extends EObjectImpl implements ScheduleType {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduledLaunchDate() <em>Scheduled Launch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledLaunchDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SCHEDULED_LAUNCH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledLaunchDate() <em>Scheduled Launch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledLaunchDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar scheduledLaunchDate = SCHEDULED_LAUNCH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModificationDate() <em>Last Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModificationDate() <em>Last Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModificationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastModificationDate = LAST_MODIFICATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanPackage.Literals.SCHEDULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.SCHEDULE_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getScheduledLaunchDate() {
		return scheduledLaunchDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledLaunchDate(XMLGregorianCalendar newScheduledLaunchDate) {
		XMLGregorianCalendar oldScheduledLaunchDate = scheduledLaunchDate;
		scheduledLaunchDate = newScheduledLaunchDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE, oldScheduledLaunchDate, scheduledLaunchDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastModificationDate() {
		return lastModificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModificationDate(XMLGregorianCalendar newLastModificationDate) {
		XMLGregorianCalendar oldLastModificationDate = lastModificationDate;
		lastModificationDate = newLastModificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.SCHEDULE_TYPE__LAST_MODIFICATION_DATE, oldLastModificationDate, lastModificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanPackage.SCHEDULE_TYPE__CREATION_DATE:
				return getCreationDate();
			case PlanPackage.SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE:
				return getScheduledLaunchDate();
			case PlanPackage.SCHEDULE_TYPE__LAST_MODIFICATION_DATE:
				return getLastModificationDate();
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
			case PlanPackage.SCHEDULE_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case PlanPackage.SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE:
				setScheduledLaunchDate((XMLGregorianCalendar)newValue);
				return;
			case PlanPackage.SCHEDULE_TYPE__LAST_MODIFICATION_DATE:
				setLastModificationDate((XMLGregorianCalendar)newValue);
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
			case PlanPackage.SCHEDULE_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case PlanPackage.SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE:
				setScheduledLaunchDate(SCHEDULED_LAUNCH_DATE_EDEFAULT);
				return;
			case PlanPackage.SCHEDULE_TYPE__LAST_MODIFICATION_DATE:
				setLastModificationDate(LAST_MODIFICATION_DATE_EDEFAULT);
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
			case PlanPackage.SCHEDULE_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case PlanPackage.SCHEDULE_TYPE__SCHEDULED_LAUNCH_DATE:
				return SCHEDULED_LAUNCH_DATE_EDEFAULT == null ? scheduledLaunchDate != null : !SCHEDULED_LAUNCH_DATE_EDEFAULT.equals(scheduledLaunchDate);
			case PlanPackage.SCHEDULE_TYPE__LAST_MODIFICATION_DATE:
				return LAST_MODIFICATION_DATE_EDEFAULT == null ? lastModificationDate != null : !LAST_MODIFICATION_DATE_EDEFAULT.equals(lastModificationDate);
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", scheduledLaunchDate: ");
		result.append(scheduledLaunchDate);
		result.append(", lastModificationDate: ");
		result.append(lastModificationDate);
		result.append(')');
		return result.toString();
	}

} //ScheduleTypeImpl

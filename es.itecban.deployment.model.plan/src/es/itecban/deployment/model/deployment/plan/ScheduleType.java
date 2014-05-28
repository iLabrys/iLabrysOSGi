/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getScheduledLaunchDate <em>Scheduled Launch Date</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getLastModificationDate <em>Last Modification Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getScheduleType()
 * @model extendedMetaData="name='ScheduleType' kind='elementOnly'"
 * @generated
 */
public interface ScheduleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getScheduleType_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='creationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Scheduled Launch Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Launch Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Launch Date</em>' attribute.
	 * @see #setScheduledLaunchDate(XMLGregorianCalendar)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getScheduleType_ScheduledLaunchDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='scheduledLaunchDate'"
	 * @generated
	 */
	XMLGregorianCalendar getScheduledLaunchDate();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getScheduledLaunchDate <em>Scheduled Launch Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Launch Date</em>' attribute.
	 * @see #getScheduledLaunchDate()
	 * @generated
	 */
	void setScheduledLaunchDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modification Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modification Date</em>' attribute.
	 * @see #setLastModificationDate(XMLGregorianCalendar)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getScheduleType_LastModificationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='lastModificationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastModificationDate();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ScheduleType#getLastModificationDate <em>Last Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modification Date</em>' attribute.
	 * @see #getLastModificationDate()
	 * @generated
	 */
	void setLastModificationDate(XMLGregorianCalendar value);

} // ScheduleType

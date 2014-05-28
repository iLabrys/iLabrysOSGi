/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ActivityType#getActivityId <em>Activity Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ActivityType#getTarget <em>Target</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ActivityType#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivityType()
 * @model abstract="true"
 *        extendedMetaData="name='ActivityType' kind='elementOnly'"
 * @generated
 */
public interface ActivityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Id</em>' attribute.
	 * @see #isSetActivityId()
	 * @see #unsetActivityId()
	 * @see #setActivityId(int)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivityType_ActivityId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='activityId'"
	 * @generated
	 */
	int getActivityId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getActivityId <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Id</em>' attribute.
	 * @see #isSetActivityId()
	 * @see #unsetActivityId()
	 * @see #getActivityId()
	 * @generated
	 */
	void setActivityId(int value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getActivityId <em>Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivityId()
	 * @see #getActivityId()
	 * @see #setActivityId(int)
	 * @generated
	 */
	void unsetActivityId();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getActivityId <em>Activity Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activity Id</em>' attribute is set.
	 * @see #unsetActivityId()
	 * @see #getActivityId()
	 * @see #setActivityId(int)
	 * @generated
	 */
	boolean isSetActivityId();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivityType_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ActivityType#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute list.
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivityType_Dependency()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='dependency'"
	 * @generated
	 */
	EList<Integer> getDependency();

} // ActivityType

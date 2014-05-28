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
 * A representation of the model object '<em><b>Activities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ActivitiesType#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivitiesType()
 * @model extendedMetaData="name='activities_._type' kind='elementOnly'"
 * @generated
 */
public interface ActivitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.plan.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivitiesType_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

} // ActivitiesType

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
 * A representation of the model object '<em><b>Initial Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.InitialConfigurationType#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getInitialConfigurationType()
 * @model extendedMetaData="name='initialConfiguration_._type' kind='elementOnly'"
 * @generated
 */
public interface InitialConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 											Collection of resource
	 * 											configurations to be applied
	 * 											to the unit
	 * 										
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getInitialConfigurationType_Configuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configuration'"
	 * @generated
	 */
	EList<ResourceConfigurationType> getConfiguration();

} // InitialConfigurationType

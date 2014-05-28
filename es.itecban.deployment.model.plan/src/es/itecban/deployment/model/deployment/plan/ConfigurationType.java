/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import es.itecban.deployment.model.deployment.unit.PropertyType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ConfigurationType#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationType()
 * @model extendedMetaData="name='configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationType_Property()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='property'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

} // ConfigurationType

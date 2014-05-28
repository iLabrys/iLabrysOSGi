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
 * A representation of the model object '<em><b>Configuration Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationPropertiesType()
 * @model extendedMetaData="name='configurationProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Properties</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationPropertiesType_ConfigurationProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configurationProperties'"
	 * @generated
	 */
	EList<PropertyType> getConfigurationProperties();

} // ConfigurationPropertiesType

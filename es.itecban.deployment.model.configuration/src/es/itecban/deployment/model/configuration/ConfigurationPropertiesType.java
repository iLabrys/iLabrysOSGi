/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.ConfigurationPropertiesType#getEnvironmentProperties <em>Environment Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationPropertiesType()
 * @model extendedMetaData="name='configurationProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment Properties</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.configuration.EnvironmentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Properties</em>' containment reference list.
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationPropertiesType_EnvironmentProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentProperties'"
	 * @generated
	 */
	EList<EnvironmentPropertyType> getEnvironmentProperties();

} // ConfigurationPropertiesType

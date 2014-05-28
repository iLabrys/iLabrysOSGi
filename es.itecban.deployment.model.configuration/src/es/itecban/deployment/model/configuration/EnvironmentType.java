/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentType#getContainers <em>Containers</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentType#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentType()
 * @model extendedMetaData="name='EnvironmentType' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference.
	 * @see #setContainers(ContainersType)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentType_Containers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containers'"
	 * @generated
	 */
	ContainersType getContainers();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentType#getContainers <em>Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containers</em>' containment reference.
	 * @see #getContainers()
	 * @generated
	 */
	void setContainers(ContainersType value);

	/**
	 * Returns the value of the '<em><b>Configuration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Properties</em>' containment reference.
	 * @see #setConfigurationProperties(ConfigurationPropertiesType)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentType_ConfigurationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurationProperties'"
	 * @generated
	 */
	ConfigurationPropertiesType getConfigurationProperties();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentType#getConfigurationProperties <em>Configuration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Properties</em>' containment reference.
	 * @see #getConfigurationProperties()
	 * @generated
	 */
	void setConfigurationProperties(ConfigurationPropertiesType value);

} // EnvironmentType

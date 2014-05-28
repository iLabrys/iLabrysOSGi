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
 * A representation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.ConfigurationContainerType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.ConfigurationContainerType#getConfigurationFiles <em>Configuration Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationContainerType()
 * @model extendedMetaData="name='ConfigurationContainerType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationContainerType extends EObject {
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
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationContainerType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.ConfigurationContainerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Files</em>' containment reference.
	 * @see #setConfigurationFiles(ConfigurationFilesType)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationContainerType_ConfigurationFiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurationFiles'"
	 * @generated
	 */
	ConfigurationFilesType getConfigurationFiles();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.ConfigurationContainerType#getConfigurationFiles <em>Configuration Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Files</em>' containment reference.
	 * @see #getConfigurationFiles()
	 * @generated
	 */
	void setConfigurationFiles(ConfigurationFilesType value);

} // ConfigurationContainerType

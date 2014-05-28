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
 * A representation of the model object '<em><b>Files Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.ConfigurationFilesType#getConfigurationFile <em>Configuration File</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationFilesType()
 * @model extendedMetaData="name='configurationFiles_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationFilesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration File</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.configuration.ConfigurationFileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration File</em>' containment reference list.
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationFilesType_ConfigurationFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurationFile'"
	 * @generated
	 */
	EList<ConfigurationFileType> getConfigurationFile();

} // ConfigurationFilesType

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
 * A representation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.ConfigurationFileType#getFileName <em>File Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.ConfigurationFileType#getConfigFile <em>Config File</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationFileType()
 * @model extendedMetaData="name='ConfigurationFileType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationFileType extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationFileType_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='fileName'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.ConfigurationFileType#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config File</em>' attribute.
	 * @see #setConfigFile(byte[])
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getConfigurationFileType_ConfigFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
	 *        annotation="teneo.jpa appinfo='\r\n    \t\t\t\t\t@Lob\r\n    \t\t\t\t\t@Column(length=1048576)\r\n    \t\t\t\t'"
	 *        extendedMetaData="kind='element' name='configFile'"
	 * @generated
	 */
	byte[] getConfigFile();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.ConfigurationFileType#getConfigFile <em>Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config File</em>' attribute.
	 * @see #getConfigFile()
	 * @generated
	 */
	void setConfigFile(byte[] value);

} // ConfigurationFileType

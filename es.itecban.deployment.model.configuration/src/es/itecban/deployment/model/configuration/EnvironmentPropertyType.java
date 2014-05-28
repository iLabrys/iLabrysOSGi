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
 * A representation of the model object '<em><b>Environment Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getKey <em>Key</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getValue <em>Value</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentPropertyType()
 * @model extendedMetaData="name='EnvironmentPropertyType' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentPropertyType_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentPropertyType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentPropertyType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.configuration.IsMandatory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see es.itecban.deployment.model.configuration.IsMandatory
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #setMandatory(IsMandatory)
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getEnvironmentPropertyType_Mandatory()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='mandatory'"
	 * @generated
	 */
	IsMandatory getMandatory();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see es.itecban.deployment.model.configuration.IsMandatory
	 * @see #isSetMandatory()
	 * @see #unsetMandatory()
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(IsMandatory value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMandatory()
	 * @see #getMandatory()
	 * @see #setMandatory(IsMandatory)
	 * @generated
	 */
	void unsetMandatory();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.configuration.EnvironmentPropertyType#getMandatory <em>Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mandatory</em>' attribute is set.
	 * @see #unsetMandatory()
	 * @see #getMandatory()
	 * @see #setMandatory(IsMandatory)
	 * @generated
	 */
	boolean isSetMandatory();

} // EnvironmentPropertyType

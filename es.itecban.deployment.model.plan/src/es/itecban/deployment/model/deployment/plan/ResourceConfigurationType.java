/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 			ResourceConfigurationType elemeents include the initial configuration of one resource of the 
 * 			selected unit (identified by the resource name)
 * 	
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceConfigurationType()
 * @model extendedMetaData="name='ResourceConfigurationType' kind='elementOnly'"
 * @generated
 */
public interface ResourceConfigurationType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceConfigurationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceConfigurationType_ConfigurationProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configurationProperties'"
	 * @generated
	 */
	ConfigurationPropertiesType getConfigurationProperties();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType#getConfigurationProperties <em>Configuration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Properties</em>' containment reference.
	 * @see #getConfigurationProperties()
	 * @generated
	 */
	void setConfigurationProperties(ConfigurationPropertiesType value);

} // ResourceConfigurationType

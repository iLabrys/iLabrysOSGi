/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getType <em>Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationActivityType()
 * @model extendedMetaData="name='ConfigurationActivityType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationActivityType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ConfigurationActivityKindType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationActivityType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	ConfigurationActivityKindType getType();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ConfigurationActivityKindType value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ConfigurationActivityKindType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ConfigurationActivityKindType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationActivityType_Configuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configuration'"
	 * @generated
	 */
	ConfigurationType getConfiguration();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType value);

} // ConfigurationActivityType

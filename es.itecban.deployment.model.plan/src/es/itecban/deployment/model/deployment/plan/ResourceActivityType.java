/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import es.itecban.deployment.model.deployment.unit.ResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getType <em>Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceActivityType()
 * @model extendedMetaData="name='ResourceActivityType' kind='elementOnly'"
 * @generated
 */
public interface ResourceActivityType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.plan.ResourceActivityKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ResourceActivityKindType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceActivityType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	ResourceActivityKindType getType();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityKindType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceActivityKindType value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ResourceActivityKindType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ResourceActivityKindType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceActivityType_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource'"
	 * @generated
	 */
	ResourceType getResource();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceType value);

} // ResourceActivityType

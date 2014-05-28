/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Resource Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getValue <em>Value</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourcePropertyType()
 * @model extendedMetaData="name='RequiredResourcePropertyType' kind='elementOnly'"
 * @generated
 */
public interface RequiredResourcePropertyType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourcePropertyType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourcePropertyType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.unit.PropertyKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @see #setKind(PropertyKindType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourcePropertyType_Kind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='kind'"
	 * @generated
	 */
	PropertyKindType getKind();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PropertyKindType value);

} // RequiredResourcePropertyType

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Resource Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourcePropertiesType()
 * @model extendedMetaData="name='requiredResourceProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface RequiredResourcePropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourcePropertiesType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property'"
	 * @generated
	 */
	List<RequiredResourcePropertyType> getProperty();

} // RequiredResourcePropertiesType

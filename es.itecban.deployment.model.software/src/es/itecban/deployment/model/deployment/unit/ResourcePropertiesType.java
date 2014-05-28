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
 * A representation of the model object '<em><b>Resource Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ResourcePropertiesType#getResourceProperty <em>Resource Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourcePropertiesType()
 * @model extendedMetaData="name='resourceProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface ResourcePropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Property</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Property</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourcePropertiesType_ResourceProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceProperty'"
	 * @generated
	 */
	List<PropertyType> getResourceProperty();

} // ResourcePropertiesType

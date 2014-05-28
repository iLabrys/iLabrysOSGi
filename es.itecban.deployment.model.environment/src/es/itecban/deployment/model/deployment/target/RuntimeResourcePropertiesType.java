/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import es.itecban.deployment.model.deployment.unit.PropertyType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Resource Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType#getResourceProperty <em>Resource Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeResourcePropertiesType()
 * @model extendedMetaData="name='runtimeResourceProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface RuntimeResourcePropertiesType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeResourcePropertiesType_ResourceProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceProperty'"
	 * @generated
	 */
	EList<PropertyType> getResourceProperty();

} // RuntimeResourcePropertiesType

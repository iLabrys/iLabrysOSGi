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
 * A representation of the model object '<em><b>Container Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerPropertiesType#getContainerProperty <em>Container Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerPropertiesType()
 * @model extendedMetaData="name='containerProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainerPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Property</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Property</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerPropertiesType_ContainerProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerProperty'"
	 * @generated
	 */
	EList<PropertyType> getContainerProperty();

} // ContainerPropertiesType

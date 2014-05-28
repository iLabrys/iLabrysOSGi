/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerTypesType#getContainerType <em>Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerTypesType()
 * @model extendedMetaData="name='containerTypes_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainerTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.ContainerTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerTypesType_ContainerType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='containerType'"
	 * @generated
	 */
	EList<ContainerTypeType> getContainerType();

} // ContainerTypesType

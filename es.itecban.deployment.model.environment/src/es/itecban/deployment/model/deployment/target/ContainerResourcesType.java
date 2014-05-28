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
 * A representation of the model object '<em><b>Container Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerResourcesType#getContainerResource <em>Container Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerResourcesType()
 * @model extendedMetaData="name='containerResources_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainerResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.RuntimeResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Resource</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerResourcesType_ContainerResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerResource'"
	 * @generated
	 */
	EList<RuntimeResourceType> getContainerResource();

} // ContainerResourcesType

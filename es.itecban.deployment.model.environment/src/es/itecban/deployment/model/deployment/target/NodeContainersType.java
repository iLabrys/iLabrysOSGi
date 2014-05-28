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
 * A representation of the model object '<em><b>Node Containers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.NodeContainersType#getNodeContainer <em>Node Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeContainersType()
 * @model extendedMetaData="name='nodeContainers_._type' kind='elementOnly'"
 * @generated
 */
public interface NodeContainersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Container</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.ContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Container</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeContainersType_NodeContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodeContainer'"
	 * @generated
	 */
	EList<ContainerType> getNodeContainer();

} // NodeContainersType

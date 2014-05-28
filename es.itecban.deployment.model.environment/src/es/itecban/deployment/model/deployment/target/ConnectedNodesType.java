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
 * A representation of the model object '<em><b>Connected Nodes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ConnectedNodesType#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getConnectedNodesType()
 * @model extendedMetaData="name='connectedNodes_._type' kind='elementOnly'"
 * @generated
 */
public interface ConnectedNodesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getConnectedNodesType_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodes'"
	 * @generated
	 */
	EList<NodeType> getNodes();

} // ConnectedNodesType

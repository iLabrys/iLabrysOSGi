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
 * A representation of the model object '<em><b>Bridges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.BridgesType#getBridge <em>Bridge</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getBridgesType()
 * @model extendedMetaData="name='bridges_._type' kind='elementOnly'"
 * @generated
 */
public interface BridgesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.BridgeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getBridgesType_Bridge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bridge'"
	 * @generated
	 */
	EList<BridgeType> getBridge();

} // BridgesType

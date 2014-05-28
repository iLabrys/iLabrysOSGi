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
 * A representation of the model object '<em><b>Interconnects Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectsType#getInterconnect <em>Interconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectsType()
 * @model extendedMetaData="name='interconnects_._type' kind='elementOnly'"
 * @generated
 */
public interface InterconnectsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interconnect</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.InterconnectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interconnect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interconnect</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectsType_Interconnect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interconnect'"
	 * @generated
	 */
	EList<InterconnectType> getInterconnect();

} // InterconnectsType

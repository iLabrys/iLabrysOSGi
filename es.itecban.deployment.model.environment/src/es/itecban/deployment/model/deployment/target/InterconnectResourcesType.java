/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import es.itecban.deployment.model.deployment.unit.ResourceType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interconnect Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectResourcesType#getInterconnectResource <em>Interconnect Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectResourcesType()
 * @model extendedMetaData="name='interconnectResources_._type' kind='elementOnly'"
 * @generated
 */
public interface InterconnectResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interconnect Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interconnect Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interconnect Resource</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectResourcesType_InterconnectResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interconnectResource'"
	 * @generated
	 */
	EList<ResourceType> getInterconnectResource();

} // InterconnectResourcesType

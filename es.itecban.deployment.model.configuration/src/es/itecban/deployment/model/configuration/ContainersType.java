/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.ContainersType#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getContainersType()
 * @model extendedMetaData="name='containers_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.configuration.ConfigurationContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see es.itecban.deployment.model.configuration.ConfigurationPackage#getContainersType_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container'"
	 * @generated
	 */
	EList<ConfigurationContainerType> getContainer();

} // ContainersType

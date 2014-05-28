/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.dependency.graph;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Node#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Node#getDependency <em>Dependency</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Node#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getNode()
 * @model extendedMetaData="name='Node' kind='elementOnly'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(DeploymentUnitType)
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getNode_Unit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unit'"
	 * @generated
	 */
	DeploymentUnitType getUnit();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.Node#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DeploymentUnitType value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.dependency.graph.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' reference list.
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getNode_Dependency()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='dependency'"
	 * @generated
	 */
	List<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getNode_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Node

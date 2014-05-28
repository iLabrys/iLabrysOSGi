/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.dependency.graph;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getNode <em>Node</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getDependency <em>Dependency</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependencyGraph()
 * @model extendedMetaData="name='DependencyGraph' kind='elementOnly'"
 * @generated
 */
public interface DependencyGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.dependency.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependencyGraph_Node()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='node'"
	 * @generated
	 */
	List<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.dependency.graph.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependencyGraph_Dependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependency'"
	 * @generated
	 */
	List<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Node)
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependencyGraph_Origin()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='origin'"
	 * @generated
	 */
	Node getOrigin();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Node value);
	
	/**
	 * 
	 * @param node
	 * @generated NOT
	 */
	public boolean addNode(Node node);
	
	/**
	 * 
	 * @param node
	 * @generated NOT
	 */
	public void removeNode(Node node);
	
	/**
	 * 
	 * 
	 * @param dep
	 * @return
	 * @generated NOT
	 */
	public boolean addDependency(Dependency dep);

} // DependencyGraph

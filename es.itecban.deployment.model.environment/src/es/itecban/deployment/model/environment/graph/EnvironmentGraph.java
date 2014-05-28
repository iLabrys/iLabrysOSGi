/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.environment.graph;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import es.itecban.deployment.model.environment.graph.Dependency;
import es.itecban.deployment.model.environment.graph.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph#getNode <em>Node</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph#getOrigins <em>Origins</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getEnvironmentGraph()
 * @model extendedMetaData="name='EnvironmentGraph' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.environment.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getEnvironmentGraph_Node()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='node'"
	 * @generated
	 */
	List<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.environment.graph.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getEnvironmentGraph_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies'"
	 * @generated
	 */
	List<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Origins</b></em>' reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.environment.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origins</em>' reference list.
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getEnvironmentGraph_Origins()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='origins'"
	 * @generated
	 */
	List<Node> getOrigins();

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
	 * @param dep
	 * @return
	 * @generated NOT
	 */
	public boolean addDependency(Dependency dep);
} // EnvironmentGraph

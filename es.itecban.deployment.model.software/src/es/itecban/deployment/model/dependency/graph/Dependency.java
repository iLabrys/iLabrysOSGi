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
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Dependency#getCause <em>Cause</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Dependency#getDestination <em>Destination</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Dependency#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Dependency#getLocality <em>Locality</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.Dependency#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependency()
 * @model extendedMetaData="name='Dependency' kind='elementOnly'"
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.dependency.graph.Cause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference list.
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependency_Cause()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cause'"
	 * @generated
	 */
	List<Cause> getCause();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Node)
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependency_Destination()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='destination'"
	 * @generated
	 */
	Node getDestination();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.Dependency#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Node value);

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
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependency_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.Dependency#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locality</em>' attribute.
	 * @see #setLocality(String)
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependency_Locality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locality'"
	 * @generated
	 */
	String getLocality();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.Dependency#getLocality <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' attribute.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see es.itecban.deployment.model.dependency.graph.GraphPackage#getDependency_Source()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.dependency.graph.Dependency#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);
	
	/**
	 * 
	 * @param cause
	 * @generated NOT
	 */
	void addCause(Cause cause);


} // Dependency

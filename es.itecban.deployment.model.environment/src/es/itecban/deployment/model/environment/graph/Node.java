/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.environment.graph;

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
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getIsRequiredBy <em>Is Required By</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.Node#getUnitVersion <em>Unit Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode()
 * @model extendedMetaData="name='Node' kind='empty'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name</em>' attribute.
	 * @see #setContainerName(String)
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_ContainerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='containerName'"
	 * @generated
	 */
	String getContainerName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.environment.graph.Node#getContainerName <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name</em>' attribute.
	 * @see #getContainerName()
	 * @generated
	 */
	void setContainerName(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.environment.graph.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_Dependencies()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='Dependencies'"
	 * @generated
	 */
	List<Dependency> getDependencies();

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
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.environment.graph.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Required By</b></em>' reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.environment.graph.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required By</em>' reference list.
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_IsRequiredBy()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='isRequiredBy'"
	 * @generated
	 */
	List<Dependency> getIsRequiredBy();

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_NodeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='nodeName'"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.environment.graph.Node#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Name</em>' attribute.
	 * @see #setUnitName(String)
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_UnitName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='unitName'"
	 * @generated
	 */
	String getUnitName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.environment.graph.Node#getUnitName <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Name</em>' attribute.
	 * @see #getUnitName()
	 * @generated
	 */
	void setUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Unit Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Version</em>' attribute.
	 * @see #setUnitVersion(String)
	 * @see es.itecban.deployment.model.environment.graph.GraphPackage#getNode_UnitVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='unitVersion'"
	 * @generated
	 */
	String getUnitVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.environment.graph.Node#getUnitVersion <em>Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Version</em>' attribute.
	 * @see #getUnitVersion()
	 * @generated
	 */
	void setUnitVersion(String value);

} // Node

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.NodeType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.NodeType#getLabel <em>Label</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeResources <em>Node Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeContainers <em>Node Containers</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeProperties <em>Node Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeType()
 * @model extendedMetaData="name='NodeType' kind='elementOnly'"
 * @generated
 */
public interface NodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A node's name is its unique identifier within
	 * 						the deployment target
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.NodeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A label is an optional human readable name.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeType_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.NodeType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Node Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Resources</em>' containment reference.
	 * @see #setNodeResources(NodeResourcesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeType_NodeResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodeResources'"
	 * @generated
	 */
	NodeResourcesType getNodeResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeResources <em>Node Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Resources</em>' containment reference.
	 * @see #getNodeResources()
	 * @generated
	 */
	void setNodeResources(NodeResourcesType value);

	/**
	 * Returns the value of the '<em><b>Node Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Containers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Containers</em>' containment reference.
	 * @see #setNodeContainers(NodeContainersType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeType_NodeContainers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodeContainers'"
	 * @generated
	 */
	NodeContainersType getNodeContainers();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeContainers <em>Node Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Containers</em>' containment reference.
	 * @see #getNodeContainers()
	 * @generated
	 */
	void setNodeContainers(NodeContainersType value);

	/**
	 * Returns the value of the '<em><b>Node Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Properties</em>' containment reference.
	 * @see #setNodeProperties(NodePropertiesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getNodeType_NodeProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodeProperties'"
	 * @generated
	 */
	NodePropertiesType getNodeProperties();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeProperties <em>Node Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Properties</em>' containment reference.
	 * @see #getNodeProperties()
	 * @generated
	 */
	void setNodeProperties(NodePropertiesType value);

} // NodeType

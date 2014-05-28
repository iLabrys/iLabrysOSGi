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
 * A representation of the model object '<em><b>Interconnect Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectType#getLabel <em>Label</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectType#getInterconnectResources <em>Interconnect Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedNodes <em>Connected Nodes</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedBridges <em>Connected Bridges</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectType()
 * @model extendedMetaData="name='InterconnectType' kind='elementOnly'"
 * @generated
 */
public interface InterconnectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						An interconnect's name is its unique identifier within the deployment
	 * 						target
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getName <em>Name</em>}' attribute.
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
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectType_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Interconnect Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interconnect Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interconnect Resources</em>' containment reference.
	 * @see #setInterconnectResources(InterconnectResourcesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectType_InterconnectResources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interconnectResources'"
	 * @generated
	 */
	InterconnectResourcesType getInterconnectResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getInterconnectResources <em>Interconnect Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect Resources</em>' containment reference.
	 * @see #getInterconnectResources()
	 * @generated
	 */
	void setInterconnectResources(InterconnectResourcesType value);

	/**
	 * Returns the value of the '<em><b>Connected Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Nodes</em>' containment reference.
	 * @see #setConnectedNodes(ConnectedNodesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectType_ConnectedNodes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connectedNodes'"
	 * @generated
	 */
	ConnectedNodesType getConnectedNodes();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedNodes <em>Connected Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Nodes</em>' containment reference.
	 * @see #getConnectedNodes()
	 * @generated
	 */
	void setConnectedNodes(ConnectedNodesType value);

	/**
	 * Returns the value of the '<em><b>Connected Bridges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Bridges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Bridges</em>' containment reference.
	 * @see #setConnectedBridges(ConnectedBridgesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getInterconnectType_ConnectedBridges()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connectedBridges'"
	 * @generated
	 */
	ConnectedBridgesType getConnectedBridges();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedBridges <em>Connected Bridges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Bridges</em>' containment reference.
	 * @see #getConnectedBridges()
	 * @generated
	 */
	void setConnectedBridges(ConnectedBridgesType value);

} // InterconnectType

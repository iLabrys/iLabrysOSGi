/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getUUID <em>UUID</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getNodes <em>Nodes</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getBridges <em>Bridges</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getInterconnects <em>Interconnects</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getSharedResources <em>Shared Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType()
 * @model extendedMetaData="name='DeploymentTargetType' kind='elementOnly'"
 * @generated
 */
public interface DeploymentTargetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *      				A node's name is its unique identifier within the
	 *      				deployment target
	 *      			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *      				An optional unique id for the deployment target
	 *      			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_UUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='UUID'"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference.
	 * @see #setNodes(NodesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodes'"
	 * @generated
	 */
	NodesType getNodes();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(NodesType value);

	/**
	 * Returns the value of the '<em><b>Bridges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridges</em>' containment reference.
	 * @see #setBridges(BridgesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_Bridges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bridges'"
	 * @generated
	 */
	BridgesType getBridges();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getBridges <em>Bridges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridges</em>' containment reference.
	 * @see #getBridges()
	 * @generated
	 */
	void setBridges(BridgesType value);

	/**
	 * Returns the value of the '<em><b>Interconnects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interconnects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interconnects</em>' containment reference.
	 * @see #setInterconnects(InterconnectsType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_Interconnects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interconnects'"
	 * @generated
	 */
	InterconnectsType getInterconnects();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getInterconnects <em>Interconnects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnects</em>' containment reference.
	 * @see #getInterconnects()
	 * @generated
	 */
	void setInterconnects(InterconnectsType value);

	/**
	 * Returns the value of the '<em><b>Shared Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resources</em>' containment reference.
	 * @see #setSharedResources(SharedResourcesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_SharedResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sharedResources'"
	 * @generated
	 */
	SharedResourcesType getSharedResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getSharedResources <em>Shared Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Resources</em>' containment reference.
	 * @see #getSharedResources()
	 * @generated
	 */
	void setSharedResources(SharedResourcesType value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDeploymentTargetType_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='timestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);

} // DeploymentTargetType

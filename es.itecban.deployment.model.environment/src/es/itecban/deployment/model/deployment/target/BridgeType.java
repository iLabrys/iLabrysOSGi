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
 * A representation of the model object '<em><b>Bridge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.BridgeType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.BridgeType#getLabel <em>Label</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.BridgeType#getBridgeResources <em>Bridge Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getBridgeType()
 * @model extendedMetaData="name='BridgeType' kind='elementOnly'"
 * @generated
 */
public interface BridgeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A bridge's name is its unique identifier within the deployment
	 * 						target
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getBridgeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.BridgeType#getName <em>Name</em>}' attribute.
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
	 * 						A lable is an optional human readable name.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getBridgeType_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.BridgeType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Bridge Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge Resources</em>' containment reference.
	 * @see #setBridgeResources(BridgeResourcesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getBridgeType_BridgeResources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bridgeResources'"
	 * @generated
	 */
	BridgeResourcesType getBridgeResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.BridgeType#getBridgeResources <em>Bridge Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Resources</em>' containment reference.
	 * @see #getBridgeResources()
	 * @generated
	 */
	void setBridgeResources(BridgeResourcesType value);

} // BridgeType

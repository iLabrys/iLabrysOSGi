/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getBridge <em>Bridge</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getContainer <em>Container</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getInterconnect <em>Interconnect</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getNode <em>Node</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeResource <em>Runtime Resource</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeUnit <em>Runtime Unit</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getStatus <em>Status</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getSupportedPackage <em>Supported Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge</em>' containment reference.
	 * @see #setBridge(BridgeType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Bridge()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridge' namespace='##targetNamespace'"
	 * @generated
	 */
	BridgeType getBridge();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getBridge <em>Bridge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge</em>' containment reference.
	 * @see #getBridge()
	 * @generated
	 */
	void setBridge(BridgeType value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(ContainerType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Container()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerType getContainer();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerType value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' containment reference.
	 * @see #setContainerType(ContainerTypeType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_ContainerType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='containerType' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerTypeType getContainerType();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getContainerType <em>Container Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type</em>' containment reference.
	 * @see #getContainerType()
	 * @generated
	 */
	void setContainerType(ContainerTypeType value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(DeploymentTargetType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Domain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	DeploymentTargetType getDomain();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DeploymentTargetType value);

	/**
	 * Returns the value of the '<em><b>Interconnect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interconnect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interconnect</em>' containment reference.
	 * @see #setInterconnect(InterconnectType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Interconnect()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interconnect' namespace='##targetNamespace'"
	 * @generated
	 */
	InterconnectType getInterconnect();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getInterconnect <em>Interconnect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnect</em>' containment reference.
	 * @see #getInterconnect()
	 * @generated
	 */
	void setInterconnect(InterconnectType value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(NodeType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Node()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeType getNode();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(NodeType value);

	/**
	 * Returns the value of the '<em><b>Runtime Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Resource</em>' containment reference.
	 * @see #setRuntimeResource(RuntimeResourceType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_RuntimeResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='runtimeResource' namespace='##targetNamespace'"
	 * @generated
	 */
	RuntimeResourceType getRuntimeResource();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeResource <em>Runtime Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Resource</em>' containment reference.
	 * @see #getRuntimeResource()
	 * @generated
	 */
	void setRuntimeResource(RuntimeResourceType value);

	/**
	 * Returns the value of the '<em><b>Runtime Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Unit</em>' containment reference.
	 * @see #setRuntimeUnit(RuntimeUnitType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_RuntimeUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='runtimeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	RuntimeUnitType getRuntimeUnit();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeUnit <em>Runtime Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Unit</em>' containment reference.
	 * @see #getRuntimeUnit()
	 * @generated
	 */
	void setRuntimeUnit(RuntimeUnitType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.target.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @see #setStatus(StatusType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_Status()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Supported Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Package</em>' containment reference.
	 * @see #setSupportedPackage(SupportedPackageType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getDocumentRoot_SupportedPackage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='supportedPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportedPackageType getSupportedPackage();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getSupportedPackage <em>Supported Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Package</em>' containment reference.
	 * @see #getSupportedPackage()
	 * @generated
	 */
	void setSupportedPackage(SupportedPackageType value);

} // DocumentRoot

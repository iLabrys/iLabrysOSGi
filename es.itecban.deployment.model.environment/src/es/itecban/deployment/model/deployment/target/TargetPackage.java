/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.target.TargetFactory
 * @model kind="package"
 * @generated
 */
public interface TargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "target";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/DeploymentTarget";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "target";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetPackage eINSTANCE = es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.BridgeResourcesTypeImpl <em>Bridge Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.BridgeResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getBridgeResourcesType()
	 * @generated
	 */
	int BRIDGE_RESOURCES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Bridge Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Bridge Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.BridgesTypeImpl <em>Bridges Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.BridgesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getBridgesType()
	 * @generated
	 */
	int BRIDGES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGES_TYPE__BRIDGE = 0;

	/**
	 * The number of structural features of the '<em>Bridges Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl <em>Bridge Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getBridgeType()
	 * @generated
	 */
	int BRIDGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Bridge Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__BRIDGE_RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Bridge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ConnectedBridgesTypeImpl <em>Connected Bridges Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ConnectedBridgesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getConnectedBridgesType()
	 * @generated
	 */
	int CONNECTED_BRIDGES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_BRIDGES_TYPE__BRIDGE = 0;

	/**
	 * The number of structural features of the '<em>Connected Bridges Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_BRIDGES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ConnectedNodesTypeImpl <em>Connected Nodes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ConnectedNodesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getConnectedNodesType()
	 * @generated
	 */
	int CONNECTED_NODES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_NODES_TYPE__NODES = 0;

	/**
	 * The number of structural features of the '<em>Connected Nodes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_NODES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerPropertiesTypeImpl <em>Container Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ContainerPropertiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerPropertiesType()
	 * @generated
	 */
	int CONTAINER_PROPERTIES_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Container Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Container Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerResourcesTypeImpl <em>Container Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ContainerResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerResourcesType()
	 * @generated
	 */
	int CONTAINER_RESOURCES_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Container Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Container Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl <em>Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Container Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__CONTAINER_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Supported Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__SUPPORTED_PACKAGES = 2;

	/**
	 * The feature id for the '<em><b>Container Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__CONTAINER_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Container Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__CONTAINER_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Runtime Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__RUNTIME_UNITS = 5;

	/**
	 * The number of structural features of the '<em>Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypesTypeImpl <em>Container Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ContainerTypesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerTypesType()
	 * @generated
	 */
	int CONTAINER_TYPES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPES_TYPE__CONTAINER_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Container Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeTypeImpl <em>Container Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.ContainerTypeTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerTypeType()
	 * @generated
	 */
	int CONTAINER_TYPE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Container Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl <em>Deployment Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getDeploymentTargetType()
	 * @generated
	 */
	int DEPLOYMENT_TARGET_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__UUID = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__NODES = 2;

	/**
	 * The feature id for the '<em><b>Bridges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__BRIDGES = 3;

	/**
	 * The feature id for the '<em><b>Interconnects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__INTERCONNECTS = 4;

	/**
	 * The feature id for the '<em><b>Shared Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE__TIMESTAMP = 6;

	/**
	 * The number of structural features of the '<em>Deployment Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TARGET_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Bridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BRIDGE = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN = 6;

	/**
	 * The feature id for the '<em><b>Interconnect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERCONNECT = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE = 8;

	/**
	 * The feature id for the '<em><b>Runtime Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUNTIME_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Runtime Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUNTIME_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATUS = 11;

	/**
	 * The feature id for the '<em><b>Supported Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPORTED_PACKAGE = 12;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.InterconnectResourcesTypeImpl <em>Interconnect Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.InterconnectResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getInterconnectResourcesType()
	 * @generated
	 */
	int INTERCONNECT_RESOURCES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Interconnect Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Interconnect Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.InterconnectsTypeImpl <em>Interconnects Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.InterconnectsTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getInterconnectsType()
	 * @generated
	 */
	int INTERCONNECTS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Interconnect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECTS_TYPE__INTERCONNECT = 0;

	/**
	 * The number of structural features of the '<em>Interconnects Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl <em>Interconnect Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getInterconnectType()
	 * @generated
	 */
	int INTERCONNECT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Interconnect Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_TYPE__INTERCONNECT_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Connected Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_TYPE__CONNECTED_NODES = 3;

	/**
	 * The feature id for the '<em><b>Connected Bridges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_TYPE__CONNECTED_BRIDGES = 4;

	/**
	 * The number of structural features of the '<em>Interconnect Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONNECT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.NodeContainersTypeImpl <em>Node Containers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.NodeContainersTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodeContainersType()
	 * @generated
	 */
	int NODE_CONTAINERS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Node Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINERS_TYPE__NODE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Node Containers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONTAINERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.NodePropertiesTypeImpl <em>Node Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.NodePropertiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodePropertiesType()
	 * @generated
	 */
	int NODE_PROPERTIES_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Node Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTIES_TYPE__NODE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Node Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.NodeResourcesTypeImpl <em>Node Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.NodeResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodeResourcesType()
	 * @generated
	 */
	int NODE_RESOURCES_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Node Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCES_TYPE__NODE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Node Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.NodesTypeImpl <em>Nodes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.NodesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodesType()
	 * @generated
	 */
	int NODES_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TYPE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Nodes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Node Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_CONTAINERS = 3;

	/**
	 * The feature id for the '<em><b>Node Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__NODE_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourcePropertiesTypeImpl <em>Runtime Resource Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourcePropertiesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourcePropertiesType()
	 * @generated
	 */
	int RUNTIME_RESOURCE_PROPERTIES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Resource Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Runtime Resource Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourcesTypeImpl <em>Runtime Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourcesType()
	 * @generated
	 */
	int RUNTIME_RESOURCES_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCES_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Runtime Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl <em>Runtime Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourceType()
	 * @generated
	 */
	int RUNTIME_RESOURCE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Runtime Resource Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Runtime Resource Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPE__STATUS = 4;

	/**
	 * The number of structural features of the '<em>Runtime Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypesTypeImpl <em>Runtime Resource Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourceTypesType()
	 * @generated
	 */
	int RUNTIME_RESOURCE_TYPES_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPES_TYPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Runtime Resource Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_RESOURCE_TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitsTypeImpl <em>Runtime Units Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeUnitsTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeUnitsType()
	 * @generated
	 */
	int RUNTIME_UNITS_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNITS_TYPE__UNIT = 0;

	/**
	 * The number of structural features of the '<em>Runtime Units Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNITS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl <em>Runtime Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeUnitType()
	 * @generated
	 */
	int RUNTIME_UNIT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNIT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNIT_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNIT_TYPE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Runtime Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES = 3;

	/**
	 * The number of structural features of the '<em>Runtime Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_UNIT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.SharedResourcesTypeImpl <em>Shared Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.SharedResourcesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getSharedResourcesType()
	 * @generated
	 */
	int SHARED_RESOURCES_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Shared Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCES_TYPE__SHARED_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Shared Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.SupportedPackagesTypeImpl <em>Supported Packages Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.SupportedPackagesTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getSupportedPackagesType()
	 * @generated
	 */
	int SUPPORTED_PACKAGES_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Container Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Supported Packages Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_PACKAGES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.impl.SupportedPackageTypeImpl <em>Supported Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.impl.SupportedPackageTypeImpl
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getSupportedPackageType()
	 * @generated
	 */
	int SUPPORTED_PACKAGE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_PACKAGE_TYPE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_PACKAGE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Supported Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_PACKAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.deployment.target.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 29;

	/**
	 * The meta object id for the '<em>Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getStatusTypeObject()
	 * @generated
	 */
	int STATUS_TYPE_OBJECT = 30;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.BridgeResourcesType <em>Bridge Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgeResourcesType
	 * @generated
	 */
	EClass getBridgeResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.BridgeResourcesType#getBridgeResource <em>Bridge Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgeResourcesType#getBridgeResource()
	 * @see #getBridgeResourcesType()
	 * @generated
	 */
	EReference getBridgeResourcesType_BridgeResource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.BridgesType <em>Bridges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridges Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgesType
	 * @generated
	 */
	EClass getBridgesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.BridgesType#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgesType#getBridge()
	 * @see #getBridgesType()
	 * @generated
	 */
	EReference getBridgesType_Bridge();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgeType
	 * @generated
	 */
	EClass getBridgeType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.BridgeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgeType#getName()
	 * @see #getBridgeType()
	 * @generated
	 */
	EAttribute getBridgeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.BridgeType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgeType#getLabel()
	 * @see #getBridgeType()
	 * @generated
	 */
	EAttribute getBridgeType_Label();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.BridgeType#getBridgeResources <em>Bridge Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bridge Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.target.BridgeType#getBridgeResources()
	 * @see #getBridgeType()
	 * @generated
	 */
	EReference getBridgeType_BridgeResources();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ConnectedBridgesType <em>Connected Bridges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connected Bridges Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ConnectedBridgesType
	 * @generated
	 */
	EClass getConnectedBridgesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.ConnectedBridgesType#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ConnectedBridgesType#getBridge()
	 * @see #getConnectedBridgesType()
	 * @generated
	 */
	EReference getConnectedBridgesType_Bridge();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ConnectedNodesType <em>Connected Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connected Nodes Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ConnectedNodesType
	 * @generated
	 */
	EClass getConnectedNodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.ConnectedNodesType#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ConnectedNodesType#getNodes()
	 * @see #getConnectedNodesType()
	 * @generated
	 */
	EReference getConnectedNodesType_Nodes();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ContainerPropertiesType <em>Container Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Properties Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerPropertiesType
	 * @generated
	 */
	EClass getContainerPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.ContainerPropertiesType#getContainerProperty <em>Container Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Property</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerPropertiesType#getContainerProperty()
	 * @see #getContainerPropertiesType()
	 * @generated
	 */
	EReference getContainerPropertiesType_ContainerProperty();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ContainerResourcesType <em>Container Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerResourcesType
	 * @generated
	 */
	EClass getContainerResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.ContainerResourcesType#getContainerResource <em>Container Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerResourcesType#getContainerResource()
	 * @see #getContainerResourcesType()
	 * @generated
	 */
	EReference getContainerResourcesType_ContainerResource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType
	 * @generated
	 */
	EClass getContainerType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.ContainerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType#getName()
	 * @see #getContainerType()
	 * @generated
	 */
	EAttribute getContainerType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerTypes <em>Container Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Types</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType#getContainerTypes()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_ContainerTypes();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.ContainerType#getSupportedPackages <em>Supported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Packages</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType#getSupportedPackages()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_SupportedPackages();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerResources <em>Container Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType#getContainerResources()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_ContainerResources();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerProperties <em>Container Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType#getContainerProperties()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_ContainerProperties();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.ContainerType#getRuntimeUnits <em>Runtime Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Units</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType#getRuntimeUnits()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_RuntimeUnits();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ContainerTypesType <em>Container Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Types Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypesType
	 * @generated
	 */
	EClass getContainerTypesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.ContainerTypesType#getContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypesType#getContainerType()
	 * @see #getContainerTypesType()
	 * @generated
	 */
	EReference getContainerTypesType_ContainerType();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.ContainerTypeType <em>Container Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Type Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypeType
	 * @generated
	 */
	EClass getContainerTypeType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.ContainerTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypeType#getName()
	 * @see #getContainerTypeType()
	 * @generated
	 */
	EAttribute getContainerTypeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.ContainerTypeType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypeType#getVersion()
	 * @see #getContainerTypeType()
	 * @generated
	 */
	EAttribute getContainerTypeType_Version();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType <em>Deployment Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Target Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType
	 * @generated
	 */
	EClass getDeploymentTargetType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getName()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EAttribute getDeploymentTargetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getUUID()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EAttribute getDeploymentTargetType_UUID();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getNodes()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EReference getDeploymentTargetType_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getBridges <em>Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bridges</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getBridges()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EReference getDeploymentTargetType_Bridges();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getInterconnects <em>Interconnects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interconnects</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getInterconnects()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EReference getDeploymentTargetType_Interconnects();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getSharedResources <em>Shared Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shared Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getSharedResources()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EReference getDeploymentTargetType_SharedResources();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType#getTimestamp()
	 * @see #getDeploymentTargetType()
	 * @generated
	 */
	EAttribute getDeploymentTargetType_Timestamp();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getBridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bridge</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getBridge()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bridge();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getContainer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Container();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getContainerType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContainerType();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getInterconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interconnect</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getInterconnect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Interconnect();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Node();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeResource <em>Runtime Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RuntimeResource();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeUnit <em>Runtime Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Unit</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getRuntimeUnit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RuntimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Status();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.DocumentRoot#getSupportedPackage <em>Supported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Package</em>'.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot#getSupportedPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SupportedPackage();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.InterconnectResourcesType <em>Interconnect Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interconnect Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectResourcesType
	 * @generated
	 */
	EClass getInterconnectResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.InterconnectResourcesType#getInterconnectResource <em>Interconnect Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interconnect Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectResourcesType#getInterconnectResource()
	 * @see #getInterconnectResourcesType()
	 * @generated
	 */
	EReference getInterconnectResourcesType_InterconnectResource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.InterconnectsType <em>Interconnects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interconnects Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectsType
	 * @generated
	 */
	EClass getInterconnectsType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.InterconnectsType#getInterconnect <em>Interconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interconnect</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectsType#getInterconnect()
	 * @see #getInterconnectsType()
	 * @generated
	 */
	EReference getInterconnectsType_Interconnect();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.InterconnectType <em>Interconnect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interconnect Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType
	 * @generated
	 */
	EClass getInterconnectType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType#getName()
	 * @see #getInterconnectType()
	 * @generated
	 */
	EAttribute getInterconnectType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType#getLabel()
	 * @see #getInterconnectType()
	 * @generated
	 */
	EAttribute getInterconnectType_Label();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getInterconnectResources <em>Interconnect Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interconnect Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType#getInterconnectResources()
	 * @see #getInterconnectType()
	 * @generated
	 */
	EReference getInterconnectType_InterconnectResources();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedNodes <em>Connected Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connected Nodes</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedNodes()
	 * @see #getInterconnectType()
	 * @generated
	 */
	EReference getInterconnectType_ConnectedNodes();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedBridges <em>Connected Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connected Bridges</em>'.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType#getConnectedBridges()
	 * @see #getInterconnectType()
	 * @generated
	 */
	EReference getInterconnectType_ConnectedBridges();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.NodeContainersType <em>Node Containers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Containers Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeContainersType
	 * @generated
	 */
	EClass getNodeContainersType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.NodeContainersType#getNodeContainer <em>Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Container</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeContainersType#getNodeContainer()
	 * @see #getNodeContainersType()
	 * @generated
	 */
	EReference getNodeContainersType_NodeContainer();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.NodePropertiesType <em>Node Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Properties Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodePropertiesType
	 * @generated
	 */
	EClass getNodePropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.NodePropertiesType#getNodeProperty <em>Node Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Property</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodePropertiesType#getNodeProperty()
	 * @see #getNodePropertiesType()
	 * @generated
	 */
	EReference getNodePropertiesType_NodeProperty();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.NodeResourcesType <em>Node Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeResourcesType
	 * @generated
	 */
	EClass getNodeResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.NodeResourcesType#getNodeResource <em>Node Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeResourcesType#getNodeResource()
	 * @see #getNodeResourcesType()
	 * @generated
	 */
	EReference getNodeResourcesType_NodeResource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.NodesType <em>Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodesType
	 * @generated
	 */
	EClass getNodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.NodesType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodesType#getNode()
	 * @see #getNodesType()
	 * @generated
	 */
	EReference getNodesType_Node();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.NodeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeType#getName()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.NodeType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeType#getLabel()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Label();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeResources <em>Node Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeType#getNodeResources()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_NodeResources();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeContainers <em>Node Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Containers</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeType#getNodeContainers()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_NodeContainers();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.NodeType#getNodeProperties <em>Node Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.target.NodeType#getNodeProperties()
	 * @see #getNodeType()
	 * @generated
	 */
	EReference getNodeType_NodeProperties();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType <em>Runtime Resource Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Resource Properties Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType
	 * @generated
	 */
	EClass getRuntimeResourcePropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType#getResourceProperty <em>Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Property</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType#getResourceProperty()
	 * @see #getRuntimeResourcePropertiesType()
	 * @generated
	 */
	EReference getRuntimeResourcePropertiesType_ResourceProperty();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourcesType <em>Runtime Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourcesType
	 * @generated
	 */
	EClass getRuntimeResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.RuntimeResourcesType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourcesType#getResource()
	 * @see #getRuntimeResourcesType()
	 * @generated
	 */
	EReference getRuntimeResourcesType_Resource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType <em>Runtime Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Resource Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType
	 * @generated
	 */
	EClass getRuntimeResourceType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType#getName()
	 * @see #getRuntimeResourceType()
	 * @generated
	 */
	EAttribute getRuntimeResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType#getVersion()
	 * @see #getRuntimeResourceType()
	 * @generated
	 */
	EAttribute getRuntimeResourceType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType#getRuntimeResourceTypes <em>Runtime Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Resource Types</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType#getRuntimeResourceTypes()
	 * @see #getRuntimeResourceType()
	 * @generated
	 */
	EReference getRuntimeResourceType_RuntimeResourceTypes();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType#getRuntimeResourceProperties <em>Runtime Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Resource Properties</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType#getRuntimeResourceProperties()
	 * @see #getRuntimeResourceType()
	 * @generated
	 */
	EReference getRuntimeResourceType_RuntimeResourceProperties();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType#getStatus()
	 * @see #getRuntimeResourceType()
	 * @generated
	 */
	EAttribute getRuntimeResourceType_Status();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType <em>Runtime Resource Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Resource Types Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType
	 * @generated
	 */
	EClass getRuntimeResourceTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType#getType()
	 * @see #getRuntimeResourceTypesType()
	 * @generated
	 */
	EAttribute getRuntimeResourceTypesType_Type();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitsType <em>Runtime Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Units Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitsType
	 * @generated
	 */
	EClass getRuntimeUnitsType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitsType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitsType#getUnit()
	 * @see #getRuntimeUnitsType()
	 * @generated
	 */
	EReference getRuntimeUnitsType_Unit();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType <em>Runtime Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Unit Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitType
	 * @generated
	 */
	EClass getRuntimeUnitType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitType#getName()
	 * @see #getRuntimeUnitType()
	 * @generated
	 */
	EAttribute getRuntimeUnitType_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitType#getVersion()
	 * @see #getRuntimeUnitType()
	 * @generated
	 */
	EAttribute getRuntimeUnitType_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitType#getStatus()
	 * @see #getRuntimeUnitType()
	 * @generated
	 */
	EAttribute getRuntimeUnitType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getRuntimeResources <em>Runtime Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Resources</em>'.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitType#getRuntimeResources()
	 * @see #getRuntimeUnitType()
	 * @generated
	 */
	EReference getRuntimeUnitType_RuntimeResources();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.SharedResourcesType <em>Shared Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Resources Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SharedResourcesType
	 * @generated
	 */
	EClass getSharedResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.SharedResourcesType#getSharedResource <em>Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Resource</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SharedResourcesType#getSharedResource()
	 * @see #getSharedResourcesType()
	 * @generated
	 */
	EReference getSharedResourcesType_SharedResource();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.SupportedPackagesType <em>Supported Packages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Packages Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackagesType
	 * @generated
	 */
	EClass getSupportedPackagesType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.deployment.target.SupportedPackagesType#getContainerPackage <em>Container Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Package</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackagesType#getContainerPackage()
	 * @see #getSupportedPackagesType()
	 * @generated
	 */
	EReference getSupportedPackagesType_ContainerPackage();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.deployment.target.SupportedPackageType <em>Supported Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Package Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackageType
	 * @generated
	 */
	EClass getSupportedPackageType();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.SupportedPackageType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackageType#getVersion()
	 * @see #getSupportedPackageType()
	 * @generated
	 */
	EAttribute getSupportedPackageType_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.deployment.target.SupportedPackageType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackageType#getType()
	 * @see #getSupportedPackageType()
	 * @generated
	 */
	EAttribute getSupportedPackageType_Type();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.deployment.target.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.deployment.target.StatusType <em>Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Type Object</em>'.
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @model instanceClass="es.itecban.deployment.model.deployment.target.StatusType"
	 *        extendedMetaData="name='StatusType:Object' baseType='StatusType'"
	 * @generated
	 */
	EDataType getStatusTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetFactory getTargetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.BridgeResourcesTypeImpl <em>Bridge Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.BridgeResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getBridgeResourcesType()
		 * @generated
		 */
		EClass BRIDGE_RESOURCES_TYPE = eINSTANCE.getBridgeResourcesType();

		/**
		 * The meta object literal for the '<em><b>Bridge Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE = eINSTANCE.getBridgeResourcesType_BridgeResource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.BridgesTypeImpl <em>Bridges Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.BridgesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getBridgesType()
		 * @generated
		 */
		EClass BRIDGES_TYPE = eINSTANCE.getBridgesType();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGES_TYPE__BRIDGE = eINSTANCE.getBridgesType_Bridge();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl <em>Bridge Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getBridgeType()
		 * @generated
		 */
		EClass BRIDGE_TYPE = eINSTANCE.getBridgeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE_TYPE__NAME = eINSTANCE.getBridgeType_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE_TYPE__LABEL = eINSTANCE.getBridgeType_Label();

		/**
		 * The meta object literal for the '<em><b>Bridge Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE_TYPE__BRIDGE_RESOURCES = eINSTANCE.getBridgeType_BridgeResources();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ConnectedBridgesTypeImpl <em>Connected Bridges Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ConnectedBridgesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getConnectedBridgesType()
		 * @generated
		 */
		EClass CONNECTED_BRIDGES_TYPE = eINSTANCE.getConnectedBridgesType();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTED_BRIDGES_TYPE__BRIDGE = eINSTANCE.getConnectedBridgesType_Bridge();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ConnectedNodesTypeImpl <em>Connected Nodes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ConnectedNodesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getConnectedNodesType()
		 * @generated
		 */
		EClass CONNECTED_NODES_TYPE = eINSTANCE.getConnectedNodesType();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTED_NODES_TYPE__NODES = eINSTANCE.getConnectedNodesType_Nodes();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerPropertiesTypeImpl <em>Container Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ContainerPropertiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerPropertiesType()
		 * @generated
		 */
		EClass CONTAINER_PROPERTIES_TYPE = eINSTANCE.getContainerPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Container Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY = eINSTANCE.getContainerPropertiesType_ContainerProperty();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerResourcesTypeImpl <em>Container Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ContainerResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerResourcesType()
		 * @generated
		 */
		EClass CONTAINER_RESOURCES_TYPE = eINSTANCE.getContainerResourcesType();

		/**
		 * The meta object literal for the '<em><b>Container Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE = eINSTANCE.getContainerResourcesType_ContainerResource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl <em>Container Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ContainerTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerType()
		 * @generated
		 */
		EClass CONTAINER_TYPE = eINSTANCE.getContainerType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TYPE__NAME = eINSTANCE.getContainerType_Name();

		/**
		 * The meta object literal for the '<em><b>Container Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TYPE__CONTAINER_TYPES = eINSTANCE.getContainerType_ContainerTypes();

		/**
		 * The meta object literal for the '<em><b>Supported Packages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TYPE__SUPPORTED_PACKAGES = eINSTANCE.getContainerType_SupportedPackages();

		/**
		 * The meta object literal for the '<em><b>Container Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TYPE__CONTAINER_RESOURCES = eINSTANCE.getContainerType_ContainerResources();

		/**
		 * The meta object literal for the '<em><b>Container Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TYPE__CONTAINER_PROPERTIES = eINSTANCE.getContainerType_ContainerProperties();

		/**
		 * The meta object literal for the '<em><b>Runtime Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TYPE__RUNTIME_UNITS = eINSTANCE.getContainerType_RuntimeUnits();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypesTypeImpl <em>Container Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ContainerTypesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerTypesType()
		 * @generated
		 */
		EClass CONTAINER_TYPES_TYPE = eINSTANCE.getContainerTypesType();

		/**
		 * The meta object literal for the '<em><b>Container Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TYPES_TYPE__CONTAINER_TYPE = eINSTANCE.getContainerTypesType_ContainerType();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.ContainerTypeTypeImpl <em>Container Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.ContainerTypeTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getContainerTypeType()
		 * @generated
		 */
		EClass CONTAINER_TYPE_TYPE = eINSTANCE.getContainerTypeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TYPE_TYPE__NAME = eINSTANCE.getContainerTypeType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TYPE_TYPE__VERSION = eINSTANCE.getContainerTypeType_Version();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl <em>Deployment Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getDeploymentTargetType()
		 * @generated
		 */
		EClass DEPLOYMENT_TARGET_TYPE = eINSTANCE.getDeploymentTargetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TARGET_TYPE__NAME = eINSTANCE.getDeploymentTargetType_Name();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TARGET_TYPE__UUID = eINSTANCE.getDeploymentTargetType_UUID();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_TARGET_TYPE__NODES = eINSTANCE.getDeploymentTargetType_Nodes();

		/**
		 * The meta object literal for the '<em><b>Bridges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_TARGET_TYPE__BRIDGES = eINSTANCE.getDeploymentTargetType_Bridges();

		/**
		 * The meta object literal for the '<em><b>Interconnects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_TARGET_TYPE__INTERCONNECTS = eINSTANCE.getDeploymentTargetType_Interconnects();

		/**
		 * The meta object literal for the '<em><b>Shared Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES = eINSTANCE.getDeploymentTargetType_SharedResources();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TARGET_TYPE__TIMESTAMP = eINSTANCE.getDeploymentTargetType_Timestamp();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Bridge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BRIDGE = eINSTANCE.getDocumentRoot_Bridge();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTAINER = eINSTANCE.getDocumentRoot_Container();

		/**
		 * The meta object literal for the '<em><b>Container Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTAINER_TYPE = eINSTANCE.getDocumentRoot_ContainerType();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN = eINSTANCE.getDocumentRoot_Domain();

		/**
		 * The meta object literal for the '<em><b>Interconnect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERCONNECT = eINSTANCE.getDocumentRoot_Interconnect();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

		/**
		 * The meta object literal for the '<em><b>Runtime Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RUNTIME_RESOURCE = eINSTANCE.getDocumentRoot_RuntimeResource();

		/**
		 * The meta object literal for the '<em><b>Runtime Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RUNTIME_UNIT = eINSTANCE.getDocumentRoot_RuntimeUnit();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STATUS = eINSTANCE.getDocumentRoot_Status();

		/**
		 * The meta object literal for the '<em><b>Supported Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUPPORTED_PACKAGE = eINSTANCE.getDocumentRoot_SupportedPackage();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.InterconnectResourcesTypeImpl <em>Interconnect Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.InterconnectResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getInterconnectResourcesType()
		 * @generated
		 */
		EClass INTERCONNECT_RESOURCES_TYPE = eINSTANCE.getInterconnectResourcesType();

		/**
		 * The meta object literal for the '<em><b>Interconnect Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE = eINSTANCE.getInterconnectResourcesType_InterconnectResource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.InterconnectsTypeImpl <em>Interconnects Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.InterconnectsTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getInterconnectsType()
		 * @generated
		 */
		EClass INTERCONNECTS_TYPE = eINSTANCE.getInterconnectsType();

		/**
		 * The meta object literal for the '<em><b>Interconnect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECTS_TYPE__INTERCONNECT = eINSTANCE.getInterconnectsType_Interconnect();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl <em>Interconnect Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getInterconnectType()
		 * @generated
		 */
		EClass INTERCONNECT_TYPE = eINSTANCE.getInterconnectType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCONNECT_TYPE__NAME = eINSTANCE.getInterconnectType_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCONNECT_TYPE__LABEL = eINSTANCE.getInterconnectType_Label();

		/**
		 * The meta object literal for the '<em><b>Interconnect Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT_TYPE__INTERCONNECT_RESOURCES = eINSTANCE.getInterconnectType_InterconnectResources();

		/**
		 * The meta object literal for the '<em><b>Connected Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT_TYPE__CONNECTED_NODES = eINSTANCE.getInterconnectType_ConnectedNodes();

		/**
		 * The meta object literal for the '<em><b>Connected Bridges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCONNECT_TYPE__CONNECTED_BRIDGES = eINSTANCE.getInterconnectType_ConnectedBridges();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.NodeContainersTypeImpl <em>Node Containers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.NodeContainersTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodeContainersType()
		 * @generated
		 */
		EClass NODE_CONTAINERS_TYPE = eINSTANCE.getNodeContainersType();

		/**
		 * The meta object literal for the '<em><b>Node Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONTAINERS_TYPE__NODE_CONTAINER = eINSTANCE.getNodeContainersType_NodeContainer();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.NodePropertiesTypeImpl <em>Node Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.NodePropertiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodePropertiesType()
		 * @generated
		 */
		EClass NODE_PROPERTIES_TYPE = eINSTANCE.getNodePropertiesType();

		/**
		 * The meta object literal for the '<em><b>Node Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PROPERTIES_TYPE__NODE_PROPERTY = eINSTANCE.getNodePropertiesType_NodeProperty();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.NodeResourcesTypeImpl <em>Node Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.NodeResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodeResourcesType()
		 * @generated
		 */
		EClass NODE_RESOURCES_TYPE = eINSTANCE.getNodeResourcesType();

		/**
		 * The meta object literal for the '<em><b>Node Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESOURCES_TYPE__NODE_RESOURCE = eINSTANCE.getNodeResourcesType_NodeResource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.NodesTypeImpl <em>Nodes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.NodesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodesType()
		 * @generated
		 */
		EClass NODES_TYPE = eINSTANCE.getNodesType();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_TYPE__NODE = eINSTANCE.getNodesType_Node();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__NAME = eINSTANCE.getNodeType_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__LABEL = eINSTANCE.getNodeType_Label();

		/**
		 * The meta object literal for the '<em><b>Node Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__NODE_RESOURCES = eINSTANCE.getNodeType_NodeResources();

		/**
		 * The meta object literal for the '<em><b>Node Containers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__NODE_CONTAINERS = eINSTANCE.getNodeType_NodeContainers();

		/**
		 * The meta object literal for the '<em><b>Node Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TYPE__NODE_PROPERTIES = eINSTANCE.getNodeType_NodeProperties();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourcePropertiesTypeImpl <em>Runtime Resource Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourcePropertiesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourcePropertiesType()
		 * @generated
		 */
		EClass RUNTIME_RESOURCE_PROPERTIES_TYPE = eINSTANCE.getRuntimeResourcePropertiesType();

		/**
		 * The meta object literal for the '<em><b>Resource Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY = eINSTANCE.getRuntimeResourcePropertiesType_ResourceProperty();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourcesTypeImpl <em>Runtime Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourcesType()
		 * @generated
		 */
		EClass RUNTIME_RESOURCES_TYPE = eINSTANCE.getRuntimeResourcesType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_RESOURCES_TYPE__RESOURCE = eINSTANCE.getRuntimeResourcesType_Resource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl <em>Runtime Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourceType()
		 * @generated
		 */
		EClass RUNTIME_RESOURCE_TYPE = eINSTANCE.getRuntimeResourceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_RESOURCE_TYPE__NAME = eINSTANCE.getRuntimeResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_RESOURCE_TYPE__VERSION = eINSTANCE.getRuntimeResourceType_Version();

		/**
		 * The meta object literal for the '<em><b>Runtime Resource Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES = eINSTANCE.getRuntimeResourceType_RuntimeResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Runtime Resource Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES = eINSTANCE.getRuntimeResourceType_RuntimeResourceProperties();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_RESOURCE_TYPE__STATUS = eINSTANCE.getRuntimeResourceType_Status();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypesTypeImpl <em>Runtime Resource Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeResourceTypesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeResourceTypesType()
		 * @generated
		 */
		EClass RUNTIME_RESOURCE_TYPES_TYPE = eINSTANCE.getRuntimeResourceTypesType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_RESOURCE_TYPES_TYPE__TYPE = eINSTANCE.getRuntimeResourceTypesType_Type();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitsTypeImpl <em>Runtime Units Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeUnitsTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeUnitsType()
		 * @generated
		 */
		EClass RUNTIME_UNITS_TYPE = eINSTANCE.getRuntimeUnitsType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_UNITS_TYPE__UNIT = eINSTANCE.getRuntimeUnitsType_Unit();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl <em>Runtime Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.RuntimeUnitTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getRuntimeUnitType()
		 * @generated
		 */
		EClass RUNTIME_UNIT_TYPE = eINSTANCE.getRuntimeUnitType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_UNIT_TYPE__NAME = eINSTANCE.getRuntimeUnitType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_UNIT_TYPE__VERSION = eINSTANCE.getRuntimeUnitType_Version();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_UNIT_TYPE__STATUS = eINSTANCE.getRuntimeUnitType_Status();

		/**
		 * The meta object literal for the '<em><b>Runtime Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES = eINSTANCE.getRuntimeUnitType_RuntimeResources();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.SharedResourcesTypeImpl <em>Shared Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.SharedResourcesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getSharedResourcesType()
		 * @generated
		 */
		EClass SHARED_RESOURCES_TYPE = eINSTANCE.getSharedResourcesType();

		/**
		 * The meta object literal for the '<em><b>Shared Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_RESOURCES_TYPE__SHARED_RESOURCE = eINSTANCE.getSharedResourcesType_SharedResource();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.SupportedPackagesTypeImpl <em>Supported Packages Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.SupportedPackagesTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getSupportedPackagesType()
		 * @generated
		 */
		EClass SUPPORTED_PACKAGES_TYPE = eINSTANCE.getSupportedPackagesType();

		/**
		 * The meta object literal for the '<em><b>Container Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE = eINSTANCE.getSupportedPackagesType_ContainerPackage();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.impl.SupportedPackageTypeImpl <em>Supported Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.impl.SupportedPackageTypeImpl
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getSupportedPackageType()
		 * @generated
		 */
		EClass SUPPORTED_PACKAGE_TYPE = eINSTANCE.getSupportedPackageType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_PACKAGE_TYPE__VERSION = eINSTANCE.getSupportedPackageType_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_PACKAGE_TYPE__TYPE = eINSTANCE.getSupportedPackageType_Type();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.deployment.target.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.StatusType
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em>Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.deployment.target.StatusType
		 * @see es.itecban.deployment.model.deployment.target.impl.TargetPackageImpl#getStatusTypeObject()
		 * @generated
		 */
		EDataType STATUS_TYPE_OBJECT = eINSTANCE.getStatusTypeObject();

	}

} //TargetPackage

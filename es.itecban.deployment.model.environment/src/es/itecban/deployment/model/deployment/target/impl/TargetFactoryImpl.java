/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetFactoryImpl extends EFactoryImpl implements TargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetFactory init() {
		try {
			TargetFactory theTargetFactory = (TargetFactory)EPackage.Registry.INSTANCE.getEFactory("http://model.deployment.itecban.es/DeploymentTarget"); 
			if (theTargetFactory != null) {
				return theTargetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TargetPackage.BRIDGE_RESOURCES_TYPE: return createBridgeResourcesType();
			case TargetPackage.BRIDGES_TYPE: return createBridgesType();
			case TargetPackage.BRIDGE_TYPE: return createBridgeType();
			case TargetPackage.CONNECTED_BRIDGES_TYPE: return createConnectedBridgesType();
			case TargetPackage.CONNECTED_NODES_TYPE: return createConnectedNodesType();
			case TargetPackage.CONTAINER_PROPERTIES_TYPE: return createContainerPropertiesType();
			case TargetPackage.CONTAINER_RESOURCES_TYPE: return createContainerResourcesType();
			case TargetPackage.CONTAINER_TYPE: return createContainerType();
			case TargetPackage.CONTAINER_TYPES_TYPE: return createContainerTypesType();
			case TargetPackage.CONTAINER_TYPE_TYPE: return createContainerTypeType();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE: return createDeploymentTargetType();
			case TargetPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE: return createInterconnectResourcesType();
			case TargetPackage.INTERCONNECTS_TYPE: return createInterconnectsType();
			case TargetPackage.INTERCONNECT_TYPE: return createInterconnectType();
			case TargetPackage.NODE_CONTAINERS_TYPE: return createNodeContainersType();
			case TargetPackage.NODE_PROPERTIES_TYPE: return createNodePropertiesType();
			case TargetPackage.NODE_RESOURCES_TYPE: return createNodeResourcesType();
			case TargetPackage.NODES_TYPE: return createNodesType();
			case TargetPackage.NODE_TYPE: return createNodeType();
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE: return createRuntimeResourcePropertiesType();
			case TargetPackage.RUNTIME_RESOURCES_TYPE: return createRuntimeResourcesType();
			case TargetPackage.RUNTIME_RESOURCE_TYPE: return createRuntimeResourceType();
			case TargetPackage.RUNTIME_RESOURCE_TYPES_TYPE: return createRuntimeResourceTypesType();
			case TargetPackage.RUNTIME_UNITS_TYPE: return createRuntimeUnitsType();
			case TargetPackage.RUNTIME_UNIT_TYPE: return createRuntimeUnitType();
			case TargetPackage.SHARED_RESOURCES_TYPE: return createSharedResourcesType();
			case TargetPackage.SUPPORTED_PACKAGES_TYPE: return createSupportedPackagesType();
			case TargetPackage.SUPPORTED_PACKAGE_TYPE: return createSupportedPackageType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TargetPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case TargetPackage.STATUS_TYPE_OBJECT:
				return createStatusTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TargetPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case TargetPackage.STATUS_TYPE_OBJECT:
				return convertStatusTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeResourcesType createBridgeResourcesType() {
		BridgeResourcesTypeImpl bridgeResourcesType = new BridgeResourcesTypeImpl();
		return bridgeResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgesType createBridgesType() {
		BridgesTypeImpl bridgesType = new BridgesTypeImpl();
		return bridgesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeType createBridgeType() {
		BridgeTypeImpl bridgeType = new BridgeTypeImpl();
		return bridgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedBridgesType createConnectedBridgesType() {
		ConnectedBridgesTypeImpl connectedBridgesType = new ConnectedBridgesTypeImpl();
		return connectedBridgesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedNodesType createConnectedNodesType() {
		ConnectedNodesTypeImpl connectedNodesType = new ConnectedNodesTypeImpl();
		return connectedNodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerPropertiesType createContainerPropertiesType() {
		ContainerPropertiesTypeImpl containerPropertiesType = new ContainerPropertiesTypeImpl();
		return containerPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerResourcesType createContainerResourcesType() {
		ContainerResourcesTypeImpl containerResourcesType = new ContainerResourcesTypeImpl();
		return containerResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType createContainerType() {
		ContainerTypeImpl containerType = new ContainerTypeImpl();
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTypesType createContainerTypesType() {
		ContainerTypesTypeImpl containerTypesType = new ContainerTypesTypeImpl();
		return containerTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTypeType createContainerTypeType() {
		ContainerTypeTypeImpl containerTypeType = new ContainerTypeTypeImpl();
		return containerTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTargetType createDeploymentTargetType() {
		DeploymentTargetTypeImpl deploymentTargetType = new DeploymentTargetTypeImpl();
		return deploymentTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectResourcesType createInterconnectResourcesType() {
		InterconnectResourcesTypeImpl interconnectResourcesType = new InterconnectResourcesTypeImpl();
		return interconnectResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectsType createInterconnectsType() {
		InterconnectsTypeImpl interconnectsType = new InterconnectsTypeImpl();
		return interconnectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectType createInterconnectType() {
		InterconnectTypeImpl interconnectType = new InterconnectTypeImpl();
		return interconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeContainersType createNodeContainersType() {
		NodeContainersTypeImpl nodeContainersType = new NodeContainersTypeImpl();
		return nodeContainersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePropertiesType createNodePropertiesType() {
		NodePropertiesTypeImpl nodePropertiesType = new NodePropertiesTypeImpl();
		return nodePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResourcesType createNodeResourcesType() {
		NodeResourcesTypeImpl nodeResourcesType = new NodeResourcesTypeImpl();
		return nodeResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesType createNodesType() {
		NodesTypeImpl nodesType = new NodesTypeImpl();
		return nodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourcePropertiesType createRuntimeResourcePropertiesType() {
		RuntimeResourcePropertiesTypeImpl runtimeResourcePropertiesType = new RuntimeResourcePropertiesTypeImpl();
		return runtimeResourcePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourcesType createRuntimeResourcesType() {
		RuntimeResourcesTypeImpl runtimeResourcesType = new RuntimeResourcesTypeImpl();
		return runtimeResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourceType createRuntimeResourceType() {
		RuntimeResourceTypeImpl runtimeResourceType = new RuntimeResourceTypeImpl();
		return runtimeResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourceTypesType createRuntimeResourceTypesType() {
		RuntimeResourceTypesTypeImpl runtimeResourceTypesType = new RuntimeResourceTypesTypeImpl();
		return runtimeResourceTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeUnitsType createRuntimeUnitsType() {
		RuntimeUnitsTypeImpl runtimeUnitsType = new RuntimeUnitsTypeImpl();
		return runtimeUnitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeUnitType createRuntimeUnitType() {
		RuntimeUnitTypeImpl runtimeUnitType = new RuntimeUnitTypeImpl();
		return runtimeUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedResourcesType createSharedResourcesType() {
		SharedResourcesTypeImpl sharedResourcesType = new SharedResourcesTypeImpl();
		return sharedResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedPackagesType createSupportedPackagesType() {
		SupportedPackagesTypeImpl supportedPackagesType = new SupportedPackagesTypeImpl();
		return supportedPackagesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedPackageType createSupportedPackageType() {
		SupportedPackageTypeImpl supportedPackageType = new SupportedPackageTypeImpl();
		return supportedPackageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusTypeFromString(TargetPackage.Literals.STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusTypeToString(TargetPackage.Literals.STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPackage getTargetPackage() {
		return (TargetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetPackage getPackage() {
		return TargetPackage.eINSTANCE;
	}

} //TargetFactoryImpl

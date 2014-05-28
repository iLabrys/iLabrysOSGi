/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.util;

import es.itecban.deployment.model.deployment.target.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.target.TargetPackage
 * @generated
 */
public class TargetSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TargetPackage.BRIDGE_RESOURCES_TYPE: {
				BridgeResourcesType bridgeResourcesType = (BridgeResourcesType)theEObject;
				T result = caseBridgeResourcesType(bridgeResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.BRIDGES_TYPE: {
				BridgesType bridgesType = (BridgesType)theEObject;
				T result = caseBridgesType(bridgesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.BRIDGE_TYPE: {
				BridgeType bridgeType = (BridgeType)theEObject;
				T result = caseBridgeType(bridgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONNECTED_BRIDGES_TYPE: {
				ConnectedBridgesType connectedBridgesType = (ConnectedBridgesType)theEObject;
				T result = caseConnectedBridgesType(connectedBridgesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONNECTED_NODES_TYPE: {
				ConnectedNodesType connectedNodesType = (ConnectedNodesType)theEObject;
				T result = caseConnectedNodesType(connectedNodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONTAINER_PROPERTIES_TYPE: {
				ContainerPropertiesType containerPropertiesType = (ContainerPropertiesType)theEObject;
				T result = caseContainerPropertiesType(containerPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONTAINER_RESOURCES_TYPE: {
				ContainerResourcesType containerResourcesType = (ContainerResourcesType)theEObject;
				T result = caseContainerResourcesType(containerResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONTAINER_TYPE: {
				ContainerType containerType = (ContainerType)theEObject;
				T result = caseContainerType(containerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONTAINER_TYPES_TYPE: {
				ContainerTypesType containerTypesType = (ContainerTypesType)theEObject;
				T result = caseContainerTypesType(containerTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.CONTAINER_TYPE_TYPE: {
				ContainerTypeType containerTypeType = (ContainerTypeType)theEObject;
				T result = caseContainerTypeType(containerTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.DEPLOYMENT_TARGET_TYPE: {
				DeploymentTargetType deploymentTargetType = (DeploymentTargetType)theEObject;
				T result = caseDeploymentTargetType(deploymentTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.INTERCONNECT_RESOURCES_TYPE: {
				InterconnectResourcesType interconnectResourcesType = (InterconnectResourcesType)theEObject;
				T result = caseInterconnectResourcesType(interconnectResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.INTERCONNECTS_TYPE: {
				InterconnectsType interconnectsType = (InterconnectsType)theEObject;
				T result = caseInterconnectsType(interconnectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.INTERCONNECT_TYPE: {
				InterconnectType interconnectType = (InterconnectType)theEObject;
				T result = caseInterconnectType(interconnectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.NODE_CONTAINERS_TYPE: {
				NodeContainersType nodeContainersType = (NodeContainersType)theEObject;
				T result = caseNodeContainersType(nodeContainersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.NODE_PROPERTIES_TYPE: {
				NodePropertiesType nodePropertiesType = (NodePropertiesType)theEObject;
				T result = caseNodePropertiesType(nodePropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.NODE_RESOURCES_TYPE: {
				NodeResourcesType nodeResourcesType = (NodeResourcesType)theEObject;
				T result = caseNodeResourcesType(nodeResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.NODES_TYPE: {
				NodesType nodesType = (NodesType)theEObject;
				T result = caseNodesType(nodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.NODE_TYPE: {
				NodeType nodeType = (NodeType)theEObject;
				T result = caseNodeType(nodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.RUNTIME_RESOURCE_PROPERTIES_TYPE: {
				RuntimeResourcePropertiesType runtimeResourcePropertiesType = (RuntimeResourcePropertiesType)theEObject;
				T result = caseRuntimeResourcePropertiesType(runtimeResourcePropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.RUNTIME_RESOURCES_TYPE: {
				RuntimeResourcesType runtimeResourcesType = (RuntimeResourcesType)theEObject;
				T result = caseRuntimeResourcesType(runtimeResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.RUNTIME_RESOURCE_TYPE: {
				RuntimeResourceType runtimeResourceType = (RuntimeResourceType)theEObject;
				T result = caseRuntimeResourceType(runtimeResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.RUNTIME_RESOURCE_TYPES_TYPE: {
				RuntimeResourceTypesType runtimeResourceTypesType = (RuntimeResourceTypesType)theEObject;
				T result = caseRuntimeResourceTypesType(runtimeResourceTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.RUNTIME_UNITS_TYPE: {
				RuntimeUnitsType runtimeUnitsType = (RuntimeUnitsType)theEObject;
				T result = caseRuntimeUnitsType(runtimeUnitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.RUNTIME_UNIT_TYPE: {
				RuntimeUnitType runtimeUnitType = (RuntimeUnitType)theEObject;
				T result = caseRuntimeUnitType(runtimeUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.SHARED_RESOURCES_TYPE: {
				SharedResourcesType sharedResourcesType = (SharedResourcesType)theEObject;
				T result = caseSharedResourcesType(sharedResourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.SUPPORTED_PACKAGES_TYPE: {
				SupportedPackagesType supportedPackagesType = (SupportedPackagesType)theEObject;
				T result = caseSupportedPackagesType(supportedPackagesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPackage.SUPPORTED_PACKAGE_TYPE: {
				SupportedPackageType supportedPackageType = (SupportedPackageType)theEObject;
				T result = caseSupportedPackageType(supportedPackageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgeResourcesType(BridgeResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgesType(BridgesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgeType(BridgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connected Bridges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connected Bridges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectedBridgesType(ConnectedBridgesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connected Nodes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connected Nodes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectedNodesType(ConnectedNodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerPropertiesType(ContainerPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerResourcesType(ContainerResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerType(ContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerTypesType(ContainerTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerTypeType(ContainerTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTargetType(DeploymentTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnect Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnect Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectResourcesType(InterconnectResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectsType(InterconnectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectType(InterconnectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Containers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Containers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeContainersType(NodeContainersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePropertiesType(NodePropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeResourcesType(NodeResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodesType(NodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeType(NodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Resource Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Resource Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeResourcePropertiesType(RuntimeResourcePropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeResourcesType(RuntimeResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeResourceType(RuntimeResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Resource Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Resource Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeResourceTypesType(RuntimeResourceTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Units Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Units Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeUnitsType(RuntimeUnitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeUnitType(RuntimeUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedResourcesType(SharedResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Packages Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Packages Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedPackagesType(SupportedPackagesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedPackageType(SupportedPackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TargetSwitch

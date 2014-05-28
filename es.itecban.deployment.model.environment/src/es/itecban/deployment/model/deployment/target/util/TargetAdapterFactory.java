/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.util;

import es.itecban.deployment.model.deployment.target.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.target.TargetPackage
 * @generated
 */
public class TargetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TargetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetSwitch<Adapter> modelSwitch =
		new TargetSwitch<Adapter>() {
			@Override
			public Adapter caseBridgeResourcesType(BridgeResourcesType object) {
				return createBridgeResourcesTypeAdapter();
			}
			@Override
			public Adapter caseBridgesType(BridgesType object) {
				return createBridgesTypeAdapter();
			}
			@Override
			public Adapter caseBridgeType(BridgeType object) {
				return createBridgeTypeAdapter();
			}
			@Override
			public Adapter caseConnectedBridgesType(ConnectedBridgesType object) {
				return createConnectedBridgesTypeAdapter();
			}
			@Override
			public Adapter caseConnectedNodesType(ConnectedNodesType object) {
				return createConnectedNodesTypeAdapter();
			}
			@Override
			public Adapter caseContainerPropertiesType(ContainerPropertiesType object) {
				return createContainerPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseContainerResourcesType(ContainerResourcesType object) {
				return createContainerResourcesTypeAdapter();
			}
			@Override
			public Adapter caseContainerType(ContainerType object) {
				return createContainerTypeAdapter();
			}
			@Override
			public Adapter caseContainerTypesType(ContainerTypesType object) {
				return createContainerTypesTypeAdapter();
			}
			@Override
			public Adapter caseContainerTypeType(ContainerTypeType object) {
				return createContainerTypeTypeAdapter();
			}
			@Override
			public Adapter caseDeploymentTargetType(DeploymentTargetType object) {
				return createDeploymentTargetTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseInterconnectResourcesType(InterconnectResourcesType object) {
				return createInterconnectResourcesTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectsType(InterconnectsType object) {
				return createInterconnectsTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectType(InterconnectType object) {
				return createInterconnectTypeAdapter();
			}
			@Override
			public Adapter caseNodeContainersType(NodeContainersType object) {
				return createNodeContainersTypeAdapter();
			}
			@Override
			public Adapter caseNodePropertiesType(NodePropertiesType object) {
				return createNodePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseNodeResourcesType(NodeResourcesType object) {
				return createNodeResourcesTypeAdapter();
			}
			@Override
			public Adapter caseNodesType(NodesType object) {
				return createNodesTypeAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeResourcePropertiesType(RuntimeResourcePropertiesType object) {
				return createRuntimeResourcePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeResourcesType(RuntimeResourcesType object) {
				return createRuntimeResourcesTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeResourceType(RuntimeResourceType object) {
				return createRuntimeResourceTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeResourceTypesType(RuntimeResourceTypesType object) {
				return createRuntimeResourceTypesTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeUnitsType(RuntimeUnitsType object) {
				return createRuntimeUnitsTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeUnitType(RuntimeUnitType object) {
				return createRuntimeUnitTypeAdapter();
			}
			@Override
			public Adapter caseSharedResourcesType(SharedResourcesType object) {
				return createSharedResourcesTypeAdapter();
			}
			@Override
			public Adapter caseSupportedPackagesType(SupportedPackagesType object) {
				return createSupportedPackagesTypeAdapter();
			}
			@Override
			public Adapter caseSupportedPackageType(SupportedPackageType object) {
				return createSupportedPackageTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.BridgeResourcesType <em>Bridge Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.BridgeResourcesType
	 * @generated
	 */
	public Adapter createBridgeResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.BridgesType <em>Bridges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.BridgesType
	 * @generated
	 */
	public Adapter createBridgesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.BridgeType
	 * @generated
	 */
	public Adapter createBridgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ConnectedBridgesType <em>Connected Bridges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ConnectedBridgesType
	 * @generated
	 */
	public Adapter createConnectedBridgesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ConnectedNodesType <em>Connected Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ConnectedNodesType
	 * @generated
	 */
	public Adapter createConnectedNodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ContainerPropertiesType <em>Container Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ContainerPropertiesType
	 * @generated
	 */
	public Adapter createContainerPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ContainerResourcesType <em>Container Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ContainerResourcesType
	 * @generated
	 */
	public Adapter createContainerResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ContainerType
	 * @generated
	 */
	public Adapter createContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ContainerTypesType <em>Container Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypesType
	 * @generated
	 */
	public Adapter createContainerTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.ContainerTypeType <em>Container Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.ContainerTypeType
	 * @generated
	 */
	public Adapter createContainerTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.DeploymentTargetType <em>Deployment Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.DeploymentTargetType
	 * @generated
	 */
	public Adapter createDeploymentTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.InterconnectResourcesType <em>Interconnect Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectResourcesType
	 * @generated
	 */
	public Adapter createInterconnectResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.InterconnectsType <em>Interconnects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectsType
	 * @generated
	 */
	public Adapter createInterconnectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.InterconnectType <em>Interconnect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.InterconnectType
	 * @generated
	 */
	public Adapter createInterconnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.NodeContainersType <em>Node Containers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.NodeContainersType
	 * @generated
	 */
	public Adapter createNodeContainersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.NodePropertiesType <em>Node Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.NodePropertiesType
	 * @generated
	 */
	public Adapter createNodePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.NodeResourcesType <em>Node Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.NodeResourcesType
	 * @generated
	 */
	public Adapter createNodeResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.NodesType <em>Nodes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.NodesType
	 * @generated
	 */
	public Adapter createNodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType <em>Runtime Resource Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType
	 * @generated
	 */
	public Adapter createRuntimeResourcePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourcesType <em>Runtime Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourcesType
	 * @generated
	 */
	public Adapter createRuntimeResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceType <em>Runtime Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceType
	 * @generated
	 */
	public Adapter createRuntimeResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType <em>Runtime Resource Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType
	 * @generated
	 */
	public Adapter createRuntimeResourceTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitsType <em>Runtime Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitsType
	 * @generated
	 */
	public Adapter createRuntimeUnitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType <em>Runtime Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.RuntimeUnitType
	 * @generated
	 */
	public Adapter createRuntimeUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.SharedResourcesType <em>Shared Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.SharedResourcesType
	 * @generated
	 */
	public Adapter createSharedResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.SupportedPackagesType <em>Supported Packages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackagesType
	 * @generated
	 */
	public Adapter createSupportedPackagesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.target.SupportedPackageType <em>Supported Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.target.SupportedPackageType
	 * @generated
	 */
	public Adapter createSupportedPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TargetAdapterFactory

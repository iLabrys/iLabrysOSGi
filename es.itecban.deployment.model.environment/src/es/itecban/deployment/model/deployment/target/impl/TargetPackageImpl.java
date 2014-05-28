/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.BridgeResourcesType;
import es.itecban.deployment.model.deployment.target.BridgeType;
import es.itecban.deployment.model.deployment.target.BridgesType;
import es.itecban.deployment.model.deployment.target.ConnectedBridgesType;
import es.itecban.deployment.model.deployment.target.ConnectedNodesType;
import es.itecban.deployment.model.deployment.target.ContainerPropertiesType;
import es.itecban.deployment.model.deployment.target.ContainerResourcesType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.ContainerTypesType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.DocumentRoot;
import es.itecban.deployment.model.deployment.target.InterconnectResourcesType;
import es.itecban.deployment.model.deployment.target.InterconnectType;
import es.itecban.deployment.model.deployment.target.InterconnectsType;
import es.itecban.deployment.model.deployment.target.NodeContainersType;
import es.itecban.deployment.model.deployment.target.NodePropertiesType;
import es.itecban.deployment.model.deployment.target.NodeResourcesType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.NodesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourcePropertiesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceTypesType;
import es.itecban.deployment.model.deployment.target.RuntimeResourcesType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitsType;
import es.itecban.deployment.model.deployment.target.SharedResourcesType;
import es.itecban.deployment.model.deployment.target.StatusType;
import es.itecban.deployment.model.deployment.target.SupportedPackageType;
import es.itecban.deployment.model.deployment.target.SupportedPackagesType;
import es.itecban.deployment.model.deployment.target.TargetFactory;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import es.itecban.deployment.model.deployment.unit.UnitPackage;

import es.itecban.deployment.model.deployment.unit.impl.UnitPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPackageImpl extends EPackageImpl implements TargetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectedBridgesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectedNodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interconnectResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interconnectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interconnectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeContainersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeResourcePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeResourceTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeUnitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedPackagesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedPackageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetPackageImpl() {
		super(eNS_URI, TargetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetPackage init() {
		if (isInited) return (TargetPackage)EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);

		// Obtain or create and register package
		TargetPackageImpl theTargetPackage = (TargetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TargetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TargetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI) : UnitPackage.eINSTANCE);

		// Create package meta-data objects
		theTargetPackage.createPackageContents();
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theTargetPackage.initializePackageContents();
		theUnitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetPackage.freeze();

		return theTargetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgeResourcesType() {
		return bridgeResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridgeResourcesType_BridgeResource() {
		return (EReference)bridgeResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgesType() {
		return bridgesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridgesType_Bridge() {
		return (EReference)bridgesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgeType() {
		return bridgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBridgeType_Name() {
		return (EAttribute)bridgeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBridgeType_Label() {
		return (EAttribute)bridgeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridgeType_BridgeResources() {
		return (EReference)bridgeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectedBridgesType() {
		return connectedBridgesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectedBridgesType_Bridge() {
		return (EReference)connectedBridgesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectedNodesType() {
		return connectedNodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectedNodesType_Nodes() {
		return (EReference)connectedNodesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerPropertiesType() {
		return containerPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerPropertiesType_ContainerProperty() {
		return (EReference)containerPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerResourcesType() {
		return containerResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerResourcesType_ContainerResource() {
		return (EReference)containerResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerType() {
		return containerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerType_Name() {
		return (EAttribute)containerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_ContainerTypes() {
		return (EReference)containerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_SupportedPackages() {
		return (EReference)containerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_ContainerResources() {
		return (EReference)containerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_ContainerProperties() {
		return (EReference)containerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_RuntimeUnits() {
		return (EReference)containerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerTypesType() {
		return containerTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerTypesType_ContainerType() {
		return (EReference)containerTypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerTypeType() {
		return containerTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerTypeType_Name() {
		return (EAttribute)containerTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerTypeType_Version() {
		return (EAttribute)containerTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTargetType() {
		return deploymentTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentTargetType_Name() {
		return (EAttribute)deploymentTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentTargetType_UUID() {
		return (EAttribute)deploymentTargetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTargetType_Nodes() {
		return (EReference)deploymentTargetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTargetType_Bridges() {
		return (EReference)deploymentTargetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTargetType_Interconnects() {
		return (EReference)deploymentTargetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTargetType_SharedResources() {
		return (EReference)deploymentTargetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentTargetType_Timestamp() {
		return (EAttribute)deploymentTargetTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bridge() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Container() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContainerType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Domain() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Interconnect() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Node() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RuntimeResource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RuntimeUnit() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Status() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SupportedPackage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterconnectResourcesType() {
		return interconnectResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectResourcesType_InterconnectResource() {
		return (EReference)interconnectResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterconnectsType() {
		return interconnectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectsType_Interconnect() {
		return (EReference)interconnectsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterconnectType() {
		return interconnectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterconnectType_Name() {
		return (EAttribute)interconnectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterconnectType_Label() {
		return (EAttribute)interconnectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectType_InterconnectResources() {
		return (EReference)interconnectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectType_ConnectedNodes() {
		return (EReference)interconnectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterconnectType_ConnectedBridges() {
		return (EReference)interconnectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeContainersType() {
		return nodeContainersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeContainersType_NodeContainer() {
		return (EReference)nodeContainersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodePropertiesType() {
		return nodePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePropertiesType_NodeProperty() {
		return (EReference)nodePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeResourcesType() {
		return nodeResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeResourcesType_NodeResource() {
		return (EReference)nodeResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodesType() {
		return nodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodesType_Node() {
		return (EReference)nodesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType() {
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Name() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Label() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_NodeResources() {
		return (EReference)nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_NodeContainers() {
		return (EReference)nodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_NodeProperties() {
		return (EReference)nodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeResourcePropertiesType() {
		return runtimeResourcePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeResourcePropertiesType_ResourceProperty() {
		return (EReference)runtimeResourcePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeResourcesType() {
		return runtimeResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeResourcesType_Resource() {
		return (EReference)runtimeResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeResourceType() {
		return runtimeResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeResourceType_Name() {
		return (EAttribute)runtimeResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeResourceType_Version() {
		return (EAttribute)runtimeResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeResourceType_RuntimeResourceTypes() {
		return (EReference)runtimeResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeResourceType_RuntimeResourceProperties() {
		return (EReference)runtimeResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeResourceType_Status() {
		return (EAttribute)runtimeResourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeResourceTypesType() {
		return runtimeResourceTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeResourceTypesType_Type() {
		return (EAttribute)runtimeResourceTypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeUnitsType() {
		return runtimeUnitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeUnitsType_Unit() {
		return (EReference)runtimeUnitsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeUnitType() {
		return runtimeUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeUnitType_Name() {
		return (EAttribute)runtimeUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeUnitType_Version() {
		return (EAttribute)runtimeUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeUnitType_Status() {
		return (EAttribute)runtimeUnitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeUnitType_RuntimeResources() {
		return (EReference)runtimeUnitTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedResourcesType() {
		return sharedResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedResourcesType_SharedResource() {
		return (EReference)sharedResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedPackagesType() {
		return supportedPackagesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedPackagesType_ContainerPackage() {
		return (EReference)supportedPackagesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedPackageType() {
		return supportedPackageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedPackageType_Version() {
		return (EAttribute)supportedPackageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedPackageType_Type() {
		return (EAttribute)supportedPackageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusTypeObject() {
		return statusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFactory getTargetFactory() {
		return (TargetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bridgeResourcesTypeEClass = createEClass(BRIDGE_RESOURCES_TYPE);
		createEReference(bridgeResourcesTypeEClass, BRIDGE_RESOURCES_TYPE__BRIDGE_RESOURCE);

		bridgesTypeEClass = createEClass(BRIDGES_TYPE);
		createEReference(bridgesTypeEClass, BRIDGES_TYPE__BRIDGE);

		bridgeTypeEClass = createEClass(BRIDGE_TYPE);
		createEAttribute(bridgeTypeEClass, BRIDGE_TYPE__NAME);
		createEAttribute(bridgeTypeEClass, BRIDGE_TYPE__LABEL);
		createEReference(bridgeTypeEClass, BRIDGE_TYPE__BRIDGE_RESOURCES);

		connectedBridgesTypeEClass = createEClass(CONNECTED_BRIDGES_TYPE);
		createEReference(connectedBridgesTypeEClass, CONNECTED_BRIDGES_TYPE__BRIDGE);

		connectedNodesTypeEClass = createEClass(CONNECTED_NODES_TYPE);
		createEReference(connectedNodesTypeEClass, CONNECTED_NODES_TYPE__NODES);

		containerPropertiesTypeEClass = createEClass(CONTAINER_PROPERTIES_TYPE);
		createEReference(containerPropertiesTypeEClass, CONTAINER_PROPERTIES_TYPE__CONTAINER_PROPERTY);

		containerResourcesTypeEClass = createEClass(CONTAINER_RESOURCES_TYPE);
		createEReference(containerResourcesTypeEClass, CONTAINER_RESOURCES_TYPE__CONTAINER_RESOURCE);

		containerTypeEClass = createEClass(CONTAINER_TYPE);
		createEAttribute(containerTypeEClass, CONTAINER_TYPE__NAME);
		createEReference(containerTypeEClass, CONTAINER_TYPE__CONTAINER_TYPES);
		createEReference(containerTypeEClass, CONTAINER_TYPE__SUPPORTED_PACKAGES);
		createEReference(containerTypeEClass, CONTAINER_TYPE__CONTAINER_RESOURCES);
		createEReference(containerTypeEClass, CONTAINER_TYPE__CONTAINER_PROPERTIES);
		createEReference(containerTypeEClass, CONTAINER_TYPE__RUNTIME_UNITS);

		containerTypesTypeEClass = createEClass(CONTAINER_TYPES_TYPE);
		createEReference(containerTypesTypeEClass, CONTAINER_TYPES_TYPE__CONTAINER_TYPE);

		containerTypeTypeEClass = createEClass(CONTAINER_TYPE_TYPE);
		createEAttribute(containerTypeTypeEClass, CONTAINER_TYPE_TYPE__NAME);
		createEAttribute(containerTypeTypeEClass, CONTAINER_TYPE_TYPE__VERSION);

		deploymentTargetTypeEClass = createEClass(DEPLOYMENT_TARGET_TYPE);
		createEAttribute(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__NAME);
		createEAttribute(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__UUID);
		createEReference(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__NODES);
		createEReference(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__BRIDGES);
		createEReference(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__INTERCONNECTS);
		createEReference(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES);
		createEAttribute(deploymentTargetTypeEClass, DEPLOYMENT_TARGET_TYPE__TIMESTAMP);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BRIDGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTAINER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTAINER_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERCONNECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RUNTIME_RESOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RUNTIME_UNIT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STATUS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUPPORTED_PACKAGE);

		interconnectResourcesTypeEClass = createEClass(INTERCONNECT_RESOURCES_TYPE);
		createEReference(interconnectResourcesTypeEClass, INTERCONNECT_RESOURCES_TYPE__INTERCONNECT_RESOURCE);

		interconnectsTypeEClass = createEClass(INTERCONNECTS_TYPE);
		createEReference(interconnectsTypeEClass, INTERCONNECTS_TYPE__INTERCONNECT);

		interconnectTypeEClass = createEClass(INTERCONNECT_TYPE);
		createEAttribute(interconnectTypeEClass, INTERCONNECT_TYPE__NAME);
		createEAttribute(interconnectTypeEClass, INTERCONNECT_TYPE__LABEL);
		createEReference(interconnectTypeEClass, INTERCONNECT_TYPE__INTERCONNECT_RESOURCES);
		createEReference(interconnectTypeEClass, INTERCONNECT_TYPE__CONNECTED_NODES);
		createEReference(interconnectTypeEClass, INTERCONNECT_TYPE__CONNECTED_BRIDGES);

		nodeContainersTypeEClass = createEClass(NODE_CONTAINERS_TYPE);
		createEReference(nodeContainersTypeEClass, NODE_CONTAINERS_TYPE__NODE_CONTAINER);

		nodePropertiesTypeEClass = createEClass(NODE_PROPERTIES_TYPE);
		createEReference(nodePropertiesTypeEClass, NODE_PROPERTIES_TYPE__NODE_PROPERTY);

		nodeResourcesTypeEClass = createEClass(NODE_RESOURCES_TYPE);
		createEReference(nodeResourcesTypeEClass, NODE_RESOURCES_TYPE__NODE_RESOURCE);

		nodesTypeEClass = createEClass(NODES_TYPE);
		createEReference(nodesTypeEClass, NODES_TYPE__NODE);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEAttribute(nodeTypeEClass, NODE_TYPE__NAME);
		createEAttribute(nodeTypeEClass, NODE_TYPE__LABEL);
		createEReference(nodeTypeEClass, NODE_TYPE__NODE_RESOURCES);
		createEReference(nodeTypeEClass, NODE_TYPE__NODE_CONTAINERS);
		createEReference(nodeTypeEClass, NODE_TYPE__NODE_PROPERTIES);

		runtimeResourcePropertiesTypeEClass = createEClass(RUNTIME_RESOURCE_PROPERTIES_TYPE);
		createEReference(runtimeResourcePropertiesTypeEClass, RUNTIME_RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY);

		runtimeResourcesTypeEClass = createEClass(RUNTIME_RESOURCES_TYPE);
		createEReference(runtimeResourcesTypeEClass, RUNTIME_RESOURCES_TYPE__RESOURCE);

		runtimeResourceTypeEClass = createEClass(RUNTIME_RESOURCE_TYPE);
		createEAttribute(runtimeResourceTypeEClass, RUNTIME_RESOURCE_TYPE__NAME);
		createEAttribute(runtimeResourceTypeEClass, RUNTIME_RESOURCE_TYPE__VERSION);
		createEReference(runtimeResourceTypeEClass, RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_TYPES);
		createEReference(runtimeResourceTypeEClass, RUNTIME_RESOURCE_TYPE__RUNTIME_RESOURCE_PROPERTIES);
		createEAttribute(runtimeResourceTypeEClass, RUNTIME_RESOURCE_TYPE__STATUS);

		runtimeResourceTypesTypeEClass = createEClass(RUNTIME_RESOURCE_TYPES_TYPE);
		createEAttribute(runtimeResourceTypesTypeEClass, RUNTIME_RESOURCE_TYPES_TYPE__TYPE);

		runtimeUnitsTypeEClass = createEClass(RUNTIME_UNITS_TYPE);
		createEReference(runtimeUnitsTypeEClass, RUNTIME_UNITS_TYPE__UNIT);

		runtimeUnitTypeEClass = createEClass(RUNTIME_UNIT_TYPE);
		createEAttribute(runtimeUnitTypeEClass, RUNTIME_UNIT_TYPE__NAME);
		createEAttribute(runtimeUnitTypeEClass, RUNTIME_UNIT_TYPE__VERSION);
		createEAttribute(runtimeUnitTypeEClass, RUNTIME_UNIT_TYPE__STATUS);
		createEReference(runtimeUnitTypeEClass, RUNTIME_UNIT_TYPE__RUNTIME_RESOURCES);

		sharedResourcesTypeEClass = createEClass(SHARED_RESOURCES_TYPE);
		createEReference(sharedResourcesTypeEClass, SHARED_RESOURCES_TYPE__SHARED_RESOURCE);

		supportedPackagesTypeEClass = createEClass(SUPPORTED_PACKAGES_TYPE);
		createEReference(supportedPackagesTypeEClass, SUPPORTED_PACKAGES_TYPE__CONTAINER_PACKAGE);

		supportedPackageTypeEClass = createEClass(SUPPORTED_PACKAGE_TYPE);
		createEAttribute(supportedPackageTypeEClass, SUPPORTED_PACKAGE_TYPE__VERSION);
		createEAttribute(supportedPackageTypeEClass, SUPPORTED_PACKAGE_TYPE__TYPE);

		// Create enums
		statusTypeEEnum = createEEnum(STATUS_TYPE);

		// Create data types
		statusTypeObjectEDataType = createEDataType(STATUS_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UnitPackage theUnitPackage = (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(bridgeResourcesTypeEClass, BridgeResourcesType.class, "BridgeResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBridgeResourcesType_BridgeResource(), theUnitPackage.getResourceType(), null, "bridgeResource", null, 0, -1, BridgeResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bridgesTypeEClass, BridgesType.class, "BridgesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBridgesType_Bridge(), this.getBridgeType(), null, "bridge", null, 0, -1, BridgesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bridgeTypeEClass, BridgeType.class, "BridgeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBridgeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BridgeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBridgeType_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, BridgeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBridgeType_BridgeResources(), this.getBridgeResourcesType(), null, "bridgeResources", null, 1, 1, BridgeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectedBridgesTypeEClass, ConnectedBridgesType.class, "ConnectedBridgesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectedBridgesType_Bridge(), this.getBridgeType(), null, "bridge", null, 0, -1, ConnectedBridgesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectedNodesTypeEClass, ConnectedNodesType.class, "ConnectedNodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectedNodesType_Nodes(), this.getNodeType(), null, "nodes", null, 0, -1, ConnectedNodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerPropertiesTypeEClass, ContainerPropertiesType.class, "ContainerPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerPropertiesType_ContainerProperty(), theUnitPackage.getPropertyType(), null, "containerProperty", null, 0, -1, ContainerPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerResourcesTypeEClass, ContainerResourcesType.class, "ContainerResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerResourcesType_ContainerResource(), this.getRuntimeResourceType(), null, "containerResource", null, 0, -1, ContainerResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerTypeEClass, ContainerType.class, "ContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerType_ContainerTypes(), this.getContainerTypesType(), null, "containerTypes", null, 1, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerType_SupportedPackages(), this.getSupportedPackagesType(), null, "supportedPackages", null, 1, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerType_ContainerResources(), this.getContainerResourcesType(), null, "containerResources", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerType_ContainerProperties(), this.getContainerPropertiesType(), null, "containerProperties", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerType_RuntimeUnits(), this.getRuntimeUnitsType(), null, "runtimeUnits", null, 0, 1, ContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerTypesTypeEClass, ContainerTypesType.class, "ContainerTypesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerTypesType_ContainerType(), this.getContainerTypeType(), null, "containerType", null, 1, -1, ContainerTypesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerTypeTypeEClass, ContainerTypeType.class, "ContainerTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerTypeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ContainerTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerTypeType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ContainerTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentTargetTypeEClass, DeploymentTargetType.class, "DeploymentTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentTargetType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentTargetType_UUID(), theXMLTypePackage.getString(), "uUID", null, 0, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentTargetType_Nodes(), this.getNodesType(), null, "nodes", null, 0, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentTargetType_Bridges(), this.getBridgesType(), null, "bridges", null, 0, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentTargetType_Interconnects(), this.getInterconnectsType(), null, "interconnects", null, 0, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentTargetType_SharedResources(), this.getSharedResourcesType(), null, "sharedResources", null, 0, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentTargetType_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 1, 1, DeploymentTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bridge(), this.getBridgeType(), null, "bridge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Container(), this.getContainerType(), null, "container", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ContainerType(), this.getContainerTypeType(), null, "containerType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Domain(), this.getDeploymentTargetType(), null, "domain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Interconnect(), this.getInterconnectType(), null, "interconnect", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Node(), this.getNodeType(), null, "node", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RuntimeResource(), this.getRuntimeResourceType(), null, "runtimeResource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RuntimeUnit(), this.getRuntimeUnitType(), null, "runtimeUnit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Status(), this.getStatusType(), "status", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SupportedPackage(), this.getSupportedPackageType(), null, "supportedPackage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interconnectResourcesTypeEClass, InterconnectResourcesType.class, "InterconnectResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterconnectResourcesType_InterconnectResource(), theUnitPackage.getResourceType(), null, "interconnectResource", null, 0, -1, InterconnectResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interconnectsTypeEClass, InterconnectsType.class, "InterconnectsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterconnectsType_Interconnect(), this.getInterconnectType(), null, "interconnect", null, 0, -1, InterconnectsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interconnectTypeEClass, InterconnectType.class, "InterconnectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterconnectType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, InterconnectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterconnectType_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, InterconnectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterconnectType_InterconnectResources(), this.getInterconnectResourcesType(), null, "interconnectResources", null, 1, 1, InterconnectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterconnectType_ConnectedNodes(), this.getConnectedNodesType(), null, "connectedNodes", null, 1, 1, InterconnectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterconnectType_ConnectedBridges(), this.getConnectedBridgesType(), null, "connectedBridges", null, 1, 1, InterconnectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeContainersTypeEClass, NodeContainersType.class, "NodeContainersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeContainersType_NodeContainer(), this.getContainerType(), null, "nodeContainer", null, 0, -1, NodeContainersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodePropertiesTypeEClass, NodePropertiesType.class, "NodePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodePropertiesType_NodeProperty(), theUnitPackage.getPropertyType(), null, "nodeProperty", null, 0, -1, NodePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeResourcesTypeEClass, NodeResourcesType.class, "NodeResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeResourcesType_NodeResource(), theUnitPackage.getResourceType(), null, "nodeResource", null, 0, -1, NodeResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesTypeEClass, NodesType.class, "NodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodesType_Node(), this.getNodeType(), null, "node", null, 0, -1, NodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_NodeResources(), this.getNodeResourcesType(), null, "nodeResources", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_NodeContainers(), this.getNodeContainersType(), null, "nodeContainers", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeType_NodeProperties(), this.getNodePropertiesType(), null, "nodeProperties", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeResourcePropertiesTypeEClass, RuntimeResourcePropertiesType.class, "RuntimeResourcePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeResourcePropertiesType_ResourceProperty(), theUnitPackage.getPropertyType(), null, "resourceProperty", null, 0, -1, RuntimeResourcePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeResourcesTypeEClass, RuntimeResourcesType.class, "RuntimeResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeResourcesType_Resource(), this.getRuntimeResourceType(), null, "resource", null, 0, -1, RuntimeResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeResourceTypeEClass, RuntimeResourceType.class, "RuntimeResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeResourceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RuntimeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeResourceType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, RuntimeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeResourceType_RuntimeResourceTypes(), this.getRuntimeResourceTypesType(), null, "runtimeResourceTypes", null, 0, 1, RuntimeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeResourceType_RuntimeResourceProperties(), this.getRuntimeResourcePropertiesType(), null, "runtimeResourceProperties", null, 0, 1, RuntimeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeResourceType_Status(), this.getStatusType(), "status", null, 0, 1, RuntimeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeResourceTypesTypeEClass, RuntimeResourceTypesType.class, "RuntimeResourceTypesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeResourceTypesType_Type(), theXMLTypePackage.getString(), "type", null, 1, -1, RuntimeResourceTypesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeUnitsTypeEClass, RuntimeUnitsType.class, "RuntimeUnitsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeUnitsType_Unit(), this.getRuntimeUnitType(), null, "unit", null, 0, -1, RuntimeUnitsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeUnitTypeEClass, RuntimeUnitType.class, "RuntimeUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeUnitType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RuntimeUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeUnitType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, RuntimeUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeUnitType_Status(), this.getStatusType(), "status", null, 1, 1, RuntimeUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeUnitType_RuntimeResources(), this.getRuntimeResourcesType(), null, "runtimeResources", null, 0, 1, RuntimeUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedResourcesTypeEClass, SharedResourcesType.class, "SharedResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedResourcesType_SharedResource(), theUnitPackage.getResourceType(), null, "sharedResource", null, 0, -1, SharedResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedPackagesTypeEClass, SupportedPackagesType.class, "SupportedPackagesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedPackagesType_ContainerPackage(), this.getSupportedPackageType(), null, "containerPackage", null, 0, -1, SupportedPackagesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedPackageTypeEClass, SupportedPackageType.class, "SupportedPackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportedPackageType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, SupportedPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportedPackageType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, SupportedPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.ACTIVE);
		addEEnumLiteral(statusTypeEEnum, StatusType.INACTIVE);
		addEEnumLiteral(statusTypeEEnum, StatusType.INSTALLED);

		// Initialize data types
		initEDataType(statusTypeObjectEDataType, StatusType.class, "StatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (bridgeResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bridgeResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBridgeResourcesType_BridgeResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bridgeResource"
		   });		
		addAnnotation
		  (bridgesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bridges_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBridgesType_Bridge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bridge"
		   });		
		addAnnotation
		  (bridgeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BridgeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getBridgeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getBridgeType_Label(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label"
		   });		
		addAnnotation
		  (getBridgeType_BridgeResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bridgeResources"
		   });		
		addAnnotation
		  (connectedBridgesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "connectedBridges_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConnectedBridgesType_Bridge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bridge"
		   });		
		addAnnotation
		  (connectedNodesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "connectedNodes_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConnectedNodesType_Nodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodes"
		   });		
		addAnnotation
		  (containerPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "containerProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerPropertiesType_ContainerProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerProperty"
		   });		
		addAnnotation
		  (containerResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "containerResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerResourcesType_ContainerResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerResource"
		   });		
		addAnnotation
		  (containerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ContainerType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getContainerType_ContainerTypes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerTypes"
		   });		
		addAnnotation
		  (getContainerType_SupportedPackages(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportedPackages"
		   });		
		addAnnotation
		  (getContainerType_ContainerResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerResources"
		   });		
		addAnnotation
		  (getContainerType_ContainerProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerProperties"
		   });		
		addAnnotation
		  (getContainerType_RuntimeUnits(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtimeUnits"
		   });		
		addAnnotation
		  (containerTypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "containerTypes_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerTypesType_ContainerType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerType"
		   });		
		addAnnotation
		  (containerTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ContainerTypeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainerTypeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getContainerTypeType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (deploymentTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeploymentTargetType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDeploymentTargetType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getDeploymentTargetType_UUID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UUID"
		   });		
		addAnnotation
		  (getDeploymentTargetType_Nodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodes"
		   });		
		addAnnotation
		  (getDeploymentTargetType_Bridges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bridges"
		   });		
		addAnnotation
		  (getDeploymentTargetType_Interconnects(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interconnects"
		   });		
		addAnnotation
		  (getDeploymentTargetType_SharedResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sharedResources"
		   });		
		addAnnotation
		  (getDeploymentTargetType_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "timestamp"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Bridge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bridge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Container(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "container",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ContainerType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Domain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Interconnect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interconnect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Node(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RuntimeResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtimeResource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RuntimeUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtimeUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SupportedPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportedPackage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (interconnectResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "interconnectResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInterconnectResourcesType_InterconnectResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interconnectResource"
		   });		
		addAnnotation
		  (interconnectsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "interconnects_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInterconnectsType_Interconnect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interconnect"
		   });		
		addAnnotation
		  (interconnectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InterconnectType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getInterconnectType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getInterconnectType_Label(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label"
		   });		
		addAnnotation
		  (getInterconnectType_InterconnectResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interconnectResources"
		   });		
		addAnnotation
		  (getInterconnectType_ConnectedNodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connectedNodes"
		   });		
		addAnnotation
		  (getInterconnectType_ConnectedBridges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connectedBridges"
		   });		
		addAnnotation
		  (nodeContainersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nodeContainers_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNodeContainersType_NodeContainer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodeContainer"
		   });		
		addAnnotation
		  (nodePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nodeProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNodePropertiesType_NodeProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodeProperty"
		   });		
		addAnnotation
		  (nodeResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nodeResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNodeResourcesType_NodeResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodeResource"
		   });		
		addAnnotation
		  (nodesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nodes_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNodesType_Node(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node"
		   });		
		addAnnotation
		  (nodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NodeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getNodeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getNodeType_Label(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label"
		   });		
		addAnnotation
		  (getNodeType_NodeResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodeResources"
		   });		
		addAnnotation
		  (getNodeType_NodeContainers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodeContainers"
		   });		
		addAnnotation
		  (getNodeType_NodeProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodeProperties"
		   });		
		addAnnotation
		  (runtimeResourcePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "runtimeResourceProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuntimeResourcePropertiesType_ResourceProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resourceProperty"
		   });		
		addAnnotation
		  (runtimeResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "runtimeResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuntimeResourcesType_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource"
		   });		
		addAnnotation
		  (runtimeResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RuntimeResourceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuntimeResourceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getRuntimeResourceType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (getRuntimeResourceType_RuntimeResourceTypes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtimeResourceTypes"
		   });		
		addAnnotation
		  (getRuntimeResourceType_RuntimeResourceProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtimeResourceProperties"
		   });		
		addAnnotation
		  (getRuntimeResourceType_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status"
		   });		
		addAnnotation
		  (runtimeResourceTypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "runtimeResourceTypes_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuntimeResourceTypesType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (runtimeUnitsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "runtimeUnits_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuntimeUnitsType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unit"
		   });		
		addAnnotation
		  (runtimeUnitTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RuntimeUnitType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuntimeUnitType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getRuntimeUnitType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (getRuntimeUnitType_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status"
		   });		
		addAnnotation
		  (getRuntimeUnitType_RuntimeResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtimeResources"
		   });		
		addAnnotation
		  (sharedResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sharedResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSharedResourcesType_SharedResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sharedResource"
		   });		
		addAnnotation
		  (statusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "StatusType"
		   });		
		addAnnotation
		  (statusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "StatusType:Object",
			 "baseType", "StatusType"
		   });		
		addAnnotation
		  (supportedPackagesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "supportedPackages_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSupportedPackagesType_ContainerPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containerPackage"
		   });		
		addAnnotation
		  (supportedPackageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SupportedPackageType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSupportedPackageType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });			
		addAnnotation
		  (getSupportedPackageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });
	}

} //TargetPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.environment.graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see es.itecban.deployment.model.environment.graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/EnvironmentGraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.environment.graph.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.environment.graph.impl.CauseImpl
	 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getCause()
	 * @generated
	 */
	int CAUSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.environment.graph.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.environment.graph.impl.DependencyImpl
	 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CAUSE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ID = 2;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LOCALITY = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAUSE = 3;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Environment Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENVIRONMENT_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NODE = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl <em>Environment Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl
	 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getEnvironmentGraph()
	 * @generated
	 */
	int ENVIRONMENT_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_GRAPH__NODE = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_GRAPH__DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_GRAPH__ORIGINS = 2;

	/**
	 * The number of structural features of the '<em>Environment Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.environment.graph.impl.NodeImpl
	 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 2;

	/**
	 * The feature id for the '<em><b>Is Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_REQUIRED_BY = 3;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNIT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Unit Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNIT_VERSION = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.environment.graph.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Cause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Cause#getName()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Cause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Cause#getType()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Cause#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Cause#getVersion()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Version();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.environment.graph.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.environment.graph.Dependency#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Dependency#getCause()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Cause();

	/**
	 * Returns the meta object for the reference '{@link es.itecban.deployment.model.environment.graph.Dependency#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Dependency#getDestination()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Destination();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Dependency#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Dependency#getId()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Dependency#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Dependency#getLocality()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Locality();

	/**
	 * Returns the meta object for the reference '{@link es.itecban.deployment.model.environment.graph.Dependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Dependency#getSource()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Source();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.environment.graph.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cause</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getCause()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cause();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getDependency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dependency();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getEnvironmentGraph <em>Environment Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment Graph</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getEnvironmentGraph()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EnvironmentGraph();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.environment.graph.DocumentRoot#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see es.itecban.deployment.model.environment.graph.DocumentRoot#getNode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Node();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph <em>Environment Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Graph</em>'.
	 * @see es.itecban.deployment.model.environment.graph.EnvironmentGraph
	 * @generated
	 */
	EClass getEnvironmentGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see es.itecban.deployment.model.environment.graph.EnvironmentGraph#getNode()
	 * @see #getEnvironmentGraph()
	 * @generated
	 */
	EReference getEnvironmentGraph_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see es.itecban.deployment.model.environment.graph.EnvironmentGraph#getDependencies()
	 * @see #getEnvironmentGraph()
	 * @generated
	 */
	EReference getEnvironmentGraph_Dependencies();

	/**
	 * Returns the meta object for the reference list '{@link es.itecban.deployment.model.environment.graph.EnvironmentGraph#getOrigins <em>Origins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Origins</em>'.
	 * @see es.itecban.deployment.model.environment.graph.EnvironmentGraph#getOrigins()
	 * @see #getEnvironmentGraph()
	 * @generated
	 */
	EReference getEnvironmentGraph_Origins();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.environment.graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Node#getContainerName <em>Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Name</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getContainerName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ContainerName();

	/**
	 * Returns the meta object for the reference list '{@link es.itecban.deployment.model.environment.graph.Node#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getDependencies()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the reference list '{@link es.itecban.deployment.model.environment.graph.Node#getIsRequiredBy <em>Is Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Required By</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getIsRequiredBy()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IsRequiredBy();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Node#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getNodeName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Node#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getUnitName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_UnitName();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.environment.graph.Node#getUnitVersion <em>Unit Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Version</em>'.
	 * @see es.itecban.deployment.model.environment.graph.Node#getUnitVersion()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_UnitVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

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
		 * The meta object literal for the '{@link es.itecban.deployment.model.environment.graph.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.environment.graph.impl.CauseImpl
		 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getCause()
		 * @generated
		 */
		EClass CAUSE = eINSTANCE.getCause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__NAME = eINSTANCE.getCause_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__TYPE = eINSTANCE.getCause_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__VERSION = eINSTANCE.getCause_Version();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.environment.graph.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.environment.graph.impl.DependencyImpl
		 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__CAUSE = eINSTANCE.getDependency_Cause();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DESTINATION = eINSTANCE.getDependency_Destination();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__ID = eINSTANCE.getDependency_Id();

		/**
		 * The meta object literal for the '<em><b>Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__LOCALITY = eINSTANCE.getDependency_Locality();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SOURCE = eINSTANCE.getDependency_Source();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAUSE = eINSTANCE.getDocumentRoot_Cause();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPENDENCY = eINSTANCE.getDocumentRoot_Dependency();

		/**
		 * The meta object literal for the '<em><b>Environment Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENVIRONMENT_GRAPH = eINSTANCE.getDocumentRoot_EnvironmentGraph();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl <em>Environment Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.environment.graph.impl.EnvironmentGraphImpl
		 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getEnvironmentGraph()
		 * @generated
		 */
		EClass ENVIRONMENT_GRAPH = eINSTANCE.getEnvironmentGraph();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_GRAPH__NODE = eINSTANCE.getEnvironmentGraph_Node();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_GRAPH__DEPENDENCIES = eINSTANCE.getEnvironmentGraph_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Origins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_GRAPH__ORIGINS = eINSTANCE.getEnvironmentGraph_Origins();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.environment.graph.impl.NodeImpl
		 * @see es.itecban.deployment.model.environment.graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CONTAINER_NAME = eINSTANCE.getNode_ContainerName();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DEPENDENCIES = eINSTANCE.getNode_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '<em><b>Is Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IS_REQUIRED_BY = eINSTANCE.getNode_IsRequiredBy();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_NAME = eINSTANCE.getNode_NodeName();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__UNIT_NAME = eINSTANCE.getNode_UnitName();

		/**
		 * The meta object literal for the '<em><b>Unit Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__UNIT_VERSION = eINSTANCE.getNode_UnitVersion();

	}

} //GraphPackage

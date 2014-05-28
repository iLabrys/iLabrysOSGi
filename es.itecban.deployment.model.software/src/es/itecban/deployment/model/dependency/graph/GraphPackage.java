/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.dependency.graph;

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
 * @see es.itecban.deployment.model.dependency.graph.GraphFactory
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
	String eNS_URI = "http://model.deployment.itecban.es/DependencyGraph";

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
	GraphPackage eINSTANCE = es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.dependency.graph.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.dependency.graph.impl.CauseImpl
	 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getCause()
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
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.dependency.graph.impl.DependencyImpl
	 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getDependency()
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
	 * The meta object id for the '{@link es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl <em>Dependency Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl
	 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getDependencyGraph()
	 * @generated
	 */
	int DEPENDENCY_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH__NODE = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH__DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH__ORIGIN = 2;

	/**
	 * The number of structural features of the '<em>Dependency Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.dependency.graph.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.dependency.graph.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Dependency Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDENCY_GRAPH = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.dependency.graph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.dependency.graph.impl.NodeImpl
	 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.dependency.graph.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.dependency.graph.Cause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Cause#getName()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.dependency.graph.Cause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Cause#getType()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_Type();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.dependency.graph.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.dependency.graph.Dependency#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Dependency#getCause()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Cause();

	/**
	 * Returns the meta object for the reference '{@link es.itecban.deployment.model.dependency.graph.Dependency#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Dependency#getDestination()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Destination();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.dependency.graph.Dependency#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Dependency#getId()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.dependency.graph.Dependency#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Dependency#getLocality()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Locality();

	/**
	 * Returns the meta object for the reference '{@link es.itecban.deployment.model.dependency.graph.Dependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Dependency#getSource()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Source();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.dependency.graph.DependencyGraph <em>Dependency Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Graph</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DependencyGraph
	 * @generated
	 */
	EClass getDependencyGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DependencyGraph#getNode()
	 * @see #getDependencyGraph()
	 * @generated
	 */
	EReference getDependencyGraph_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DependencyGraph#getDependency()
	 * @see #getDependencyGraph()
	 * @generated
	 */
	EReference getDependencyGraph_Dependency();

	/**
	 * Returns the meta object for the reference '{@link es.itecban.deployment.model.dependency.graph.DependencyGraph#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DependencyGraph#getOrigin()
	 * @see #getDependencyGraph()
	 * @generated
	 */
	EReference getDependencyGraph_Origin();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.dependency.graph.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.dependency.graph.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.dependency.graph.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.dependency.graph.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.dependency.graph.DocumentRoot#getDependencyGraph <em>Dependency Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency Graph</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.DocumentRoot#getDependencyGraph()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DependencyGraph();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.dependency.graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.dependency.graph.Node#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Node#getUnit()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Unit();

	/**
	 * Returns the meta object for the reference list '{@link es.itecban.deployment.model.dependency.graph.Node#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Node#getDependency()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.dependency.graph.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.itecban.deployment.model.dependency.graph.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

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
		 * The meta object literal for the '{@link es.itecban.deployment.model.dependency.graph.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.dependency.graph.impl.CauseImpl
		 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getCause()
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
		 * The meta object literal for the '{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.dependency.graph.impl.DependencyImpl
		 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getDependency()
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
		 * The meta object literal for the '{@link es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl <em>Dependency Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.dependency.graph.impl.DependencyGraphImpl
		 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getDependencyGraph()
		 * @generated
		 */
		EClass DEPENDENCY_GRAPH = eINSTANCE.getDependencyGraph();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_GRAPH__NODE = eINSTANCE.getDependencyGraph_Node();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_GRAPH__DEPENDENCY = eINSTANCE.getDependencyGraph_Dependency();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_GRAPH__ORIGIN = eINSTANCE.getDependencyGraph_Origin();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.dependency.graph.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.dependency.graph.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Dependency Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPENDENCY_GRAPH = eINSTANCE.getDocumentRoot_DependencyGraph();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.dependency.graph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.dependency.graph.impl.NodeImpl
		 * @see es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__UNIT = eINSTANCE.getNode_Unit();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DEPENDENCY = eINSTANCE.getNode_Dependency();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

	}

} //GraphPackage

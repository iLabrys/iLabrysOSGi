/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.environment.graph.impl;

import es.itecban.deployment.model.environment.graph.Cause;
import es.itecban.deployment.model.environment.graph.Dependency;
import es.itecban.deployment.model.environment.graph.DocumentRoot;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphPackage;
import es.itecban.deployment.model.environment.graph.Node;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getEnvironmentGraph <em>Environment Graph</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GraphPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GraphPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GraphPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cause getCause() {
		return (Cause)getMixed().get(GraphPackage.Literals.DOCUMENT_ROOT__CAUSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCause(Cause newCause, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GraphPackage.Literals.DOCUMENT_ROOT__CAUSE, newCause, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(Cause newCause) {
		((FeatureMap.Internal)getMixed()).set(GraphPackage.Literals.DOCUMENT_ROOT__CAUSE, newCause);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getDependency() {
		return (Dependency)getMixed().get(GraphPackage.Literals.DOCUMENT_ROOT__DEPENDENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependency(Dependency newDependency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GraphPackage.Literals.DOCUMENT_ROOT__DEPENDENCY, newDependency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(Dependency newDependency) {
		((FeatureMap.Internal)getMixed()).set(GraphPackage.Literals.DOCUMENT_ROOT__DEPENDENCY, newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentGraph getEnvironmentGraph() {
		return (EnvironmentGraph)getMixed().get(GraphPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT_GRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentGraph(EnvironmentGraph newEnvironmentGraph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GraphPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT_GRAPH, newEnvironmentGraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentGraph(EnvironmentGraph newEnvironmentGraph) {
		((FeatureMap.Internal)getMixed()).set(GraphPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT_GRAPH, newEnvironmentGraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return (Node)getMixed().get(GraphPackage.Literals.DOCUMENT_ROOT__NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GraphPackage.Literals.DOCUMENT_ROOT__NODE, newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		((FeatureMap.Internal)getMixed()).set(GraphPackage.Literals.DOCUMENT_ROOT__NODE, newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GraphPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).basicRemove(otherEnd, msgs);
			case GraphPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).basicRemove(otherEnd, msgs);
			case GraphPackage.DOCUMENT_ROOT__CAUSE:
				return basicSetCause(null, msgs);
			case GraphPackage.DOCUMENT_ROOT__DEPENDENCY:
				return basicSetDependency(null, msgs);
			case GraphPackage.DOCUMENT_ROOT__ENVIRONMENT_GRAPH:
				return basicSetEnvironmentGraph(null, msgs);
			case GraphPackage.DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GraphPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return ((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap();
				else return getXMLNSPrefixMap();
			case GraphPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return ((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap();
				else return getXSISchemaLocation();
			case GraphPackage.DOCUMENT_ROOT__CAUSE:
				return getCause();
			case GraphPackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency();
			case GraphPackage.DOCUMENT_ROOT__ENVIRONMENT_GRAPH:
				return getEnvironmentGraph();
			case GraphPackage.DOCUMENT_ROOT__NODE:
				return getNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GraphPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).set(newValue);
				return;
			case GraphPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).set(newValue);
				return;
			case GraphPackage.DOCUMENT_ROOT__CAUSE:
				setCause((Cause)newValue);
				return;
			case GraphPackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((Dependency)newValue);
				return;
			case GraphPackage.DOCUMENT_ROOT__ENVIRONMENT_GRAPH:
				setEnvironmentGraph((EnvironmentGraph)newValue);
				return;
			case GraphPackage.DOCUMENT_ROOT__NODE:
				setNode((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GraphPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GraphPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GraphPackage.DOCUMENT_ROOT__CAUSE:
				setCause((Cause)null);
				return;
			case GraphPackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((Dependency)null);
				return;
			case GraphPackage.DOCUMENT_ROOT__ENVIRONMENT_GRAPH:
				setEnvironmentGraph((EnvironmentGraph)null);
				return;
			case GraphPackage.DOCUMENT_ROOT__NODE:
				setNode((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GraphPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GraphPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GraphPackage.DOCUMENT_ROOT__CAUSE:
				return getCause() != null;
			case GraphPackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency() != null;
			case GraphPackage.DOCUMENT_ROOT__ENVIRONMENT_GRAPH:
				return getEnvironmentGraph() != null;
			case GraphPackage.DOCUMENT_ROOT__NODE:
				return getNode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

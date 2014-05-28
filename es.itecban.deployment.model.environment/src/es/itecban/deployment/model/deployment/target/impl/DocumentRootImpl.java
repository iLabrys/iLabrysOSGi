/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.BridgeType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.DocumentRoot;
import es.itecban.deployment.model.deployment.target.InterconnectType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.target.StatusType;
import es.itecban.deployment.model.deployment.target.SupportedPackageType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

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
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getBridge <em>Bridge</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getInterconnect <em>Interconnect</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getRuntimeResource <em>Runtime Resource</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getRuntimeUnit <em>Runtime Unit</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DocumentRootImpl#getSupportedPackage <em>Supported Package</em>}</li>
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.ACTIVE;

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
		return TargetPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TargetPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TargetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TargetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeType getBridge() {
		return (BridgeType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__BRIDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBridge(BridgeType newBridge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__BRIDGE, newBridge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBridge(BridgeType newBridge) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__BRIDGE, newBridge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType getContainer() {
		return (ContainerType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ContainerType newContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__CONTAINER, newContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ContainerType newContainer) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTypeType getContainerType() {
		return (ContainerTypeType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__CONTAINER_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerType(ContainerTypeType newContainerType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__CONTAINER_TYPE, newContainerType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(ContainerTypeType newContainerType) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__CONTAINER_TYPE, newContainerType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTargetType getDomain() {
		return (DeploymentTargetType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(DeploymentTargetType newDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__DOMAIN, newDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DeploymentTargetType newDomain) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectType getInterconnect() {
		return (InterconnectType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__INTERCONNECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterconnect(InterconnectType newInterconnect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__INTERCONNECT, newInterconnect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnect(InterconnectType newInterconnect) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__INTERCONNECT, newInterconnect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNode() {
		return (NodeType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(NodeType newNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__NODE, newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(NodeType newNode) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__NODE, newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourceType getRuntimeResource() {
		return (RuntimeResourceType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__RUNTIME_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeResource(RuntimeResourceType newRuntimeResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__RUNTIME_RESOURCE, newRuntimeResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeResource(RuntimeResourceType newRuntimeResource) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__RUNTIME_RESOURCE, newRuntimeResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeUnitType getRuntimeUnit() {
		return (RuntimeUnitType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__RUNTIME_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeUnit(RuntimeUnitType newRuntimeUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__RUNTIME_UNIT, newRuntimeUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeUnit(RuntimeUnitType newRuntimeUnit) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__RUNTIME_UNIT, newRuntimeUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return (StatusType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedPackageType getSupportedPackage() {
		return (SupportedPackageType)getMixed().get(TargetPackage.Literals.DOCUMENT_ROOT__SUPPORTED_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedPackage(SupportedPackageType newSupportedPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TargetPackage.Literals.DOCUMENT_ROOT__SUPPORTED_PACKAGE, newSupportedPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedPackage(SupportedPackageType newSupportedPackage) {
		((FeatureMap.Internal)getMixed()).set(TargetPackage.Literals.DOCUMENT_ROOT__SUPPORTED_PACKAGE, newSupportedPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TargetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TargetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TargetPackage.DOCUMENT_ROOT__BRIDGE:
				return basicSetBridge(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__CONTAINER:
				return basicSetContainer(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__CONTAINER_TYPE:
				return basicSetContainerType(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__DOMAIN:
				return basicSetDomain(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__INTERCONNECT:
				return basicSetInterconnect(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_RESOURCE:
				return basicSetRuntimeResource(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_UNIT:
				return basicSetRuntimeUnit(null, msgs);
			case TargetPackage.DOCUMENT_ROOT__SUPPORTED_PACKAGE:
				return basicSetSupportedPackage(null, msgs);
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
			case TargetPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TargetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TargetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TargetPackage.DOCUMENT_ROOT__BRIDGE:
				return getBridge();
			case TargetPackage.DOCUMENT_ROOT__CONTAINER:
				return getContainer();
			case TargetPackage.DOCUMENT_ROOT__CONTAINER_TYPE:
				return getContainerType();
			case TargetPackage.DOCUMENT_ROOT__DOMAIN:
				return getDomain();
			case TargetPackage.DOCUMENT_ROOT__INTERCONNECT:
				return getInterconnect();
			case TargetPackage.DOCUMENT_ROOT__NODE:
				return getNode();
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_RESOURCE:
				return getRuntimeResource();
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_UNIT:
				return getRuntimeUnit();
			case TargetPackage.DOCUMENT_ROOT__STATUS:
				return getStatus();
			case TargetPackage.DOCUMENT_ROOT__SUPPORTED_PACKAGE:
				return getSupportedPackage();
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
			case TargetPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__BRIDGE:
				setBridge((BridgeType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__CONTAINER:
				setContainer((ContainerType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__CONTAINER_TYPE:
				setContainerType((ContainerTypeType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__DOMAIN:
				setDomain((DeploymentTargetType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__INTERCONNECT:
				setInterconnect((InterconnectType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__NODE:
				setNode((NodeType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_RESOURCE:
				setRuntimeResource((RuntimeResourceType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_UNIT:
				setRuntimeUnit((RuntimeUnitType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__STATUS:
				setStatus((StatusType)newValue);
				return;
			case TargetPackage.DOCUMENT_ROOT__SUPPORTED_PACKAGE:
				setSupportedPackage((SupportedPackageType)newValue);
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
			case TargetPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TargetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TargetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TargetPackage.DOCUMENT_ROOT__BRIDGE:
				setBridge((BridgeType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__CONTAINER:
				setContainer((ContainerType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__CONTAINER_TYPE:
				setContainerType((ContainerTypeType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__DOMAIN:
				setDomain((DeploymentTargetType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__INTERCONNECT:
				setInterconnect((InterconnectType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__NODE:
				setNode((NodeType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_RESOURCE:
				setRuntimeResource((RuntimeResourceType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_UNIT:
				setRuntimeUnit((RuntimeUnitType)null);
				return;
			case TargetPackage.DOCUMENT_ROOT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TargetPackage.DOCUMENT_ROOT__SUPPORTED_PACKAGE:
				setSupportedPackage((SupportedPackageType)null);
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
			case TargetPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TargetPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TargetPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TargetPackage.DOCUMENT_ROOT__BRIDGE:
				return getBridge() != null;
			case TargetPackage.DOCUMENT_ROOT__CONTAINER:
				return getContainer() != null;
			case TargetPackage.DOCUMENT_ROOT__CONTAINER_TYPE:
				return getContainerType() != null;
			case TargetPackage.DOCUMENT_ROOT__DOMAIN:
				return getDomain() != null;
			case TargetPackage.DOCUMENT_ROOT__INTERCONNECT:
				return getInterconnect() != null;
			case TargetPackage.DOCUMENT_ROOT__NODE:
				return getNode() != null;
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_RESOURCE:
				return getRuntimeResource() != null;
			case TargetPackage.DOCUMENT_ROOT__RUNTIME_UNIT:
				return getRuntimeUnit() != null;
			case TargetPackage.DOCUMENT_ROOT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case TargetPackage.DOCUMENT_ROOT__SUPPORTED_PACKAGE:
				return getSupportedPackage() != null;
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

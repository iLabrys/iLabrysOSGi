/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.DependencyType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.DocumentRoot;
import es.itecban.deployment.model.deployment.unit.LocalityConstraintType;
import es.itecban.deployment.model.deployment.unit.PackageType;
import es.itecban.deployment.model.deployment.unit.PropertyKindType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ProviderType;
import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

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
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getDeploymentUnit <em>Deployment Unit</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getLocalityConstraint <em>Locality Constraint</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getPropertyKind <em>Property Kind</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getRequiredResourceProperty <em>Required Resource Property</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
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
	 * The default value of the '{@link #getLocalityConstraint() <em>Locality Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final LocalityConstraintType LOCALITY_CONSTRAINT_EDEFAULT = LocalityConstraintType.SAMENODE;

	/**
	 * The default value of the '{@link #getPropertyKind() <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKind()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyKindType PROPERTY_KIND_EDEFAULT = PropertyKindType.QUANTITY;

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
		return UnitPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, UnitPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UnitPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UnitPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType getDependency() {
		return (DependencyType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__DEPENDENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependency(DependencyType newDependency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__DEPENDENCY, newDependency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(DependencyType newDependency) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__DEPENDENCY, newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentUnitType getDeploymentUnit() {
		return (DeploymentUnitType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__DEPLOYMENT_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentUnit(DeploymentUnitType newDeploymentUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__DEPLOYMENT_UNIT, newDeploymentUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentUnit(DeploymentUnitType newDeploymentUnit) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__DEPLOYMENT_UNIT, newDeploymentUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityConstraintType getLocalityConstraint() {
		return (LocalityConstraintType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__LOCALITY_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalityConstraint(LocalityConstraintType newLocalityConstraint) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__LOCALITY_CONSTRAINT, newLocalityConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getPackage() {
		return (PackageType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageType newPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__PACKAGE, newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(PackageType newPackage) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyKindType getPropertyKind() {
		return (PropertyKindType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__PROPERTY_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyKind(PropertyKindType newPropertyKind) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__PROPERTY_KIND, newPropertyKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType getProvider() {
		return (ProviderType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(ProviderType newProvider, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__PROVIDER, newProvider, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(ProviderType newProvider) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourceType getRequiredResource() {
		return (RequiredResourceType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__REQUIRED_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredResource(RequiredResourceType newRequiredResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__REQUIRED_RESOURCE, newRequiredResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResource(RequiredResourceType newRequiredResource) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__REQUIRED_RESOURCE, newRequiredResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourcePropertyType getRequiredResourceProperty() {
		return (RequiredResourcePropertyType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredResourceProperty(RequiredResourcePropertyType newRequiredResourceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY, newRequiredResourceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResourceProperty(RequiredResourcePropertyType newRequiredResourceProperty) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY, newRequiredResourceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getResource() {
		return (ResourceType)getMixed().get(UnitPackage.Literals.DOCUMENT_ROOT__RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnitPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(ResourceType newResource) {
		((FeatureMap.Internal)getMixed()).set(UnitPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case UnitPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).basicRemove(otherEnd, msgs);
			case UnitPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).basicRemove(otherEnd, msgs);
			case UnitPackage.DOCUMENT_ROOT__DEPENDENCY:
				return basicSetDependency(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__DEPLOYMENT_UNIT:
				return basicSetDeploymentUnit(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__PROVIDER:
				return basicSetProvider(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE:
				return basicSetRequiredResource(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY:
				return basicSetRequiredResourceProperty(null, msgs);
			case UnitPackage.DOCUMENT_ROOT__RESOURCE:
				return basicSetResource(null, msgs);
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
			case UnitPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case UnitPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return ((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap();
				else return getXMLNSPrefixMap();
			case UnitPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return ((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap();
				else return getXSISchemaLocation();
			case UnitPackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency();
			case UnitPackage.DOCUMENT_ROOT__DEPLOYMENT_UNIT:
				return getDeploymentUnit();
			case UnitPackage.DOCUMENT_ROOT__LOCALITY_CONSTRAINT:
				return getLocalityConstraint();
			case UnitPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case UnitPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case UnitPackage.DOCUMENT_ROOT__PROPERTY_KIND:
				return getPropertyKind();
			case UnitPackage.DOCUMENT_ROOT__PROVIDER:
				return getProvider();
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE:
				return getRequiredResource();
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY:
				return getRequiredResourceProperty();
			case UnitPackage.DOCUMENT_ROOT__RESOURCE:
				return getResource();
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
			case UnitPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXMLNSPrefixMap()).eMap()).set(newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getXSISchemaLocation()).eMap()).set(newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((DependencyType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__DEPLOYMENT_UNIT:
				setDeploymentUnit((DeploymentUnitType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__LOCALITY_CONSTRAINT:
				setLocalityConstraint((LocalityConstraintType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((PackageType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__PROPERTY_KIND:
				setPropertyKind((PropertyKindType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__PROVIDER:
				setProvider((ProviderType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE:
				setRequiredResource((RequiredResourceType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY:
				setRequiredResourceProperty((RequiredResourcePropertyType)newValue);
				return;
			case UnitPackage.DOCUMENT_ROOT__RESOURCE:
				setResource((ResourceType)newValue);
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
			case UnitPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case UnitPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case UnitPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case UnitPackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((DependencyType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__DEPLOYMENT_UNIT:
				setDeploymentUnit((DeploymentUnitType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__LOCALITY_CONSTRAINT:
				setLocalityConstraint(LOCALITY_CONSTRAINT_EDEFAULT);
				return;
			case UnitPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((PackageType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__PROPERTY_KIND:
				setPropertyKind(PROPERTY_KIND_EDEFAULT);
				return;
			case UnitPackage.DOCUMENT_ROOT__PROVIDER:
				setProvider((ProviderType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE:
				setRequiredResource((RequiredResourceType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY:
				setRequiredResourceProperty((RequiredResourcePropertyType)null);
				return;
			case UnitPackage.DOCUMENT_ROOT__RESOURCE:
				setResource((ResourceType)null);
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
			case UnitPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case UnitPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case UnitPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case UnitPackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency() != null;
			case UnitPackage.DOCUMENT_ROOT__DEPLOYMENT_UNIT:
				return getDeploymentUnit() != null;
			case UnitPackage.DOCUMENT_ROOT__LOCALITY_CONSTRAINT:
				return getLocalityConstraint() != LOCALITY_CONSTRAINT_EDEFAULT;
			case UnitPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case UnitPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case UnitPackage.DOCUMENT_ROOT__PROPERTY_KIND:
				return getPropertyKind() != PROPERTY_KIND_EDEFAULT;
			case UnitPackage.DOCUMENT_ROOT__PROVIDER:
				return getProvider() != null;
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE:
				return getRequiredResource() != null;
			case UnitPackage.DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY:
				return getRequiredResourceProperty() != null;
			case UnitPackage.DOCUMENT_ROOT__RESOURCE:
				return getResource() != null;
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

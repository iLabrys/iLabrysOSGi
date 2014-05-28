/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationContainerType;
import es.itecban.deployment.model.configuration.ConfigurationFileType;
import es.itecban.deployment.model.configuration.ConfigurationPackage;
import es.itecban.deployment.model.configuration.DocumentRoot;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.configuration.EnvironmentType;

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
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getConfigurationFile <em>Configuration File</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.DocumentRootImpl#getEnvironmentProperty <em>Environment Property</em>}</li>
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
		return ConfigurationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ConfigurationPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFileType getConfigurationFile() {
		return (ConfigurationFileType)getMixed().get(ConfigurationPackage.Literals.DOCUMENT_ROOT__CONFIGURATION_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationFile(ConfigurationFileType newConfigurationFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigurationPackage.Literals.DOCUMENT_ROOT__CONFIGURATION_FILE, newConfigurationFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationFile(ConfigurationFileType newConfigurationFile) {
		((FeatureMap.Internal)getMixed()).set(ConfigurationPackage.Literals.DOCUMENT_ROOT__CONFIGURATION_FILE, newConfigurationFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationContainerType getContainer() {
		return (ConfigurationContainerType)getMixed().get(ConfigurationPackage.Literals.DOCUMENT_ROOT__CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ConfigurationContainerType newContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigurationPackage.Literals.DOCUMENT_ROOT__CONTAINER, newContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ConfigurationContainerType newContainer) {
		((FeatureMap.Internal)getMixed()).set(ConfigurationPackage.Literals.DOCUMENT_ROOT__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType getEnvironment() {
		return (EnvironmentType)getMixed().get(ConfigurationPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(EnvironmentType newEnvironment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigurationPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT, newEnvironment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(EnvironmentType newEnvironment) {
		((FeatureMap.Internal)getMixed()).set(ConfigurationPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT, newEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentPropertyType getEnvironmentProperty() {
		return (EnvironmentPropertyType)getMixed().get(ConfigurationPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentProperty(EnvironmentPropertyType newEnvironmentProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigurationPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY, newEnvironmentProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentProperty(EnvironmentPropertyType newEnvironmentProperty) {
		((FeatureMap.Internal)getMixed()).set(ConfigurationPackage.Literals.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY, newEnvironmentProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DOCUMENT_ROOT__CONFIGURATION_FILE:
				return basicSetConfigurationFile(null, msgs);
			case ConfigurationPackage.DOCUMENT_ROOT__CONTAINER:
				return basicSetContainer(null, msgs);
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY:
				return basicSetEnvironmentProperty(null, msgs);
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
			case ConfigurationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ConfigurationPackage.DOCUMENT_ROOT__CONFIGURATION_FILE:
				return getConfigurationFile();
			case ConfigurationPackage.DOCUMENT_ROOT__CONTAINER:
				return getContainer();
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT:
				return getEnvironment();
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY:
				return getEnvironmentProperty();
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
			case ConfigurationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__CONFIGURATION_FILE:
				setConfigurationFile((ConfigurationFileType)newValue);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__CONTAINER:
				setContainer((ConfigurationContainerType)newValue);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT:
				setEnvironment((EnvironmentType)newValue);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY:
				setEnvironmentProperty((EnvironmentPropertyType)newValue);
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
			case ConfigurationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__CONFIGURATION_FILE:
				setConfigurationFile((ConfigurationFileType)null);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__CONTAINER:
				setContainer((ConfigurationContainerType)null);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT:
				setEnvironment((EnvironmentType)null);
				return;
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY:
				setEnvironmentProperty((EnvironmentPropertyType)null);
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
			case ConfigurationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ConfigurationPackage.DOCUMENT_ROOT__CONFIGURATION_FILE:
				return getConfigurationFile() != null;
			case ConfigurationPackage.DOCUMENT_ROOT__CONTAINER:
				return getContainer() != null;
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT:
				return getEnvironment() != null;
			case ConfigurationPackage.DOCUMENT_ROOT__ENVIRONMENT_PROPERTY:
				return getEnvironmentProperty() != null;
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

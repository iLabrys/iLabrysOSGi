/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import java.util.List;

import es.itecban.deployment.model.deployment.unit.ConstraintsType;
import es.itecban.deployment.model.deployment.unit.DependenciesType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.ExportedResourcesType;
import es.itecban.deployment.model.deployment.unit.PackageType;
import es.itecban.deployment.model.deployment.unit.ProviderType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;
import es.itecban.deployment.model.deployment.unit.UnitRepositoriesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getExportedResources <em>Exported Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DeploymentUnitTypeImpl#getUnitRepositories <em>Unit Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentUnitTypeImpl extends EObjectImpl implements DeploymentUnitType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected ProviderType provider;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageType package_;

	/**
	 * The cached value of the '{@link #getExportedResources() <em>Exported Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedResources()
	 * @generated
	 * @ordered
	 */
	protected ExportedResourcesType exportedResources;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependenciesType dependencies;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsType constraints;

	/**
	 * The cached value of the '{@link #getUnitRepositories() <em>Unit Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRepositories()
	 * @generated
	 * @ordered
	 */
	protected UnitRepositoriesType unitRepositories;

	protected String e_id;
	
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.DEPLOYMENT_UNIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		version = newVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(ProviderType newProvider, NotificationChain msgs) {
		ProviderType oldProvider = provider;
		provider = newProvider;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(ProviderType newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageType newPackage, NotificationChain msgs) {
		PackageType oldPackage = package_;
		package_ = newPackage;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(PackageType newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedResourcesType getExportedResources() {
		return exportedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExportedResources(ExportedResourcesType newExportedResources, NotificationChain msgs) {
		ExportedResourcesType oldExportedResources = exportedResources;
		exportedResources = newExportedResources;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportedResources(ExportedResourcesType newExportedResources) {
		if (newExportedResources != exportedResources) {
			NotificationChain msgs = null;
			if (exportedResources != null)
				msgs = ((InternalEObject)exportedResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES, null, msgs);
			if (newExportedResources != null)
				msgs = ((InternalEObject)newExportedResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES, null, msgs);
			msgs = basicSetExportedResources(newExportedResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesType getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependenciesType newDependencies, NotificationChain msgs) {
		DependenciesType oldDependencies = dependencies;
		dependencies = newDependencies;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencies(DependenciesType newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		ConstraintsType oldConstraints = constraints;
		constraints = newConstraints;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRepositoriesType getUnitRepositories() {
		return unitRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitRepositories(UnitRepositoriesType newUnitRepositories, NotificationChain msgs) {
		UnitRepositoriesType oldUnitRepositories = unitRepositories;
		unitRepositories = newUnitRepositories;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitRepositories(UnitRepositoriesType newUnitRepositories) {
		if (newUnitRepositories != unitRepositories) {
			NotificationChain msgs = null;
			if (unitRepositories != null)
				msgs = ((InternalEObject)unitRepositories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES, null, msgs);
			if (newUnitRepositories != null)
				msgs = ((InternalEObject)newUnitRepositories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES, null, msgs);
			msgs = basicSetUnitRepositories(newUnitRepositories, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER:
				return basicSetProvider(null, msgs);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES:
				return basicSetExportedResources(null, msgs);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES:
				return basicSetUnitRepositories(null, msgs);
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
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__NAME:
				return getName();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__VERSION:
				return getVersion();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DESCRIPTION:
				return getDescription();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER:
				return getProvider();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE:
				return getPackage();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES:
				return getExportedResources();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES:
				return getDependencies();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS:
				return getConstraints();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES:
				return getUnitRepositories();
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
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__NAME:
				setName((String)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER:
				setProvider((ProviderType)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE:
				setPackage((PackageType)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES:
				setExportedResources((ExportedResourcesType)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS:
				setConstraints((ConstraintsType)newValue);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES:
				setUnitRepositories((UnitRepositoriesType)newValue);
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
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER:
				setProvider((ProviderType)null);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE:
				setPackage((PackageType)null);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES:
				setExportedResources((ExportedResourcesType)null);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS:
				setConstraints((ConstraintsType)null);
				return;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES:
				setUnitRepositories((UnitRepositoriesType)null);
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
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PROVIDER:
				return provider != null;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__PACKAGE:
				return package_ != null;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES:
				return exportedResources != null;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__DEPENDENCIES:
				return dependencies != null;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__CONSTRAINTS:
				return constraints != null;
			case UnitPackage.DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES:
				return unitRepositories != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String id) {
	
		this.e_id = id;
	}
	
	/**
	 * @generated NOT
	 */
	public boolean equals(Object arg0) {
		if(arg0 instanceof DeploymentUnitType!= true)
			return false;
		DeploymentUnitType n = (DeploymentUnitType) arg0;
		String nn = n.getName();
		String nv = n.getVersion();
		String tn = this.getName();
		String tv = this.getVersion();
		if (nn.equals(tn)) {
			if (nv == null && tv == null)
				return true;
			if (nv != null && tv != null)
				return nv.equals(tv);
		}
		return false;
	}
	
	/**
	 * @generated NOT
	 */
	public ResourceType getResource(String name) {
		List<ResourceType> resources = this.getExportedResources().getExportedResource();
		for (ResourceType resource : resources) {
			if (resource.getName().equals(name)) {
				return resource;
			}
		}
		return null;
	}
} //DeploymentUnitTypeImpl

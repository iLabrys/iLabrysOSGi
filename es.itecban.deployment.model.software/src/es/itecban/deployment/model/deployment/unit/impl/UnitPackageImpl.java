/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.dependency.graph.GraphPackage;

import es.itecban.deployment.model.dependency.graph.impl.GraphPackageImpl;

import es.itecban.deployment.model.deployment.unit.ConstraintsType;
import es.itecban.deployment.model.deployment.unit.DependenciesType;
import es.itecban.deployment.model.deployment.unit.DependencyType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.DocumentRoot;
import es.itecban.deployment.model.deployment.unit.ExportedResourcesType;
import es.itecban.deployment.model.deployment.unit.LocalityConstraintType;
import es.itecban.deployment.model.deployment.unit.PackageType;
import es.itecban.deployment.model.deployment.unit.PropertyKindType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ProviderType;
import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.model.deployment.unit.ResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.TypesType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;
import es.itecban.deployment.model.deployment.unit.UnitPackage;
import es.itecban.deployment.model.deployment.unit.UnitRepositoriesType;

import es.itecban.deployment.model.software.product.ProductPackage;

import es.itecban.deployment.model.software.product.impl.ProductPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitPackageImpl extends EPackageImpl implements UnitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentUnitTypeEClass = null;

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
	private EClass exportedResourcesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredResourcePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredResourcePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitRepositoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum localityConstraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localityConstraintTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyKindTypeObjectEDataType = null;

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
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnitPackageImpl() {
		super(eNS_URI, UnitFactory.eINSTANCE);
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
	public static UnitPackage init() {
		if (isInited) return (UnitPackage)EPackage.Registry.INSTANCE.getEPackage(UnitPackage.eNS_URI);

		// Obtain or create and register package
		UnitPackageImpl theUnitPackage = (UnitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UnitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UnitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUnitPackage.createPackageContents();

		// Initialize created meta-data
		theUnitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnitPackage.freeze();

		return theUnitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType() {
		return constraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_Constraint() {
		return (EReference)constraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependenciesType() {
		return dependenciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependenciesType_DependencyExpression() {
		return (EAttribute)dependenciesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependenciesType_Dependency() {
		return (EReference)dependenciesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyType() {
		return dependencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_Id() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_Locality() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_Description() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyType_RequiredResource() {
		return (EReference)dependencyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyType_RequiredPackage() {
		return (EReference)dependencyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentUnitType() {
		return deploymentUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentUnitType_Name() {
		return (EAttribute)deploymentUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentUnitType_Version() {
		return (EAttribute)deploymentUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentUnitType_Description() {
		return (EAttribute)deploymentUnitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnitType_Provider() {
		return (EReference)deploymentUnitTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnitType_Package() {
		return (EReference)deploymentUnitTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnitType_ExportedResources() {
		return (EReference)deploymentUnitTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnitType_Dependencies() {
		return (EReference)deploymentUnitTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnitType_Constraints() {
		return (EReference)deploymentUnitTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentUnitType_UnitRepositories() {
		return (EReference)deploymentUnitTypeEClass.getEStructuralFeatures().get(8);
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
	public EReference getDocumentRoot_Dependency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeploymentUnit() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LocalityConstraint() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Package() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Property() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PropertyKind() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Provider() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequiredResource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequiredResourceProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Resource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportedResourcesType() {
		return exportedResourcesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportedResourcesType_ExportedResource() {
		return (EReference)exportedResourcesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageType() {
		return packageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Name() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Version() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Type() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderType() {
		return providerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderType_Name() {
		return (EAttribute)providerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderType_Id() {
		return (EAttribute)providerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderType_HomeUrl() {
		return (EAttribute)providerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredResourcePropertiesType() {
		return requiredResourcePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredResourcePropertiesType_Property() {
		return (EReference)requiredResourcePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredResourcePropertyType() {
		return requiredResourcePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredResourcePropertyType_Name() {
		return (EAttribute)requiredResourcePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredResourcePropertyType_Value() {
		return (EAttribute)requiredResourcePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredResourcePropertyType_Kind() {
		return (EAttribute)requiredResourcePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredResourceType() {
		return requiredResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredResourceType_Name() {
		return (EAttribute)requiredResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredResourceType_Version() {
		return (EAttribute)requiredResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredResourceType_Type() {
		return (EAttribute)requiredResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredResourceType_RequiredResourceProperties() {
		return (EReference)requiredResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePropertiesType() {
		return resourcePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePropertiesType_ResourceProperty() {
		return (EReference)resourcePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Name() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Version() {
		return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Types() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_ResourceProperties() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesType() {
		return typesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypesType_Type() {
		return (EAttribute)typesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitRepositoriesType() {
		return unitRepositoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitRepositoriesType_Repository() {
		return (EAttribute)unitRepositoriesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocalityConstraintType() {
		return localityConstraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyKindType() {
		return propertyKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalityConstraintTypeObject() {
		return localityConstraintTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyKindTypeObject() {
		return propertyKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFactory getUnitFactory() {
		return (UnitFactory)getEFactoryInstance();
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
		constraintsTypeEClass = createEClass(CONSTRAINTS_TYPE);
		createEReference(constraintsTypeEClass, CONSTRAINTS_TYPE__CONSTRAINT);

		dependenciesTypeEClass = createEClass(DEPENDENCIES_TYPE);
		createEAttribute(dependenciesTypeEClass, DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION);
		createEReference(dependenciesTypeEClass, DEPENDENCIES_TYPE__DEPENDENCY);

		dependencyTypeEClass = createEClass(DEPENDENCY_TYPE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__ID);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__LOCALITY);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__DESCRIPTION);
		createEReference(dependencyTypeEClass, DEPENDENCY_TYPE__REQUIRED_RESOURCE);
		createEReference(dependencyTypeEClass, DEPENDENCY_TYPE__REQUIRED_PACKAGE);

		deploymentUnitTypeEClass = createEClass(DEPLOYMENT_UNIT_TYPE);
		createEAttribute(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__NAME);
		createEAttribute(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__VERSION);
		createEAttribute(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__DESCRIPTION);
		createEReference(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__PROVIDER);
		createEReference(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__PACKAGE);
		createEReference(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__EXPORTED_RESOURCES);
		createEReference(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__DEPENDENCIES);
		createEReference(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__CONSTRAINTS);
		createEReference(deploymentUnitTypeEClass, DEPLOYMENT_UNIT_TYPE__UNIT_REPOSITORIES);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEPENDENCY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEPLOYMENT_UNIT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LOCALITY_CONSTRAINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROPERTY_KIND);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROVIDER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRED_RESOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRED_RESOURCE_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE);

		exportedResourcesTypeEClass = createEClass(EXPORTED_RESOURCES_TYPE);
		createEReference(exportedResourcesTypeEClass, EXPORTED_RESOURCES_TYPE__EXPORTED_RESOURCE);

		packageTypeEClass = createEClass(PACKAGE_TYPE);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__NAME);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__VERSION);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__TYPE);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

		providerTypeEClass = createEClass(PROVIDER_TYPE);
		createEAttribute(providerTypeEClass, PROVIDER_TYPE__NAME);
		createEAttribute(providerTypeEClass, PROVIDER_TYPE__ID);
		createEAttribute(providerTypeEClass, PROVIDER_TYPE__HOME_URL);

		requiredResourcePropertiesTypeEClass = createEClass(REQUIRED_RESOURCE_PROPERTIES_TYPE);
		createEReference(requiredResourcePropertiesTypeEClass, REQUIRED_RESOURCE_PROPERTIES_TYPE__PROPERTY);

		requiredResourcePropertyTypeEClass = createEClass(REQUIRED_RESOURCE_PROPERTY_TYPE);
		createEAttribute(requiredResourcePropertyTypeEClass, REQUIRED_RESOURCE_PROPERTY_TYPE__NAME);
		createEAttribute(requiredResourcePropertyTypeEClass, REQUIRED_RESOURCE_PROPERTY_TYPE__VALUE);
		createEAttribute(requiredResourcePropertyTypeEClass, REQUIRED_RESOURCE_PROPERTY_TYPE__KIND);

		requiredResourceTypeEClass = createEClass(REQUIRED_RESOURCE_TYPE);
		createEAttribute(requiredResourceTypeEClass, REQUIRED_RESOURCE_TYPE__NAME);
		createEAttribute(requiredResourceTypeEClass, REQUIRED_RESOURCE_TYPE__VERSION);
		createEAttribute(requiredResourceTypeEClass, REQUIRED_RESOURCE_TYPE__TYPE);
		createEReference(requiredResourceTypeEClass, REQUIRED_RESOURCE_TYPE__REQUIRED_RESOURCE_PROPERTIES);

		resourcePropertiesTypeEClass = createEClass(RESOURCE_PROPERTIES_TYPE);
		createEReference(resourcePropertiesTypeEClass, RESOURCE_PROPERTIES_TYPE__RESOURCE_PROPERTY);

		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__VERSION);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__TYPES);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__RESOURCE_PROPERTIES);

		typesTypeEClass = createEClass(TYPES_TYPE);
		createEAttribute(typesTypeEClass, TYPES_TYPE__TYPE);

		unitRepositoriesTypeEClass = createEClass(UNIT_REPOSITORIES_TYPE);
		createEAttribute(unitRepositoriesTypeEClass, UNIT_REPOSITORIES_TYPE__REPOSITORY);

		// Create enums
		localityConstraintTypeEEnum = createEEnum(LOCALITY_CONSTRAINT_TYPE);
		propertyKindTypeEEnum = createEEnum(PROPERTY_KIND_TYPE);

		// Create data types
		localityConstraintTypeObjectEDataType = createEDataType(LOCALITY_CONSTRAINT_TYPE_OBJECT);
		propertyKindTypeObjectEDataType = createEDataType(PROPERTY_KIND_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(constraintsTypeEClass, ConstraintsType.class, "ConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintsType_Constraint(), this.getRequiredResourceType(), null, "constraint", null, 0, -1, ConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenciesTypeEClass, DependenciesType.class, "DependenciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependenciesType_DependencyExpression(), theXMLTypePackage.getString(), "dependencyExpression", null, 0, 1, DependenciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependenciesType_Dependency(), this.getDependencyType(), null, "dependency", null, 0, -1, DependenciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyTypeEClass, DependencyType.class, "DependencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_Locality(), this.getLocalityConstraintType(), "locality", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyType_RequiredResource(), this.getRequiredResourceType(), null, "requiredResource", null, 1, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyType_RequiredPackage(), this.getPackageType(), null, "requiredPackage", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentUnitTypeEClass, DeploymentUnitType.class, "DeploymentUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentUnitType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentUnitType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentUnitType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnitType_Provider(), this.getProviderType(), null, "provider", null, 0, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnitType_Package(), this.getPackageType(), null, "package", null, 1, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnitType_ExportedResources(), this.getExportedResourcesType(), null, "exportedResources", null, 0, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnitType_Dependencies(), this.getDependenciesType(), null, "dependencies", null, 0, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnitType_Constraints(), this.getConstraintsType(), null, "constraints", null, 0, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentUnitType_UnitRepositories(), this.getUnitRepositoriesType(), null, "unitRepositories", null, 0, 1, DeploymentUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dependency(), this.getDependencyType(), null, "dependency", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DeploymentUnit(), this.getDeploymentUnitType(), null, "deploymentUnit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LocalityConstraint(), this.getLocalityConstraintType(), "localityConstraint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Package(), this.getPackageType(), null, "package", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PropertyKind(), this.getPropertyKindType(), "propertyKind", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Provider(), this.getProviderType(), null, "provider", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequiredResource(), this.getRequiredResourceType(), null, "requiredResource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequiredResourceProperty(), this.getRequiredResourcePropertyType(), null, "requiredResourceProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Resource(), this.getResourceType(), null, "resource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exportedResourcesTypeEClass, ExportedResourcesType.class, "ExportedResourcesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportedResourcesType_ExportedResource(), this.getResourceType(), null, "exportedResource", null, 0, -1, ExportedResourcesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageTypeEClass, PackageType.class, "PackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerTypeEClass, ProviderType.class, "ProviderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProviderType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderType_Id(), theXMLTypePackage.getInt(), "id", null, 1, 1, ProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderType_HomeUrl(), theXMLTypePackage.getAnyURI(), "homeUrl", null, 0, 1, ProviderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredResourcePropertiesTypeEClass, RequiredResourcePropertiesType.class, "RequiredResourcePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredResourcePropertiesType_Property(), this.getRequiredResourcePropertyType(), null, "property", null, 0, -1, RequiredResourcePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredResourcePropertyTypeEClass, RequiredResourcePropertyType.class, "RequiredResourcePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredResourcePropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RequiredResourcePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredResourcePropertyType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 1, 1, RequiredResourcePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredResourcePropertyType_Kind(), this.getPropertyKindType(), "kind", null, 1, 1, RequiredResourcePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredResourceTypeEClass, RequiredResourceType.class, "RequiredResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredResourceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RequiredResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredResourceType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, RequiredResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredResourceType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, RequiredResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredResourceType_RequiredResourceProperties(), this.getRequiredResourcePropertiesType(), null, "requiredResourceProperties", null, 0, 1, RequiredResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePropertiesTypeEClass, ResourcePropertiesType.class, "ResourcePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePropertiesType_ResourceProperty(), this.getPropertyType(), null, "resourceProperty", null, 0, -1, ResourcePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Types(), this.getTypesType(), null, "types", null, 1, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_ResourceProperties(), this.getResourcePropertiesType(), null, "resourceProperties", null, 0, 1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesTypeEClass, TypesType.class, "TypesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypesType_Type(), theXMLTypePackage.getString(), "type", null, 1, -1, TypesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitRepositoriesTypeEClass, UnitRepositoriesType.class, "UnitRepositoriesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitRepositoriesType_Repository(), theXMLTypePackage.getAnyURI(), "repository", null, 0, -1, UnitRepositoriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(localityConstraintTypeEEnum, LocalityConstraintType.class, "LocalityConstraintType");
		addEEnumLiteral(localityConstraintTypeEEnum, LocalityConstraintType.SAMENODE);
		addEEnumLiteral(localityConstraintTypeEEnum, LocalityConstraintType.SAMENODESAMEPROCESS);
		addEEnumLiteral(localityConstraintTypeEEnum, LocalityConstraintType.ANYNODE);

		initEEnum(propertyKindTypeEEnum, PropertyKindType.class, "PropertyKindType");
		addEEnumLiteral(propertyKindTypeEEnum, PropertyKindType.QUANTITY);
		addEEnumLiteral(propertyKindTypeEEnum, PropertyKindType.CAPACITY);
		addEEnumLiteral(propertyKindTypeEEnum, PropertyKindType.MINIMUM);
		addEEnumLiteral(propertyKindTypeEEnum, PropertyKindType.MAXIMUM);
		addEEnumLiteral(propertyKindTypeEEnum, PropertyKindType.ATTRIBUTE);
		addEEnumLiteral(propertyKindTypeEEnum, PropertyKindType.SELECTION);

		// Initialize data types
		initEDataType(localityConstraintTypeObjectEDataType, LocalityConstraintType.class, "LocalityConstraintTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyKindTypeObjectEDataType, PropertyKindType.class, "PropertyKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (constraintsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "constraints_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConstraintsType_Constraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constraint"
		   });		
		addAnnotation
		  (dependenciesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dependencies_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDependenciesType_DependencyExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dependencyExpression"
		   });			
		addAnnotation
		  (getDependenciesType_Dependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dependency"
		   });		
		addAnnotation
		  (dependencyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DependencyType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDependencyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getDependencyType_Locality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locality"
		   });			
		addAnnotation
		  (getDependencyType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getDependencyType_RequiredResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requiredResource"
		   });		
		addAnnotation
		  (getDependencyType_RequiredPackage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requiredPackage"
		   });		
		addAnnotation
		  (deploymentUnitTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeploymentUnitType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Provider(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "provider"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package"
		   });			
		addAnnotation
		  (getDeploymentUnitType_ExportedResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exportedResources"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Dependencies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dependencies"
		   });			
		addAnnotation
		  (getDeploymentUnitType_Constraints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constraints"
		   });			
		addAnnotation
		  (getDeploymentUnitType_UnitRepositories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unitRepositories"
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
		  (getDocumentRoot_Dependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dependency",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_DeploymentUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deploymentUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LocalityConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localityConstraint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyKind(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "propertyKind",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Provider(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "provider",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequiredResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requiredResource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequiredResourceProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requiredResourceProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (exportedResourcesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "exportedResources_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExportedResourcesType_ExportedResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exportedResource"
		   });			
		addAnnotation
		  (localityConstraintTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "LocalityConstraintType"
		   });		
		addAnnotation
		  (localityConstraintTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "LocalityConstraintType:Object",
			 "baseType", "LocalityConstraintType"
		   });		
		addAnnotation
		  (packageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PackageType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPackageType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getPackageType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });			
		addAnnotation
		  (getPackageType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (propertyKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PropertyKindType"
		   });		
		addAnnotation
		  (propertyKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PropertyKindType:Object",
			 "baseType", "PropertyKindType"
		   });			
		addAnnotation
		  (propertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPropertyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getPropertyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });			
		addAnnotation
		  (providerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProviderType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProviderType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getProviderType_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getProviderType_HomeUrl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "homeUrl"
		   });		
		addAnnotation
		  (requiredResourcePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "requiredResourceProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequiredResourcePropertiesType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property"
		   });		
		addAnnotation
		  (requiredResourcePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequiredResourcePropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequiredResourcePropertyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getRequiredResourcePropertyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (getRequiredResourcePropertyType_Kind(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kind"
		   });			
		addAnnotation
		  (requiredResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequiredResourceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequiredResourceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getRequiredResourceType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (getRequiredResourceType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (getRequiredResourceType_RequiredResourceProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requiredResourceProperties"
		   });		
		addAnnotation
		  (resourcePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "resourceProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResourcePropertiesType_ResourceProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resourceProperty"
		   });			
		addAnnotation
		  (resourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getResourceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getResourceType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (getResourceType_Types(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "types"
		   });			
		addAnnotation
		  (getResourceType_ResourceProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resourceProperties"
		   });		
		addAnnotation
		  (typesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "types_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypesType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });		
		addAnnotation
		  (unitRepositoriesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "unitRepositories_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnitRepositoriesType_Repository(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repository"
		   });
	}

} //UnitPackageImpl

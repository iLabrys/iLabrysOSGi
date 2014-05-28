/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitFactoryImpl extends EFactoryImpl implements UnitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitFactory init() {
		try {
			UnitFactory theUnitFactory = (UnitFactory)EPackage.Registry.INSTANCE.getEFactory("http://model.deployment.itecban.es/DeploymentUnit"); 
			if (theUnitFactory != null) {
				return theUnitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UnitPackage.CONSTRAINTS_TYPE: return createConstraintsType();
			case UnitPackage.DEPENDENCIES_TYPE: return createDependenciesType();
			case UnitPackage.DEPENDENCY_TYPE: return createDependencyType();
			case UnitPackage.DEPLOYMENT_UNIT_TYPE: return createDeploymentUnitType();
			case UnitPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UnitPackage.EXPORTED_RESOURCES_TYPE: return createExportedResourcesType();
			case UnitPackage.PACKAGE_TYPE: return createPackageType();
			case UnitPackage.PROPERTY_TYPE: return createPropertyType();
			case UnitPackage.PROVIDER_TYPE: return createProviderType();
			case UnitPackage.REQUIRED_RESOURCE_PROPERTIES_TYPE: return createRequiredResourcePropertiesType();
			case UnitPackage.REQUIRED_RESOURCE_PROPERTY_TYPE: return createRequiredResourcePropertyType();
			case UnitPackage.REQUIRED_RESOURCE_TYPE: return createRequiredResourceType();
			case UnitPackage.RESOURCE_PROPERTIES_TYPE: return createResourcePropertiesType();
			case UnitPackage.RESOURCE_TYPE: return createResourceType();
			case UnitPackage.TYPES_TYPE: return createTypesType();
			case UnitPackage.UNIT_REPOSITORIES_TYPE: return createUnitRepositoriesType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UnitPackage.LOCALITY_CONSTRAINT_TYPE:
				return createLocalityConstraintTypeFromString(eDataType, initialValue);
			case UnitPackage.PROPERTY_KIND_TYPE:
				return createPropertyKindTypeFromString(eDataType, initialValue);
			case UnitPackage.LOCALITY_CONSTRAINT_TYPE_OBJECT:
				return createLocalityConstraintTypeObjectFromString(eDataType, initialValue);
			case UnitPackage.PROPERTY_KIND_TYPE_OBJECT:
				return createPropertyKindTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UnitPackage.LOCALITY_CONSTRAINT_TYPE:
				return convertLocalityConstraintTypeToString(eDataType, instanceValue);
			case UnitPackage.PROPERTY_KIND_TYPE:
				return convertPropertyKindTypeToString(eDataType, instanceValue);
			case UnitPackage.LOCALITY_CONSTRAINT_TYPE_OBJECT:
				return convertLocalityConstraintTypeObjectToString(eDataType, instanceValue);
			case UnitPackage.PROPERTY_KIND_TYPE_OBJECT:
				return convertPropertyKindTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesType createDependenciesType() {
		DependenciesTypeImpl dependenciesType = new DependenciesTypeImpl();
		return dependenciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType createDependencyType() {
		DependencyTypeImpl dependencyType = new DependencyTypeImpl();
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentUnitType createDeploymentUnitType() {
		DeploymentUnitTypeImpl deploymentUnitType = new DeploymentUnitTypeImpl();
		return deploymentUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedResourcesType createExportedResourcesType() {
		ExportedResourcesTypeImpl exportedResourcesType = new ExportedResourcesTypeImpl();
		return exportedResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType createPackageType() {
		PackageTypeImpl packageType = new PackageTypeImpl();
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderType createProviderType() {
		ProviderTypeImpl providerType = new ProviderTypeImpl();
		return providerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourcePropertiesType createRequiredResourcePropertiesType() {
		RequiredResourcePropertiesTypeImpl requiredResourcePropertiesType = new RequiredResourcePropertiesTypeImpl();
		return requiredResourcePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourcePropertyType createRequiredResourcePropertyType() {
		RequiredResourcePropertyTypeImpl requiredResourcePropertyType = new RequiredResourcePropertyTypeImpl();
		return requiredResourcePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourceType createRequiredResourceType() {
		RequiredResourceTypeImpl requiredResourceType = new RequiredResourceTypeImpl();
		return requiredResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertiesType createResourcePropertiesType() {
		ResourcePropertiesTypeImpl resourcePropertiesType = new ResourcePropertiesTypeImpl();
		return resourcePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType createTypesType() {
		TypesTypeImpl typesType = new TypesTypeImpl();
		return typesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRepositoriesType createUnitRepositoriesType() {
		UnitRepositoriesTypeImpl unitRepositoriesType = new UnitRepositoriesTypeImpl();
		return unitRepositoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityConstraintType createLocalityConstraintTypeFromString(EDataType eDataType, String initialValue) {
		LocalityConstraintType result = LocalityConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalityConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyKindType createPropertyKindTypeFromString(EDataType eDataType, String initialValue) {
		PropertyKindType result = PropertyKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityConstraintType createLocalityConstraintTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLocalityConstraintTypeFromString(UnitPackage.Literals.LOCALITY_CONSTRAINT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalityConstraintTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocalityConstraintTypeToString(UnitPackage.Literals.LOCALITY_CONSTRAINT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyKindType createPropertyKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyKindTypeFromString(UnitPackage.Literals.PROPERTY_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyKindTypeToString(UnitPackage.Literals.PROPERTY_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPackage getUnitPackage() {
		return (UnitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnitPackage getPackage() {
		return UnitPackage.eINSTANCE;
	}

} //UnitFactoryImpl

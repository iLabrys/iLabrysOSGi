/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage
 * @generated
 */
public interface UnitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitFactory eINSTANCE = es.itecban.deployment.model.deployment.unit.impl.UnitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraints Type</em>'.
	 * @generated
	 */
	ConstraintsType createConstraintsType();

	/**
	 * Returns a new object of class '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Type</em>'.
	 * @generated
	 */
	DependenciesType createDependenciesType();

	/**
	 * Returns a new object of class '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Type</em>'.
	 * @generated
	 */
	DependencyType createDependencyType();

	/**
	 * Returns a new object of class '<em>Deployment Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Unit Type</em>'.
	 * @generated
	 */
	DeploymentUnitType createDeploymentUnitType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Exported Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exported Resources Type</em>'.
	 * @generated
	 */
	ExportedResourcesType createExportedResourcesType();

	/**
	 * Returns a new object of class '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Type</em>'.
	 * @generated
	 */
	PackageType createPackageType();

	/**
	 * Returns a new object of class '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Type</em>'.
	 * @generated
	 */
	PropertyType createPropertyType();

	/**
	 * Returns a new object of class '<em>Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider Type</em>'.
	 * @generated
	 */
	ProviderType createProviderType();

	/**
	 * Returns a new object of class '<em>Required Resource Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Resource Properties Type</em>'.
	 * @generated
	 */
	RequiredResourcePropertiesType createRequiredResourcePropertiesType();

	/**
	 * Returns a new object of class '<em>Required Resource Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Resource Property Type</em>'.
	 * @generated
	 */
	RequiredResourcePropertyType createRequiredResourcePropertyType();

	/**
	 * Returns a new object of class '<em>Required Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Resource Type</em>'.
	 * @generated
	 */
	RequiredResourceType createRequiredResourceType();

	/**
	 * Returns a new object of class '<em>Resource Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Properties Type</em>'.
	 * @generated
	 */
	ResourcePropertiesType createResourcePropertiesType();

	/**
	 * Returns a new object of class '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type</em>'.
	 * @generated
	 */
	ResourceType createResourceType();

	/**
	 * Returns a new object of class '<em>Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types Type</em>'.
	 * @generated
	 */
	TypesType createTypesType();

	/**
	 * Returns a new object of class '<em>Repositories Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repositories Type</em>'.
	 * @generated
	 */
	UnitRepositoriesType createUnitRepositoriesType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnitPackage getUnitPackage();

} //UnitFactory

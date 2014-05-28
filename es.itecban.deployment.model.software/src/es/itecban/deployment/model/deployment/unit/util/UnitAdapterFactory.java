/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.util;

import es.itecban.deployment.model.deployment.unit.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage
 * @generated
 */
public class UnitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UnitPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitSwitch<Adapter> modelSwitch =
		new UnitSwitch<Adapter>() {
			@Override
			public Adapter caseConstraintsType(ConstraintsType object) {
				return createConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType(DependenciesType object) {
				return createDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseDependencyType(DependencyType object) {
				return createDependencyTypeAdapter();
			}
			@Override
			public Adapter caseDeploymentUnitType(DeploymentUnitType object) {
				return createDeploymentUnitTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExportedResourcesType(ExportedResourcesType object) {
				return createExportedResourcesTypeAdapter();
			}
			@Override
			public Adapter casePackageType(PackageType object) {
				return createPackageTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProviderType(ProviderType object) {
				return createProviderTypeAdapter();
			}
			@Override
			public Adapter caseRequiredResourcePropertiesType(RequiredResourcePropertiesType object) {
				return createRequiredResourcePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseRequiredResourcePropertyType(RequiredResourcePropertyType object) {
				return createRequiredResourcePropertyTypeAdapter();
			}
			@Override
			public Adapter caseRequiredResourceType(RequiredResourceType object) {
				return createRequiredResourceTypeAdapter();
			}
			@Override
			public Adapter caseResourcePropertiesType(ResourcePropertiesType object) {
				return createResourcePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseTypesType(TypesType object) {
				return createTypesTypeAdapter();
			}
			@Override
			public Adapter caseUnitRepositoriesType(UnitRepositoriesType object) {
				return createUnitRepositoriesTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.ConstraintsType
	 * @generated
	 */
	public Adapter createConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.DependenciesType
	 * @generated
	 */
	public Adapter createDependenciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.DependencyType
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType <em>Deployment Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.DeploymentUnitType
	 * @generated
	 */
	public Adapter createDeploymentUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.ExportedResourcesType <em>Exported Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.ExportedResourcesType
	 * @generated
	 */
	public Adapter createExportedResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.PackageType
	 * @generated
	 */
	public Adapter createPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.ProviderType <em>Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.ProviderType
	 * @generated
	 */
	public Adapter createProviderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType <em>Required Resource Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertiesType
	 * @generated
	 */
	public Adapter createRequiredResourcePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType <em>Required Resource Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourcePropertyType
	 * @generated
	 */
	public Adapter createRequiredResourcePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType <em>Required Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.RequiredResourceType
	 * @generated
	 */
	public Adapter createRequiredResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.ResourcePropertiesType <em>Resource Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.ResourcePropertiesType
	 * @generated
	 */
	public Adapter createResourcePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.TypesType
	 * @generated
	 */
	public Adapter createTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.unit.UnitRepositoriesType <em>Repositories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.unit.UnitRepositoriesType
	 * @generated
	 */
	public Adapter createUnitRepositoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UnitAdapterFactory

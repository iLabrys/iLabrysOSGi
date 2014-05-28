/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.util;

import es.itecban.deployment.model.software.product.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.software.product.ProductPackage
 * @generated
 */
public class ProductAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProductPackage.eINSTANCE;
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
	protected ProductSwitch<Adapter> modelSwitch =
		new ProductSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFeaturesType(FeaturesType object) {
				return createFeaturesTypeAdapter();
			}
			@Override
			public Adapter caseProductDependenciesType(ProductDependenciesType object) {
				return createProductDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseSoftwareElementsType(SoftwareElementsType object) {
				return createSoftwareElementsTypeAdapter();
			}
			@Override
			public Adapter caseSoftwareFeatureType(SoftwareFeatureType object) {
				return createSoftwareFeatureTypeAdapter();
			}
			@Override
			public Adapter caseSoftwareProductType(SoftwareProductType object) {
				return createSoftwareProductTypeAdapter();
			}
			@Override
			public Adapter caseWarrantyType(WarrantyType object) {
				return createWarrantyTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.FeaturesType <em>Features Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.FeaturesType
	 * @generated
	 */
	public Adapter createFeaturesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.ProductDependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.ProductDependenciesType
	 * @generated
	 */
	public Adapter createProductDependenciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.SoftwareElementsType <em>Software Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.SoftwareElementsType
	 * @generated
	 */
	public Adapter createSoftwareElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.SoftwareFeatureType <em>Software Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.SoftwareFeatureType
	 * @generated
	 */
	public Adapter createSoftwareFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.SoftwareProductType <em>Software Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.SoftwareProductType
	 * @generated
	 */
	public Adapter createSoftwareProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.software.product.WarrantyType <em>Warranty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.software.product.WarrantyType
	 * @generated
	 */
	public Adapter createWarrantyTypeAdapter() {
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

} //ProductAdapterFactory

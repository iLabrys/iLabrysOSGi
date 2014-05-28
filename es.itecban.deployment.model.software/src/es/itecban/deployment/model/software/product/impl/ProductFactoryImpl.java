/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.software.product.*;

import org.eclipse.emf.ecore.EClass;
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
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory("http://model.deployment.itecban.es/SoftwareProduct"); 
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
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
			case ProductPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ProductPackage.FEATURES_TYPE: return createFeaturesType();
			case ProductPackage.PRODUCT_DEPENDENCIES_TYPE: return createProductDependenciesType();
			case ProductPackage.SOFTWARE_ELEMENTS_TYPE: return createSoftwareElementsType();
			case ProductPackage.SOFTWARE_FEATURE_TYPE: return createSoftwareFeatureType();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE: return createSoftwareProductType();
			case ProductPackage.WARRANTY_TYPE: return createWarrantyType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public FeaturesType createFeaturesType() {
		FeaturesTypeImpl featuresType = new FeaturesTypeImpl();
		return featuresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDependenciesType createProductDependenciesType() {
		ProductDependenciesTypeImpl productDependenciesType = new ProductDependenciesTypeImpl();
		return productDependenciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareElementsType createSoftwareElementsType() {
		SoftwareElementsTypeImpl softwareElementsType = new SoftwareElementsTypeImpl();
		return softwareElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFeatureType createSoftwareFeatureType() {
		SoftwareFeatureTypeImpl softwareFeatureType = new SoftwareFeatureTypeImpl();
		return softwareFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareProductType createSoftwareProductType() {
		SoftwareProductTypeImpl softwareProductType = new SoftwareProductTypeImpl();
		return softwareProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarrantyType createWarrantyType() {
		WarrantyTypeImpl warrantyType = new WarrantyTypeImpl();
		return warrantyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl

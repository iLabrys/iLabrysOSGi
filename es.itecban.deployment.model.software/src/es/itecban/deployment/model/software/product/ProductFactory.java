/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.software.product.ProductPackage
 * @generated
 */
public interface ProductFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductFactory eINSTANCE = es.itecban.deployment.model.software.product.impl.ProductFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Features Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Features Type</em>'.
	 * @generated
	 */
	FeaturesType createFeaturesType();

	/**
	 * Returns a new object of class '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Type</em>'.
	 * @generated
	 */
	ProductDependenciesType createProductDependenciesType();

	/**
	 * Returns a new object of class '<em>Software Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Elements Type</em>'.
	 * @generated
	 */
	SoftwareElementsType createSoftwareElementsType();

	/**
	 * Returns a new object of class '<em>Software Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Feature Type</em>'.
	 * @generated
	 */
	SoftwareFeatureType createSoftwareFeatureType();

	/**
	 * Returns a new object of class '<em>Software Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Product Type</em>'.
	 * @generated
	 */
	SoftwareProductType createSoftwareProductType();

	/**
	 * Returns a new object of class '<em>Warranty Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warranty Type</em>'.
	 * @generated
	 */
	WarrantyType createWarrantyType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductPackage getProductPackage();

} //ProductFactory

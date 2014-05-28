/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.ProductDependenciesType#getProductList <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getProductDependenciesType()
 * @model extendedMetaData="name='productDependencies_._type' kind='elementOnly'"
 * @generated
 */
public interface ProductDependenciesType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareProductType[] getProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareProductType getProduct(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getProductLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setProduct(SoftwareProductType[] newProduct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setProduct(int index, SoftwareProductType element);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.software.product.SoftwareProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getProductDependenciesType_Product()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='product'"
	 * @generated
	 */
	List<SoftwareProductType> getProductList();

} // ProductDependenciesType

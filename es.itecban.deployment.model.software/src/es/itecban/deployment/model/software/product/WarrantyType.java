/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warranty Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.WarrantyType#getWarrantyDuration <em>Warranty Duration</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.WarrantyType#getWarrantyStartDate <em>Warranty Start Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getWarrantyType()
 * @model extendedMetaData="name='warranty_._type' kind='elementOnly'"
 * @generated
 */
public interface WarrantyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Warranty Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty Duration</em>' attribute.
	 * @see #setWarrantyDuration(String)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getWarrantyType_WarrantyDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='warrantyDuration'"
	 * @generated
	 */
	String getWarrantyDuration();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.WarrantyType#getWarrantyDuration <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty Duration</em>' attribute.
	 * @see #getWarrantyDuration()
	 * @generated
	 */
	void setWarrantyDuration(String value);

	/**
	 * Returns the value of the '<em><b>Warranty Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty Start Date</em>' attribute.
	 * @see #setWarrantyStartDate(String)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getWarrantyType_WarrantyStartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='warrantyStartDate'"
	 * @generated
	 */
	String getWarrantyStartDate();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.WarrantyType#getWarrantyStartDate <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty Start Date</em>' attribute.
	 * @see #getWarrantyStartDate()
	 * @generated
	 */
	void setWarrantyStartDate(String value);

} // WarrantyType

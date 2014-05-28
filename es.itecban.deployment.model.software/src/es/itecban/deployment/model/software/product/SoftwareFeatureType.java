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
 * A representation of the model object '<em><b>Software Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareFeatureType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareFeatureType#getSoftwareElements <em>Software Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareFeatureType()
 * @model extendedMetaData="name='SoftwareFeatureType' kind='elementOnly'"
 * @generated
 */
public interface SoftwareFeatureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareFeatureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareFeatureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Software Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Elements</em>' containment reference.
	 * @see #setSoftwareElements(SoftwareElementsType)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareFeatureType_SoftwareElements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='softwareElements'"
	 * @generated
	 */
	SoftwareElementsType getSoftwareElements();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareFeatureType#getSoftwareElements <em>Software Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Elements</em>' containment reference.
	 * @see #getSoftwareElements()
	 * @generated
	 */
	void setSoftwareElements(SoftwareElementsType value);

} // SoftwareFeatureType

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import java.util.Map;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareFeature <em>Software Feature</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareProduct <em>Software Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	Map<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	Map<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Software Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Feature</em>' containment reference.
	 * @see #setSoftwareFeature(SoftwareFeatureType)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getDocumentRoot_SoftwareFeature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='softwareFeature' namespace='##targetNamespace'"
	 * @generated
	 */
	SoftwareFeatureType getSoftwareFeature();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareFeature <em>Software Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Feature</em>' containment reference.
	 * @see #getSoftwareFeature()
	 * @generated
	 */
	void setSoftwareFeature(SoftwareFeatureType value);

	/**
	 * Returns the value of the '<em><b>Software Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Product</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Product</em>' containment reference.
	 * @see #setSoftwareProduct(SoftwareProductType)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getDocumentRoot_SoftwareProduct()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='softwareProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	SoftwareProductType getSoftwareProduct();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.DocumentRoot#getSoftwareProduct <em>Software Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Product</em>' containment reference.
	 * @see #getSoftwareProduct()
	 * @generated
	 */
	void setSoftwareProduct(SoftwareProductType value);

} // DocumentRoot

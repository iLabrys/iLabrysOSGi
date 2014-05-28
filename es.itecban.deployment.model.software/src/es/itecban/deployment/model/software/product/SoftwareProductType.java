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
 * A representation of the model object '<em><b>Software Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getWarranty <em>Warranty</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getFeatures <em>Features</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getProductDependencies <em>Product Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getSKUnumber <em>SK Unumber</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareProductType#getIdentifyingNumber <em>Identifying Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType()
 * @model extendedMetaData="name='SoftwareProductType' kind='elementOnly'"
 * @generated
 */
public interface SoftwareProductType extends EObject {
	String getE_id();
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
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Warranty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty</em>' containment reference.
	 * @see #setWarranty(WarrantyType)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_Warranty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='warranty'"
	 * @generated
	 */
	WarrantyType getWarranty();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getWarranty <em>Warranty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty</em>' containment reference.
	 * @see #getWarranty()
	 * @generated
	 */
	void setWarranty(WarrantyType value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference.
	 * @see #setFeatures(FeaturesType)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_Features()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='features'"
	 * @generated
	 */
	FeaturesType getFeatures();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getFeatures <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' containment reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(FeaturesType value);

	/**
	 * Returns the value of the '<em><b>Product Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Dependencies</em>' containment reference.
	 * @see #setProductDependencies(ProductDependenciesType)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_ProductDependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productDependencies'"
	 * @generated
	 */
	ProductDependenciesType getProductDependencies();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getProductDependencies <em>Product Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Dependencies</em>' containment reference.
	 * @see #getProductDependencies()
	 * @generated
	 */
	void setProductDependencies(ProductDependenciesType value);

	/**
	 * Returns the value of the '<em><b>SK Unumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SK Unumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SK Unumber</em>' attribute.
	 * @see #setSKUnumber(String)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_SKUnumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SKUnumber'"
	 * @generated
	 */
	String getSKUnumber();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getSKUnumber <em>SK Unumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SK Unumber</em>' attribute.
	 * @see #getSKUnumber()
	 * @generated
	 */
	void setSKUnumber(String value);

	/**
	 * Returns the value of the '<em><b>Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifying Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Number</em>' attribute.
	 * @see #setIdentifyingNumber(String)
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareProductType_IdentifyingNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='identifyingNumber'"
	 * @generated
	 */
	String getIdentifyingNumber();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.software.product.SoftwareProductType#getIdentifyingNumber <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying Number</em>' attribute.
	 * @see #getIdentifyingNumber()
	 * @generated
	 */
	void setIdentifyingNumber(String value);

} // SoftwareProductType

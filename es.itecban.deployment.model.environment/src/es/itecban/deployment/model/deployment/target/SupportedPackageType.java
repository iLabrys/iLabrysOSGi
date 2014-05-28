/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.SupportedPackageType#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.SupportedPackageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getSupportedPackageType()
 * @model extendedMetaData="name='SupportedPackageType' kind='elementOnly'"
 * @generated
 */
public interface SupportedPackageType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getSupportedPackageType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.SupportedPackageType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Type of package of this deployment unit. A
	 * 						taxonomy of valid packaging formats is defined
	 * 						in a external system.
	 * 
	 * 						For this version the supported packaging formats
	 * 						are: es.itecban.packaging.jar,
	 * 						es.itecban.packaging.osgi,
	 * 						es.itecban.packaging.ear,
	 * 						es.itecban.packaging.war,
	 * 						es.itecban.packaging.rar,
	 * 						es.itecban.packaging.zip,
	 * 						es.itecban.packaging.sca
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getSupportedPackageType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.SupportedPackageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // SupportedPackageType

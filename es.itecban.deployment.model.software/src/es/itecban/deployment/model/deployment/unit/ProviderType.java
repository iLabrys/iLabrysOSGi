/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         		The provider type can be used to include information
 *         		related to the actor responsible for the deployment
 *         		unit.
 *         	
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ProviderType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ProviderType#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ProviderType#getHomeUrl <em>Home Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getProviderType()
 * @model extendedMetaData="name='ProviderType' kind='elementOnly'"
 * @generated
 */
public interface ProviderType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getProviderType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ProviderType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getProviderType_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ProviderType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Home Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						URL to the service provider
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Url</em>' attribute.
	 * @see #setHomeUrl(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getProviderType_HomeUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='homeUrl'"
	 * @generated
	 */
	String getHomeUrl();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ProviderType#getHomeUrl <em>Home Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Url</em>' attribute.
	 * @see #getHomeUrl()
	 * @generated
	 */
	void setHomeUrl(String value);

} // ProviderType

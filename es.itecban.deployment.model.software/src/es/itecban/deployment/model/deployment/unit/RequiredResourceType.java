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
 * A representation of the model object '<em><b>Required Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				Required resources are used to describe dependencies
 * 				between deployment units.The required resources are
 * 				modeled using this data type. The main difference is the
 * 				type of versioning information. In this case version
 * 				ranges are accepted. Use the intervals syntax to add
 * 				this information, e.g. (1.0.0,4.4.10] means that
 * 				resources with a version greater than 1.0.0 and smaller
 * 				or equal to 4.4.10 are accepted
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getType <em>Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getRequiredResourceProperties <em>Required Resource Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourceType()
 * @model extendedMetaData="name='RequiredResourceType' kind='elementOnly'"
 * @generated
 */
public interface RequiredResourceType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourceType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A version is a unique String resource attribute.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourceType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getVersion <em>Version</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourceType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Required Resource Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource Properties</em>' containment reference.
	 * @see #setRequiredResourceProperties(RequiredResourcePropertiesType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getRequiredResourceType_RequiredResourceProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredResourceProperties'"
	 * @generated
	 */
	RequiredResourcePropertiesType getRequiredResourceProperties();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.RequiredResourceType#getRequiredResourceProperties <em>Required Resource Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource Properties</em>' containment reference.
	 * @see #getRequiredResourceProperties()
	 * @generated
	 */
	void setRequiredResourceProperties(RequiredResourcePropertiesType value);

} // RequiredResourceType

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
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         		Resources are capabilities offered by the deployment
 *         		unit to other deployment units.
 *         	
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ResourceType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ResourceType#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ResourceType#getTypes <em>Types</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ResourceType#getResourceProperties <em>Resource Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourceType()
 * @model extendedMetaData="name='ResourceType' kind='elementOnly'"
 * @generated
 */
public interface ResourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Name that identifies the resource. Resources are
	 * 						optionaly qualified with a version attribute,
	 * 						but they must be tagged under a type. Resource
	 * 						types allows differentiating among resources
	 * 						with the same name. As regard the name it is
	 * 						strongly recommended to use naming patterns that
	 * 						help to avoid name clashing, a good practice is
	 * 						to to use the reverse-domain naming strategy,
	 * 						such as the one used to name Java packages, e.g.
	 * 						es.itecban.service.TransferenceManager
	 * 
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourceType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getName <em>Name</em>}' attribute.
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
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourceType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(TypesType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourceType_Types()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='types'"
	 * @generated
	 */
	TypesType getTypes();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(TypesType value);

	/**
	 * Returns the value of the '<em><b>Resource Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 		Properties can be used to refine the resource
	 *                 		description further than the basic
	 *                 		name-version-type tuple.
	 *                 	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Properties</em>' containment reference.
	 * @see #setResourceProperties(ResourcePropertiesType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getResourceType_ResourceProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceProperties'"
	 * @generated
	 */
	ResourcePropertiesType getResourceProperties();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.ResourceType#getResourceProperties <em>Resource Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Properties</em>' containment reference.
	 * @see #getResourceProperties()
	 * @generated
	 */
	void setResourceProperties(ResourcePropertiesType value);

} // ResourceType

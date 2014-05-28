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
 * A representation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependencyType#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependencyType#getLocality <em>Locality</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependencyType#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredPackage <em>Required Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependencyType()
 * @model extendedMetaData="name='DependencyType' kind='elementOnly'"
 * @generated
 */
public interface DependencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						This is a locally unique identifier for the
	 * 						dependency. This identifier is used in the
	 * 						dependency expression to locally identify
	 * 						dependency items
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependencyType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.unit.LocalityConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Some deployment units must share a same runtime
	 * 						environment, others can communicate remotely.
	 * 						This element allows defining the type of
	 * 						distribution supported.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @see #setLocality(LocalityConstraintType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependencyType_Locality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='locality'"
	 * @generated
	 */
	LocalityConstraintType getLocality();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getLocality <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(LocalityConstraintType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						An optional human readable description of the
	 * 						deployment unit contents
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependencyType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Required Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource</em>' containment reference.
	 * @see #setRequiredResource(RequiredResourceType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependencyType_RequiredResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='requiredResource'"
	 * @generated
	 */
	RequiredResourceType getRequiredResource();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredResource <em>Required Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource</em>' containment reference.
	 * @see #getRequiredResource()
	 * @generated
	 */
	void setRequiredResource(RequiredResourceType value);

	/**
	 * Returns the value of the '<em><b>Required Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Package</em>' containment reference.
	 * @see #setRequiredPackage(PackageType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependencyType_RequiredPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredPackage'"
	 * @generated
	 */
	PackageType getRequiredPackage();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DependencyType#getRequiredPackage <em>Required Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Package</em>' containment reference.
	 * @see #getRequiredPackage()
	 * @generated
	 */
	void setRequiredPackage(PackageType value);

} // DependencyType

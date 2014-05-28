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
 * A representation of the model object '<em><b>Runtime Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getStatus <em>Status</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getRuntimeResources <em>Runtime Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitType()
 * @model extendedMetaData="name='RuntimeUnitType' kind='elementOnly'"
 * @generated
 */
public interface RuntimeUnitType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getName <em>Name</em>}' attribute.
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
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.target.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(StatusType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitType_Status()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.target.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Runtime Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Resources</em>' containment reference.
	 * @see #setRuntimeResources(RuntimeResourcesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitType_RuntimeResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runtimeResources'"
	 * @generated
	 */
	RuntimeResourcesType getRuntimeResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.RuntimeUnitType#getRuntimeResources <em>Runtime Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Resources</em>' containment reference.
	 * @see #getRuntimeResources()
	 * @generated
	 */
	void setRuntimeResources(RuntimeResourcesType value);

} // RuntimeUnitType

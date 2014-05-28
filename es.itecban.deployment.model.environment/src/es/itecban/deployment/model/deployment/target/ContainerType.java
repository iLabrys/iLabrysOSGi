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
 * A representation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerTypes <em>Container Types</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerType#getSupportedPackages <em>Supported Packages</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerResources <em>Container Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerProperties <em>Container Properties</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.ContainerType#getRuntimeUnits <em>Runtime Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType()
 * @model extendedMetaData="name='ContainerType' kind='elementOnly'"
 * @generated
 */
public interface ContainerType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.ContainerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Types</em>' containment reference.
	 * @see #setContainerTypes(ContainerTypesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType_ContainerTypes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='containerTypes'"
	 * @generated
	 */
	ContainerTypesType getContainerTypes();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerTypes <em>Container Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Types</em>' containment reference.
	 * @see #getContainerTypes()
	 * @generated
	 */
	void setContainerTypes(ContainerTypesType value);

	/**
	 * Returns the value of the '<em><b>Supported Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Packages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Packages</em>' containment reference.
	 * @see #setSupportedPackages(SupportedPackagesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType_SupportedPackages()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='supportedPackages'"
	 * @generated
	 */
	SupportedPackagesType getSupportedPackages();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.ContainerType#getSupportedPackages <em>Supported Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Packages</em>' containment reference.
	 * @see #getSupportedPackages()
	 * @generated
	 */
	void setSupportedPackages(SupportedPackagesType value);

	/**
	 * Returns the value of the '<em><b>Container Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Resources</em>' containment reference.
	 * @see #setContainerResources(ContainerResourcesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType_ContainerResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerResources'"
	 * @generated
	 */
	ContainerResourcesType getContainerResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerResources <em>Container Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Resources</em>' containment reference.
	 * @see #getContainerResources()
	 * @generated
	 */
	void setContainerResources(ContainerResourcesType value);

	/**
	 * Returns the value of the '<em><b>Container Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Properties</em>' containment reference.
	 * @see #setContainerProperties(ContainerPropertiesType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType_ContainerProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerProperties'"
	 * @generated
	 */
	ContainerPropertiesType getContainerProperties();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.ContainerType#getContainerProperties <em>Container Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Properties</em>' containment reference.
	 * @see #getContainerProperties()
	 * @generated
	 */
	void setContainerProperties(ContainerPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Runtime Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Units</em>' containment reference.
	 * @see #setRuntimeUnits(RuntimeUnitsType)
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getContainerType_RuntimeUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runtimeUnits'"
	 * @generated
	 */
	RuntimeUnitsType getRuntimeUnits();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.target.ContainerType#getRuntimeUnits <em>Runtime Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Units</em>' containment reference.
	 * @see #getRuntimeUnits()
	 * @generated
	 */
	void setRuntimeUnits(RuntimeUnitsType value);

} // ContainerType

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
 * A representation of the model object '<em><b>Deployment Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getProvider <em>Provider</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getPackage <em>Package</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getExportedResources <em>Exported Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getUnitRepositories <em>Unit Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType()
 * @model extendedMetaData="name='DeploymentUnitType' kind='elementOnly'"
 * @generated
 */
public interface DeploymentUnitType extends EObject {
	
	String getE_id();
	void setE_id(String id);
	
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Deployment unit name. In general, it should
	 * 						match the package name, but a shorter name can
	 * 						be used if required.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getName <em>Name</em>}' attribute.
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
	 * 						Version tag of the deployment unit.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						An optional human readable description of the
	 * 						deployment unit contents.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						An optional reference to the deployment unit
	 * 						provider.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(ProviderType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider'"
	 * @generated
	 */
	ProviderType getProvider();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(ProviderType value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						File that contains the resources/artifacts to
	 * 						which this deployment unit description pertains
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(PackageType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Package()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='package'"
	 * @generated
	 */
	PackageType getPackage();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageType value);

	/**
	 * Returns the value of the '<em><b>Exported Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A collection of the logical exported resources
	 * 						by the deployment unit
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exported Resources</em>' containment reference.
	 * @see #setExportedResources(ExportedResourcesType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_ExportedResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exportedResources'"
	 * @generated
	 */
	ExportedResourcesType getExportedResources();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getExportedResources <em>Exported Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported Resources</em>' containment reference.
	 * @see #getExportedResources()
	 * @generated
	 */
	void setExportedResources(ExportedResourcesType value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						List of dependencies to other deployment units
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies'"
	 * @generated
	 */
	DependenciesType getDependencies();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependenciesType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Section that incudes contraints on the execution
	 * 						environment, either to the containing runtime,
	 * 						or to the underlying operating system and
	 * 						hardware
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_Constraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraints'"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Unit Repositories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						List of repositories where this deployment unit
	 * 						should be found
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Repositories</em>' containment reference.
	 * @see #setUnitRepositories(UnitRepositoriesType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDeploymentUnitType_UnitRepositories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitRepositories'"
	 * @generated
	 */
	UnitRepositoriesType getUnitRepositories();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType#getUnitRepositories <em>Unit Repositories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Repositories</em>' containment reference.
	 * @see #getUnitRepositories()
	 * @generated
	 */
	void setUnitRepositories(UnitRepositoriesType value);

	/**
	 * If the unit exports a resource matching the name provided, returns it 
	 * @param name The name of the resource, can not be null
	 * @return The matching ResourceType, null if no matches are made
	 * @generated NOT
	 */
	ResourceType getResource(String name);
} // DeploymentUnitType

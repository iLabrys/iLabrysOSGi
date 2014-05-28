/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getType <em>Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitVersion <em>Unit Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getInitialConfiguration <em>Initial Configuration</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitName <em>Previous Unit Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitVersion <em>Previous Unit Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType()
 * @model extendedMetaData="name='DeploymentActivityType' kind='elementOnly'"
 * @generated
 */
public interface DeploymentActivityType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(DeploymentActivityKindType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	DeploymentActivityKindType getType();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(DeploymentActivityKindType value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(DeploymentActivityKindType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(DeploymentActivityKindType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Name</em>' attribute.
	 * @see #setUnitName(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType_UnitName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='unitName'"
	 * @generated
	 */
	String getUnitName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitName <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Name</em>' attribute.
	 * @see #getUnitName()
	 * @generated
	 */
	void setUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Unit Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Version</em>' attribute.
	 * @see #setUnitVersion(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType_UnitVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='unitVersion'"
	 * @generated
	 */
	String getUnitVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getUnitVersion <em>Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Version</em>' attribute.
	 * @see #getUnitVersion()
	 * @generated
	 */
	void setUnitVersion(String value);

	/**
	 * Returns the value of the '<em><b>Initial Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 								Optional initial configuration values
	 * 								for install /update operations
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Configuration</em>' containment reference.
	 * @see #setInitialConfiguration(InitialConfigurationType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType_InitialConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialConfiguration'"
	 * @generated
	 */
	InitialConfigurationType getInitialConfiguration();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getInitialConfiguration <em>Initial Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Configuration</em>' containment reference.
	 * @see #getInitialConfiguration()
	 * @generated
	 */
	void setInitialConfiguration(InitialConfigurationType value);

	/**
	 * Returns the value of the '<em><b>Previous Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Unit Name</em>' attribute.
	 * @see #setPreviousUnitName(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType_PreviousUnitName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='previousUnitName'"
	 * @generated
	 */
	String getPreviousUnitName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitName <em>Previous Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Unit Name</em>' attribute.
	 * @see #getPreviousUnitName()
	 * @generated
	 */
	void setPreviousUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Previous Unit Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Unit Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Unit Version</em>' attribute.
	 * @see #setPreviousUnitVersion(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityType_PreviousUnitVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='previousUnitVersion'"
	 * @generated
	 */
	String getPreviousUnitVersion();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType#getPreviousUnitVersion <em>Previous Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Unit Version</em>' attribute.
	 * @see #getPreviousUnitVersion()
	 * @generated
	 */
	void setPreviousUnitVersion(String value);

} // DeploymentActivityType

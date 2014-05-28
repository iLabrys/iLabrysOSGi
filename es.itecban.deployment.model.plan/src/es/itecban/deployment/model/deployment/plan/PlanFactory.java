/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage
 * @generated
 */
public interface PlanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlanFactory eINSTANCE = es.itecban.deployment.model.deployment.plan.impl.PlanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activities Type</em>'.
	 * @generated
	 */
	ActivitiesType createActivitiesType();

	/**
	 * Returns a new object of class '<em>Configuration Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Activity Type</em>'.
	 * @generated
	 */
	ConfigurationActivityType createConfigurationActivityType();

	/**
	 * Returns a new object of class '<em>Configuration Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Properties Type</em>'.
	 * @generated
	 */
	ConfigurationPropertiesType createConfigurationPropertiesType();

	/**
	 * Returns a new object of class '<em>Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Type</em>'.
	 * @generated
	 */
	ConfigurationType createConfigurationType();

	/**
	 * Returns a new object of class '<em>Deployment Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Activity Type</em>'.
	 * @generated
	 */
	DeploymentActivityType createDeploymentActivityType();

	/**
	 * Returns a new object of class '<em>Deployment Plan Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Plan Type</em>'.
	 * @generated
	 */
	DeploymentPlanType createDeploymentPlanType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Initial Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Configuration Type</em>'.
	 * @generated
	 */
	InitialConfigurationType createInitialConfigurationType();

	/**
	 * Returns a new object of class '<em>Resource Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Activity Type</em>'.
	 * @generated
	 */
	ResourceActivityType createResourceActivityType();

	/**
	 * Returns a new object of class '<em>Resource Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Configuration Type</em>'.
	 * @generated
	 */
	ResourceConfigurationType createResourceConfigurationType();

	/**
	 * Returns a new object of class '<em>Schedule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Type</em>'.
	 * @generated
	 */
	ScheduleType createScheduleType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlanPackage getPlanPackage();

} //PlanFactory

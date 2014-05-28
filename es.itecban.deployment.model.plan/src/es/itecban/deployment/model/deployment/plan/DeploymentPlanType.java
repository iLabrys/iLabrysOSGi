/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Plan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getActivities <em>Activities</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getScheduleData <em>Schedule Data</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getPlanStatus <em>Plan Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentPlanType()
 * @model extendedMetaData="name='DeploymentPlanType' kind='elementOnly'"
 * @generated
 */
public interface DeploymentPlanType extends EObject {
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
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentPlanType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentPlanType_Environment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='environment'"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference.
	 * @see #setActivities(ActivitiesType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentPlanType_Activities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activities'"
	 * @generated
	 */
	ActivitiesType getActivities();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getActivities <em>Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activities</em>' containment reference.
	 * @see #getActivities()
	 * @generated
	 */
	void setActivities(ActivitiesType value);

	/**
	 * Returns the value of the '<em><b>Schedule Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Data</em>' containment reference.
	 * @see #setScheduleData(ScheduleType)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentPlanType_ScheduleData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scheduleData'"
	 * @generated
	 */
	ScheduleType getScheduleData();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getScheduleData <em>Schedule Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Data</em>' containment reference.
	 * @see #getScheduleData()
	 * @generated
	 */
	void setScheduleData(ScheduleType value);

	/**
	 * Returns the value of the '<em><b>Plan Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Status</em>' attribute.
	 * @see #setPlanStatus(String)
	 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentPlanType_PlanStatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='planStatus'"
	 * @generated
	 */
	String getPlanStatus();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType#getPlanStatus <em>Plan Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Status</em>' attribute.
	 * @see #getPlanStatus()
	 * @generated
	 */
	void setPlanStatus(String value);

} // DeploymentPlanType

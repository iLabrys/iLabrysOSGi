/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanFactoryImpl extends EFactoryImpl implements PlanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlanFactory init() {
		try {
			PlanFactory thePlanFactory = (PlanFactory)EPackage.Registry.INSTANCE.getEFactory("http://model.deployment.itecban.es/DeploymentPlan"); 
			if (thePlanFactory != null) {
				return thePlanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlanPackage.ACTIVITIES_TYPE: return createActivitiesType();
			case PlanPackage.CONFIGURATION_ACTIVITY_TYPE: return createConfigurationActivityType();
			case PlanPackage.CONFIGURATION_PROPERTIES_TYPE: return createConfigurationPropertiesType();
			case PlanPackage.CONFIGURATION_TYPE: return createConfigurationType();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE: return createDeploymentActivityType();
			case PlanPackage.DEPLOYMENT_PLAN_TYPE: return createDeploymentPlanType();
			case PlanPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PlanPackage.INITIAL_CONFIGURATION_TYPE: return createInitialConfigurationType();
			case PlanPackage.RESOURCE_ACTIVITY_TYPE: return createResourceActivityType();
			case PlanPackage.RESOURCE_CONFIGURATION_TYPE: return createResourceConfigurationType();
			case PlanPackage.SCHEDULE_TYPE: return createScheduleType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlanPackage.ACTIVITY_KIND_TYPE:
				return createActivityKindTypeFromString(eDataType, initialValue);
			case PlanPackage.CONFIGURATION_ACTIVITY_KIND_TYPE:
				return createConfigurationActivityKindTypeFromString(eDataType, initialValue);
			case PlanPackage.DEPLOYMENT_ACTIVITY_KIND_TYPE:
				return createDeploymentActivityKindTypeFromString(eDataType, initialValue);
			case PlanPackage.RESOURCE_ACTIVITY_KIND_TYPE:
				return createResourceActivityKindTypeFromString(eDataType, initialValue);
			case PlanPackage.ACTIVITY_KIND_TYPE_OBJECT:
				return createActivityKindTypeObjectFromString(eDataType, initialValue);
			case PlanPackage.CONFIGURATION_ACTIVITY_KIND_TYPE_OBJECT:
				return createConfigurationActivityKindTypeObjectFromString(eDataType, initialValue);
			case PlanPackage.DEPLOYMENT_ACTIVITY_KIND_TYPE_OBJECT:
				return createDeploymentActivityKindTypeObjectFromString(eDataType, initialValue);
			case PlanPackage.RESOURCE_ACTIVITY_KIND_TYPE_OBJECT:
				return createResourceActivityKindTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlanPackage.ACTIVITY_KIND_TYPE:
				return convertActivityKindTypeToString(eDataType, instanceValue);
			case PlanPackage.CONFIGURATION_ACTIVITY_KIND_TYPE:
				return convertConfigurationActivityKindTypeToString(eDataType, instanceValue);
			case PlanPackage.DEPLOYMENT_ACTIVITY_KIND_TYPE:
				return convertDeploymentActivityKindTypeToString(eDataType, instanceValue);
			case PlanPackage.RESOURCE_ACTIVITY_KIND_TYPE:
				return convertResourceActivityKindTypeToString(eDataType, instanceValue);
			case PlanPackage.ACTIVITY_KIND_TYPE_OBJECT:
				return convertActivityKindTypeObjectToString(eDataType, instanceValue);
			case PlanPackage.CONFIGURATION_ACTIVITY_KIND_TYPE_OBJECT:
				return convertConfigurationActivityKindTypeObjectToString(eDataType, instanceValue);
			case PlanPackage.DEPLOYMENT_ACTIVITY_KIND_TYPE_OBJECT:
				return convertDeploymentActivityKindTypeObjectToString(eDataType, instanceValue);
			case PlanPackage.RESOURCE_ACTIVITY_KIND_TYPE_OBJECT:
				return convertResourceActivityKindTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesType createActivitiesType() {
		ActivitiesTypeImpl activitiesType = new ActivitiesTypeImpl();
		return activitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationActivityType createConfigurationActivityType() {
		ConfigurationActivityTypeImpl configurationActivityType = new ConfigurationActivityTypeImpl();
		return configurationActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertiesType createConfigurationPropertiesType() {
		ConfigurationPropertiesTypeImpl configurationPropertiesType = new ConfigurationPropertiesTypeImpl();
		return configurationPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationType createConfigurationType() {
		ConfigurationTypeImpl configurationType = new ConfigurationTypeImpl();
		return configurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentActivityType createDeploymentActivityType() {
		DeploymentActivityTypeImpl deploymentActivityType = new DeploymentActivityTypeImpl();
		return deploymentActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentPlanType createDeploymentPlanType() {
		DeploymentPlanTypeImpl deploymentPlanType = new DeploymentPlanTypeImpl();
		return deploymentPlanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialConfigurationType createInitialConfigurationType() {
		InitialConfigurationTypeImpl initialConfigurationType = new InitialConfigurationTypeImpl();
		return initialConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceActivityType createResourceActivityType() {
		ResourceActivityTypeImpl resourceActivityType = new ResourceActivityTypeImpl();
		return resourceActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConfigurationType createResourceConfigurationType() {
		ResourceConfigurationTypeImpl resourceConfigurationType = new ResourceConfigurationTypeImpl();
		return resourceConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType createScheduleType() {
		ScheduleTypeImpl scheduleType = new ScheduleTypeImpl();
		return scheduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityKindType createActivityKindTypeFromString(EDataType eDataType, String initialValue) {
		ActivityKindType result = ActivityKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationActivityKindType createConfigurationActivityKindTypeFromString(EDataType eDataType, String initialValue) {
		ConfigurationActivityKindType result = ConfigurationActivityKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationActivityKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentActivityKindType createDeploymentActivityKindTypeFromString(EDataType eDataType, String initialValue) {
		DeploymentActivityKindType result = DeploymentActivityKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentActivityKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceActivityKindType createResourceActivityKindTypeFromString(EDataType eDataType, String initialValue) {
		ResourceActivityKindType result = ResourceActivityKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceActivityKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityKindType createActivityKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActivityKindTypeFromString(PlanPackage.Literals.ACTIVITY_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActivityKindTypeToString(PlanPackage.Literals.ACTIVITY_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationActivityKindType createConfigurationActivityKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConfigurationActivityKindTypeFromString(PlanPackage.Literals.CONFIGURATION_ACTIVITY_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationActivityKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConfigurationActivityKindTypeToString(PlanPackage.Literals.CONFIGURATION_ACTIVITY_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentActivityKindType createDeploymentActivityKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeploymentActivityKindTypeFromString(PlanPackage.Literals.DEPLOYMENT_ACTIVITY_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentActivityKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeploymentActivityKindTypeToString(PlanPackage.Literals.DEPLOYMENT_ACTIVITY_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceActivityKindType createResourceActivityKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceActivityKindTypeFromString(PlanPackage.Literals.RESOURCE_ACTIVITY_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceActivityKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceActivityKindTypeToString(PlanPackage.Literals.RESOURCE_ACTIVITY_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanPackage getPlanPackage() {
		return (PlanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlanPackage getPackage() {
		return PlanPackage.eINSTANCE;
	}

} //PlanFactoryImpl

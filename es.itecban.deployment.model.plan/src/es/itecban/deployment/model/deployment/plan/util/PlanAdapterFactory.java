/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.util;

import es.itecban.deployment.model.deployment.plan.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage
 * @generated
 */
public class PlanAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanSwitch<Adapter> modelSwitch =
		new PlanSwitch<Adapter>() {
			@Override
			public Adapter caseActivitiesType(ActivitiesType object) {
				return createActivitiesTypeAdapter();
			}
			@Override
			public Adapter caseActivityType(ActivityType object) {
				return createActivityTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationActivityType(ConfigurationActivityType object) {
				return createConfigurationActivityTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationPropertiesType(ConfigurationPropertiesType object) {
				return createConfigurationPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationType(ConfigurationType object) {
				return createConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseDeploymentActivityType(DeploymentActivityType object) {
				return createDeploymentActivityTypeAdapter();
			}
			@Override
			public Adapter caseDeploymentPlanType(DeploymentPlanType object) {
				return createDeploymentPlanTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseInitialConfigurationType(InitialConfigurationType object) {
				return createInitialConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseResourceActivityType(ResourceActivityType object) {
				return createResourceActivityTypeAdapter();
			}
			@Override
			public Adapter caseResourceConfigurationType(ResourceConfigurationType object) {
				return createResourceConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseScheduleType(ScheduleType object) {
				return createScheduleTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ActivitiesType <em>Activities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ActivitiesType
	 * @generated
	 */
	public Adapter createActivitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ActivityType
	 * @generated
	 */
	public Adapter createActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ConfigurationActivityType <em>Configuration Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationActivityType
	 * @generated
	 */
	public Adapter createConfigurationActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType <em>Configuration Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationPropertiesType
	 * @generated
	 */
	public Adapter createConfigurationPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ConfigurationType
	 * @generated
	 */
	public Adapter createConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.DeploymentActivityType <em>Deployment Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentActivityType
	 * @generated
	 */
	public Adapter createDeploymentActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.DeploymentPlanType <em>Deployment Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.DeploymentPlanType
	 * @generated
	 */
	public Adapter createDeploymentPlanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.InitialConfigurationType <em>Initial Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.InitialConfigurationType
	 * @generated
	 */
	public Adapter createInitialConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ResourceActivityType <em>Resource Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceActivityType
	 * @generated
	 */
	public Adapter createResourceActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ResourceConfigurationType <em>Resource Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ResourceConfigurationType
	 * @generated
	 */
	public Adapter createResourceConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.itecban.deployment.model.deployment.plan.ScheduleType <em>Schedule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.itecban.deployment.model.deployment.plan.ScheduleType
	 * @generated
	 */
	public Adapter createScheduleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlanAdapterFactory

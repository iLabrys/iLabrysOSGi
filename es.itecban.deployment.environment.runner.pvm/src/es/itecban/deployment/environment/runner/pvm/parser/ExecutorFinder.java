package es.itecban.deployment.environment.runner.pvm.parser;

import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import es.itecban.deployment.environment.runner.pvm.factory.ActivityExecutorFactory;
import es.itecban.deployment.environment.runner.pvm.factory.ConfigurationExecutorFactory;
import es.itecban.deployment.environment.runner.pvm.factory.DeploymentExecutorFactory;
import es.itecban.deployment.environment.runner.pvm.factory.ResourceExecutorFactory;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;

public class ExecutorFinder {
	
	private static Logger logger = Logger.getLogger(ExecutorFinder.class.getName());
//	private DeploymentTargetType deploymentTarget;
//	private BundleContext ctx;
	
//	private	static final String SEPARATOR = "#";
	
//	public ExecutorFinder(DeploymentTargetType deploymentTarget, BundleContext ctx) {
//		this.deploymentTarget = deploymentTarget;
//		this.ctx = ctx;
//	}
	
//	public ActivityExecutorFactory[] checkForExecutors(EList<ActivityType> acts) {
//		ActivityExecutorFactory[] executorFactories = new ActivityExecutorFactory[acts.size()];
//		for (int i = 0; i < acts.size(); i++) {
//			ActivityType act = acts.get(i);
//			String target = act.getTarget();
//			String[] params = target.split(SEPARATOR, 5);
//			String nodeName = params[1];
//			String containerName = params[2];
//			NodeType node = EnvironmentNavigator.getNode(nodeName, deploymentTarget);
//			ContainerType container = EnvironmentNavigator.getContainer(containerName, node);
//			executorFactories[i] = getActivityExecutorFactory(act, container);
//			if (executorFactories[i] == null) return null;
//		}
//		return executorFactories;
//	}
	
	public static ActivityExecutorFactory getActivityExecutorFactory(BundleContext ctx, ActivityType act, ContainerType container) {
		if (container == null) return null;
		String className = "";
		String actKind = "";
		String targetContainer = "";
		if (act instanceof DeploymentActivityType) {
			DeploymentActivityType da = (DeploymentActivityType) act;
			actKind = da.getType().getLiteral();
			className = DeploymentExecutorFactory.class.getName();
		}
		if (act instanceof ConfigurationActivityType) {
			ConfigurationActivityType ca = (ConfigurationActivityType) act;
			actKind = ca.getType().getLiteral();
			className = ConfigurationExecutorFactory.class.getName();
		}
		if (act instanceof ResourceActivityType) {
			ResourceActivityType ra = (ResourceActivityType) act;
			actKind = ra.getType().getLiteral();
			className = ResourceExecutorFactory.class.getName();
		}
		EList<ContainerTypeType> containerTypes = container.getContainerTypes().getContainerType();
		for (ContainerTypeType containerType : containerTypes) {
			targetContainer = containerType.getName();
			// TODO: Check version if wanted
			String filter = "(&"
				+ "(objectClass=" + className + ") "
				+ "(supportedOperations=" + actKind + ") "
				+ "(supportedContainer=" + targetContainer + "))";
			
			ServiceReference[] serviceReferences;
			try {
				serviceReferences = ctx.getServiceReferences(className, filter);
				
				if (serviceReferences != null && serviceReferences.length > 0) {
					for (ServiceReference serviceReference : serviceReferences) {
						ActivityExecutorFactory executorFactory = (ActivityExecutorFactory) ctx.getService(serviceReference);
						logger.fine("Got a matching reference for filter: " + filter);
						logger.fine(executorFactory.toString());
						return executorFactory;
					}
				}
			} catch (InvalidSyntaxException e) {
				e.printStackTrace();
			}
		}
		return null; // If executor not found
	}
	
}

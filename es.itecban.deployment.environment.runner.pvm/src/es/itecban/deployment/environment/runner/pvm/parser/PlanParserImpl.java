	package es.itecban.deployment.environment.runner.pvm.parser;

	import java.util.Map;

import es.itecban.deployment.environment.runner.pvm.PlanParser;
	import es.itecban.deployment.environment.runner.pvm.impl.ActivityNode;
	import es.itecban.deployment.model.deployment.plan.ActivityType;
	import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
	import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
	import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
	import org.eclipse.emf.common.util.EList;
	import org.jbpm.pvm.client.ClientProcessDefinition;
	import org.jbpm.pvm.internal.model.NodeImpl;
	import org.jbpm.pvm.internal.model.TransitionImpl;
import org.jbpm.pvm.model.Node;
	import org.jbpm.pvm.model.OpenProcessDefinition;
import org.jbpm.pvm.model.ProcessFactory;

	public class PlanParserImpl implements PlanParser {

		private ActivityProcessor nodeFactory;

		public PlanParserImpl() {
		}

		public PlanParserImpl(ActivityProcessor nodeFactory) {
			this.nodeFactory = nodeFactory;
		}

		public ClientProcessDefinition getProcessDefinition(
				EList<ActivityType> activities) {

			// ActivityExecutorFactory[] executorFactories =
			// finder.checkForExecutors(activities);
			// if (executorFactories == null) {
			// logger.severe("Missing executor, not launching plan");
			// return null;
			// }
			ProcessFactory processFactory = ProcessFactory.build();

			// Create nodes
			for (int i = 0; i < activities.size(); i++) {
				ActivityType activity = activities.get(i);
				String nName = "" + (i + 1);
				// ActivityExecutorFactory executorFactory =
				// executorFactories[i];
				ActivityNode nodeBehaviour = getNodeBehaviour(activity);
				if (i == 0) {
					processFactory = processFactory.node(nName).initial()
							.behaviour(nodeBehaviour);
				} else {
					processFactory = processFactory.transition("proceed").to(
							nName).node(nName).behaviour(nodeBehaviour);
				}
			}

			ClientProcessDefinition processDefinition = processFactory.done();
			return processDefinition;

		}

		public void createCompensationNodes(EList<ActivityType> compActivities,
				OpenProcessDefinition processDefinition, NodeImpl currentNode) {

			// ActivityExecutorFactory[] executorFactories =
			// finder.checkForExecutors(compActivities);

			// Create compensation nodes
			for (int i = compActivities.size(); i > 0; i--) {
				ActivityType compActivity = compActivities.get(i - 1);
				// ActivityExecutorFactory executorFactory =
				// executorFactories[i-1];
				ActivityNode compBehaviour = getNodeBehaviour(compActivity);
				NodeImpl rollbackNode = new NodeImpl();
				rollbackNode.setName("" + (-i));
				rollbackNode.setBehaviour(compBehaviour);
				if (i == compActivities.size()) {
					TransitionImpl rollbackTransition = currentNode
							.createOutgoingTransition("rollback");
					rollbackNode.addIncomingTransition(rollbackTransition);
				} else {
					NodeImpl previousNode = (NodeImpl) processDefinition
							.getNode("-" + (i + 1));
					previousNode.createOutgoingTransition(rollbackNode,
							"proceed");
				}
				Map<String, Node> nodesMap = processDefinition.getNodesMap();
				nodesMap.put(rollbackNode.getName(), rollbackNode);
			}

		}

		private ActivityNode getNodeBehaviour(ActivityType activity) {

			// Deployment activity
			if (activity instanceof DeploymentActivityType) {
				DeploymentActivityType da = (DeploymentActivityType) activity;
				// DeploymentExecutorFactory def = (DeploymentExecutorFactory)
				// executorFactory;
				return nodeFactory.deploymentNode(da);
			}
			// Configuration activity
			if (activity instanceof ConfigurationActivityType) {
				ConfigurationActivityType ca = (ConfigurationActivityType) activity;
				// ConfigurationExecutorFactory cef =
				// (ConfigurationExecutorFactory) executorFactory;
				return nodeFactory.configurationNode(ca);
			}
			// Resource activity
			if (activity instanceof ResourceActivityType) {
				ResourceActivityType ra = (ResourceActivityType) activity;
				// ResourceExecutorFactory ref = (ResourceExecutorFactory)
				// executorFactory;
				return nodeFactory.resourceNode(ra);
			}
			return null;

		}

	}

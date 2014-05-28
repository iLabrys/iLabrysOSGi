package es.itecban.deployment.environment.runner.pvm;

import org.eclipse.emf.common.util.EList;
import org.jbpm.pvm.client.ClientProcessDefinition;
import org.jbpm.pvm.internal.model.NodeImpl;
import org.jbpm.pvm.model.OpenProcessDefinition;

import es.itecban.deployment.model.deployment.plan.ActivityType;

/**
 * Parses deployment plans to obtain their corresponding PVM process definitions.
 * @author marco
 * @version 0.2
 */
public interface PlanParser {
	
	/**
	 * Creates a PVM process definition according to a deployment plan.
	 * @param plan the deployment plan to be parsed
	 * @return process definition of the plan
	 */
	public ClientProcessDefinition getProcessDefinition(EList<ActivityType> activities);
	public void createCompensationNodes(EList<ActivityType> compActivities, OpenProcessDefinition processDefinition, NodeImpl currentNode);

}

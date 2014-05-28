package es.itecban.deployment.repository.services;
import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.deployment.unit.RequiredResourceType;
import es.itecban.deployment.repository.services.core.ResolverCore;


/**
 * This service interface is used at the active repository to carry out
 * dependency resolution among deployment units and resources.
 * The Resolver connects to one or more RepositoryManagers for querying
 * for Dep Units and Resources, and employs a SelectionPolicyManager for
 * choosing among candidate DependencyGraph
 * @author jlruiz, fcuadrado
 *
 */
public interface Resolver extends ResolverCore{
	/**
	 * 
	 * @param rr required resource
	 * @return a graph with the required deployment units
	 * to successfully install the resource
	 * @throws Exception
	 */
	public DependencyGraph resolveRequiredResource(RequiredResourceType rr) throws Exception;

	
}

package es.itecban.deployment.resource.taxonomy;

import java.util.List;

/**
 * Service used to handle the resource taxonomy in the deployment system. The
 * taxonomy is organized hierarchically in a tree, but this is not enforced
 * by the underlying system instead the hierarchy is extracted from the names
 * 
 * @author jlrrevuelta
 * 
 */
public interface TaxonomyValidator {

	/**
	 * @return a list with the supported category names, e.g.
	 *         es.indra.itecban.service, es.indra.itecban.process,
	 *         es.indra.itecban.container
	 */
	public List<Category> getRegisteredCategories();
	

	/**
	 * 
	 * @param type
	 *            to be validated
	 * @param category
	 *            the scope to validate the type
	 * @return true if the type is valid within the category scope
	 */
	public boolean isValidType(String type, Category category);
	/**
	 * 
	 * @param type resource type to be searched
	 * @return null if there is not a suitable category or the category
	 * name
	 */
	public Category isRegisteredType(String type);

	// Check properties
	/**
	 * @return an array of supported property names for a given resourceType in
	 *         a category
	 */
	public List<String> getSupportedResourceProperties(String resourceType,
			Category category);
}

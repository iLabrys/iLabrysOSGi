package es.itecban.deployment.resource.taxonomy;

import java.util.Hashtable;

public interface TaxonomyManager {
	/**
	 * Reset default categories
	 */
	public void resetCategories();

	/**
	 * Add category to the taxonomy
	 * 
	 * @param category
	 */
	public void addCategory(Category category);

	/**
	 * Add supported types to the category
	 * 
	 * @param types
	 *            each type name has an optional human readable description
	 * @param category
	 */
	public void addTypes2Category(Hashtable<String, String> types,
			Category category);

	/**
	 * Remove category
	 * 
	 * @param category
	 */
	public void deleteCategory(Category category);
}

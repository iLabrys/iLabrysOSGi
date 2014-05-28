/*******************************************************************************
 * Copyright 2014 Indra
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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

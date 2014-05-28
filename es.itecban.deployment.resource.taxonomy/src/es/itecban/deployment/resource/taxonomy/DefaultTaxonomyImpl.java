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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DefaultTaxonomyImpl implements TaxonomyManager, TaxonomyValidator {

	private String configLocation;
	private Resource supportedTypes;
	private Hashtable<String, Category> categories;

	private void initTaxonomy() {
		categories = new Hashtable<String, Category>();
		Properties types = new Properties();
		try {
			types.load(supportedTypes.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (types != null) {
			Enumeration keys = types.keys();

			while (keys.hasMoreElements()) {
				String categoryName = (String) keys.nextElement();
				String categoryDescription = (String) types.get(categoryName);
				addCategory(categoryName, categoryDescription);
			}
		}
	}

	private void addCategory(String categoryName, String categoryDescription) {
		// Load internal properties file and add category to the list
		Properties types = new Properties();
		try {
			// Property file is located inside the bundle at configlocation
			types.load(new ClassPathResource(configLocation + File.separator
					+ categoryName + ".properties").getInputStream());
			Category category = new Category(categoryName, categoryDescription,
					types);
			this.categories.put(categoryName, category);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addCategory(Category category) {
		// TODO Add category to persistent storage

	}

	public void addTypes2Category(Hashtable<String, String> types,
			Category category) {
		// TODO Add types to category and save it.

	}

	public void deleteCategory(Category category) {
		// TODO Remove category from the persistent storage

	}

	public void resetCategories() {
		// TODO Add implementation
		// 1.Load categories from the etc internal directory
		// 2.Scan the directory and with each file:
		// 2.1 Create a category with the name of the file (excluding the
		// .properties suffix)
		// 2.2 Load the properties file and take each property name as a
		// supported type for the category
		// 3.Save default categories
	}

	public List<Category> getRegisteredCategories() {
		Enumeration keys = this.categories.keys();
		List<Category> result = new ArrayList<Category>();
		if (keys != null)
			while (keys.hasMoreElements()) {
				result.add(categories.get(keys.nextElement()));
			}
		return result;
	}

	public List<String> getSupportedResourceProperties(String resourceType,
			Category category) {
		// TODO Not to be implemented yet
		return null;
	}

	/**
	 * If category is null, then the search will be done in any category
	 * 
	 * @throws FileNotFoundException
	 */

	public boolean isValidType(String type, Category category) {

		if (category == null){
			List<Category> categoryList = this.getRegisteredCategories();
			for (Category theCategory : categoryList) {
				Properties supportedTypes = theCategory.getSupportedTypes();
				if (supportedTypes.containsKey(type)) {
					return true;
				}
			}
		}else{
			Properties supportedTypes = category.getSupportedTypes();
			if (supportedTypes.containsKey(type)) {
				return true;
			}
		}
		return false;
	}

	public Category isRegisteredType(String type) {
		// TODO Search categories and answer accordingly
		return null;
	}

	public String getConfigLocation() {
		return configLocation;
	}

	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

	public void setSupportedTypes(Resource supportedTypes) {
		this.supportedTypes = supportedTypes;
	}

}

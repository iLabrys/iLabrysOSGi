package es.itecban.deployment.resource.taxonomy;

import java.io.Serializable;
import java.util.Properties;
/**
 * Resources are structured in categories
 * @author jlrrevuelta
 */
public class Category implements Serializable{
	
	private String name;
	private String description;
	private Properties supportedTypes;
	
	public Category(String name, String description, Properties supportedTypes) {
		super();
		this.name = name;
		this.description = description;
		this.supportedTypes = supportedTypes;
	}
	
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.supportedTypes=new Properties();
	}
	
	public Category(String name) {
		super();
		this.name = name;
		this.description = name;
		this.supportedTypes=new Properties();
	}
	public String getName() {
		return name;
	}

	public Properties getSupportedTypes() {
		return supportedTypes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}

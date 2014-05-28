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
package es.itecban.deployment.model.configuration.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.configuration.ConfigurationFactory;
import es.itecban.deployment.model.configuration.DocumentRoot;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.configuration.EnvironmentType;
import es.itecban.deployment.model.configuration.util.ConfigurationResourceImpl;
import es.itecban.deployment.model.configuration.util.ConfigurationXMLProcessor;

public class ConfigurationMarshaller {
	
	public static EnvironmentPropertyType getEnvPropertyFromPath(String path) {
		
		ConfigurationXMLProcessor proc = new ConfigurationXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getEnvironmentProperty();
	}
	
	public static String getXMLFromEnvProperty(EnvironmentPropertyType envProperty) {
		ConfigurationXMLProcessor proc = new ConfigurationXMLProcessor();
		String xmlFile = "The XML String has not been created";
		ConfigurationResourceImpl configurationResource = new ConfigurationResourceImpl(URI.createURI(""));
		DocumentRoot root = ConfigurationFactory.eINSTANCE.createDocumentRoot();
		root.setEnvironmentProperty(envProperty);
		configurationResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(configurationResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
	public static EnvironmentType getEnvironmentTypeFromXML(String xmlPath){
		
		ConfigurationXMLProcessor proc = new ConfigurationXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlPath.getBytes()), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getEnvironment();
	}
	
	public static String getXMLFromEnvironmentType(EnvironmentType environmentConfig){
		
		ConfigurationXMLProcessor proc = new ConfigurationXMLProcessor();
		String xmlFile = "The XML String has not been created";
		ConfigurationResourceImpl configurationResource = new ConfigurationResourceImpl(URI.createURI(""));
		DocumentRoot root = ConfigurationFactory.eINSTANCE.createDocumentRoot();
		root.setEnvironment(environmentConfig);
		configurationResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(configurationResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

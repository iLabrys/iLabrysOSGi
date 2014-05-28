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
package es.itecban.deployment.model.deployment.unit.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.DocumentRoot;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;
import es.itecban.deployment.model.deployment.unit.util.UnitResourceImpl;
import es.itecban.deployment.model.deployment.unit.util.UnitXMLProcessor;

public class UnitMarshaller {
	
	public static DeploymentUnitType getUnitFromXML(String xmlString) {
		UnitXMLProcessor proc = new UnitXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDeploymentUnit();
	}
	
	public static DeploymentUnitType getUnitFromPath(String path) {
		UnitXMLProcessor proc = new UnitXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDeploymentUnit();
	}
	
	public static String getXMLFromUnit(DeploymentUnitType unit) {
		UnitXMLProcessor proc = new UnitXMLProcessor();
		String xmlFile = "The XML String has not been created";
		UnitResourceImpl unitResource = new UnitResourceImpl(URI.createURI(""));
		DocumentRoot root = UnitFactory.eINSTANCE.createDocumentRoot();
		root.setDeploymentUnit(unit);
		unitResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(unitResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
	public static ResourceType getResourceFromXML(String xmlString) {
		UnitXMLProcessor proc = new UnitXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getResource();
	}
	
	public static ResourceType getResourceFromPath(String path) {
		UnitXMLProcessor proc = new UnitXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getResource();
	}
	
	public static String getXMLFromResource(ResourceType resource) {
		UnitXMLProcessor proc = new UnitXMLProcessor();
		String xmlFile = "The XML String has not been created";
		UnitResourceImpl unitResource = new UnitResourceImpl(URI.createURI(""));
		DocumentRoot root = UnitFactory.eINSTANCE.createDocumentRoot();
		root.setResource(resource);
		unitResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(unitResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

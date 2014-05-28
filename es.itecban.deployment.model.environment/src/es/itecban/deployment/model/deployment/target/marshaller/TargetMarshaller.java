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
package es.itecban.deployment.model.deployment.target.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.DocumentRoot;
import es.itecban.deployment.model.deployment.target.TargetFactory;
import es.itecban.deployment.model.deployment.target.util.TargetResourceImpl;
import es.itecban.deployment.model.deployment.target.util.TargetXMLProcessor;

public class TargetMarshaller {

	public static DeploymentTargetType getTargetFromXML(String xmlString) {
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (Exception e) {
			//System.err.println("Error while loading the info from the xml " + e);
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDomain();
	}
	
	public static DeploymentTargetType getTargetFromPath(String path) {
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDomain();
	}
	
	public static String getXMLFromTarget(DeploymentTargetType target) {
		TargetXMLProcessor proc = new TargetXMLProcessor();
		String xmlFile = "The XML String has not been created";
		TargetResourceImpl targetResource = new TargetResourceImpl(URI.createURI(""));
	 	DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
	 	root.setDomain(target);
	 	targetResource.getContents().add(root); 
		try {
		 	xmlFile = proc.saveToString(targetResource, null);
		} catch (IOException e) {
			//System.out.println("Error while making the xml file " + e);
			e.printStackTrace();
		}
		return xmlFile;
	}
	
	public static ContainerType getContainerFromXML(String xmlString) {
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (Exception e) {
			//System.err.println("Error while loading the info from the xml " + e);
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getContainer();
	}
	
	public static ContainerType getContainerFromPath(String path) {
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getContainer();
	}
	
	public static String getXMLFromContainer(ContainerType container) {
		TargetXMLProcessor proc = new TargetXMLProcessor();
		String xmlFile = "The XML String has not been created";
		TargetResourceImpl targetResource = new TargetResourceImpl(URI.createURI(""));
	 	DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
	 	root.setContainer(container);
	 	targetResource.getContents().add(root); 
		try {
		 	xmlFile = proc.saveToString(targetResource, null);
		} catch (IOException e) {
			//System.out.println("Error while making the xml file " + e);
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

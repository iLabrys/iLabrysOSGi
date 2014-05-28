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
package es.itecban.deployment.model.deployment.plan.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.util.PlanResourceImpl;
import es.itecban.deployment.model.deployment.plan.util.PlanXMLProcessor;

public class PlanMarshaller {
	
	public static DeploymentPlanType getPlanFromXML(String xmlString) {
		PlanXMLProcessor proc = new PlanXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getPlan();	
	}
	
	public static DeploymentPlanType getPlanFromUrl(URL url) {
		PlanXMLProcessor proc = new PlanXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(url.openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getPlan();
	}
	
	
	public static DeploymentPlanType getPlanFromPath(String path) {
		PlanXMLProcessor proc = new PlanXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(path.getBytes()), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getPlan();
	}
	
	public static String getXMLFromPlan(DeploymentPlanType plan) {
		PlanXMLProcessor proc = new PlanXMLProcessor();
		String xmlFile = "The XML String has not been created";
		PlanResourceImpl planResource = new PlanResourceImpl(URI.createURI(""));
		DocumentRoot root = PlanFactory.eINSTANCE.createDocumentRoot();
		root.setPlan(plan);
		planResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(planResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

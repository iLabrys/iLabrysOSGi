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

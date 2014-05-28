package es.itecban.deployment.executionmanager.bbdd.utils;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;

import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.util.PlanXMLProcessor;

public class ExecutionManagerUtils {

	private PlanManager service;
	private org.springframework.core.io.Resource plan;
		
	public void addDefaultPlan(){

		try{
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); 
			Document document = documentBuilderFactory.newDocumentBuilder().parse(plan.getInputStream()); 
			StringWriter sw = new StringWriter(); 
			Transformer serializer = TransformerFactory.newInstance().newTransformer(); 
			serializer.transform(new DOMSource(document), new StreamResult(sw));
			String infoString = sw.toString();
			DeploymentPlanType deploymentPlan = this.xmlstring2omodel(infoString);
			service.save(deploymentPlan);
			System.out.println("Default plan correctly added to the database");
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
	}
	
	protected DeploymentPlanType xmlstring2omodel(String xmlstring){
		
		PlanXMLProcessor processor = new PlanXMLProcessor();
		Resource res = null;
		try{
			res = processor.load(new ByteArrayInputStream(xmlstring.getBytes()), null);
		}catch (Exception e){
			System.err.println("Error while loading the info from the xml " + e);
			e.printStackTrace();
		}
		DocumentRoot documenttargetroot = (DocumentRoot) res.getContents().get(0);
		//DeploymentPlanType deploymenttargettype = documenttargetroot.getDomain();
		DeploymentPlanType deploymentplan = documenttargetroot.getPlan();
		return deploymentplan;
	}

	public void setPlan(org.springframework.core.io.Resource plan) {
		this.plan = plan;
	}

	public void setService(PlanManager service) {
		this.service = service;
	}
}

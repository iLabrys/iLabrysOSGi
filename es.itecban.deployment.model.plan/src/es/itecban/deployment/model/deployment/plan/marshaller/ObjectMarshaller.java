package es.itecban.deployment.model.deployment.plan.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.util.PlanResourceImpl;
import es.itecban.deployment.model.deployment.plan.util.PlanXMLProcessor;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.util.TargetXMLProcessor;

public class ObjectMarshaller {

	public DeploymentPlanType unmarshallDeploymentPlan(String xmlDeploymentPlan) throws Exception {

		// Create the object representation
		if (xmlDeploymentPlan == null) 
			throw new IOException("a valid URL to an XML serialized deployment plan must be provided");
		PlanXMLProcessor proc = new PlanXMLProcessor();
		Resource res = null;
		try{
			res = proc.load(new ByteArrayInputStream(xmlDeploymentPlan.getBytes()), null);
		}catch (Exception e){
			System.err.println("Error while loading the info from the xml " + e);
			throw new Exception();
		}
		DocumentRoot documentRoot = (DocumentRoot) res.getContents().get(0);
		DeploymentPlanType dp = documentRoot.getPlan();
		return dp;
	}
	
	public String getXMLDeploymentPlan(DeploymentPlanType plan) throws Exception {

		PlanXMLProcessor proc = new PlanXMLProcessor();
		PlanResourceImpl planResource = new PlanResourceImpl(URI.createURI(""));
		DocumentRoot documentRoot = PlanFactory.eINSTANCE.createDocumentRoot();
		documentRoot.setPlan(plan);
		planResource.getContents().add(documentRoot);
		return proc.saveToString(planResource, null);
	}
}

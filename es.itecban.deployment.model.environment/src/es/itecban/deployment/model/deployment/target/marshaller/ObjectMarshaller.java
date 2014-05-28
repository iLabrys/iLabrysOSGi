package es.itecban.deployment.model.deployment.target.marshaller;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.DocumentRoot;
import es.itecban.deployment.model.deployment.target.TargetFactory;
import es.itecban.deployment.model.deployment.target.util.TargetResourceImpl;
import es.itecban.deployment.model.deployment.target.util.TargetXMLProcessor;

public class ObjectMarshaller {

	public DeploymentTargetType unmarshallDeploymentTarget(String xmlstring) throws Exception {

		TargetXMLProcessor processor = new TargetXMLProcessor();
		Resource res = null;
		try{
			res = processor.load(new ByteArrayInputStream(xmlstring.getBytes()), null);
		}catch (Exception e){
			System.err.println("Error while loading the info from the xml " + e);
			e.printStackTrace();
		}
		DocumentRoot documenttargetroot = (DocumentRoot) res.getContents().get(0);
		DeploymentTargetType deploymenttargettype = documenttargetroot.getDomain();
		
		return deploymenttargettype;
	}
	
	public String getXMLDeploymentTarget(DeploymentTargetType target) throws Exception {

		TargetXMLProcessor processor = new TargetXMLProcessor();
		String xmlfile = "The xml String has not been created";
		try{
			TargetResourceImpl targetresourceimpl = new TargetResourceImpl(URI.createURI(""));
		 	es.itecban.deployment.model.deployment.target.DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
		 	root.setDomain(target);
		 	targetresourceimpl.getContents().add(root); 
		 	xmlfile = processor.saveToString(targetresourceimpl, null);
		}catch (FileNotFoundException e){
			System.out.println("Error while making the xml file " + e);
		}catch (IOException e){
			System.out.println("Error while making the xml file " + e);
		}
		return xmlfile;
	}
}

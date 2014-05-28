package es.itecban.deployment.model.deployment.unit.marshaller;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.DocumentRoot;
import es.itecban.deployment.model.deployment.unit.UnitFactory;
import es.itecban.deployment.model.deployment.unit.util.UnitResourceImpl;
import es.itecban.deployment.model.deployment.unit.util.UnitXMLProcessor;

public class ObjectMarshaller {

	public DeploymentUnitType unmarshallDeploymentUnit(String xmlDeploymentUnit) throws Exception {

		// Create the object representation
		if (xmlDeploymentUnit == null) 
			throw new IOException("a valid URL to an XML serialized dependency graph must be provided");
		UnitXMLProcessor proc = new UnitXMLProcessor();
		org.eclipse.emf.ecore.resource.Resource res = proc.load(new URL(xmlDeploymentUnit).openStream(), null);
		DocumentRoot documentRoot = (DocumentRoot) res.getContents().get(0);
		DeploymentUnitType du = documentRoot.getDeploymentUnit();
		if (du != null)
			System.out.println("Correctly deserialized graph:\n" + du.toString());
		return du;
	}
	
	public String getXMLDeploymentUnit(DeploymentUnitType unit) throws Exception {

		UnitXMLProcessor proc = new UnitXMLProcessor();
		UnitResourceImpl unitResource = new UnitResourceImpl(URI.createURI(""));
		DocumentRoot documentRoot = UnitFactory.eINSTANCE.createDocumentRoot();
		documentRoot.setDeploymentUnit(unit);
		unitResource.getContents().add(documentRoot);
		return proc.saveToString(unitResource, null);
	}
}

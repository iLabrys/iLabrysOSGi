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

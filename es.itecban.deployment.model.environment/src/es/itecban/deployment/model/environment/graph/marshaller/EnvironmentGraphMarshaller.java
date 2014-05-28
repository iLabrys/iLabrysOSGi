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
package es.itecban.deployment.model.environment.graph.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.environment.graph.DocumentRoot;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphFactory;
import es.itecban.deployment.model.environment.graph.util.GraphResourceImpl;
import es.itecban.deployment.model.environment.graph.util.GraphXMLProcessor;

public class EnvironmentGraphMarshaller {

	private static Logger logger=Logger.getLogger(EnvironmentGraphMarshaller.class.getName());
	public static final String NAMESPACE_URI = "http://model.deployment.itecban.es/EnvironmentGraph";
	
	public static EnvironmentGraph unmarshallEnvironmentGraph(String xmlEnvironmentGraph)
			throws Exception {
		// Create the object representation
		if (xmlEnvironmentGraph == null)
			throw new IOException(
					"a valid URL to an XML serialized dependency graph must be provided");
		GraphXMLProcessor proc = new GraphXMLProcessor();
		
		Resource res = proc.load(new ByteArrayInputStream(xmlEnvironmentGraph.getBytes()), null);
		
		es.itecban.deployment.model.environment.graph.DocumentRoot graphr = (es.itecban.deployment.model.environment.graph.DocumentRoot) res.getContents().get(0);
		EnvironmentGraph graph = graphr.getEnvironmentGraph();
		if (graph != null)
			logger.fine("Correctly deserialized graph:\n" + graph.toString());
		return graph;
	}
	
	public static String marshallEnvironmentGraph(EnvironmentGraph environmentGraph) {
		GraphXMLProcessor proc = new GraphXMLProcessor();;
		String xmlFile = "The XML String has not been created";
		GraphResourceImpl environmentGraphResource = new GraphResourceImpl(URI.createURI(""));
		DocumentRoot root = GraphFactory.eINSTANCE.createDocumentRoot();
	 	root.setEnvironmentGraph(environmentGraph);
	 	environmentGraphResource.getContents().add(root); 
		try {
		 	xmlFile = proc.saveToString(environmentGraphResource, null);
		} catch (IOException e) {
			//System.out.println("Error while making the xml file " + e);
			e.printStackTrace();
		}
		return xmlFile;
	}



}

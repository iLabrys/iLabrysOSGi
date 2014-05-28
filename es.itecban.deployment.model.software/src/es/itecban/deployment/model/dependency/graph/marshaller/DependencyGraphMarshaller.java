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
package es.itecban.deployment.model.dependency.graph.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.dependency.graph.DocumentRoot;
import es.itecban.deployment.model.dependency.graph.GraphFactory;
import es.itecban.deployment.model.dependency.graph.util.GraphResourceImpl;
import es.itecban.deployment.model.dependency.graph.util.GraphXMLProcessor;

public class DependencyGraphMarshaller {
	
	public static DependencyGraph getDepGraphFromXML(String xmlString) {
		GraphXMLProcessor proc = new GraphXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDependencyGraph();
	}
	
	public static DependencyGraph getDepGraphFromPath(String path) {
		GraphXMLProcessor proc = new GraphXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getDependencyGraph();
	}
	
	public static String getXMLFromDepGraph(DependencyGraph depGraph) {
		GraphXMLProcessor proc = new GraphXMLProcessor();
		String xmlFile = "The XML String has not been created";
		GraphResourceImpl depGraphResource = new GraphResourceImpl(URI.createURI(""));
		DocumentRoot root = GraphFactory.eINSTANCE.createDocumentRoot();
		root.setDependencyGraph(depGraph);
		depGraphResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(depGraphResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

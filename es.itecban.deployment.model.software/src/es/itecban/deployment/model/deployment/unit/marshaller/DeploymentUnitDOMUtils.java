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

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.DocumentRoot;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;
import es.itecban.deployment.model.deployment.unit.util.UnitResourceImpl;
import es.itecban.deployment.model.deployment.unit.util.UnitXMLProcessor;

/**
 * @author rodrigo garcia
 */
public class DeploymentUnitDOMUtils {

	public static final String NAMESPACE_URI = "http://deployment.itecban.es/repository";

	public static void createTextNode(Element element, String nodeName, String textValue) {
		// Get the document
		Document doc = element.getOwnerDocument();
		// Write the name
		Node resourceNameNode = doc.createElementNS(NAMESPACE_URI, nodeName);
		element.appendChild(resourceNameNode);
		Text resourceNameText = doc.createTextNode(textValue);
		resourceNameNode.appendChild(resourceNameText);
	}

	public static Node getNodeFromProperty(PropertyType property, Document doc) throws Exception {
		// Create the xml document
		UnitXMLProcessor proc = new UnitXMLProcessor();
		UnitResourceImpl urimpl = new UnitResourceImpl(null);
		DocumentRoot root = UnitFactory.eINSTANCE.createDocumentRoot();
		root.setProperty(property);
		urimpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(urimpl, null);
		// Create the inputStream
		byte xmlBytes[] = xmlString.getBytes();
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xmlBytes);
		// Create the DOM document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document xmlDoc = documentBuilder.parse(new InputSource(byteArrayInputStream));
		// Return the first node of the document
		// The node is adopted by the provided document
		return doc.adoptNode(xmlDoc.getFirstChild());
	}
	
	public static PropertyType[] getPropertiesFromDocument(Document doc) throws IOException {
		// Iterate the response properties
		NodeList propertyNodes = doc.getFirstChild().getChildNodes();
		PropertyType[] propertiess = new PropertyType[propertyNodes.getLength()];
		for (int index = 0; index < propertyNodes.getLength(); index++) {
			propertiess[index] = getPropertyFromNode(propertyNodes.item(index));
		}
		// Return the properties
		return propertiess;
	}
	
	public static PropertyType getPropertyFromNode(Node node) throws IOException {
		// Create the object representation
		UnitXMLProcessor proc = new UnitXMLProcessor();
		Resource res = proc.load(node, null);
		DocumentRoot propertyr = (DocumentRoot) res.getContents().get(0);
		PropertyType property = propertyr.getProperty();
		// Return it
		return property;
	}
	public static DeploymentUnitType[] getDeploymentUnitsFromDocument(Document doc) throws IOException {
		// Iterate the response deployment units
		NodeList deploymentUnitNodes = doc.getFirstChild().getChildNodes();
		DeploymentUnitType[] dus = new DeploymentUnitType[deploymentUnitNodes.getLength()];
		for (int index = 0; index < deploymentUnitNodes.getLength(); index++) {
			dus[index] = getDeploymentUnitFromNode(deploymentUnitNodes.item(index));
		}
		// Return the deployment units
		return dus;
	}

	public static Node getNodeFromDeploymentUnit(DeploymentUnitType du, Document doc) throws Exception {
		// Create the xml document
		UnitXMLProcessor proc = new UnitXMLProcessor();
		UnitResourceImpl urimpl = new UnitResourceImpl(null);
		DocumentRoot root = UnitFactory.eINSTANCE.createDocumentRoot();
		root.setDeploymentUnit(du);
		urimpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(urimpl, null);
		// Create the inputStream
		byte xmlBytes[] = xmlString.getBytes();
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xmlBytes);
		// Create the DOM document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document xmlDoc = documentBuilder.parse(new InputSource(byteArrayInputStream));
		// Return the first node of the document
		// The node is adopted by the provided document
		return doc.adoptNode(xmlDoc.getFirstChild());
	}

	public static DeploymentUnitType getDeploymentUnitFromNode(Node node) throws IOException {
		// Create the object representation
		UnitXMLProcessor proc = new UnitXMLProcessor();
		Resource res = proc.load(node, null);
		DocumentRoot dunitr = (DocumentRoot) res.getContents().get(0);
		DeploymentUnitType du = dunitr.getDeploymentUnit();
		// Return it
		return du;
	}
}

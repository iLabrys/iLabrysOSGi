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
package es.itecban.deployment.model.deployment.target.marshaller;

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

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.TargetFactory;
import es.itecban.deployment.model.deployment.target.util.TargetResourceImpl;
import es.itecban.deployment.model.deployment.target.util.TargetXMLProcessor;

/**
 * @author rodrigo garcia
 */
public class DeploymentTargetDOMUtils {

	public static final String NAMESPACE_URI = "http://deployment.itecban.es/environmentManager";

	public static void createTextNode(Element element, String nodeName, String textValue) {
		// Get the document
		Document doc = element.getOwnerDocument();
		// Write the name
		Node resourceNameNode = doc.createElementNS(NAMESPACE_URI, nodeName);
		element.appendChild(resourceNameNode);
		Text resourceNameText = doc.createTextNode(textValue);
		resourceNameNode.appendChild(resourceNameText);
	}

	public static DeploymentTargetType[] getDeploymentTargetsFromDocument(Document doc) throws IOException {
		// Iterate the response properties
		NodeList environmentNodes = doc.getFirstChild().getChildNodes();
		DeploymentTargetType[] environments = new DeploymentTargetType[environmentNodes.getLength()];
		for (int index = 0; index < environmentNodes.getLength(); index++) {
			environments[index] = getDeploymentTargetFromNode(environmentNodes.item(index));
		}
		// Return the environments
		return environments;
	}

	public static Node getNodeFromDeploymentTarget(DeploymentTargetType environment, Document doc) throws Exception {
		// Create the xml document
		TargetXMLProcessor proc = new TargetXMLProcessor();
		TargetResourceImpl trimpl = new TargetResourceImpl(null);
		es.itecban.deployment.model.deployment.target.DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
		root.setDomain(environment);
		trimpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(trimpl, null);
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

	public static DeploymentTargetType getDeploymentTargetFromNode(Node node) throws IOException {
		// Create the object representation
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.deployment.target.DocumentRoot environmentr = (es.itecban.deployment.model.deployment.target.DocumentRoot) res
				.getContents().get(0);
		DeploymentTargetType environment = environmentr.getDomain();
		// Return it
		return environment;
	}

	public static Node getDomNodeFromNodeType(NodeType nodeType, Document doc) throws Exception {
		// Create the xml document
		TargetXMLProcessor proc = new TargetXMLProcessor();
		TargetResourceImpl trimpl = new TargetResourceImpl(null);
		es.itecban.deployment.model.deployment.target.DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
		root.setNode(nodeType);
		trimpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(trimpl, null);
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

	public static NodeType getNodeTypeFromDomNode(Node node) throws IOException {
		// Create the object representation
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.deployment.target.DocumentRoot noder = (es.itecban.deployment.model.deployment.target.DocumentRoot) res.getContents()
				.get(0);
		NodeType nodeType = noder.getNode();
		// Return it
		return nodeType;
	}
	
	public static Node getNodeFromContainer(ContainerType containerType, Document doc) throws Exception {
		// Create the xml document
		TargetXMLProcessor proc = new TargetXMLProcessor();
		TargetResourceImpl trimpl = new TargetResourceImpl(null);
		es.itecban.deployment.model.deployment.target.DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
		root.setContainer(containerType);
		trimpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(trimpl, null);
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

	public static ContainerType getContainerFromNode(Node node) throws IOException {
		// Create the object representation
		TargetXMLProcessor proc = new TargetXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.deployment.target.DocumentRoot containerr = (es.itecban.deployment.model.deployment.target.DocumentRoot) res
				.getContents().get(0);
		ContainerType container = containerr.getContainer();
		// Return it
		return container;
	}
	
	public static ContainerType[] getContainersFromDocument(Document doc) throws IOException {
		// Iterate the response deployment units
		NodeList containerNodes = doc.getFirstChild().getChildNodes();
		ContainerType[] containers = new ContainerType[containerNodes.getLength()];
		for (int index = 0; index < containerNodes.getLength(); index++) {
			containers[index] = getContainerFromNode(containerNodes.item(index));
		}
		// Return the deployment units
		return containers;
	}
}

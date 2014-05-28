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
package es.itecban.deployment.model.validation.result.marshaller;

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
import es.itecban.deployment.model.validation.result.DocumentRoot;
import es.itecban.deployment.model.validation.result.PlanValidationResult;
import es.itecban.deployment.model.validation.result.ResultFactory;
import es.itecban.deployment.model.validation.result.util.ResultResourceImpl;
import es.itecban.deployment.model.validation.result.util.ResultXMLProcessor;

/**
 * @author rodrigo garcia
 */
public class ValidationResultDOMUtils {

	public static final String NAMESPACE_URI = "http://deployment.itecban.es/ValidationResult";

	public static void createTextNode(Element element, String nodeName, String textValue) {
		// Get the document
		Document doc = element.getOwnerDocument();
		// Write the name
		Node resourceNameNode = doc.createElementNS(NAMESPACE_URI, nodeName);
		element.appendChild(resourceNameNode);
		Text resourceNameText = doc.createTextNode(textValue);
		resourceNameNode.appendChild(resourceNameText);
	}

	public static Node getNodeFromValidationResult(PlanValidationResult result, Document doc) throws Exception {
		// Create the xml document
		ResultXMLProcessor proc = new ResultXMLProcessor();
		ResultResourceImpl trimpl = new ResultResourceImpl(null);
		DocumentRoot root = ResultFactory.eINSTANCE.createDocumentRoot();
		root.setResult(result);
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

	public static PlanValidationResult getValidationResultFromNode(Node node) throws IOException {
		// Create the object representation
		ResultXMLProcessor proc = new ResultXMLProcessor();
		Resource res = proc.load(node, null);
		DocumentRoot resultr = (DocumentRoot) res.getContents().get(0);
		PlanValidationResult result = resultr.getResult();
		// Return it
		return result;
	}
	
	public static PlanValidationResult[] getValidationResultsFromDocument(Document doc) throws IOException {
		// Iterate the response deployment units
		NodeList resultNodes = doc.getFirstChild().getChildNodes();
		PlanValidationResult[] results = new PlanValidationResult[resultNodes.getLength()];
		for (int index = 0; index < resultNodes.getLength(); index++) {
			results[index] = getValidationResultFromNode(resultNodes.item(index));
		}
		// Return the deployment units
		return results;
	}

}

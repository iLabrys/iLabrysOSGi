package es.itecban.deployment.model.dependency.graph.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

import es.itecban.deployment.model.dependency.graph.DependencyGraph;
import es.itecban.deployment.model.dependency.graph.GraphFactory;
import es.itecban.deployment.model.dependency.graph.util.GraphResourceImpl;
import es.itecban.deployment.model.dependency.graph.util.GraphXMLProcessor;

/**
 * @author rodrigo garcia
 */
public class DependencyGraphDOMUtils {

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

	public static Node getNodeFromDependencyGraph(DependencyGraph graph, Document doc) throws Exception {
		// Create the xml document
		GraphXMLProcessor proc = new GraphXMLProcessor();
		GraphResourceImpl graphrimpl = new GraphResourceImpl(null);
		es.itecban.deployment.model.dependency.graph.DocumentRoot root = GraphFactory.eINSTANCE.createDocumentRoot();
		root.setDependencyGraph(graph);
		graphrimpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(graphrimpl, null);
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

	public static DependencyGraph getDependencyGraphFromNode(Node node) throws IOException {
		// Create the object representation
		GraphXMLProcessor proc = new GraphXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.dependency.graph.DocumentRoot graphr = (es.itecban.deployment.model.dependency.graph.DocumentRoot) res.getContents().get(0);
		DependencyGraph graph = graphr.getDependencyGraph();
		// Return it
		return graph;
	}
}

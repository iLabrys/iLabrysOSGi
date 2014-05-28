package es.itecban.deployment.model.environment.graph.marshaller;

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

import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.GraphFactory;
import es.itecban.deployment.model.environment.graph.util.GraphResourceImpl;
import es.itecban.deployment.model.environment.graph.util.GraphXMLProcessor;



/**
 * @author lmfteomiro
 */
public class EnvironmentGraphDOMUtils {

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

	public static Node getNodeFromEnvironmentGraph(EnvironmentGraph graph, Document doc) throws Exception {
		// Create the xml document
		GraphXMLProcessor proc = new GraphXMLProcessor();
		GraphResourceImpl graphrimpl = new GraphResourceImpl(null);
		es.itecban.deployment.model.environment.graph.DocumentRoot root = GraphFactory.eINSTANCE.createDocumentRoot();
		root.setEnvironmentGraph(graph);
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

	public static EnvironmentGraph getEnvironmentGraphFromNode(Node node) throws IOException {
		// Create the object representation
		GraphXMLProcessor proc = new GraphXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.environment.graph.DocumentRoot graphr = (es.itecban.deployment.model.environment.graph.DocumentRoot) res.getContents().get(0);
		EnvironmentGraph graph = graphr.getEnvironmentGraph();
		// Return it
		return graph;
	}
}

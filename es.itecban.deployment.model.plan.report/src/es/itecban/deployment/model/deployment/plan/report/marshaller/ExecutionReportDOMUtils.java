package es.itecban.deployment.model.deployment.plan.report.marshaller;

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

import es.itecban.deployment.model.deployment.plan.report.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.plan.report.util.ReportResourceImpl;
import es.itecban.deployment.model.deployment.plan.report.util.ReportXMLProcessor;

/**
 * @author rodrigo garcia
 */
public class ExecutionReportDOMUtils {

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

	public static Node getNodeFromExecutionReport(ExecutionReportType report, Document doc) throws Exception {
		// Create the xml document
		ReportXMLProcessor proc = new ReportXMLProcessor();
		ReportResourceImpl primpl = new ReportResourceImpl(null);
		DocumentRoot root = ReportFactory.eINSTANCE.createDocumentRoot();
		root.setExecutionReport(report);
		primpl.getContents().add(root);
		// Create the string
		String xmlString = proc.saveToString(primpl, null);
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

	public static ExecutionReportType getExecutionReportFromNode(Node node) throws IOException {
		// Create the object representation
		ReportXMLProcessor proc = new ReportXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.deployment.plan.report.DocumentRoot reportr = (es.itecban.deployment.model.deployment.plan.report.DocumentRoot) res.getContents().get(0);
		ExecutionReportType plan = reportr.getExecutionReport();
		// Return it
		return plan;
	}

	
}

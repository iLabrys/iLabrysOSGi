package es.itecban.deployment.model.deployment.plan.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.ScheduleType;
import es.itecban.deployment.model.deployment.plan.util.PlanResourceImpl;
import es.itecban.deployment.model.deployment.plan.util.PlanXMLProcessor;

/**
 * @author rodrigo garcia
 */
public class DeploymentPlanDOMUtils {

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

	public static Node getNodeFromDeploymentPlan(DeploymentPlanType plan, Document doc) throws Exception {
		// Create the xml document
		PlanXMLProcessor proc = new PlanXMLProcessor();
		PlanResourceImpl primpl = new PlanResourceImpl(null);
		DocumentRoot root = PlanFactory.eINSTANCE.createDocumentRoot();
		root.setPlan(plan);
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

	public static DeploymentPlanType getDeploymentPlanFromNode(Node node) throws IOException {
		// Create the object representation
		PlanXMLProcessor proc = new PlanXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.deployment.plan.DocumentRoot planr = (es.itecban.deployment.model.deployment.plan.DocumentRoot) res.getContents().get(0);
		DeploymentPlanType plan = planr.getPlan();
		// Return it
		return plan;
	}

	public static Node getNodeFromSchedule(ScheduleType schedule, Document doc) throws Exception {
		// Create the xml document
		PlanXMLProcessor proc = new PlanXMLProcessor();
		PlanResourceImpl primpl = new PlanResourceImpl(null);
		es.itecban.deployment.model.deployment.plan.DocumentRoot root = PlanFactory.eINSTANCE.createDocumentRoot();
		root.setSchedule(schedule);
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

	public static ScheduleType getScheduleFromNode(Node node) throws IOException {
		// Create the object representation
		PlanXMLProcessor proc = new PlanXMLProcessor();
		Resource res = proc.load(node, null);
		es.itecban.deployment.model.deployment.plan.DocumentRoot scheduler = (es.itecban.deployment.model.deployment.plan.DocumentRoot) res.getContents()
				.get(0);
		ScheduleType schedule = scheduler.getSchedule();
		// Return it
		return schedule;
	}
}

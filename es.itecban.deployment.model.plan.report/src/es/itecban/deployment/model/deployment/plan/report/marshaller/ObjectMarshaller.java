package es.itecban.deployment.model.deployment.plan.report.marshaller;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;

import es.itecban.deployment.model.deployment.plan.report.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.plan.report.util.ReportResourceImpl;
import es.itecban.deployment.model.deployment.plan.report.util.ReportXMLProcessor;

public class ObjectMarshaller {

	public ExecutionReportType unmarshallExecutionReport(String xmlExecutionReport) throws Exception {

		// Create the object representation
		if (xmlExecutionReport == null) 
			throw new IOException("a valid URL to an XML serialized execution report must be provided");
		ReportXMLProcessor proc = new ReportXMLProcessor();
		org.eclipse.emf.ecore.resource.Resource res = proc.load(new URL(xmlExecutionReport).openStream(), null);
		DocumentRoot documentRoot = (DocumentRoot) res.getContents().get(0);
		ExecutionReportType er = documentRoot.getExecutionReport();
		return er;
	}
	
	public String getXMLExecutionReport(ExecutionReportType report) throws Exception {

		ReportXMLProcessor proc = new ReportXMLProcessor();
		ReportResourceImpl reportResource = new ReportResourceImpl(URI.createURI(""));
		DocumentRoot documentRoot = ReportFactory.eINSTANCE.createDocumentRoot();
		documentRoot.setExecutionReport(report);
		reportResource.getContents().add(documentRoot);
		return proc.saveToString(reportResource, null);
	}
}


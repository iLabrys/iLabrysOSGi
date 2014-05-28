package es.itecban.deployment.model.deployment.plan.report.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.DocumentRoot;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ReportFactory;
import es.itecban.deployment.model.deployment.plan.report.util.ReportResourceImpl;
import es.itecban.deployment.model.deployment.plan.report.util.ReportXMLProcessor;

public class ReportMarshaller {
	
	public static ExecutionReportType getReportFromXML(String xmlString) {
		ReportXMLProcessor proc = new ReportXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getExecutionReport();
	}
	public static ExecutionReportType getReportFromUrl(URL url){
		ReportXMLProcessor proc = new ReportXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(url.openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getExecutionReport();	
	}
	
	public static ExecutionReportType getReportFromPath(String path) {
		ReportXMLProcessor proc = new ReportXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getExecutionReport();
	}
	
	public static String getXMLFromReport(ExecutionReportType report) {
		ReportXMLProcessor proc = new ReportXMLProcessor();
		String xmlFile = "The XML String has not been created";
		ReportResourceImpl reportResource = new ReportResourceImpl(URI.createURI(""));
		DocumentRoot root = ReportFactory.eINSTANCE.createDocumentRoot();
		root.setExecutionReport(report);
		reportResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(reportResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
	public static ActivityExecReportType getActReportFromXML(String xmlString) {
		ReportXMLProcessor proc = new ReportXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getActivity();
	}
	
	public static ActivityExecReportType getActReportFromPath(String path) {
		ReportXMLProcessor proc = new ReportXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getActivity();
	}
	
	public static String getXMLFromActReport(ActivityExecReportType actReport) {
		ReportXMLProcessor proc = new ReportXMLProcessor();
		String xmlFile = "The XML String has not been created";
		ReportResourceImpl reportResource = new ReportResourceImpl(URI.createURI(""));
		DocumentRoot root = ReportFactory.eINSTANCE.createDocumentRoot();
		root.setActivity(actReport);
		reportResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(reportResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

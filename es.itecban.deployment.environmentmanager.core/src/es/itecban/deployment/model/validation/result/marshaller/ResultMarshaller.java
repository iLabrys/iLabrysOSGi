package es.itecban.deployment.model.validation.result.marshaller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import es.itecban.deployment.model.validation.result.DocumentRoot;
import es.itecban.deployment.model.validation.result.PlanValidationResult;
import es.itecban.deployment.model.validation.result.ResultFactory;
import es.itecban.deployment.model.validation.result.util.ResultResourceImpl;
import es.itecban.deployment.model.validation.result.util.ResultXMLProcessor;

public class ResultMarshaller {
	
	public static PlanValidationResult getResultFromXML(String xmlString) {
		ResultXMLProcessor proc = new ResultXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new ByteArrayInputStream(xmlString.getBytes()), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getResult();
	}
	
	public static PlanValidationResult getResultFromPath(String path) {
		ResultXMLProcessor proc = new ResultXMLProcessor();
		Resource res = null;
		try {
			res = proc.load(new URL(path).openStream(), null);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DocumentRoot root = (DocumentRoot) res.getContents().get(0);
		return root.getResult();
	}
	
	public static String getXMLFromResult(PlanValidationResult result) {
		ResultXMLProcessor proc = new ResultXMLProcessor();
		String xmlFile = "The XML String has not been created";
		ResultResourceImpl resultResource = new ResultResourceImpl(URI.createURI(""));
		DocumentRoot root = ResultFactory.eINSTANCE.createDocumentRoot();
		root.setResult(result);
		resultResource.getContents().add(root);
		try {
			xmlFile = proc.saveToString(resultResource, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
}

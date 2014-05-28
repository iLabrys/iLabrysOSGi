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


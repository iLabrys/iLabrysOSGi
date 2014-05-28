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
package es.itecban.deployment.executionmanager.web.view;


import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;


public class ReportActivityView implements View {

	public String getContentType() {
		return "application/octet-stream";
	}
	public void render(Map model, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		PrintWriter out=resp.getWriter();

		resp.setContentType("application/octet-stream");

		ActivityExecReportType report = (ActivityExecReportType)model.get("report");
		out.print(report.getTechnicalActivityExecReport());
		out.flush();
		out.close();

	}
	


}

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
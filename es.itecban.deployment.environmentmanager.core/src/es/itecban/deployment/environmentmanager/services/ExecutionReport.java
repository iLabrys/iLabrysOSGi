package es.itecban.deployment.environmentmanager.services;

public class ExecutionReport implements java.io.Serializable{

	public String report;
	public String reportPath;
	
	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
	
	public String getReportString(){
		
		return this.reportPath;
	}
	
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}
	
	public String getReportPath() {
		return reportPath;
	}
	
}
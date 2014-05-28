package es.itecban.deployment.environmentmanager.services;

import java.util.EventObject;

import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;


/**
 * @author lmfteomiro
 * 
 * This class defines a general event type
 *
 */
public class ExecutionEvent extends EventObject{
	
	private static final long serialVersionUID = 3210802372318693598L;
	String id;
	ExecutionReportType planReport;

	/**
	 * @param obj The object on which the Event initially occurred.
	 * @param id Instance variable to difference each object of this type
	 * @param planReport Plan execution report. It could be finished or not. 
	 */
	public ExecutionEvent(Object obj, String id, ExecutionReportType planReport) {
		super(obj);
		this.id = id;
		this.planReport = planReport;		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ExecutionReportType getPlanReport() {
		return planReport;
	}

	public void setPlanReport(ExecutionReportType planReport) {
		this.planReport = planReport;
	}
	
}

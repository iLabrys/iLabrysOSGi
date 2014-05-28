package es.itecban.deployment.environmentmanager.services;

import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

/**
 * @author lmfteomiro
 * 
 * This class defines a plan execution end event type
 *
 */

public class PlanExecutionEndEvent extends ExecutionEvent {

	
	private static final long serialVersionUID = -3431312735085608468L;
	
	/**
	 * @param obj The object on which the Event initially occurred.
	 * @param id Instance variable to difference each object of this type
	 * @param planReport Plan execution report. This event event indicates the plan execution end
	 */
	public PlanExecutionEndEvent(Object obj, String id,
			ExecutionReportType planReport) {
		super(obj, id, planReport);
		
	}


}

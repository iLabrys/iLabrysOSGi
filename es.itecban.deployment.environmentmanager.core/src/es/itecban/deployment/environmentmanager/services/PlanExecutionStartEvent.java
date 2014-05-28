package es.itecban.deployment.environmentmanager.services;

import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

/**
 * @author lmfteomiro
 * 
 * This class defines a plan execution start event type
 *
 */

public class PlanExecutionStartEvent extends ExecutionEvent {
	
	private static final long serialVersionUID = 1379912632966226003L;

	/**
	 * @param obj The object on which the Event initially occurred.
	 * @param id Instance variable to difference each object of this type
	 * @param planReport Plan execution report. This event event indicates the plan execution start.  
	 */
	public PlanExecutionStartEvent(Object obj, String id,
			ExecutionReportType planReport) {
		super(obj, id, planReport);
		
	}

	

}

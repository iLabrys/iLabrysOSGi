package es.itecban.deployment.environmentmanager.services;

import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

/**
 * @author lmfteomiro
 * 
 * This class defines an activity execution start event type
 *
 */

public class ActivityExecutionStartEvent extends ExecutionEvent {


	private static final long serialVersionUID = 3814566303509762982L;

	
	/**
	 * @param obj The object on which the Event initially occurred.
	 * @param id Instance variable to difference each object of this type
	 * @param planReport Plan execution report. This event event indicates that an activity execution has been started 
	 */
	
	public ActivityExecutionStartEvent(Object obj, String id,
			ExecutionReportType planReport) {
		super(obj, id, planReport);
		
	}



}

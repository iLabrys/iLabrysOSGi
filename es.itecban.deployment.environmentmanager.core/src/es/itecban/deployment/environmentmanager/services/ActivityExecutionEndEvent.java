package es.itecban.deployment.environmentmanager.services;

import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;

/**
 * @author lmfteomiro
 * 
 * This class defines an activity execution end event type
 *
 */

public class ActivityExecutionEndEvent extends ExecutionEvent {	
	

	private static final long serialVersionUID = 5731031332781568222L;

	/**
	 * @param obj The object on which the Event initially occurred.
	 * @param id Instance variable to difference each object of this type
	 * @param planReport Plan execution report. This event event indicates that an activity execution has been finished  
	 */
	
	public ActivityExecutionEndEvent(Object obj, String id,
			ExecutionReportType planReport) {
		super(obj, id, planReport);		
	}

	

}

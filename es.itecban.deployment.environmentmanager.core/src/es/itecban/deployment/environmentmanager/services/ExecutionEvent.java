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

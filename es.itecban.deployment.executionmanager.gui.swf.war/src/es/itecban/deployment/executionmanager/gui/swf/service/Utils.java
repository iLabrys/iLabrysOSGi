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
package es.itecban.deployment.executionmanager.gui.swf.service;

import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;

public class Utils {

	private static Logger utilsLogger = Logger
			.getLogger(UpdatePlanCreationManager.class.getName());

	public static void getTimeOfExecution(Calendar cal1, Calendar cal2,
			String message) {

		long cal1milis = cal1.getTimeInMillis();
		long cal2milis = cal2.getTimeInMillis();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(cal2milis - cal1milis);
		utilsLogger.info("===================" + message + (cal.get(Calendar.HOUR_OF_DAY) -1) + " hours, "
				+ cal.get(Calendar.MINUTE) + " mins, "
				+ cal.get(Calendar.SECOND) + " secs.");
	}
	
	public static void getTimeOfExecution(long long1, long long2,
			String message) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(long2 - long1);
		utilsLogger.info("===================" + message + (cal.get(Calendar.HOUR_OF_DAY) -1) + " hours, "
				+ cal.get(Calendar.MINUTE) + " mins, "
				+ cal.get(Calendar.SECOND) + " secs.");
	}
}

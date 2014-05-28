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

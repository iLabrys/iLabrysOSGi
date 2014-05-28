package es.itecban.deployment.executionmanager.core;

import java.util.Date;

/**
 * Schedule Java Bean that wraps scheduling information
 * 
 * @author jlrrevuelta
 * 
 */
public class Schedule {

	private String environment;
	private String planId;
	private Date launchDate;

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	@Override
	public String toString() {
		return "Scheduled Plan: " + planId + " \n\tEnvironment: " + environment
				+ "\n\tLaunchDate: " + launchDate;
	}

}

package es.itecban.deployment.executionmanager.elements;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class PlanFilter {
	
	private String target;
	private XMLGregorianCalendar creationMin;
	private XMLGregorianCalendar creationMax;
	private XMLGregorianCalendar scheduledLaunchMin;
	private XMLGregorianCalendar scheduledLaunchMax;
	private XMLGregorianCalendar lastModificationMin;
	private XMLGregorianCalendar lastModificationMax;

	private XMLGregorianCalendar creation;

	private XMLGregorianCalendar scheduledLaunch;
	private XMLGregorianCalendar lastModification;
	private XMLGregorianCalendar launch;
	private XMLGregorianCalendar deletion;
	
	public void setTarget(String target) {
		this.target = target;
	}

	public void setCreation(XMLGregorianCalendar creation) {
		this.creation = creation;
	}

	public void setScheduledLaunch(XMLGregorianCalendar scheduledLaunch) {
		this.scheduledLaunch = scheduledLaunch;
	}

	public void setLastModification(XMLGregorianCalendar lastModification) {
		this.lastModification = lastModification;
	}

	public void setLaunch(XMLGregorianCalendar launch) {
		this.launch = launch;
	}

	public void setDeletion(XMLGregorianCalendar deletion) {
		this.deletion = deletion;
	}

	public PlanFilter(String target) {
		this.target = target;
	}
	
	public PlanFilter(String target, XMLGregorianCalendar creation, XMLGregorianCalendar scheduledLaunch, XMLGregorianCalendar lastModification) {
		this(target);
		this.creation = creation;
		this.scheduledLaunch = scheduledLaunch;
		this.lastModification = lastModification;
	}
	
	public PlanFilter(String target, 
			XMLGregorianCalendar creationMin, XMLGregorianCalendar creationMax,
			XMLGregorianCalendar scheduledLaunchMin, XMLGregorianCalendar scheduledLaunchMax,
			XMLGregorianCalendar lastModificationMin, XMLGregorianCalendar lastModificationMax) {
		this(target);
		this.creationMin = creationMin;
		this.creationMax = creationMax;
		this.scheduledLaunchMin = scheduledLaunchMin;
		this.scheduledLaunchMax = scheduledLaunchMax;
		this.lastModificationMin = lastModificationMin;
		this.lastModificationMax = lastModificationMax;
	}
	/**
	 * 
	 * Filter deployment plans
	 * @param target the target of the plan
	 * @param from initial date included in the filter
	 * @param to final date included in the filter
	 * @return true if the params match the filter ranges
	 */
	boolean filter(String target, Date from, Date to){
		//TODO Search filters are not implemented yet
	 return true;	
	}

	public String getTarget() {
		return target;
	}

	public XMLGregorianCalendar getCreationMin() {
		return creationMin;
	}

	public void setCreationMin(XMLGregorianCalendar creationMin) {
		this.creationMin = creationMin;
	}

	public XMLGregorianCalendar getCreationMax() {
		return creationMax;
	}

	public void setCreationMax(XMLGregorianCalendar creationMax) {
		this.creationMax = creationMax;
	}

	public XMLGregorianCalendar getScheduledLaunchMin() {
		return scheduledLaunchMin;
	}

	public void setScheduledLaunchMin(XMLGregorianCalendar scheduledLaunchMin) {
		this.scheduledLaunchMin = scheduledLaunchMin;
	}

	public XMLGregorianCalendar getScheduledLaunchMax() {
		return scheduledLaunchMax;
	}

	public void setScheduledLaunchMax(XMLGregorianCalendar scheduledLaunchMax) {
		this.scheduledLaunchMax = scheduledLaunchMax;
	}

	public XMLGregorianCalendar getLastModificationMin() {
		return lastModificationMin;
	}

	public void setLastModificationMin(XMLGregorianCalendar lastModificationMin) {
		this.lastModificationMin = lastModificationMin;
	}

	public XMLGregorianCalendar getLastModificationMax() {
		return lastModificationMax;
	}

	public void setLastModificationMax(XMLGregorianCalendar lastModificationMax) {
		this.lastModificationMax = lastModificationMax;
	}
}

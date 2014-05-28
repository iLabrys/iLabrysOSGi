package es.itecban.deployment.executionmanager.elements;

import javax.xml.datatype.XMLGregorianCalendar;


public class PlanReport implements java.io.Serializable{
	

	private static final long serialVersionUID = -6414530699650347166L;
	private String planName;
	private XMLGregorianCalendar startTime;
	
	public PlanReport(){
		
	}
	
	public PlanReport (String planName, XMLGregorianCalendar startTime){
		
		super();
		this.planName = planName;
		this.startTime = startTime;
	}
	
	public String getPlanName() {
		return planName;
	}
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}
	
	public void setStartTime(XMLGregorianCalendar startTime) {
		this.startTime = startTime;
	}

}

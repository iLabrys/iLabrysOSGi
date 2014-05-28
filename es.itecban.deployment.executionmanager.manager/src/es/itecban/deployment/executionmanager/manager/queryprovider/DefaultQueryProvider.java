package es.itecban.deployment.executionmanager.manager.queryprovider;

import javax.xml.datatype.XMLGregorianCalendar;

import es.itecban.deployment.executionmanager.elements.PlanFilter;

public class DefaultQueryProvider implements QueryProvider {

	@Override
	public String getDeploymentPlan(String name) {
		
		return "from DeploymentPlanType where name='" + name + "'";
	}

	@Override
	public String getDeploymentList(PlanFilter filter, String planName) {
		
		String qSelect = "select dplan from DeploymentPlanType as dplan"
				+ " inner join dplan.scheduleData sch"
				+ " where dplan.environment=:planTarget";
		
		//getting the name
		if (planName!=null && !planName.equals("")){
			//be careful!! the name is concatenated with "|environmentName|date"
			qSelect = qSelect + " and dplan.name like '" + "%" + planName + "%|%|%|%'";
		}
		//getting the creationDateMin date from the filter
		if (filter.getCreationMin()!=null){
			qSelect = qSelect + " and sch.creationDate>=:creationDateMin";
		}
		//getting the creationDateMax date from the filter
		if (filter.getCreationMax()!=null){
			qSelect = qSelect + " and sch.creationDate<=:creationDateMax";
		}
		//getting the lastModificationDateMin date from the filter
		if (filter.getLastModificationMin()!=null){
			qSelect = qSelect + " and sch.lastModificationDate>=:lastModificationDateMin";
		}
		//getting the lastModificationDateMax date from the filter
		if (filter.getLastModificationMax()!=null){
			qSelect = qSelect + " and sch.lastModificationDate<=:lastModificationDateMax";
		}
		//getting the scheduledLaunchDateMin date from the filter
		if (filter.getScheduledLaunchMin()!=null){
			qSelect = qSelect + " and sch.scheduledLaunchDate>:scheduledLaunchDateMin";
		}
		//getting the scheduledLaunchDateMax date from the filter
		if (filter.getScheduledLaunchMax()!=null){
			qSelect = qSelect + " and sch.scheduledLaunchDate<:scheduledLaunchDateMax";
		}
		return qSelect + " order by sch.creationDate asc";
	}

	@Override
	public String getAllDeploymentPlans() {
		
		return "from DeploymentPlanType as dplan"
				+ " inner join dplan.scheduleData sch order by sch.creationDate asc";
	}

	@Override
	public String findPlanById(String id) {

		String qSelect = "select dplan from DeploymentPlanType as dplan"
			+ " where dplan.e_id='" + id + "'";
		return qSelect;
	}

	@Override
	public String findReportsByParameters(String planName,
			XMLGregorianCalendar endTimeMin, XMLGregorianCalendar endTimeMax,
			String creationUserId, String launchUserId, String environment) {


		String qSelect = "select report.planId, report.startTime from ExecutionReportType as report"
			+ " where report.environment like :environment";
		
		if (planName != null && !planName.equals(""))
			qSelect = qSelect + " and report.planId like '" + "%" + planName + "%|%|%|%'";
		if (endTimeMin != null)
			qSelect = qSelect + " and report.endTime>= :endTimeMin";
		if (endTimeMax != null)
			qSelect = qSelect + " and report.endTime<= :endTimeMax";
		if (creationUserId != null && !creationUserId.equals(""))
			qSelect = qSelect
					+ " and report.creationUserId like '" + "%" + creationUserId + "%" + "'";
		if (launchUserId != null && !launchUserId.equals(""))
			qSelect = qSelect + " and report.launcherUserId like '" + "%" + launchUserId + "%" + "'";

		qSelect = qSelect + " order by report.startTime";
		
		return qSelect;
	}

	@Override
	public String findReport(String planName, XMLGregorianCalendar calendar) {
		
		String qSelect = "select report from ExecutionReportType as report"
			+ " where report.planId='" + planName + "'"
			+ " and report.startTime=:startTime";
	
		return qSelect;
	}
}

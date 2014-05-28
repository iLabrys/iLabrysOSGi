package es.itecban.deployment.executionmanager.utils;

import java.io.IOException;
import java.io.StringWriter;

import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;
import es.itecban.deployment.model.deployment.plan.util.PlanResourceImpl;
import es.itecban.deployment.model.deployment.plan.util.PlanXMLProcessor;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.TargetFactory;
import es.itecban.deployment.model.deployment.target.util.TargetResourceImpl;
import es.itecban.deployment.model.deployment.target.util.TargetXMLProcessor;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.UnitFactory;
import es.itecban.deployment.model.deployment.unit.util.UnitResourceImpl;
import es.itecban.deployment.model.deployment.unit.util.UnitXMLProcessor;

public class XMLUtils {

	public static String getPlanXML(DeploymentPlanType plan) throws IOException {
		StringWriter sw = new StringWriter();
		PlanResourceImpl planimpl = new PlanResourceImpl(null);
		es.itecban.deployment.model.deployment.plan.DocumentRoot root = PlanFactory.eINSTANCE.createDocumentRoot();
		planimpl.getContents().add(root);
		root.setPlan(plan);
		PlanXMLProcessor proc = new PlanXMLProcessor();
		proc.save(sw, planimpl, null);
		sw.flush();
		return sw.toString();
	}
	
	public static String getUnitXML(DeploymentUnitType unit) throws IOException {
		StringWriter sw = new StringWriter();
		UnitResourceImpl unitimpl = new UnitResourceImpl(null);
		es.itecban.deployment.model.deployment.unit.DocumentRoot root = UnitFactory.eINSTANCE.createDocumentRoot();
		unitimpl.getContents().add(root);
		root.setDeploymentUnit(unit);
		UnitXMLProcessor proc = new UnitXMLProcessor();
		proc.save(sw, unitimpl, null);
		sw.flush();
		return sw.toString();
	}
	
	public static String getEnvironmentXML(DeploymentTargetType environment) throws IOException {
		StringWriter sw = new StringWriter();
		TargetResourceImpl targetimpl = new TargetResourceImpl(null);
		es.itecban.deployment.model.deployment.target.DocumentRoot root = TargetFactory.eINSTANCE.createDocumentRoot();
		targetimpl.getContents().add(root);
		root.setDomain(environment);
		TargetXMLProcessor proc = new TargetXMLProcessor();
		proc.save(sw, targetimpl, null);
		sw.flush();
		return sw.toString();
	}
}

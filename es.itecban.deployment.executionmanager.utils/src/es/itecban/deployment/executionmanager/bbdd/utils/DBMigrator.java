package es.itecban.deployment.executionmanager.bbdd.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.logging.Logger;

import es.itecban.deployment.executionmanager.elements.PlanFilter;
import es.itecban.deployment.executionmanager.services.PlanManager;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.marshaller.PlanMarshaller;

public class DBMigrator {

	private String pathToData;
	private Logger logger;
	private PlanManager planManager;

	public void extractData() throws Exception {

		this.init();
		try {
			PlanFilter filter = new PlanFilter(null);
			DeploymentPlanType[] planArray = planManager.findDeploymentPlans(filter);
			// For each Object, write the xml object in the given path
			int i = 0;
			Writer output = null;
			for (DeploymentPlanType plan : planArray) {
				String planString = PlanMarshaller.getXMLFromPlan(plan);
				// write the string into a file
				String fileName = pathToData + "/DeploymentPlanTypeObject_" + i
						+ ".xml";
				File file = new File(fileName);
				output = new BufferedWriter(new FileWriter(file));
				output.write(planString);
				output.close();
				logger.info("File with name " + fileName
						+ " has been correctly written");
				i++;
			}
		} catch (Exception e) {
			logger.severe("Error while retrieving the data for the migration"
					+ e);
			throw new Exception(
					"Error while retrieving the data for the migration" + e);
		} finally {
			logger.info("Finish");
		}
	}

	public void storeData() throws Exception {

		this.init();
		String dataToStoreString;
		// Search for all existing .xml files in the given path
		File dataFilesDirectory = new File(this.pathToData);
		File[] fileArray = dataFilesDirectory.listFiles();
		try {
			for (File file : fileArray) {
				if (file.getName().contains("DeploymentPlanTypeObject")) {
					InputStream is = new FileInputStream(file);
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(is));
					StringBuilder sb = new StringBuilder();
					String line = null;
					try {
						while ((line = reader.readLine()) != null) {
							sb.append(line + "\n");
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					dataToStoreString = sb.toString();
					DeploymentPlanType deploymentUnit = PlanMarshaller
							.getPlanFromXML(dataToStoreString);
					planManager.save(deploymentUnit);
					file.delete();
				}
			}
		} catch (Exception e) {
			logger.severe("Error while storing the data of the migration" + e);
			throw new Exception("Error while storing the data of the migration"
					+ e);
		} finally {
			this.clean();
			logger.info("Finish");
		}
	}

	private void init() {

		this.logger = Logger.getLogger(DBMigrator.class.getName());
		File pathFolder = new File(this.pathToData);
		pathFolder.mkdirs();
	}

	private void clean() {

		File pathFolder = new File(this.pathToData);
		pathFolder.delete();
	}

	public void setPathToData(String pathToData) {
		this.pathToData = pathToData;
	}

	public void setPlanManager(PlanManager planManager) {
		this.planManager = planManager;
	}
}

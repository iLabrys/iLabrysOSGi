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
package es.itecban.deployment.executionmanager;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.osgi.service.ServiceUnavailableException;

import java.util.Properties;

import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.environmentmanager.services.ReportManager;
import es.itecban.deployment.environmentmanager.services.core.ExecutorServiceCore;
import es.itecban.deployment.executionmanager.services.PlanExecutor;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.deployment.plan.DeploymentPlanType;
import es.itecban.deployment.model.deployment.plan.report.ExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.PlanResultKindType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.validation.result.PlanValidationResult;
import es.itecban.deployment.security.client.ws.AuthenticationManager;
import es.itecban.ilabrys.ram.services.IlabrysRAMUtils;

public class DefaultPlanExecutor implements PlanExecutor {

	private ExecutorServiceCore executorService;

	private ReportManager reportManager;

	private IlabrysRAMUtils ramManager;

	private static Logger logger = Logger.getLogger(DefaultPlanExecutor.class
			.getName());

	private ConfigurationProvider configurationProvider;

	public ExecutionReportType launchPlan(DeploymentPlanType plan)
			throws Exception {

		boolean assetCheckActive = this.isAssetCheckingActive(plan
				.getEnvironment());
		if (assetCheckActive) {
			Hashtable<String, DeploymentUnitType> notApprovedAssetsHs = null;
			try {
				// Validate with the RAM if each asset in the plan is approved
				notApprovedAssetsHs = this.ramManager.validateAssetInPlan(plan);
			} catch (ServiceUnavailableException e) {
				logger
						.info("Error ocurred while communicating with the RAM. "
								+ "Maybe this module is not available as it is optional ");
			}
			if (notApprovedAssetsHs != null && notApprovedAssetsHs.size() != 0) {
//				String messageError = "The following resource is not approved in the "
//						+ "Rational Asset Manager ";
				// Show only the first in the collection not approved
				Set<String> notApprovedAssetsSet = notApprovedAssetsHs.keySet();
				for (String notApprovedAsset : notApprovedAssetsSet) {
					// messageError = messageError
					// + "\r\n"
					// + notApprovedAsset
					// + " in component "
					// + notApprovedAssetsHs.get(notApprovedAsset)
					// .getName()
					// + " version_"
					// + notApprovedAssetsHs.get(notApprovedAsset)
					// .getVersion();
					// not tested
					throw new MessageException(
							"running.error.assetNotApproved",
							notApprovedAsset,
							notApprovedAssetsHs.get(notApprovedAsset).getName(),
							notApprovedAssetsHs.get(notApprovedAsset)
									.getVersion());
				}
			}
		}

		// If here, all the validations has gone succesfully
		ExecutionReportType report = null;
		try{
			report = executorService.launchPlan(plan);
			if (report == null)
					throw new Exception ("running.error.problemPlan");
		}catch (Exception e){
			logger.severe ("Error launching the plan." + e.getMessage());
			throw new Exception(e.getMessage());
		}
		
		// Set the report launcher user

		if (report.getResult().equals(PlanResultKindType.OK)
				&& assetCheckActive) {
			try {
				this.ramManager.changeDeployedAssetStatus(plan);
				logger
						.info("Plan result: "
								+ report.getResult()
								+ ". Changes done in the RAM to the status of the assets");
			} catch (ServiceUnavailableException e) {
				logger
						.info("Error ocurred while communicating with the RAM. "
								+ "Maybe this module is not available as it is optional ");
			}
		} else {
			logger.info("Plan result: " + report.getResult()
					+ ". No changes done in RAM to the status of the assets");
		}
		String planName = plan.getName();
		String creationUser = planName.split("\\|")[3];
		
		report.setCreationUserId(creationUser);
		report.setLauncherUserId(AuthenticationManager.getUserName());
		reportManager.setCreationUserId(report.getPlanId(), report
				.getStartTime(), creationUser);
		reportManager.setLauncherUserId(report.getPlanId(), report
				.getStartTime(), AuthenticationManager.getUserName());
		return report;
	}

	public ReportManager getReportManager() {
		return reportManager;
	}

	public void setReportManager(ReportManager reportManager) {
		this.reportManager = reportManager;
	}

	public void setExecutorService(ExecutorServiceCore executorService) {
		this.executorService = executorService;
	}

	@Override
	public List<PlanValidationResult> validatePlan(DeploymentPlanType plan)
			throws Exception {
		if (plan == null)
			throw new Exception(
					"A not null plan must be provided for preparation");
		return executorService.validatePlan(plan);
	}

	public ExecutionReportType compensatePlan(DeploymentPlanType plan,
			ExecutionReportType initialReport) throws Exception {

		ExecutionReportType report = executorService.compensatePlan(plan,
				initialReport);
		report.setCreationUserId(AuthenticationManager.getUserName());
		report.setLauncherUserId(AuthenticationManager.getUserName());
		reportManager.setCreationUserId(report.getPlanId(), report
				.getStartTime(), AuthenticationManager.getUserName());
		reportManager.setLauncherUserId(report.getPlanId(), report
				.getStartTime(), AuthenticationManager.getUserName());
		return report;
	}

	private boolean isAssetCheckingActive(String environmentName) {

		EnvironmentPropertyType property = null;
		try {
			property = this.configurationProvider
					.getEnvironmentProperty(environmentName,
							"es.itecban.ilabrys.ram.checkAssetsStatus");

		} catch (ServiceUnavailableException e) {
			logger
					.info("Error ocurred while communicating with the configuratioProvider. "
							+ "Maybe this module is not available as it is optional for the "
							+ "Execution Manager system");
		}
		if (property != null)
			return new Boolean(property.getValue());
		else
			// return true;
			return false;
	}

	public void setRamManager(IlabrysRAMUtils ramManager) {
		this.ramManager = ramManager;
	}

	public void setConfigurationProvider(
			ConfigurationProvider configurationProvider) {
		this.configurationProvider = configurationProvider;
	}
}

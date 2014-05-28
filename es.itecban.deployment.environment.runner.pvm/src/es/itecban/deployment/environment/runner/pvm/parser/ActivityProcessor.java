package es.itecban.deployment.environment.runner.pvm.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.osgi.framework.BundleContext;

import es.itecban.deployment.environment.runner.pvm.executor.ActivityExecutor;
import es.itecban.deployment.environment.runner.pvm.executor.FaultExecutor;
import es.itecban.deployment.environment.runner.pvm.factory.ConfigurationExecutorFactory;
import es.itecban.deployment.environment.runner.pvm.factory.DeploymentExecutorFactory;
import es.itecban.deployment.environment.runner.pvm.factory.ResourceExecutorFactory;
import es.itecban.deployment.environment.runner.pvm.impl.ActivityNode;
import es.itecban.deployment.environmentmanager.Constants;
import es.itecban.deployment.environmentmanager.services.ConfigurationProvider;
import es.itecban.deployment.environmentmanager.services.InterceptorManager;
import es.itecban.deployment.model.configuration.ConfigurationPropertiesType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityKindType;
import es.itecban.deployment.model.deployment.plan.ConfigurationActivityType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityKindType;
import es.itecban.deployment.model.deployment.plan.ResourceActivityType;
import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.ContainerTypeType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.RuntimeResourceType;
import es.itecban.deployment.model.deployment.target.RuntimeUnitType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;
import es.itecban.deployment.repository.services.core.UnitLocatorCore;

public class ActivityProcessor {

	private Logger logger = Logger.getLogger(ActivityProcessor.class.getName());
	private BundleContext ctx;
	private DeploymentTargetType deploymentTarget;
	private RepositoryManagerCore rep;
	private UnitLocatorCore ul;
	private ConfigurationProvider conf;
	private InterceptorManager intercept;

	private static final String SEPARATOR = "#";

	public ActivityProcessor(BundleContext ctx,
			DeploymentTargetType deploymentTarget, RepositoryManagerCore rep,
			UnitLocatorCore ul, ConfigurationProvider conf,
			InterceptorManager intercept) {
		this.ctx = ctx;
		this.deploymentTarget = deploymentTarget;
		this.rep = rep;
		this.ul = ul;
		this.conf = conf;
		this.intercept = intercept;
	}

	public ActivityNode deploymentNode(DeploymentActivityType da) {

		String target = da.getTarget();
		String[] params = target.split(SEPARATOR, 3);
		String envName = params[0];
		String nodeName = params[1];
		String containerName = params[2];

		Properties props = new Properties();
		Properties fails = new Properties();

		NodeType node = EnvironmentNavigator
				.getNode(nodeName, deploymentTarget);
		ContainerType container = EnvironmentNavigator.getContainer(
				containerName, node);
		if (deploymentTarget == null)
			fails.put("failEnvironment", "NE Environment " + envName
					+ " not found");
		else if (node == null)
			fails.put("failEnvironment", "NN Node " + nodeName
					+ " not found in environment " + envName);
		else if (container == null)
			fails.put("failEnvironment", "NC Container " + containerName
					+ " not found in node " + nodeName);

		String unitName = da.getUnitName();
		String unitVersion = da.getUnitVersion();
		String oldUnitName = da.getPreviousUnitName();
		String oldUnitVersion = da.getPreviousUnitVersion();
		String downloadUrl = "fakeDownloadUrl";
		String unitPackage = "fakeUnitPackage";
		String oldUnitPackage = "fakeOldUnitPackage";

		// properties necessary for the websphere translator
		props.put("es.itecban.deployment.environment.name", envName);
		props.put("es.itecban.deployment.container.target", containerName);
		DeploymentUnitType du = null;
		DeploymentUnitType oldDu = null;

		// Get container properties from Environment Manager (namely username
		// and password)
		getContainerCredentials(props, fails, envName, containerName);

		// If UPDATE, get old unit package name
		if (da.getType()
				.equals(DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT)) {
			try {
				oldDu = rep.getDeploymentUnit(oldUnitName, oldUnitVersion);
				// This needs to be the package name because this name is going
				// to be compared to the name the websphere returns when asking
				// for its deployed units
				oldUnitPackage = oldDu.getPackage().getName();
				props.put("es.itecban.deployment.unit.name", oldUnitPackage);
				// Property necessary for the jrules translator
				props.put("es.itecban.deployment.unit.version.old",
						oldUnitVersion);
			} catch (Exception e) {
				logger.severe("Could not get unit " + oldUnitName + " version "
						+ oldUnitVersion);
				// failUnit = "WU" + e.getMessage();
				fails.put("failUnit", "WU " + e.getMessage());
			}
		}

		// Get download URL from Repository
		try {
			du = rep.getDeploymentUnit(unitName, unitVersion);
			downloadUrl = ul.getDownloadURL(du);
			// This needs to be the package name because this name is going to
			// be compared to the name the websphere returns when asking for its
			// deployed units
			unitPackage = du.getPackage().getName();

			// downloadUrl = "file:///home/marco/Desktop/WARs/pbo-1.0.war";
			props.put("es.itecban.deployment.unit.packageURL", downloadUrl);
			if (!da.getType().equals(
					DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT)) {
				props.put("es.itecban.deployment.unit.name", unitPackage);
			}

			// Interceptor
			if (da.getType().equals(
					DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT)
					|| da.getType().equals(
							DeploymentActivityKindType.UPDATEDEPLOYMENTUNIT)) {

				ConfigurationPropertiesType configuration = conf
						.getEnvironmentConfiguration(envName);
				File component = null;
				try {
					// Download from the url
					URL url = new URL(downloadUrl);
					InputStream in = url.openStream();
					component = new File(unitPackage);
					OutputStream out = new FileOutputStream(component);
					byte[] buf = new byte[4 * 1024]; // 4K buffer
					int bytesRead;
					while ((bytesRead = in.read(buf)) != -1) {
						out.write(buf, 0, bytesRead);
					}
					in.close();
					out.close();
					// Get configured file
					try {
						if (configuration != null) {
							File configuredFile = intercept.configure(
									configuration, component);
							component.delete();
							String newDownloadUrl = configuredFile.toURI()
									.toURL().toString();
							props.put("es.itecban.deployment.unit.packageURL",
									newDownloadUrl);
						} else {
							props.put("es.itecban.deployment.unit.packageURL",
									component.toURI().toString());
							logger
									.info("The file is not going to be configured because there do not exist any environment property");
						}
					} catch (Exception e) {
						logger.severe("Error while configuring the component");
						// failUnit = "CP" + e.getMessage();
						fails.put("failUnit", "CP " + e.getMessage());
						e.printStackTrace();
					}

				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					logger.severe("Error while downloading the component");
					// failUnit = "BD" + e.getMessage();
					fails.put("failUnit", "BD " + e.getMessage());
				}
			}

		} catch (Exception e) {
			logger.severe("Could not get download URL for unit " + unitName
					+ " version " + unitVersion);
			// failUnit = "WU" + e.getMessage();
			fails.put("failUnit", "WU " + e.getMessage());
		}

		if (container != null)
			getContainerInfo(props, container);

		DeploymentExecutorFactory def = (DeploymentExecutorFactory) ExecutorFinder
				.getActivityExecutorFactory(ctx, da, container);
		ActivityExecutor executor = null;
		if (def != null) {
			executor = def.createExecutor(da.getActivityId(), da.getType(),
					props, du);
		} else {
			fails.put("failExecutor", "WE Executor not found for container "
					+ containerName);
		}
		if (!fails.isEmpty()) {
			executor = new FaultExecutor(da, fails);
		}
		return new ActivityNode(da, executor);

	}

	public ActivityNode configurationNode(ConfigurationActivityType ca) {

		String target = ca.getTarget();
		String[] params = target.split(SEPARATOR, 5);
		String envName = params[0];
		String nodeName = params[1];
		String containerName = params[2];
		String containerResourceName = "";
		String unitName = "";
		String unitResourceName = "";

		Properties props = new Properties();
		Properties fails = new Properties();

		NodeType node = EnvironmentNavigator
				.getNode(nodeName, deploymentTarget);
		ContainerType container = EnvironmentNavigator.getContainer(
				containerName, node);
		if (deploymentTarget == null)
			fails.put("failEnvironment", "NE Environment " + envName
					+ " not found");
		else if (node == null)
			fails.put("failEnvironment", "NN Node " + nodeName
					+ " not found in environment " + envName);
		else if (container == null)
			fails.put("failEnvironment", "NC Container " + containerName
					+ " not found in node " + nodeName);
		else {
			if (ca.getType().equals(
					ConfigurationActivityKindType.CONFIGURECONTAINERRESOURCE)) {
				containerResourceName = params[3];
				RuntimeResourceType containerResource = EnvironmentNavigator
						.getContainerResource(containerResourceName, container);
				if (containerResource == null)
					fails.put("failEnvironment", "NS Resource "
							+ containerResourceName
							+ " not found in container " + containerName);
				props.put("es.itecban.deployment.container.resource",
						containerResourceName);
			}
			if (ca.getType().equals(
					ConfigurationActivityKindType.CONFIGUREUNITRESOURCE)) {
				unitName = params[3];
				unitResourceName = params[4];
				RuntimeUnitType unit = EnvironmentNavigator.getUnit(unitName,
						container);
				RuntimeResourceType unitResource = EnvironmentNavigator
						.getUnitResource(unitResourceName, unit);
				if (unit == null)
					fails.put("failEnvironment", "NU Unit " + unitName
							+ " not found in container " + containerName);
				else if (unitResource == null)
					fails.put("failEnvironment", "NR Resource "
							+ unitResourceName + " not found in unit "
							+ unitName);
				props.put("es.itecban.deployment.container.unit", unitName);
				props.put("es.itecban.deployment.unit.resource",
						unitResourceName);
			}
		}

		if (node != null) {
			// Get JMX URL for setting unit's properties
			EList<ResourceType> nodeResources = node.getNodeResources()
					.getNodeResource();
			ResourceType jmxUrlResource = null;
			for (ResourceType resource : nodeResources) {
				if (resource.getName().equals("JMX,URL")) {
					jmxUrlResource = resource;
					break;
				}
			}
			List<PropertyType> nodeResourceProperties = jmxUrlResource
					.getResourceProperties().getResourceProperty();
			PropertyType jmxUrlProperty = null;
			for (PropertyType resourceProperty : nodeResourceProperties) {
				if (resourceProperty.getName().equals("URL")) {
					jmxUrlProperty = resourceProperty;
					break;
				}
			}
			String jmxURL = jmxUrlProperty.getValue();
			props.put("es.itecban.deployment.container.jmxURL", jmxURL);
		}

		getContainerCredentials(props, fails, envName, containerName);
		if (container != null)
			getContainerInfo(props, container);

		ConfigurationExecutorFactory cef = (ConfigurationExecutorFactory) ExecutorFinder
				.getActivityExecutorFactory(ctx, ca, container);
		ActivityExecutor executor = null;
		if (cef != null) {
			executor = cef.createExecutor(ca.getActivityId(), ca.getType(),
					props, ca.getConfiguration());
		} else {
			fails.put("failExecutor", "WE Executor not found for container "
					+ containerName);
		}
		if (!fails.isEmpty()) {
			executor = new FaultExecutor(ca, fails);
		}
		return new ActivityNode(ca, executor);

	}

	public ActivityNode resourceNode(ResourceActivityType ra) {

		String target = ra.getTarget();
		String resourceName = ra.getResource().getName();
		String resourceVersion = ra.getResource().getVersion();
		String[] params = target.split(SEPARATOR, 3);
		String envName = params[0];
		String nodeName = params[1];
		String containerName = params[2];
		String[] containerProperties = containerName.split("/", 3);
		String cellName = containerProperties[1];
		String downloadUrl = "fakeDownloadUrl";
		String unitPackage = "fakeUnitPackage";

		Properties props = new Properties();
		Properties fails = new Properties();

		NodeType node = EnvironmentNavigator
				.getNode(nodeName, deploymentTarget);
		ContainerType container = EnvironmentNavigator.getContainer(
				containerName, node);
		if (deploymentTarget == null)
			fails.put("failEnvironment", "NE Environment " + envName
					+ " not found");
		else if (node == null)
			fails.put("failEnvironment", "NN Node " + nodeName
					+ " not found in environment " + envName);
		else if (container == null)
			fails.put("failEnvironment", "NC Container " + containerName
					+ " not found in node " + nodeName);

		// properties necessary for the resource websphere translator
		props.put("es.itecban.deployment.environment.name", envName);
		props.put("es.itecban.deployment.container.target", containerName);
		props.put("es.itecban.deployment.resource.name", resourceName);
		props.put("es.itecban.deployment.resource.version", resourceVersion);
		props.put("es.itecban.deployment.cell.name", cellName);

		DeploymentUnitType du = null;

		if (ra.getType().equals(
				ResourceActivityKindType.ADDCONTAINERRESOURCE)) {
			File component = null;
			try {
				du = rep.getDeploymentUnit(resourceName, resourceVersion);
				downloadUrl = ul.getDownloadURL(du);
				// This needs to be the package name because this name is going
				// to
				// be compared to the name the websphere returns when asking for
				// its
				// deployed units
				unitPackage = du.getPackage().getName();

				// downloadUrl = "file:///home/marco/Desktop/WARs/pbo-1.0.war";
				props.put("es.itecban.deployment.unit.packageURL", downloadUrl);
				props.put("es.itecban.deployment.zip.name", unitPackage);
				// Download from the url
				URL url = new URL(downloadUrl);
				InputStream in = url.openStream();
				component = new File(unitPackage);
				props.put("es.itecban.deployment.unit.packageURL", component
						.getAbsolutePath());
				System.out
						.println("packageURL " + component.toURI().toString());
				OutputStream out = new FileOutputStream(component);
				byte[] buf = new byte[4 * 1024]; // 4K buffer
				int bytesRead;
				while ((bytesRead = in.read(buf)) != -1) {
					out.write(buf, 0, bytesRead);
				}
				in.close();
				out.close();

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// if (container != null)
		// getContainerInfo(props, container);
		getContainerCredentials(props, fails, envName, containerName);

		ResourceExecutorFactory ref = (ResourceExecutorFactory) ExecutorFinder
				.getActivityExecutorFactory(ctx, ra, container);
		ActivityExecutor executor = null;
		if (ref != null) {
			executor = ref.createExecutor(ra.getActivityId(), ra.getType(),
					props, ra.getResource());
		} else {
			fails.put("failExecutor", "WE Executor not found for container "
					+ containerName);
		}
		if (!fails.isEmpty()) {
			executor = new FaultExecutor(ra, fails);
		}
		return new ActivityNode(ra, executor);

	}

	private void getContainerCredentials(Properties props, Properties fails,
			String envName, String containerName) {

		try {
			File configurationFile = conf.getContainerConfiguration(envName,
					containerName, Constants.CONTAINER_CONEXION_CONFIGURATION);
			if (configurationFile == null) {
				throw new FileNotFoundException("Container " + containerName
						+ " connection configuration file not found");
			}
			FileInputStream fis = new FileInputStream(configurationFile);
			props.load(fis);
		} catch (FileNotFoundException e) {
			logger.severe("File Not Found");
			// failConnection = "CC " + e.getMessage();
			fails.put("failConnection", "CC " + e.getMessage());
		} catch (IOException e) {
			logger.severe("Error while loading the file");
			// failConnection = "CC " + e.getMessage();
			fails.put("failConnection", "CC " + e.getMessage());
		}

	}

	private void getContainerInfo(Properties props, ContainerType container) {

		props.put("es.itecban.deployment.container.name", container.getName());
		EList<ContainerTypeType> containerTypes = container.getContainerTypes()
				.getContainerType();
		String containerTypesNames = "";
		String containerTypesVersions = "";
		for (ContainerTypeType containerType : containerTypes) {
			containerTypesNames += containerType.getName() + ";";
			containerTypesVersions += containerType.getVersion() + ";";
		}
		containerTypesNames = containerTypesNames.substring(0,
				containerTypesNames.length() - 1);
		containerTypesVersions = containerTypesVersions.substring(0,
				containerTypesVersions.length() - 1);
		props.put("es.itecban.deployment.container.types.names",
				containerTypesNames);
		props.put("es.itecban.deployment.container.types.versions",
				containerTypesVersions);

		if (container.getContainerProperties() != null) {
			EList<PropertyType> containerProperties = container
					.getContainerProperties().getContainerProperty();
			for (PropertyType containerProperty : containerProperties) {
				String propName = containerProperty.getName();
				props.put(propName, containerProperty.getValue());
			}
		}
	}

	// private File copy2Location(File zippedFile) throws IOException {
	//
	// File auxFolder = this.ctx.getDataFile("auxFolder");
	// auxFolder.mkdir();
	// File auxFile = this.ctx.getDataFile("auxFolder/"
	// + zippedFile.getName());
	// auxFile.createNewFile();
	// FileUtils.copyFile(zippedFile, auxFile);
	// return auxFile;
	// }

}

package es.itecban.deployment.executionmanager.web.controller;

import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import es.itecban.deployment.environmentmanager.services.core.EnvironmentManagerCore;
import es.itecban.deployment.executionmanager.services.EnvironmentGraphBuilder;
import es.itecban.deployment.executionmanager.services.EnvironmentGraphBuilderFactory;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;
import es.itecban.deployment.model.environment.graph.EnvironmentGraph;
import es.itecban.deployment.model.environment.graph.marshaller.EnvironmentGraphMarshaller;
import es.itecban.deployment.repository.services.core.RepositoryManagerCore;

public class UnitInverseDependenciesController extends AbstractController {

	private RepositoryManagerCore repoManager;

	private EnvironmentManagerCore envManager;
	private EnvironmentGraphBuilderFactory factory;
	
	public EnvironmentGraphBuilderFactory getFactory() {
		return factory;
	}

	public void setFactory(EnvironmentGraphBuilderFactory factory) {
		this.factory = factory;
	}

	public EnvironmentManagerCore getEnvManager() {
		return envManager;
	}

	public void setEnvManager(EnvironmentManagerCore envManager) {
		this.envManager = envManager;
	}
	public RepositoryManagerCore getRepoManager() {
		return repoManager;
	}

	public void setRepoManager(RepositoryManagerCore repoManager) {
		this.repoManager = repoManager;
	}


	// private Resolver resolver;

	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// String name = req.getParameter(RepositoryManager.DEPLOYMENT_UNIT);
		String unitName = req.getParameter("name");
		// String version = req.getParameter(RepositoryManager.UNIT_VERSION);
		String unitVersion = req.getParameter("version");
		DeploymentUnitType unit = repoManager.getDeploymentUnit(unitName,
				unitVersion);
		String environment = req.getParameter("environment");
		String containerList = req.getParameter("containerGraphList");
		List<String> containerNameList = new ArrayList<String>();
		String[] containerNameArray = containerList.split("\\|");
		containerNameList = Arrays.asList(containerNameArray);
		
		//FIXME mirar si esto se puede evitar
		DeploymentTargetType envi = envManager.getEnvironment(environment);

		// if we just want the graph then return it in xml format
		if (req.getParameter("justGraph") != null) {
			if (unit != null) {
				String xmlInvDepGraph = this.getXMLInverseDepencyGraph(unit, envi, containerNameList);
				
				res.setContentType("text/xml");
				PrintWriter out = res.getWriter();
				out.println(xmlInvDepGraph);
				return null;
			} else
				return new ModelAndView("error", "error",
						"error.nonExistingUnit");
		}

		// we are finding the graph

		if (unit != null) {
			HashMap<String, Object> model = new HashMap<String, Object>();
			model.put("name", unitName);
			model.put("version", unitVersion);
			model.put("environment", environment);
			model
					.put("xmlDependencyGraph", getXMLDependencyGraphURL(unit,
							req));
			ModelAndView mav = new ModelAndView("unitInverseDependencies", model);
			return mav;
		}
		return new ModelAndView("error", "error", "error.nonExistingUnit");
	}

	private String getXMLDependencyGraphURL(DeploymentUnitType unit,
			HttpServletRequest request) throws Exception {
		String file = request.getRequestURI();
		if (request.getQueryString() != null) {
			file += '?' + request.getQueryString() + "&justGraph=true";
		}
		URL reconstructedURL = new URL(request.getScheme(), request
				.getServerName(), request.getServerPort(), file);
		return reconstructedURL.toString();
	}

	private String getXMLInverseDepencyGraph(DeploymentUnitType unit, DeploymentTargetType envi, List<String> containerList)
			throws Exception {	

		EnvironmentGraphBuilder graphBuilder = factory
				.createEnvironmentGraphBuilder(envi, unit, containerList);
		EnvironmentGraph graph = graphBuilder.getGraph();
		return EnvironmentGraphMarshaller.marshallEnvironmentGraph(graph);		
	}
}

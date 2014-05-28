package es.itecban.deployment.agents;

import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.NodesType;

public interface TargetManagerMultiThread {
	
	public boolean checkNodeExists(NodesType globalnodestype, NodeType node);
	
	public NodesType addContainerInfo2ExistingGlobalNode (NodesType globalnodestype, NodeType node);
	
	public DeploymentTargetType xml2omodel(String xmlmodel);
	

}

/**
 * 
 */
package es.itecban.deployment.utils.beans;

import java.io.Serializable;

/**
 * @author emocana
 *
 */
@SuppressWarnings("serial")
public class HeaderBean implements Serializable{

	private String executionUri;
	private String environmentUri;
	private String repositoryUri;
	private String artifactUri;
	
	
	public HeaderBean() {}
	
	public HeaderBean (String executionUri, String environmentUri, String repositoryUri, String artifactUri)
	{
		this.executionUri = executionUri;
		this.environmentUri = environmentUri;
		this.repositoryUri = repositoryUri;
		this.artifactUri = artifactUri;
	}
	
	public String getExecutionUri() {
		return executionUri;
	}

	public void setExecutionUri(String executionUri) {
		this.executionUri = executionUri;
	}

	public String getEnvironmentUri() {
		return environmentUri;
	}

	public void setEnvironmentUri(String environmentUri) {
		this.environmentUri = environmentUri;
	}

	public String getRepositoryUri() {
		return repositoryUri;
	}

	public void setRepositoryUri(String repositoryUri) {
		this.repositoryUri = repositoryUri;
	}

	public String getArtifactUri() {
		return artifactUri;
	}

	public void setArtifactUri(String artifactUri) {
		this.artifactUri = artifactUri;
	}
}

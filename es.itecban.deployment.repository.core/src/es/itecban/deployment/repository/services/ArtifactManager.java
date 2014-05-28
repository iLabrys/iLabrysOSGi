package es.itecban.deployment.repository.services;

public interface ArtifactManager {

	/**
	 * @param artifactName The name of the artifact you want to find
	 * @return null
	 * @throws Exception
	 */
	public boolean deleteArtifact(String artifactName) throws Exception;
}

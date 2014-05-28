package es.itecban.deployment.environmentmanager.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;

import org.osgi.framework.BundleContext;

import es.itecban.deployment.model.deployment.target.ContainerType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.NodeContainersType;
import es.itecban.deployment.model.deployment.target.NodeType;

public class EnvironmentConfigurationUtils {

	public static byte[] getBytesFromFile(File file) throws IOException {

		if (!file.exists()) {
			System.err.println("The file does not exist");
			return null;
		}
		InputStream is = new FileInputStream(file);

		// Get the size of the file
		long length = file.length();

		if (length > Integer.MAX_VALUE) {
			// File is too large
		}

		// Create the byte array to hold the data
		byte[] bytes = new byte[(int) length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "
					+ file.getName());
		}

		// Close the input stream and return bytes
		is.close();
		return bytes;
	}

	// not tested yet. Be careful with file creation
	public static File getFileFromBytes(byte[] byteArray, String fileName, BundleContext context)
			throws IOException {

		File file = context.getDataFile(fileName);
		file.createNewFile();
		OutputStream os = new FileOutputStream(file);
		os.write(byteArray);
		os.close();
		return file;
	}

public DeploymentTargetType filterContainers(DeploymentTargetType deploymentTarget, String properties){
		
		Scanner scanner = new Scanner(properties);
		scanner.useDelimiter("\\+");
		for ( ; scanner.hasNext() ; ){
			String target = scanner.next();
			//delete this container from the environment information
			List<NodeType> nodeList = deploymentTarget.getNodes().getNode();
			for (int i = 0 ; i < nodeList.size() ; i++){
//			for (NodeType node : nodeList){
				//List<ContainerType> containerList = nodeList.get(i).getNodeContainers().getNodeContainer();
				NodeContainersType nodeContainers = nodeList.get(i).getNodeContainers();
				if (nodeContainers != null){
					List<ContainerType> containerList = nodeContainers.getNodeContainer();
					for (int j = 0 ; j < containerList.size() ; j++){
						String containerName = containerList.get(j).getName();
						if (containerName.equals(target)){
							//this container must be filtered
							containerList.remove(j);
							break;
						}
					}
				}
			}
		}
		return deploymentTarget;
	}
}

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
package es.itecban.deployment.environment.runner.pvm.executor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.XmlLogger;
import org.eclipse.ant.core.AntRunner;

public class AntExecutor {
	
	
	private Logger logger = Logger.getLogger(AntExecutor.class
			.getName());  
	
	private AntRunner runner;
	private String logPath;
	
	public AntExecutor(String buildFile, String target, Properties props) {		
		runner = new AntRunner();
		runner.setBuildFileLocation(buildFile);
		String[] targets = {target};
		runner.setExecutionTargets(targets);
		runner.addUserProperties(props);
		runner.addBuildLogger(XmlLogger.class.getName());
		runner.setMessageOutputLevel(Project.MSG_VERBOSE);
		logPath = buildFile + "_log.xml";
		runner.setArguments("-Dmessage=Building -verbose -logfile " + logPath);
	}
	
	public String logToString() {
		Reader r = null;
		File logFile = new File(logPath);
		try {
			r = new InputStreamReader(new FileInputStream(logFile), "UTF-8");
			StringWriter w = new StringWriter();
			char[] buffer = new char[65536];
			int len;
			while ((len = r.read(buffer)) != -1) {
				w.write(buffer, 0, len);
			}
			r.close();
			return w.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			logFile.delete();
		}
		return null;
	}
	
	public void run() throws Exception {
		runner.run();
	}
	
}

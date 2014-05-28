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
/**
 * Result Codes constants to be used to encode activity excutions
 * @author jlrrevuelta
 *
 */
public interface ResultCodes {
	  //SUCCESS
	  /**
	   * Operation succesfully executed
	   */
	  public static final String AERC000="AERC000";
	
	  //CONNECTION_PROBLEMS
	  /**
	   * Host or port parameters are not correct
	   */
	  public static final String AERC001001="AERC001001";
	  /**
	   * Username or password are not correct
	   */
	  public static final String AERC001002="AERC001002";
	  /**
	   * JMX Configuration URL is not correct
	   */
	  public static final String AERC001003="AERC001003";
	  /**
	   * Connection to the application server was impossible
	   */
	  public static final String AERC001004="AERC001004";
	 /**
	  * Deployment Environment not found 
	  */
	  public static final String AERC001005="AERC001005";
	  /**
	   * Host not found in this environment
	   */
	  public static final String AERC001006="AERC001006";
	  /**
	   * Container not found in that host 
	   */
	  public static final String AERC001007="AERC001007";
	  /**
	   * Resource not found in that host
	   */
	  public static final String AERC001008="AERC001008";
	  /**
	   * Deployment unit was not found in that container
	   */
	  public static final String AERC001009="AERC001009";
	  /**
	   * Resource not found in the unit
	   */
	  public static final String AERC001010="AERC001010";
	  
	  //UNAVAILABLE_DEPLOYMENT_UNIT_S
	  /**
	   *  Deployment unit was not found in the repository
	   */
	  public static final String AERC002001="AERC002001";
	  /**
	   * Deployment unit was found but the URL for the download was not correct or anavailable
	   */
	  public static final String AERC002002="AERC002002"; 
	  /**
	   * You have tried to start/stop/uninstall/reinstall a unit that was not installed
	   */
	  public static final String AERC002003="AERC002003";
	  
	  //CONFIGURATION_PROBLEM
	  /**
	   *  Container connection properties were not correctly obtained
	   */
	  public static final String AERC003001="AERC003001";
	  /**
	   *  Interceptor configuration error
	   */
	  public static final String AERC003002="AERC003002";
	  /**
	   *  Datasource JDBC name error, its name must start with "jdbc/"
	   */
	  public static final String AERC003003="AERC003003";
	  /**
	   *  Database properties error
	   */
	  public static final String AERC003004="AERC003004";
	  /**
	   *  Tried to delete a non-existing datasource
	   */
	  public static final String AERC003005="AERC003005";
	  /**
	   *  Tried to configure a non-existing resource
	   */
	  public static final String AERC003006="AERC003006"; 
	  /**
	   * Tried to erase a non-existing resource property
	   */
	  public static final String AERC003007="AERC003007";
	  /**
	   *  The datasource being configured or any of its interrelated objects already exists. 
	   *  No changes are carried out
	   */
	  public static final String AERC003008="AERC003008";
	  //TIME_OUT
	  /**
	   * Time out error for PVM deployment engine. Not to be used by specific 
	   * plan interpreters
	   */
	  public static final String AERC004XXX="AERC004XXX";
	  //DEFAULT error code
	  public static final String AERC005XXX="AERC005XXX";




}

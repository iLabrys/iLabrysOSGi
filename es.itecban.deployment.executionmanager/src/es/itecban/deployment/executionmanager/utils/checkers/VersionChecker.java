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
package es.itecban.deployment.executionmanager.utils.checkers;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Rodrigo Garcia
 * 
 */
public class VersionChecker {

	private static Logger logger = Logger.getLogger(VersionChecker.class
			.getName());

	static {
		logger.setLevel(Level.OFF);
	}

	/**
	 * Compares versions. Supports version ranges of the following types:
	 * 	"[initialVersion, finalVersion]", "(initialVersion, finalVersion)",
	 *  "[initialVersion, finalVersion)", "(initialVersion, finalVersion]"
	 *  allowing also a non-existing final version.    
	 * @param requiredVersion
	 *            String with the required version in dot separated format (e.g.
	 *            2.4.16b). Supports alpha, beta and release candidate versions
	 * @param providedVersion
	 *            String with the provided version in dot separated format (e.g.
	 *            2.4.16b). Supports alpha, beta and release candidate versions
	 * @return true if the provided version is equal or higher than the required
	 *         version
	 */
	public static boolean compareVersions(String requiredVersion, String providedVersion) {
		logger.info("Comparing provided version " + providedVersion	+ " with required version " + requiredVersion);
		// Trim the versions
		requiredVersion = requiredVersion.trim();
		providedVersion = providedVersion.trim();
		// Check if at least one of the versions is null skip version checking
		if (requiredVersion == null || providedVersion == null
				|| requiredVersion.equals("defaultVersion")
				|| providedVersion.equals("defaultVersion")
				|| requiredVersion.equals("unknown")
				|| providedVersion.equals("unknown")) {
			return true;
		}
		int commaPos = requiredVersion.indexOf(',');
		// Required version is a version range
		if (((requiredVersion.startsWith("(") || requiredVersion.startsWith("[")))
				&& ((requiredVersion.endsWith(")") || requiredVersion.endsWith("]"))) && commaPos > 0) {
			// If "[" and "]" allow equal versions
			// If "(" and ")" not allow equal versions
			boolean initEqualVerAllowed = false;
			if (requiredVersion.charAt(0) == '[') {
				initEqualVerAllowed = true;
			}
			boolean finalEqualVerAllowed = false;
			if (requiredVersion.charAt(requiredVersion.length() - 1) == ']') {
				finalEqualVerAllowed = true;
			}
			String initVersion = requiredVersion.substring(1, commaPos);
			// If the upper limit is not set, e.g. (1.0, ] then the last
			// condition is not necessary
			String finalVersion = "";
			finalVersion = requiredVersion.substring(commaPos + 1,
					requiredVersion.length() - 1);
			// Check if it complains to both versions
			if (compareVersionNumbers(initVersion, providedVersion, initEqualVerAllowed) &&
					finalVersion.equals("") || compareVersionNumbers(providedVersion, finalVersion, finalEqualVerAllowed)) {
				return true;
			}
			// If not, return false
			else {
				return false;
			}
		}
		// Required version is a single version
		return compareVersionNumbers(requiredVersion, providedVersion, true);

	}

	private static boolean compareVersionNumbers(String requiredVersion, String providedVersion, boolean equalVerAllowed) {
		// Check if the provided version is equal to or higher than the required version
		ArrayList<String> reqResVersionNumbers = new ArrayList<String>();
		ArrayList<String> resVersionNumbers = new ArrayList<String>();
		String[] reqResVersionArray = requiredVersion.split("[.]");
		String[] resVersionArray = providedVersion.split("[.]");
		for (int i = 0; i < reqResVersionArray.length; i++) {
			reqResVersionNumbers.add(reqResVersionArray[i]);
		}
		for (int i = 0; i < resVersionArray.length; i++) {
			resVersionNumbers.add(resVersionArray[i]);
		}
		// Difference in the length of the version numbers arrays
		int lengthDifference = resVersionNumbers.size()	- reqResVersionNumbers.size();
		// If difference is > 0 add fillers to the required resource version
		if (lengthDifference > 0) {
			while (lengthDifference > 0) {
				reqResVersionNumbers.add("0");
				lengthDifference--;
			}
		}
		// If difference is < 0 add fillers to the resource version
		else if (lengthDifference < 0) {
			while (lengthDifference < 0) {
				resVersionNumbers.add("0");
				lengthDifference++;
			}
		}
		// Iterates the version numbers
		// Sets the status of both version numbers as "Released"
		// Possible status: "Alpha", "Beta", "Release Candidate #" and
		// "Released"
		String reqResStatus = "r";
		String resStatus = "r";
		for (int index = 0; index < reqResVersionNumbers.size(); index++) {
			String reqResCurrentNumber = reqResVersionNumbers.get(index);
			String resCurrentNumber = resVersionNumbers.get(index);
			// Check if this number contains status information
			// If it is the case, set status of both versions as "Alpha", "Beta"
			// or "Release Candidate #"
			// If it is, trims the current number and changes its status to the
			// corresponding one
			if (resCurrentNumber.endsWith("a")) {
				resStatus = "a";
				resCurrentNumber = resCurrentNumber.substring(0,
						resCurrentNumber.length() - 1);
			} else if (resCurrentNumber.endsWith("b")) {
				resStatus = "b";
				resCurrentNumber = resCurrentNumber.substring(0,
						resCurrentNumber.length() - 1);
			} else if (resCurrentNumber.contains("rc")) {
				resStatus = "rc"
						+ resCurrentNumber.substring(resCurrentNumber
								.indexOf("rc") + 2);
				resCurrentNumber = resCurrentNumber.substring(0,
						resCurrentNumber.indexOf("rc"));
			}
			if (reqResCurrentNumber.endsWith("a")) {
				reqResStatus = "a";
				reqResCurrentNumber = reqResCurrentNumber.substring(0,
						reqResCurrentNumber.length() - 1);
			} else if (reqResCurrentNumber.endsWith("b")) {
				reqResStatus = "b";
				reqResCurrentNumber = reqResCurrentNumber.substring(0,
						reqResCurrentNumber.length() - 1);
			} else if (reqResCurrentNumber.contains("rc")) {
				reqResStatus = "rc"
						+ reqResCurrentNumber.substring(reqResCurrentNumber
								.indexOf("rc") + 2);
				reqResCurrentNumber = reqResCurrentNumber.substring(0,
						reqResCurrentNumber.indexOf("rc"));
			}
			try {
				int reqResParsedNumber = Integer.parseInt(reqResCurrentNumber);
				int resParsedNumber = Integer.parseInt(resCurrentNumber);
				// Return true if version is higher than required
				if (resParsedNumber > reqResParsedNumber) {
					return true;
				}
				// Return false if version is lesser than required
				else if (resParsedNumber < reqResParsedNumber) {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Compare status of the versions if all the numbers are the same
		// If required and provided status are equal are the same
		// both versions are the same
		if (reqResStatus.equalsIgnoreCase(resStatus)) {
			return equalVerAllowed;
		}
		// If "Alpha" is required every status is fine
		else if (reqResStatus.equalsIgnoreCase("a")) {
			return true;
		}
		// If "Beta" is required every status other than "Alpha" is fine
		else if (reqResStatus.equalsIgnoreCase("b")
				&& !resStatus.equalsIgnoreCase("a")) {
			return true;
		}
		// If "Release Candidate #" is required "Release Candidate #" with higher
		// number than the required is fine
		else if (reqResStatus.length() > 2
				&& reqResStatus.substring(0, 2).equalsIgnoreCase("rc")
				&& resStatus.length() > 2
				&& resStatus.substring(0, 2).equalsIgnoreCase("rc")) {
			int reqResInt = Integer.parseInt(reqResStatus.substring(2));
			int resInt = Integer.parseInt(resStatus.substring(2));
			if (resInt > reqResInt) {
				return true;
			}
		}
		// If "Release Candidate #" is required "Release" status is fine
		else if (reqResStatus.length() > 2
				&& reqResStatus.substring(0, 2).equalsIgnoreCase("rc")
				&& resStatus.equalsIgnoreCase("r")) {
			return true;
		}
		// Else, return false
		return false;
	}
}

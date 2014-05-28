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

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Rodrigo Garcia
 *
 */
public class SizeChecker {

	private static Logger logger = Logger.getLogger(SizeChecker.class.getName());
	
	static {
		logger.setLevel(Level.ALL);
	}
	
	/**
	 * @param requiredSize String in the format NumberDimension (e.g. 32M) representing the required memory size.
	 * @param providedSize requiredSize String in the format NumberDimension (e.g. 32M) representing the provided memory size.
	 * @return true if the provided size is equal or higher than the required size 
	 */
	public static boolean compareSizes(String requiredSize, String providedSize) {
		float requiredFloat = parseFloat(requiredSize);
		float providedFloat = parseFloat(providedSize);
		logger.info("Checking if size " + providedSize + " (" + providedFloat + ") is enough for size " + requiredSize + " (" + requiredFloat + ").");
		// If provided size is equal or higher than the required size return true
		if (Float.compare(providedFloat, requiredFloat) >= 0) {
			return true;
		}
		// Else return false
		return false;
	}

	/**
	 * @param originalSize String in the format NumberDimension (e.g. 32M) representing the memory size
	 * to witch the other size will be added.
	 * @param addingSize String in the format NumberDimension (e.g. 32M) representing the memory size
	 * that will be added.
	 * @return A String in the format NumberDimension (e.g. 32M) representing the new memory size.
	 */
	public static String addSizes(String originalSize, String addingSize) {
		float originalFloat = parseFloat(originalSize);
		float addingFloat = parseFloat(addingSize);
		float finalFloat = originalFloat + addingFloat;
		String finalString = parseString(finalFloat);
		logger.info("Adding " + addingSize + " (" + addingFloat + ") to " + originalSize + " (" + originalFloat + ") to obtain " + finalString + " (" + finalFloat + ")."); 
		return finalString;
	}
	
	/**
	 * @param originalSize String in the format NumberDimension (e.g. 32M) representing the memory size
	 *  from witch the other size will be subtracted.
	 * @param subtractingSize String in the format NumberDimension (e.g. 32M) representing the memory size
	 * that will be subtracted.
	 * @return A String in the format NumberDimension (e.g. 32M) representing the new memory size.
	 */
	public static String subtractSizes(String originalSize, String subtractingSize) {
		float originalFloat = parseFloat(originalSize);
		float subtractingFloat = parseFloat(subtractingSize);
		// Returns null if the size to be subtracted is bigger than the original size
		if (Float.compare(originalFloat, subtractingFloat) < 0) {
			return null;
		}
		float finalFloat = originalFloat - subtractingFloat;
		String finalString = parseString(finalFloat);
		logger.info("Subtracting " + subtractingSize + " (" + subtractingFloat + ") from " + originalSize + " (" + originalFloat + ") to obtain " + finalString + " (" + finalFloat + ").");
		return finalString;
	}
	
	/**
	 * @param size String in the format NumberDimension (e.g. 32M) representing memory size.
	 * @return A float with the size in bytes represented by the string.
	 */
	private static float parseFloat(String size) {
		String numValue = size.substring(0, size.length() - 1);
		String dimValue = size.substring(size.length() - 1);
		float floatSize = Float.parseFloat(numValue);
		// If exabytes
		if (dimValue.equalsIgnoreCase("E")) {
			return (floatSize * (float) Math.pow(1024, 6));
		}
		// If petabytes
		else if (dimValue.equalsIgnoreCase("P")) {
			return (floatSize * (float) Math.pow(1024, 5));
		}
		// If terabytes
		else if (dimValue.equalsIgnoreCase("T")) {
			return (floatSize * (float) Math.pow(1024, 4));
		}
		// If gigabytes
		else if (dimValue.equalsIgnoreCase("G")) {
			return (floatSize * (float) Math.pow(1024, 3));
		}
		// if megabytes
		else if (dimValue.equalsIgnoreCase("M")) {
			return (floatSize * (float) Math.pow(1024, 2));
		}
		// if kilobytes
		else if (dimValue.equalsIgnoreCase("K")) {
			return floatSize*1024;
		}
		// If none of the above, actual bytes
		return floatSize;
	}
	
	/**
	 * @param size float with the size in bytes to be converted to String.
	 * @return A String in the format NumberDimension (e.g. 32M) representing memory size. 
	 */
	private static String parseString(float size) {
		// If exabytes
		if (size >= Math.pow(1024, 6)) {
			return (Float.toString(((float) size)/((float) Math.pow(1024, 6))) + "E");	
		}
		// If petabytes
		else if (size >= Math.pow(1024, 5)) {
			return (Float.toString(((float) size)/((float) Math.pow(1024, 5))) + "P");
		}
		// If terabytes
		else if (size >= Math.pow(1024, 4)) {
			return (Float.toString(((float) size)/((float) Math.pow(1024, 4))) + "T");
		}
		// If gigabytes
		else if (size >= Math.pow(1024, 3)) {
			return (Float.toString(((float) size)/((float) Math.pow(1024, 3))) + "G");
		}
		// if megabytes
		else if (size >= Math.pow(1024, 2)) {
			return (Float.toString(((float) size)/((float) Math.pow(1024, 2))) + "M");
		}
		// if kilobytes
		else if (size >= 1024) {
			return (Float.toString(((float) size)/1024) + "K");
		}
		// If none of the above, actual bytes
		return Float.toString(size);
	}
}

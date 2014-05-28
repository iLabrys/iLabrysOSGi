package es.itecban.deployment.executionmanager.utils.checkers;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Rodrigo Garcia
 *
 */
public class SpeedChecker {

	private static Logger logger = Logger.getLogger(SpeedChecker.class.getName());
	
	static {
		logger.setLevel(Level.ALL);
	}
	
	/**
	 * @param requiredSpeed String in the format NumberDimension (e.g. 32M) representing the required speed.
	 * @param providedSpeed requiredSize String in the format NumberDimension (e.g. 32M) representing the provided speed.
	 * @return true if the provided speed is equal or higher than the required speed 
	 */
	public static boolean compareSpeeds(String requiredSpeed, String providedSpeed) {
		float requiredFloat = parseFloat(requiredSpeed);
		float providedFloat = parseFloat(providedSpeed);
		logger.info("Checking if speed " + providedSpeed + " (" + providedFloat + ") is equal or higher than minimum required speed " + requiredSpeed + " (" + requiredFloat + ").");
		// If provided size is equal or higher than the required size return true
		if (Float.compare(providedFloat, requiredFloat) >= 0) {
			return true;
		}
		// Else return false
		return false;
	}
	
	/**
	 * @param speed String in the format NumberDimension (e.g. 32M) representing speed.
	 * @return A float with the speed in hertzs represented by the string.
	 */
	private static float parseFloat(String speed) {
		String numValue = speed.substring(0, speed.length() - 1);
		String dimValue = speed.substring(speed.length() - 1);
		float floatSpeed = Float.parseFloat(numValue);
		// If exahertzs
		if (dimValue.equalsIgnoreCase("E")) {
			return (floatSpeed * (float) Math.pow(1000, 6));
		}
		// If petahertzs
		else if (dimValue.equalsIgnoreCase("P")) {
			return (floatSpeed * (float) Math.pow(1000, 5));
		}
		// If terahertzs
		else if (dimValue.equalsIgnoreCase("T")) {
			return (floatSpeed * (float) Math.pow(1000, 4));
		}
		// If gigahertzs
		else if (dimValue.equalsIgnoreCase("G")) {
			return (floatSpeed * (float) Math.pow(1000, 3));
		}
		// if megahertzs
		else if (dimValue.equalsIgnoreCase("M")) {
			return (floatSpeed * (float) Math.pow(1000, 2));
		}
		// if kilohertzs
		else if (dimValue.equalsIgnoreCase("K")) {
			return floatSpeed*1000;
		}
		// If none of the above, actual hertzs
		return floatSpeed;
	}
	
	/**
	 * @param speed float with the speed in hertzs to be converted to String.
	 * @return A String in the format NumberDimension (e.g. 32M) representing speed. 
	 */
	private static String parseString(float speed) {
		// If exahertzs
		if (speed >= Math.pow(1024, 6)) {
			return (Float.toString(((float) speed)/((float) Math.pow(1000, 6))) + "E");	
		}
		// If petahertzs
		else if (speed >= Math.pow(1024, 5)) {
			return (Float.toString(((float) speed)/((float) Math.pow(1000, 5))) + "P");
		}
		// If terahertzs
		else if (speed >= Math.pow(1024, 4)) {
			return (Float.toString(((float) speed)/((float) Math.pow(1000, 4))) + "T");
		}
		// If gigahertzs
		else if (speed >= Math.pow(1024, 3)) {
			return (Float.toString(((float) speed)/((float) Math.pow(1000, 3))) + "G");
		}
		// if megahertzs
		else if (speed >= Math.pow(1024, 2)) {
			return (Float.toString(((float) speed)/((float) Math.pow(1000, 2))) + "M");
		}
		// if kilohertzs
		else if (speed >= 1024) {
			return (Float.toString(((float) speed)/1000) + "K");
		}
		// If none of the above, actual hertzs
		return Float.toString(speed);
	}
}

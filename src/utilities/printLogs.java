package utilities;

import java.util.Date;

import org.apache.log4j.Logger;


public class printLogs {

	// Initialize Log4j logs
		static Date currentDate = new Date();
		private static Logger Log = Logger.getLogger(printLogs.class.getName());
		
		
// To print log for the starting of the test case
		
	public static void startTest(String testCaseName) {
			
			Log.info(" " + testCaseName + "Start date and time" + currentDate.toString()+ "");

		}
		
	
// To print log for the ending of the test case

	public static void endTest(String testCaseName) {

			Log.info("" + testCaseName + "End date and time:" +currentDate.toString()+"");

				}

		
//  To print informational message that highlights the progress of the execution test
	// new changes

public static void info(String message) {

			Log.info(message);

		}


//To print information regarding faulty and unexpected system behavior.
	
public static void warn(String message) {

			Log.warn(message);

		}

// To print error message that might allow system to continue
		
		public static void error(String message) {

			Log.error(message);

		}

// To print system critical information which are causing the application to crash
		
		public static void fatal(String message) {

			Log.fatal(message);

		}

		
// To print the debugging information and is helpful in debugging stage.
		public static void debug(String message) {

			Log.debug(message);

		}

	}

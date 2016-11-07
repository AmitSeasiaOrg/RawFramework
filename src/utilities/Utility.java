package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import frameworkGlobals.BrowserSelection;

public class Utility extends BrowserSelection {
	public static void takeScreenshot(String SSname) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+dateFormat.format(date)+"\\"+SSname+".jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
			throw new java.lang.RuntimeException("Exception occur during take ScreenShot: "+SSname);
		}
		System.out.println("Screenshot has been generated for " +SSname);		    
	}
	
}

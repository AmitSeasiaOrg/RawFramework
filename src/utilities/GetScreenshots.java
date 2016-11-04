package utilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import frameworkGlobals.BrowserSelection;



public class GetScreenshots extends BrowserSelection {


		public static void GenerateScreenshot(String SSname) throws IOException, InterruptedException
	{	
		
		try
		{
			if("Error" == driver.getTitle() || "Server Error" == driver.getTitle())
			{
				Thread.sleep(4000);
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+SSname+".jpeg"));
				System.out.println("Screenshot has been generated for server error and location is  " +SSname);
				
			}
		// It will check whether server error is coming in a page
		if(isTextPresent("Server") || isTextPresent("Page not found") || isTextPresent("Server Error"))
		{
			Thread.sleep(4000);
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+SSname+".jpeg"));
			System.out.println("Screenshot has been generated for " +SSname);
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Everything is working fine");
		}
		
	}
	
		
		
		
		public static void checkerroralertcomesandaccept(String SSname) throws IOException, InterruptedException, HeadlessException, AWTException
		{
			/*boolean abc = isAlertPresent.checkAlertPresent();
		if(abc == true)
		{
				alertScreenshot(SSname);
				isAlertPresent.acceptAlert();
				
			}*/
		}
	
		
		
		
		public static boolean isTextPresent(String text)
		{
			try
			{
			 boolean b ;
			 b = driver.getPageSource().contains(text);
		        return b;
		    }
		    catch(Exception e)
		    {
		    	System.out.println( text + " ------ not present test case failed");
		    	System.exit(0);
		        return false;
		    }
		  }
	
		
		
		
public static void ForcefulGenerateScreenshot(String SSname) throws IOException, InterruptedException
		{	
			// It will check whether server error is coming in a page
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
				Thread.sleep(4000);
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// Now you can do whatever you need to do with it, for example copy somewhere
				FileUtils.copyFile(scrFile, new File("SystemLogs\\Screenshots\\"+SSname+".jpeg"));
				System.out.println("Screenshot has been generated for " +SSname);
			    System.out.println("Screenshot taken");
			
		}
	
		
		
}

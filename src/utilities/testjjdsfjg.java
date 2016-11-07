package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import frameworkGlobals.*;


public class testjjdsfjg extends BrowserSelection {
	
	@BeforeClass
	public void hello(){
	    driver = new FirefoxDriver();
	   // caps = ((RemoteWebDriver) driver).getCapabilities();
		driver.get("http://uat.herbdigest.com/");
		driver.manage().window().maximize();
		byId.click("btnLogin", "");
	    
	}
	@Test
	public void hello2(){
	  //  driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=jzMcWNrLGqLT8geK9I6wBg&gws_rd=ssl");
		
	//	ByID.click("gb_70", "");
	}
}

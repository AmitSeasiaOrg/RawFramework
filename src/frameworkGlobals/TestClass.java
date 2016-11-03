package frameworkGlobals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

import utilities.JSExecutor;

public class TestClass {
	public static JSExecutor obj = new JSExecutor();
	
	public static void main(String[] args) throws InterruptedException
	{
		fillForm();
	}

	
		
public static void test()
{
	//test1();
}

public  void test1()
{
	test();
}

	//@Test
	public void fillForm() throws InterruptedException
	{
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement nameTb = driver.findElement(By.name("firstname"));
		JSExecutor obj =  new JSExecutor();
		 JSExecutor jsobj= obj.obj();
		jsobj.h
		//highlightElement(nameTb);
		nameTb.sendKeys("test");
		
		Thread.sleep(3000);
		
		WebElement dateTb = driver.findElement(By.id("datepicker"));
		highlightElement(dateTb);
		nameTb.sendKeys("10/11/12");
		
		Thread.sleep(3000);
		
		WebElement toolRadio = driver.findElement(By.id("tool-0"));
		highlightElement(toolRadio);
		toolRadio.sendKeys("10/11/12");
	}

}
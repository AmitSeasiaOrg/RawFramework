package frameworkGlobals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import interfaces.DriverActions;
import utilities.Alerts;
import utilities.JSExecutor;
import utilities.Utility;

public class ById extends BrowserSelection implements DriverActions{
	
	 /**
	   * This method performs click on the @param selector element.
	   * ID of elements should be pass as argument @param selector.
	   * Information of action should be pass as argument @param actionInfo
	   * @param selector ID of element to Click.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void click(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			if (Alerts.isAlertPresent()) {
				Alerts.acceptAlert();
			}			
			//ALert Check Metod need to implement here
			WebElement element = driver.findElement(By.id(selector));
			new JSExecutor().highlightElement(element);
			element.click();
			System.out.println("Clicked Successfully: "+actionInfo+" (ID: "+selector+")");
		
			//log1.info("Click Successfully: "+actionInfo+" (ID: "+selector+")");
		} catch (Exception e) {
			System.out.println("Not able to Click: "+actionInfo+" (ID: "+selector+")");
			//log1.info("Not able to Click: "+actionInfo+" (ID: "+selector+")");
			
			Utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("Test Case failed as Not able to Click: " + actionInfo);
		}
		
	}

	@Override
	public void selectByIndex(String selector, int index, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectByValue(String selector, String value, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectByVisibleText(String selector, String text, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getClass(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstSelectedOption(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getOptions(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAttribute(String selector, String attribute, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String selector, String inputText, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearThenSetText(String selector, String inputText, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTagName(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDisplayed(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelected(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMultibleText(String urlPath, String[] selectorArray, String[] textArray, String actionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getElement(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getElements(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}

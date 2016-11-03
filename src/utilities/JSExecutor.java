package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import frameworkGlobals.BrowserSelection;

public class JSExecutor extends BrowserSelection{
	// assuming JS is enabled
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	private WebElement lastElem = null;
	private String lastBorder = null;

	private static final String setBorder = "color: red; border: 2px solid red;";
	private static final String removeBorder = "";
	
	public void highlightElement(WebElement elem) {
		unhighlightLast();
		// remember the new element
		lastElem = elem;
		// Set element border
		lastBorder = (String) (js.executeScript("arguments[0].setAttribute('style', arguments[1]);", elem, setBorder));
	}

	public void unhighlightLast() {
		if (lastElem != null) {
			try {
				// if there already is a highlighted element, Un-highlight it
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", lastElem, removeBorder);
			} catch (StaleElementReferenceException e) {
				// the page got reloaded, the element isn't there
				e.printStackTrace();
			} finally {
				// element either restored or wasn't valid, nullify in both cases
				lastElem = null;
			}
		}
	}

}
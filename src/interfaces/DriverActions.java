package interfaces;

import java.util.List;

public interface DriverActions {
	
		
	public void click(String selector, String actionInfo);
	
	public void selectByIndex(String selector, int index, String actionInfo);
	
	public void selectByValue(String selector, String value, String actionInfo);
	
	public void selectByVisibleText(String selector, String text, String actionInfo);
	
	public String getClass(String selector, String actionInfo);
	
	public String getFirstSelectedOption(String selector, String actionInfo);
	
	public List<String> getOptions(String selector, String actionInfo);
	
	public int getSize(String selector, String actionInfo);
	
	public String getAttribute(String selector, String attribute, String actionInfo);
	
	public String getText(String selector, String actionInfo);
	
	public void setText(String selector, String inputText, String actionInfo);
	
	public void clearThenSetText(String selector, String inputText, String actionInfo);
	
	public String getTagName(String selector, String actionInfo);
	
	public boolean isDisplayed(String selector, String actionInfo);
	
	public boolean isEnabled(String selector, String actionInfo);
	
	public boolean isSelected(String selector, String actionInfo);
	
	public void clear(String selector, String actionInfo);
	
	public void setMultibleText(String urlPath, String[] selectorArray, String[] textArray, String actionInfo);
	
	public Object getElement(String selector, String actionInfo);
	// need to chekc last 2 methods
	public List<Object> getElements(String selector, String actionInfo);
		
}
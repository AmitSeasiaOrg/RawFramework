package interfaces;

public interface DriverActions {
	
	public void click(String locator, String actionInfo);
	
	public void selectByIndex(String locator, int index, String actionInfo);
	
	public void selectByValue(String locator, String value, String actionInfo);
	
	public void selectByVisibleText(String locator, String text, String actionInfo);
	
	public void getAllSelectedOptions(String locator, String actionInfo);
	
	public void getFirstSelectedOption(String locator, String actionInfo);

	
}
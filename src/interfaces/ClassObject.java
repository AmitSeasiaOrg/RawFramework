package interfaces;

import frameworkGlobals.*;
public interface ClassObject {
	
	public static ByClassName byClassName=new ByClassName();
	public ByCssSelector byCssSelector=new ByCssSelector();
	public ById byId = new ById();
	public ByLinkText byLinkText=new ByLinkText();
	public ByName byName=new ByName();
	public ByPartialLinkTest byPartialLinkTest=new ByPartialLinkTest();
	public ByXpath byXpath=new ByXpath();
	
}

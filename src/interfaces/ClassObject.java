package interfaces;

import frameworkGlobals.*;
public interface ClassObject {
	
	public ByClassName byClassName=new ByClassName();
	public ByCssSelector byCssSelector=new ByCssSelector();
	public ByID byId =new ByID();
	public ByLinkText byLinkText=new ByLinkText();
	public ByName byName=new ByName();
	public ByPartialLinkTest byPartialLinkTest=new ByPartialLinkTest();
	public ByXpath byXpath=new ByXpath();
	
}

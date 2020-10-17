package com.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC02 {
@Test	
public void show() {
	//test case steps 
	DOMConfigurator.configure("Log4j.xml");
	General objj = new General();
	objj.openApplication();
	objj.login();
	objj.closeApplication();
}
} 
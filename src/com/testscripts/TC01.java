package com.testscripts;
import com.hrms.lib.General;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC01 {
	@Test
	 public  void tc001() throws Exception {
		 //test steps.
		DOMConfigurator.configure("Log4j.xml");
		 General obj = new General();
		 obj.openApplication();
		 obj.login();
		 obj.addEmp();
		 obj.mouseoverDelete();
		 obj.logout();
		 obj.closeApplication();	 
}
}

package com.testscripts;
import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC03  {
	@Test
	public  void mouseover() throws Exception {
	General objj = new General();
	 objj.openApplication();
	 objj.login();
	 objj.logout();
	 objj.closeApplication();
}
}

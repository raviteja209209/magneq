package com.testscripts;
import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC04 {
	 @Test
	public void method() throws Exception {
	General obb = new General();
	 obb.openApplication();
	 obb.login(); 
	 obb.logout();
	 obb.closeApplication();
}
}
package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	//TEST DATA
	public WebDriver  driver;
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw = "admin";
	public int i = 0020;
	// OBJ DATA
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";

}

package com.hrms.lib;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.newpackage.util.Log;

import org.openqa.selenium.By;
public class General extends Global {
	//re used function
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");// console
		Reporter.log("Application opened");// html report
		Log.info("Application opened");// log file
	}
	public void closeApplication(){
		driver.close();
		Log.info("Application closed");
}
	public void login(){
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Log.info("Login success");
}
	public void logout()throws Exception{
		driver.findElement(By.linkText(link_logout)).click(); 
		Thread.sleep(3000);
		Log.info("Logout success");
		}
	public void addEmp() {
		// enter to frame
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		System.out.println("Clicked on ADD button");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Ravi");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("teja");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		System.out.println("Clicked on Save button");
		System.out.println("adding new emp");
		//exit from frame
		driver.switchTo().defaultContent();
		Log.info("adding new employee success");
	}
	public void delmp() throws Exception {
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.id("loc_name")).sendKeys("0015");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		// select check box to delete emplyee
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().defaultContent();
		System.out.println("delete emp");
		Thread.sleep(5000);
	}
	
	public void mouseoverDelete()throws Exception {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Employee List")).click();	
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.id("loc_name")).sendKeys("0004");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		// select check box to delete emplyee
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().defaultContent();
		System.out.println("delete emp");
		Log.info("deleting  employee success");
		Thread.sleep(5000);
}
}
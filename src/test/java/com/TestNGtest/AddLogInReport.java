package com.TestNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddLogInReport {
	WebDriver driver;
	
	  @BeforeTest
	  public void OpenGoogle() {
		  
		  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		  System.out.println("Browser Configuration completed. ");
		  driver=new FirefoxDriver();
		  
		  driver.get("https://www.google.com");
		  
	  }
	  
	  @Test(description="This is test method for Title")
	  public void GetGoogleTitle() {
		  Reporter.log("Getting Title....");
		  System.out.println(driver.getTitle());
		  
	  }
	  @Test
	  public void GetGoogleURL() {
		  Reporter.log("Getting URL....");
		  System.out.println(driver.getCurrentUrl());
		  
	  } 
	  
	  @Test
	  public void TearDown()
	  {
		  driver.close();
		  Reporter.log("Browser close....");
	  }
	  
}

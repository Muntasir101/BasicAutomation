package com.TestNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeClassTest {
	WebDriver driver;
	
  @Test
  public void basicTest() {
	  System.out.println("Test site open..");
	  driver.get("https://www.google.com");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Browser Launching....");
	  driver=new FirefoxDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass executing...");
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
	  System.out.println("Browser Configuration completed. ");
  }

}

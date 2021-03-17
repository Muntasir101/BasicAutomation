package com.TestNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class AfterMethodTest {
	WebDriver driver;
	
  @Test
  public void BasicTest() {
	  System.out.println("@Test executing....");
	  driver.get("https://www.google.com");
	  System.out.println("@Test Executed Successfully.");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	    System.out.println("Opening Firefox Browser");
	    System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Firefox Browser Opened");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Closing browser..");
	  driver.close();
	  System.out.println("Firefox closed successfully. ");
  }

}

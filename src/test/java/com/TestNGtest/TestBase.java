package com.TestNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("@BeforeTest executing...");
		  
		  System.out.println("Browser Configuration completed. ");
		  
	  }
	@BeforeSuite
	public void BrowserConfig() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(5000);
	}

	@AfterSuite
	  public void TestClose() {
		
		if(driver!=null)
		{
			driver.close();
		}
	  }
	
	
}

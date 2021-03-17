package com.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTest {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest logger;
	
  @Test
  public void f() {
	  
	  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\ExtentReport\\MyReport.html");
	  report=new ExtentReports();
	  report.attachReporter(htmlReporter);
	  
	  logger=report.createTest("CheckTitle");
	  
	    System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		logger.log(Status.INFO, "Starting Browser");
	    driver=new FirefoxDriver();
	  
	    logger.log(Status.INFO, "Opening Test SIte");
	    driver.get("https://www.google.com");
	    
	    String Title=driver.getTitle();
	    System.out.println(Title);
	    
	    logger.log(Status.PASS, "Test Passed");
	    
	    driver.close();
  }
}

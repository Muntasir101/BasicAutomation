package com.TestNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
 WebDriver driver;
 
 @DataProvider(name="searchData")
 public Object[][] searchData()
 {
	 Object [][] data=new Object[3][1];
	 data [0][0]="https://www.google.com";
	 data [1][0]="http://www.bing.com/";
	 data [2][0]="https://edition.cnn.com/";
	 
	 return data;
 }
 
 @Test(dataProvider="searchData")
 public void doSearch(String TestSite)
 {
	 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get(TestSite);
 }
 
 @AfterClass
 public void tearDown()
 {
	 driver.quit();
 }
}

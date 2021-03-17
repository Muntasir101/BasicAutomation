package com.TestNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basic 
{
	WebDriver driver;
	
	@Test
	public void simpleTest() 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
}

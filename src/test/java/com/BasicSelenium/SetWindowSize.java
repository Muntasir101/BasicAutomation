package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetWindowSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/Muntasir101/Batch12");		
		driver.manage().window().setSize(new Dimension(500,700));		
		driver.quit();

	}

}

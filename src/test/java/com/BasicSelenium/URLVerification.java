package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URLVerification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/Muntasir101/Batch12");
		
		String ExperctedURL="http://localhost:8081/WebProject/index.html";
		
		String ActualURL=driver.getCurrentUrl();
		
		if(ExperctedURL.equals(ActualURL))
		{
			System.out.println("URL Match");
		}
		else
		{
			System.out.println("Failed.Actual URL :"+ActualURL);
		}
	}
}

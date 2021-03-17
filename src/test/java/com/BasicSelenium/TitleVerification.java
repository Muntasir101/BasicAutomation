package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/WebProject/index.html");
		
		String ExperctedTitle="My Test site";
		
		String ActualTitle=driver.getTitle();
		
		if(ExperctedTitle.equals(ActualTitle))
		{
			System.out.println("Title pass");
		}
		else
		{
			System.out.println("Failed.Actual Title :"+ActualTitle);
		}
	}
}

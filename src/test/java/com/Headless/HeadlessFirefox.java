package com.Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions option=new FirefoxOptions();
		
		//set Firefox Headless
		option.setHeadless(true);
		
		//Instantiate Firefox Driver
		WebDriver driver=new FirefoxDriver(option);
		
		driver.get("https://bing.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}

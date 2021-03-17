package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHightWidth {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
		int hight=driver.manage().window().getSize().height;
		int width=driver.manage().window().getSize().width;
		
		System.out.println(hight+";"+width);
		
		int hight1=driver.manage().window().getSize().getHeight();
		System.out.println(hight1);
		
		//browser maximize
		driver.manage().window().maximize();
	

	}

}

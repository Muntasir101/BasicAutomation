package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElemnet {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement Search=driver.findElement(By.name("search"));
		Search.sendKeys("iphone");
		
		Search.clear();
		
		Search.sendKeys("Macbook");

		WebElement Search_btn=driver.findElement(By.cssSelector("#search > span > button"));
		Search_btn.click();
		
//		//Testing apply..
//       String ExperctedTitle="Search - iphone";
//		
//		String ActualTitle=driver.getTitle();
//		
//		if(ExperctedTitle.equals(ActualTitle))
//		{
//			System.out.println("Result page success");
//		}
//		else
//		{
//			System.out.println("Failed.Actual Title:"+ActualTitle);
//		}
		
	}
}

package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerify {

	   public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		//String text=driver.findElement(By.cssSelector("#logo > h1 > a")).getText();
//		System.out.println(driver.findElement(By.cssSelector("#logo > h1 > a")).getText());
//		
//		String value=driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.caption > h4 > a")).getAttribute("value");
//		System.out.println(value);
		
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("id"));

	}

}

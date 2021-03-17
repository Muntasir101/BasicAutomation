package com.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromtAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		String inputText="Selenium";
		driver.switchTo().alert().sendKeys(inputText);
		driver.switchTo().alert().accept();
		
		String Expected="You entered: Selenium";
		String Output=driver.findElement(By.id("result")).getText();
		
		if(Expected.equals(Output))
		{
			System.out.println("Pass");
		}

		else
		{
			System.out.println("Failed. Inputed value did not match with output Text.");
		}
	}

}

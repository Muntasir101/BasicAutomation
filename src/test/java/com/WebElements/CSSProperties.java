package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSProperties {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement FirstName=driver.findElement(By.name("firstname"));
		
		Dimension size=FirstName.getSize();
		System.out.println(size);
		
		String BgColor=FirstName.getCssValue("background-color");
		System.out.println(BgColor);
		
		//IsSelected
		WebElement RadioButton=driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2) > input[type=radio]"));
		boolean ActualSelection=RadioButton.isSelected();
		
		if(ActualSelection==true)
		{
			System.out.println("Default Selected");
		}
		else{
			System.out.println("Default not selected,failed.");
		}

	}

}

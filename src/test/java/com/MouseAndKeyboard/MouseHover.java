package com.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/WebProject/index.html");
		
		WebElement ele=driver.findElement(By.cssSelector("body > p"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		
	}

}

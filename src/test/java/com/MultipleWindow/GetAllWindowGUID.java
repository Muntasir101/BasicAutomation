package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllWindowGUID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		String parentGUID=driver.getWindowHandle();
		System.out.println("Parent window GUID: "+parentGUID);
		
		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		Thread.sleep(3000);
		
		//Get all session id of the Browser
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);
		
		// Print the title of the page
		System.out.println("Page Title before switching: " +driver.getTitle());
		System.out.println("Total Windows: " +allGUID.size());
		
	}

}

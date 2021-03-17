package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.get("https://www.facebook.com/");
		
		// Find Dropdown
		WebElement dropDownElementDay=driver.findElement(By.name("birthday_day"));
		 
		// Create Object for Select Class
		Select dropdownDay=new Select(dropDownElementDay);
		
		
		// Verify Single or multiple value Drop Down
		boolean SingleOrMultiple=dropdownDay.isMultiple();
		if(SingleOrMultiple)
		{
			System.out.println("Dropdown is Multi value drop down");
		}
		else{
			System.out.println("Dropdown is Single value drop down");
		}
		
		// Select date from dropdown
		dropdownDay.selectByIndex(10);
		
		// Get all value and store it in List
		List<WebElement> allElements=dropdownDay.getOptions();
		System.out.println("Values Present in Dropdown: ");
		for(WebElement element: allElements)
		{
			System.out.println(element.getText());
		}
		
		// Verify the particular value present
		List<WebElement> allElements2=dropdownDay.getOptions();
		for(WebElement element: allElements2)
		{
			String dropDownValues=element.getText();
			if(dropDownValues.equals("Day"))
			{
				System.out.println("Day present in dropdown values");
			}
		}
		
	}

}

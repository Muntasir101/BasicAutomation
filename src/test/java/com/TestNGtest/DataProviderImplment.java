package com.TestNGtest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class DataProviderImplment {
	WebDriver driver;
	
  @Test(dataProvider="searchData")
  public void LoginTest(String username, String password) 
  {
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://demo.opencart.com/index.php?route=account/login");
	  
	WebElement email=  driver.findElement(By.name("email"));
	email.sendKeys(username);
	WebElement pass=driver.findElement(By.name("password"));
	pass.sendKeys(password);
	WebElement loginButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
	loginButton.submit();
  }

  @DataProvider(name="searchData")
  public Object[][] searchData() {
	  Object [][] data=new Object[3][2];
		 data [0][0]="admin";
		 data [0][1]="123456";
		 data [1][0]="admin2";
		 data [1][1]="admin123";
		 data [2][0]="admin3";
		 data [2][1]="admin";		 
		 return data;
  }
}

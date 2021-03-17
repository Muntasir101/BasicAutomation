package com.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromProperties2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesFile\\OR.properties");
		Properties prop=new Properties();
		prop.load(fis);		
		System.out.println(prop.getProperty("TestSite"));
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.get(prop.getProperty("TestURL"));
		
		driver.findElement(By.name(prop.getProperty("GoogleSerachBox_Name"))).sendKeys(prop.getProperty("SearchKeyword"));
        driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
        
        driver.close();

		
	}

}

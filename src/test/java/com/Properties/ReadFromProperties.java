package com.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesFile\\OR.properties");
		Properties prop=new Properties();
		prop.load(fis);		
		System.out.println(prop.getProperty("TestSite"));
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.get(prop.getProperty("TestURL"));
		
	}

}

package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base64ToImage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Take Screenshot
		String scrbase64=((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		
		//Convert the BASE64 to FILE type
		File file=OutputType.FILE.convertFromBase64Png(scrbase64);
		
		// Save the converted file as Image
		FileUtils.copyFile(file, new File("E:\\Muntasir\\Doc\\Batch-12\\9th Class\\15. ScreenShots\\BASE64-Converted-Image.png"), true);
		
	}

}

package com.Screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElementScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Locate Image element to capture a Screenshot
		WebElement element=driver.findElement(By.cssSelector("#content > ul:nth-child(4) > li:nth-child(1) > a:nth-child(1)"));
		
		//Capture entire page screenshot as File
		File screen=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Using Selenium point class to get X Y coordinates of image
		//get location of(x y coordinates) of the element
		
		Point point=element.getLocation();
		int xcoordinate=point.getX();
		int ycoordinate=point.getY();
		
		//Using selenium getSize() method to get height and width of element
		// Retrieves width of element
		// Retrieves height of element
		int imageWidth=element.getSize().getWidth();
		int imageheight=element.getSize().getHeight();
		
		//Reading full image screenshot
		BufferedImage img=ImageIO.read(screen);
		
		//Cut Image using height, width, x y coordinates
		BufferedImage destination=img.getSubimage(xcoordinate, ycoordinate, imageWidth, imageheight);
		ImageIO.write(destination, "png", screen);
		
		//Save image Screenshot to Drive
		FileUtils.copyFile(screen, new File("E:\\Muntasir\\Doc\\Batch-12\\9th Class\\15. ScreenShots\\ElementScreenshot.png"));
		

	}

}

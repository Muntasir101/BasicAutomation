package com.Screenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDFwithScreenshot {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Take screenshot and store it in byte[] array format
		byte[] input=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Document document=new Document();
		String output="E:\\Muntasir\\Doc\\Batch-12\\9th Class\\15. ScreenShots\\TestReport.pdf";
        FileOutputStream fos=new FileOutputStream(output);
		
        // Instantiate the pdf writer
        PdfWriter writer=PdfWriter.getInstance(document, fos);
        
        //Open the pdf for writing
        writer.open();
        document.open();
        
        //Process content into an image
        Image im=Image.getInstance(input);
        
        //set the size of the image
        im.scaleToFit(PageSize.A4.getWidth()/2,PageSize.A4.getHeight()/2);
        
        //Add image to PDF
        document.add(im);
        document.add(new Paragraph(" "));
        
        // close the files and save to local drive
        document.close();
        writer.close();
        
		
	}

}

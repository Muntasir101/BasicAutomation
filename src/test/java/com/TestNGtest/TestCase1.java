package com.TestNGtest;

import org.testng.annotations.Test;

public class TestCase1 extends TestBase {
	
  @Test(description="test1")
  public void SimpleTest() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
	  Thread.sleep(5000);
	  
  }
}

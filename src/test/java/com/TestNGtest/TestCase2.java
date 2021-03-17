package com.TestNGtest;

import org.testng.annotations.Test;

public class TestCase2 extends TestBase {
	
  @Test(groups="test2")
  public void SimpleTest() {
	  
	  driver.get("https://www.demo.opencart.com");
	  System.out.println(driver.getTitle());
	  
  }
}

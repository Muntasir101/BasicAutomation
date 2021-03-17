package com.TestNGtest;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority=3)
  public void test1() {
	  System.out.println("Test1 Execute");
  }
  @Test(priority=2)
  public void test2() {
	  System.out.println("Test2 Execute");
  }
  @Test(priority=1)
  public void test3() {
	  System.out.println("Test3 Execute");
  }
  @Test(priority=-1)
  public void test4() {
	  System.out.println("Test4 Execute");
  }
  
}

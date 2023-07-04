package ua.hillel29032023.tests.Lesson15.actions;

import org.testng.annotations.*;

public class Test2 {
  @BeforeClass
  public void beforeClass() {
    System.out.println("==== Before Class Test2 ====");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("==== After Class Test2 ====");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("==== Before Method ====");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("==== After Method ====");
  }

  @Test
  public void test1() {
    System.out.println("==== Test 3 ====");
  }

  @Test
  public void test2() {
    System.out.println("==== Test 4 ====");
  }
}

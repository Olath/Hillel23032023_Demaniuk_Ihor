package ua.hillel29032023.tests.Lesson15;

import org.testng.annotations.Test;

public class FirstTest {
  @Test(groups = {"regression", "smoke", "P1"},
  enabled = false,
  dependsOnMethods = {"innerTest", "tests.SecondTest.SecondInnerTest"},
  priority = 10)
  public void firstTest() {
    System.out.println("I'm fist test");
    System.out.println("Testing on " + System.getProperty("url"));
  }
  @Test(priority = 20)
  public void newFuncTest() {
    System.out.println("newFuncTest");
  }

  @Test(priority = 21)
  public void newFuncTest2() {
    System.out.println("newFuncTest2");
  }

  @Test(priority = 30)
  public void innerTest() {
    System.out.println("First Inner Test");
  }

  @Test(priority = 40)
  public void test3 () {
    System.out.println("test3");
  }
}

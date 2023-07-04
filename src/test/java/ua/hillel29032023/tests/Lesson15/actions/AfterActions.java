package ua.hillel29032023.tests.Lesson15.actions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class AfterActions {
  @AfterSuite
  public void afterSuite() {
    System.out.println("==== After Suite ====");
  }
  @AfterTest
  public void afterTest() {
    System.out.println("==== After Test ====");
  }
}

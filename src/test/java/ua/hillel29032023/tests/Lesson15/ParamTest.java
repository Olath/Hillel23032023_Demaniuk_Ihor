package ua.hillel29032023.tests.Lesson15;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
  @Test
  @Parameters({"url", "browserName"})
  public void ruTest(String url, String browser) {
    System.out.println("Running test on " + browser + " in " + url);
  }
}

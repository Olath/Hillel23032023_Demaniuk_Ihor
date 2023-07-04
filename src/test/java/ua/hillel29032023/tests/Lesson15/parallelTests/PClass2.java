package ua.hillel29032023.tests.Lesson15.parallelTests;

import org.testng.annotations.Test;

public class PClass2 {
  @Test
  public void  test1() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {}

    System.out.println("Test passed");
  }
}

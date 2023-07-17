package ua.hillel29032023.tests.HomeTasks.Home15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependTest {
  @Test(dependsOnGroups = "stuff", groups = "other", priority = 30)
  public void test1() {
    System.out.println("Login : Login - Password : Password - Role : Role");
  }
  @Test(groups = "stuff", priority = 40)
  public void test2 (){
    Assert.assertEquals("actual","expected", "does not compute");
  }
}

package ua.hillel29032023.tests.Lesson15;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderTest {
  @Test(dataProvider = "userProvider")
  public void userRoleTest(String userName, String password, String role) {
    System.out.printf("name : %s - password : %s - role : %s%n", userName, password, role);
    System.out.println("Starting test for " + role);
    if (role.equals("admin")) {
      throw new RuntimeException("Test Failed");
    }
    System.out.println("Test for " + role + "passed");

    Assert.assertEquals("actual", "expected", "Assertion message");
    Assert.assertFalse(true, "message");

    SoftAssert softUserAssert = new SoftAssert();
    softUserAssert.assertEquals(userName, "Jon");
    softUserAssert.assertTrue(role.isBlank());

    System.out.println("test goes on");
    softUserAssert.assertAll();
  }

  @DataProvider(name = "userProvider")
  public Object[][] userProvider() {
    String[][] users = {
        {"userName", "userPass", "user"},
        {"adminName", "adminPass", "admin"},
        {"guestName", "guestPass", "guest"}
    };
    return users;
  }
}

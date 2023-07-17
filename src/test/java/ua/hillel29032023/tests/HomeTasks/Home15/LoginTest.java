package ua.hillel29032023.tests.HomeTasks.Home15;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
  @Test(dataProvider = "LoginData", groups = "login", priority = 10)
  public void login(String login, String password, String role){
    System.out.printf("Login : %s - Password : %s - Role : %s%n", login, password, role);
    System.out.println("Starting test for " + role);
    System.out.println("Test for " + role + " passed\n");
  }

  @DataProvider(name = "LoginData")
  public Object[][] loginData(){
    String[][] users = {
        {"userLogin", "userPassword", "User"},
        {"adminLogin", "adminPassword", "Admin"},
        {"guestLogin", "guestPassword", "Guest"}
    };
    return users;
  }
}

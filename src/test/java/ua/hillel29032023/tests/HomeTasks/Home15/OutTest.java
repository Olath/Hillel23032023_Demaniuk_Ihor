package ua.hillel29032023.tests.HomeTasks.Home15;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

public class OutTest {
  @Test(dataProvider = "Logins", priority = 20, groups = "login")
  public void outTest(String login, String password, String role) {
    System.out.printf("Login : %s - Password : %s - Role : %s%n", login, password, role);
    System.out.println("Starting test for " + role);
    System.out.println("Test for " + role + " passed\n");
  }
  @DataProvider(name = "Logins")
  public Object[][] stuffing () throws NoSuchElementException, IOException{
    Properties props1 = new Properties();
    FileInputStream fis1 = new FileInputStream("D:\\Program Files\\IdeaProjects\\Hillel29032023\\" +
        "src\\test\\resources\\example1.txt");
    props1.load(fis1);

    String userName = props1.getProperty("name");
    String userPass = props1.getProperty("pass");
    String userRole = props1.getProperty("role");
    System.out.println("user '" + userName + "' password : '" + userPass + "' role : " + userRole + "'");

    Properties props2 = new Properties();
    FileInputStream fis2 = new FileInputStream("D:\\Program Files\\IdeaProjects\\Hillel29032023\\" +
        "src\\test\\resources\\example2.txt");
    props2.load(fis2);
    String adminName = props2.getProperty("name");
    String adminPass = props2.getProperty("pass");
    String adminRole = props2.getProperty("role");
    System.out.println("user '" + adminName + "' password : '" + adminPass + "' role : " + adminRole + "'");

    Properties props3 = new Properties();
    FileInputStream fis3 = new FileInputStream("D:\\Program Files\\IdeaProjects\\Hillel29032023\\" +
        "src\\test\\resources\\example3.txt");
    props3.load(fis3);
    String guestName = props3.getProperty("name");
    String guestPass = props3.getProperty("pass");
    String guestRole = props3.getProperty("role");
    System.out.println("user '" + guestName + "' password : '" + guestPass + "' role : " + guestRole + "'");
    String[][] stuff = {{userName, userPass, userRole}, {adminName, adminPass, adminRole},
        {guestName, guestPass, guestRole}};
    return stuff;

  }
}

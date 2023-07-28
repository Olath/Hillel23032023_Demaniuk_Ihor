package ua.hillel29032023.tests.HomeTasks.Home17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginActionsTest {
  @Test
  public void correctLoginTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login");

    WebElement login = driver.findElement(By.id("username"));
    login.clear();
    login.sendKeys("tomsmith");

    WebElement password = driver.findElement(By.id("password"));
    password.clear();
    password.sendKeys("SuperSecretPassword!");

    WebElement loginButton = driver.findElement(By.className("fa"));
    loginButton.click();

    WebElement success = driver.findElement(By.className("success"));

    Assert.assertTrue(success.getText().contains("You logged into a secure area!"));

    driver.quit();
  }
  @Test
  public void incorrectLoginTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://the-internet.herokuapp.com/login");

    WebElement login = driver.findElement(By.id("username"));
    login.clear();
    login.sendKeys("user");

    WebElement password = driver.findElement(By.id("password"));
    password.clear();
    password.sendKeys("password");

    WebElement loginButton = driver.findElement(By.className("fa"));
    loginButton.click();

    WebElement error = driver.findElement(By.className("error"));
//    System.out.println(error.getText());

    Assert.assertTrue(error.getText().contains("Your username is invalid!"));

    driver.quit();
  }
}

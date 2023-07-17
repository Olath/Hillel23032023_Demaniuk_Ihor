package ua.hillel29032023.tests.wd.Lesson16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WdTest {
  @Test
  public void wdTest() {
//    WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();

    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();

    driver.get("https//google.com");
    System.out.println(driver.getTitle());
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.close();
    driver.quit();
  }
}

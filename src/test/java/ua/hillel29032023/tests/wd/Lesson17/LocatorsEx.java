package ua.hillel29032023.tests.wd.Lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsEx {
  @Test
  public void locatorsTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

//    driver.findElement(By.ByCssSelector())
    driver.findElement(By.className("row.")).findElement(By.tagName("a"));

    driver.findElement(By.linkText("Disappearing elements"));

    WebElement element =  driver.findElement(By.partialLinkText("and Drop"));
//    element.


    driver.findElement(By.xpath(String.format("//label[text()='%s']/../input", "Password")));
    driver.findElement(By.xpath(String.format("//label[text()='%s']/../input", "Username")));

  }
}

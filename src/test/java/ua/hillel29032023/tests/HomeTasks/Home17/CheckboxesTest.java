package ua.hillel29032023.tests.HomeTasks.Home17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest {
  @Test
  public void checkboxesTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/checkboxes");
    driver.manage().window().maximize();

    WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]"));

    WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]"));

    if (!checkbox1.isSelected()) {
      checkbox1.click();
    }

    if (!checkbox2.isSelected()) {
      checkbox2.click();
    }

    Assert.assertTrue(checkbox1.isSelected() && checkbox2.isSelected());
    driver.quit();
  }
}

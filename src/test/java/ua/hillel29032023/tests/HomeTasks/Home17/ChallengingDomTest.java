package ua.hillel29032023.tests.HomeTasks.Home17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChallengingDomTest {
  @Test
  public void challengingDomTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/challenging_dom");

    WebElement div1 = driver.findElement(By.className("large-2")).findElement(By.cssSelector("a[class = 'button']"));
    div1.click();

    WebElement div2 = driver.findElement(By.className("large-2")).findElement(By.cssSelector("a[class = 'button alert']"));
    div2.click();

    WebElement div3 = driver.findElement(By.className("large-2")).findElement(By.cssSelector("a[class = 'button success']"));
    div3.click();

    WebElement tbody = driver.findElement(By.tagName("tbody"));
    WebElement tr = tbody.findElement(By.cssSelector("tr:nth-child(5)"));
    System.out.println(tr.getText());

    driver.quit();
  }

}

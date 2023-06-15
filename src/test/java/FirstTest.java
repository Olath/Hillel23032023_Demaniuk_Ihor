import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void firstTest() {
    System.out.println("I'm fist test");
    System.out.println("Testing on " + System.getProperty("url"));
  }
}

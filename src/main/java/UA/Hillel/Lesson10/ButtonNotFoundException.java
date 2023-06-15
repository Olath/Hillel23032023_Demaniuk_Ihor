package UA.Hillel.Lesson10;

public class ButtonNotFoundException extends RuntimeException{
  public ButtonNotFoundException(String name, String locator) {
    super("Button" + name + "" + locator);
  }
}

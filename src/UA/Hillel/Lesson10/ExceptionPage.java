package UA.Hillel.Lesson10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPage {
  public void getValueFromConfig(){
    try {
      new Config().getConfigValue();
    } catch (IOException e) {

    }

  }
}

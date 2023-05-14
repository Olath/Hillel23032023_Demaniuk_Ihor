package UA.Hillel.Lesson10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Config {
    public String getConfigValue() throws IOException{
    FileReader reader = new FileReader(new File("somefile"));
    reader.read();

    //    Thread.sleep(1000);

    return "";

  }
}

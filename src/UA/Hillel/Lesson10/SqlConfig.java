package UA.Hillel.Lesson10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConfig {
  public void getSqlConfig() {
//    Connection connection;
//    try{
//      connection = DriverManager.getConnection("url", "user", "pass")
//    } catch (SQLException sqlExceptionon){
//      System.out.println("");
//    } finally {
//      if (connection != null) {
//        try {
//          connection.close();
//        } catch (Exception e){
//
//        }
//      }
//    }

    try (Connection connection = DriverManager.getConnection("url", "inf", "pass")) {
      connection.beginRequest();
    } catch (Exception e) {

    }
  }
}

package UA.Hillel.Lesson10;

import java.io.IOException;

public class ExceptionEx {
  public static void main(String[] args) throws IOException, InterruptedException{
//    new ExceptionTest().exceptionTest();


    int index = 10;
    int[] array = {1,2,3};

    try {
      System.out.println("Start Try");
      System.out.println(array[index]);
      System.out.println("End Try");
    } catch (Exception e) {
      System.out.println("Inside Catch");
    } finally {
      System.out.println("Inside finally");
    }

    System.out.println("After Try-catch");
  }

}

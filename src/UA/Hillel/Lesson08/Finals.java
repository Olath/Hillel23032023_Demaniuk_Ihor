package UA.Hillel.Lesson08;

public class Finals {
  private final String FINAL_VAR_NAME = "name";

  public final String FINAL_CONST_VAR;

  public Finals(String value){
    FINAL_CONST_VAR = value;
  }

  public void updateVar(){
//    FINAL_VAR_NAME = "new name";
  }
  public void setStatus(String status){
    System.out.println("Setting status :" + status);
  }
  public final void finalMethod(){
    System.out.println("Im in final class");
  }
}

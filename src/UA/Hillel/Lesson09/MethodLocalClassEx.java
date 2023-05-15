package UA.Hillel.Lesson09;

public class MethodLocalClassEx {
  public void method1() {
    class MethodLocalClass {
      String f1, f2, f3;
    }
    MethodLocalClass methodLocalClass = new MethodLocalClass();
    methodLocalClass.f1 = "";
  }
  public void method2() {

  }
}

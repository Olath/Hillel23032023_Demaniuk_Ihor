package UA.Hillel.Lesson09;

public class AnonClassEx {
  public static void main(String[] args) {
    CustomIface iface1 = new CustomIface() {
      @Override
      public int getNum() {
        return 10;
      }

      @Override
      public int increaseNum(int num) {
        return num + 10;
      }
    };

    System.out.println(iface1.getNum());
    System.out.println(iface1.increaseNum(5));

//    iface1 = () -> 290;
//    System.out.println(iface1.getNum());

  }
}

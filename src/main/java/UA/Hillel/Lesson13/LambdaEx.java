package UA.Hillel.Lesson13;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaEx {
  public static void main(String[] args) {
    MyIface iface = () -> {
      Random random = new Random();
      return random.nextInt();
    };
    iface.method1();

    MyIface iface2 = new MyIface() {
      @Override
      public int method1() {
        return 0;
      }
    };

//    Predicate<String> predicate = s -> s.contains("Java");

//    System.out.println(predicate.test("Java Automation"));
//    System.out.println(predicate.test("JavaScript Automation"));
//    System.out.println(predicate.test("Python Automation"));

//    Supplier <Integer> supplier = () -> new Random().nextInt();
    Supplier<Integer> supplier = iface2::method1;

//    System.out.println(supplier.get());
//    System.out.println(supplier.get());
//    System.out.println(supplier.get());


//    Consumer<Integer> consumer = i -> System.out.println(i);
//
//    consumer.accept(10);
//    consumer.accept(20);
//    consumer.accept(30);

    Function<String, Integer> function = Integer::valueOf;
//
//    System.out.println(function.apply("5") + function.apply("10"));

    funcMethod(() -> 10);
  }
  public static void funcMethod(MyIface iface) {
    iface.method1();
  }
}
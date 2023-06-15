package UA.Hillel.Lesson06;

import UA.Hillel.Lesson06.phone.*;

public class OopExample {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.setName("Lucifer");
    cat1.setAge(1);
    cat1.setColor("black");

    String name =  cat1.getName();
//
//    Cat cat2 = new Cat();
//    cat2.name = "Tom";
//    cat2.age = 3;
//    cat2.color = "white";
//
//    System.out.println(cat1.name);
//    System.out.println(cat2.name);
//
//    cat1.sayMeow();
//    cat2.sayMeow();

    Phone phone = new IPhone();
    phone.makeCall("1111");
    phone.receiveSms("1222", "text");

    Filming filming = new Camera();

    Filming filming1 = new AndroidPhone();
  }
}

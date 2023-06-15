package UA.Hillel.Lesson14;

import com.github.javafaker.Faker;

public class FakeUsers {

  public static void main(String[] args) {
    Faker faker = new Faker();
    for (int i=0; i<5; i++){
      String user = faker.name().firstName() + " " + faker.name().lastName();
      System.out.println(user);
    }
  }
}

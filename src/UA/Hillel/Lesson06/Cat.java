package UA.Hillel.Lesson06;

public class Cat {
  private String color;
  private String name;
  private int age;

  public void setColor(String color){
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor(){
    return color;
  }
  public void sayMeow() {
    System.out.println(name + " Meow");
  }
}

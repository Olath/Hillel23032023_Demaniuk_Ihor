package UA.Hillel.Lesson07;

import UA.Hillel.Lesson06.Cat;

public class MethodLib {
  // access_mod return_type name(parameters){

  //}
  //IsStatusActive

  public int methodWithoutReturn() {
    return 0;
//     System.out.println();
  }

  public void methodWithParams(String s, int i, boolean b) {

  }

  public Cat updateCat(Cat localCat) {
    localCat.setAge(localCat.getAge() + 4);
    return localCat;
  }

  public void createProducts(String... products) {
    System.out.println(products[0]);
    System.out.println(products[1]);
    System.out.println(products[2]);
  }

  public int convertInt(int i) {
    i = i + 10;
    return i;

  }

  public void methodWithVarArgs(int... i) {
    System.out.println(i);
  }

  public void giveDiscount(int discount){
    System.out.println(discount);
  }
  public void giveDiscount(double discount){
    System.out.println(discount);
  }
}

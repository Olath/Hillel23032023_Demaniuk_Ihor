package UA.Hillel.HomeWork.Home04;

import java.util.Arrays;
import java.util.Random;

public class AverageNumber {
  public static void main(String[] args) {
    int length = 20;
    int[] intArray = new int[length];
    int sum = 0;
    Random random = new Random();

    for (int tries = 0; tries < intArray.length; tries++){
      intArray[tries] = random.nextInt(100);
      sum += intArray[tries];

    }
    System.out.println("Array number are " + Arrays.toString(intArray));
    System.out.println("Sum is " + sum);
    System.out.println("Average is " + sum / length + "," + sum % length);
  }
}

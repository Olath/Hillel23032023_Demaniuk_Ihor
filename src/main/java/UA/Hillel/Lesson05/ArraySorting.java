package UA.Hillel.Lesson05;

import java.util.Arrays;
import java.util.Random;

public class ArraySorting {
  public static void main(String[] args) {
    int[] intArray = new int[10];
    Random random = new Random();

    for (int i = 0; i < intArray.length; i++){
      intArray[i] = random.nextInt(50);
    }
    System.out.println(Arrays.toString(intArray));

    boolean needSorting = true;

    while (needSorting){
      needSorting = false;

      for (int i = 0; i < intArray.length - 1; i++){
        if (intArray[i]>intArray[i+1]){
          int temp = intArray[i];
          intArray[i] = intArray [i + 1];
          intArray[i+1] = temp;
          needSorting = true;
        }
      }
    }
    System.out.println(Arrays.toString(intArray));
  }
}

package UA.Hillel.Lesson04;

import com.sun.jdi.Value;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
//        int[][] intArray22 = new int[5][5];
//        String[][] stringArray = new String[10][10];

//        double doubleArray[];

//        System.out.println(intArray);
//        System.out.println(Arrays.toString(intArray));
//        System.out.println(Arrays.toString(stringArray));

//        String[] categories = {"cat", "cat2", "cat3"};
//        System.out.println(Arrays.toString(categories));

        int[] intArrays = new  int [5];
//        System.out.println(Arrays.toString(intArrays));
//
        intArrays[1] = 10;
        intArrays[3] = 20;
//
//        System.out.println(Arrays.toString(intArrays));
//        int i = intArrays[1] + 5;
//        System.out.println(i);
//
//        for (int j = 0; j < intArrays.length; j++){
//            System.out.println(j + " Element in array"  + intArrays[j]);
//        }

//        for (int value : intArrays){
//            System.out.println("Old value " + value);
//            value += 10;
//            System.out.println("New value " + value);
//        }
        System.out.println(Arrays.toString(intArrays));

        String categories = " phone, notebook, tablet";
        String[] cats = categories.split(",");
        for (String category : cats) {
            System.out.println(category);
        }
    }
}

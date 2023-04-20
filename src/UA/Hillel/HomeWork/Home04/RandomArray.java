package UA.Hillel.HomeWork.Home04;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        Random random = new Random();

        int lengthOfArray = random.nextInt(2, 10);
        int[] intArray = new int [lengthOfArray];

        for (int i = 0; i < intArray.length; i++){
            int j = random.nextInt(100);
            System.out.println("Before change = " + j );
            if (j % 2 == 0){
                j = 0;
            }
            System.out.println("After change " + j);
        }
    }
}

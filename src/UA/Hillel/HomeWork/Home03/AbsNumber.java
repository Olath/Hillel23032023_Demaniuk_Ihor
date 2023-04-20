package UA.Hillel.HomeWork.Home03;

import java.util.Random;

public class AbsNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(-100, 101);
        int number2 = random.nextInt(-100, 101);

        System.out.println("Before : Number1 " + number1 + " Number2 " + number2);

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        System.out.println("After : Number1 " + number1 + " Number2 " + number2);

        if (number1>number2) System.out.println(number1 + " is bigger than " + number2);
        else System.out.println(number2 + " is bigger than " +number1);
    }
}

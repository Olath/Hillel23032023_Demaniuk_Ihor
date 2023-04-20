package UA.Hillel.HomeWork.Home03;

import java.util.Random;

public class CheckTriangle {
    public static void main(String[] args) {
        Random random = new Random();
        int leftSide = random.nextInt(1, 11);
        int rightSide = random.nextInt(1, 11);
        int floor = random.nextInt(10, 16);

        System.out.println("left side is " + leftSide + ", right side is " + rightSide + ", floor is " + floor);

        if (leftSide == rightSide) System.out.println("The triangle is isosceles (Sides are equal)");
        else if (leftSide == floor) System.out.println("The triangle is isosceles (Left side is equal to the floor)");
        else if (rightSide == floor) System.out.println("The triangle is isosceles (Right side is equal to the floor)");
        else System.out.println("The triangle is not isosceles");


    }
}

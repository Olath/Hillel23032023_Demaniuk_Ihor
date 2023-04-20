package UA.Hillel.HomeWork.Home02;

public class Circle {
    public static void main(String[] args) {
        int radius = 15;
        double area = Math.PI * (Math.pow(radius, 2));
//        System.out.println("The area of circle is " + area);
        System.out.printf("The area of circle is %.3f  %n", area);
    }
}

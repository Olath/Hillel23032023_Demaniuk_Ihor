package UA.Hillel.HomeWork.Home03;

public class CheckOddEven {
    public static void main(String[] args) {
        int first = (int)(Math.random() * 100);
        int second = (int)(Math.random() * 100);

        System.out.println("First number " + first);
        System.out.println("Second number " + second);
        System.out.println("Hello");

        if (first % 2 == 0) {
            System.out.printf("%nEven number " + first);
        } else if (second % 2 == 0) {
            System.out.printf("%nEven number " + second);
        } else if (first % 2 != 0){
            System.out.printf("%nOdd number " + first);
        } else {
            System.out.printf("%nOdd number " + second);
        }

        System.out.printf("%n%nBye");
    }
}

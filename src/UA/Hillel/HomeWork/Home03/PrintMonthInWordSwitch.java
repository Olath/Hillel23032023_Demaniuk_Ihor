package UA.Hillel.HomeWork.Home03;

import java.util.Random;

public class PrintMonthInWordSwitch {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(1 ,12);

        switch (month) {
            case 1 -> System.out.println(month + " January");
            case 2 -> System.out.println(month + " February");
            case 3 -> System.out.println(month + " March");
            case 4 -> System.out.println(month + " April");
            case 5 -> System.out.println(month + " May");
            case 6 -> System.out.println(month + " June");
            case 7 -> System.out.println(month + " July");
            case 8 -> System.out.println(month + " August");
            case 9 -> System.out.println(month + " September");
            case 10 -> System.out.println(month + " October");
            case 11 -> System.out.println(month + " November");
            case 12 -> System.out.println(month + " December");
            default -> System.out.println(month + " Such month doesn't exist");
        }
    }
}
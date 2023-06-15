package UA.Hillel.HomeWork.Home03;

import java.util.Random;

public class PrintMonthInWordIfElse {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(1 ,12);

        if (month == 1) System.out.println(month + " January");
        else if (month == 2) System.out.println(month + " February");
        else if (month == 3) System.out.println(month + " March");
        else if (month == 4) System.out.println(month + " April");
        else if (month == 5) System.out.println(month + " May");
        else if (month == 6) System.out.println(month + " June");
        else if (month == 7) System.out.println(month + " July");
        else if (month == 8) System.out.println(month + " August");
        else if (month == 9) System.out.println(month + " September");
        else if (month == 10) System.out.println(month + " October");
        else if (month == 11) System.out.println(month + " November");
        else if (month == 12) System.out.println(month + " December");
        else System.out.println(month + " Such month doesn't exist");

    }
}

package UA.Hillel.HomeWork.Home02;

public class Temperature {

    public static void main(String[] args) {
        double Celsius = 40.06;
        double Fahrenheit = ((Celsius * 9)/5) + 32;
        double Kelvin = Celsius + 273.15;

        System.out.println("Celsius is " + Celsius);
        System.out.printf("Fahrenheit is %.3f  %n", Fahrenheit);
        System.out.println("Kelvin is " + Kelvin);
    }
}

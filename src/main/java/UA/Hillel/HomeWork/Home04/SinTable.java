package UA.Hillel.HomeWork.Home04;

public class SinTable {
  public static void main(String[] args) {

    int lengthOfArray = 37;
    int[] sinArray = new int[lengthOfArray];

    for (int i = 0; i < sinArray.length; i++){

      sinArray[i] = i;
      sinArray[i] *= 10;

      System.out.println("Sine of " + sinArray[i] + " = " + Math.sin(sinArray[i]));
    }
  }
}

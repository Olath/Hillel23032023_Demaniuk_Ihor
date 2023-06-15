package UA.Hillel.HomeWork.Home04;

import java.util.Random;

public class PokerMachine {
  public static void main(String[] args) {
    String peter = "Peter";
    String jacob = "Jacob";
    String cloud = "Cloud";
    String will = "Will";

    Random random = new Random();

    String[] suits = {"hearts", "diamonds", "pikes", "clovers"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//    (int valueCover : suits) {
//      valueCover = random.nextInt(4);
//    }
//    System.out.println(Arrays.toString(suits));
//    System.out.println(Arrays.toString(ranks));
//    System.out.println((suits[random.nextInt(4)]) + " " + ranks[random.nextInt(/**/13)]);
//    String a = ((suits[random.nextInt(4)]) + " " + ranks[random.nextInt(13)]);
//    System.out.println(a);
    int i = 0;

    while (i < 5){
      i++;
      System.out.println(peter + " Received " + ((suits[random.nextInt(4)]) + " " + ranks[random.nextInt(13)]));
      System.out.println(jacob + " Received " + ((suits[random.nextInt(4)]) + " " + ranks[random.nextInt(13)]));
      System.out.println(cloud + " Received " + ((suits[random.nextInt(4)]) + " " + ranks[random.nextInt(13)]));
      System.out.println(will + " Received " + ((suits[random.nextInt(4)]) + " " + ranks[random.nextInt(13)]));
    }



  }
}

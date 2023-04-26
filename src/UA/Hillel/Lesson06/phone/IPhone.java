package UA.Hillel.Lesson06.phone;

public class IPhone extends Phone{
  @Override
  public void makeCall(String num) {
    System.out.println("Calling" + num + " From IPhone");
  }

  @Override
  public void playMusic() {

  }

  @Override
  public void playPodcast() {

  }

  @Override
  public void makeVideo() {

  }

  @Override
  public void makePhoto() {

  }

  @Override
  public void receiveCall(String num) {
    System.out.println("Calling " + num + "From Iphone");
  }


}

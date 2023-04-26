package UA.Hillel.Lesson06.phone;

public class AndroidPhone extends Phone{
  @Override
  public void makeCall(String num) {
    System.out.println("Calling" + num + " From Android");
  }

  @Override
  public void receiveCall(String num) {
    System.out.println("New CaLL" + num + " On Android");
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
}

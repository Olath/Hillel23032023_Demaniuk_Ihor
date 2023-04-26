package UA.Hillel.Lesson06.phone;

public class Ipod implements AudioAble{
  @Override
  public void playMusic() {
    System.out.println("Some Video is playing");
  }

  @Override
  public void playPodcast() {
    System.out.println("Plating some Podcast");
  }
}

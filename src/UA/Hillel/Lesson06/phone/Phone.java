package UA.Hillel.Lesson06.phone;

public abstract class Phone implements Filming, AudioAble{
  public abstract void makeCall(String num);
  public abstract void receiveCall(String num);

  public void sendSms(String num, String text) {
    System.out.println("Send sms to " + num + " with text:\n" + text);
  }
  public void receiveSms(String num, String text){
    enableGsmModule("ON");
    System.out.println("Receive sms from " + num + " with text:\n" + text);
    enableGsmModule("OFF");
  }

  private void enableGsmModule (String state){
    System.out.println("Setting Gsm to " + state);
  }
}

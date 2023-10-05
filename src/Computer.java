public class Computer
{
  public void playMusic()
  {   //behavior
    System.out.println("Music is now playing...");
  }
  public String getMeAPen(int cost)
  {
    if (cost < 10)
    {
      System.out.print("You don't have enough");
      return null;
    } else
    {
      System.out.print("Here you go!");
      return "You have enough money. Here's you Pen!";
    }
  }
  public static void main(String[] args)
  {
    Computer obj = new Computer();
    obj.playMusic();
    String str = obj.getMeAPen(8);
  }
}

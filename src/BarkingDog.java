public class BarkingDog {

  public static void main(String[] args) {
    shouldWakeUp (true, 1); // should return true
    shouldWakeUp (false, 2); // should return false since the dog is not barking.
    shouldWakeUp (true, 8); // should return false, since it's not before 8.
    shouldWakeUp (true, -1);
  }
  public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
    boolean shouldWake = false;
    if ((barking == true && hourOfDay < 8 && hourOfDay >= 0) || (barking == true && hourOfDay > 22 && hourOfDay <=23)) {
      shouldWake = true;
      System.out.println("Wake up!");
    }
    else if ((barking == true && hourOfDay < 0) ||
            (barking == true && hourOfDay > 23)) {
      shouldWake = false;
      System.out.println("Do not Wake!");
   }
    else {
      shouldWake =false;
      System.out.println("Do not Wake!");
    }
    return shouldWake;
  }
}

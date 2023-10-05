public class LeapYear {

  public static void main(String[] args) {
    //main
    isLeapYear(-1600);
    isLeapYear(1600);
    isLeapYear(2017);
    isLeapYear(2000);
  }
  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    } else if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else if (year % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
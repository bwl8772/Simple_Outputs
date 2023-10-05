public class LeapYearChecker {

  public static void main(String[] args) {
    System.out.println(isLeapYear(2000));  // Should print true (divisible by 400)
    System.out.println(isLeapYear(2024));  // Should print true (divisible by 4 but not by 100)
    System.out.println(isLeapYear(2021));  // Should print false (not divisible by 4)
    System.out.println(isLeapYear(1900));  // Should print false (divisible by 100 but not by 400)
    System.out.println(getDaysInMonth(2, 2020));  // Should print 29 (leap year)
    System.out.println(getDaysInMonth(2, 2021));  // Should print 28 (non-leap year)
    System.out.println(getDaysInMonth(4, 2021));  // Should print 30
    System.out.println(getDaysInMonth(9, 2021));  // Should print 30
    System.out.println(getDaysInMonth(13, 2021)); // Should print -1 (invalid month)
    System.out.println(getDaysInMonth(7, 10000)); // Should print -1 (invalid year)
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;  // Year is outside the valid range
    } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      return true;  // Leap year condition satisfied
    } else {
      return false;  // Not a leap year
    }
  }

  public static int getDaysInMonth(int month, int year) {
    if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
      return -1; // Invalid month or year
    }
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        return 31; // Months with 31 days
      case 4: case 6: case 9: case 11:
        return 30; // Months with 30 days
      case 2:
        return isLeapYear(year) ? 29 : 28; // February with 28 or 29 days (leap year)
      default:
        return -1; // Invalid month
    }
  }
}


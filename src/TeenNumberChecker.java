public class TeenNumberChecker {

  public static void main(String[] args) {
    isTeen(13);
    isTeen(9);
    hasTeen(9,99,19);
    hasTeen(23,15,42);
    hasTeen(22,23,34);
    System.out.println(isTeen(13));          // true
    System.out.println(isTeen(9));           // false
    System.out.println(hasTeen(9, 99, 19));  // true
    System.out.println(hasTeen(23, 15, 42)); // true
    System.out.println(hasTeen(22, 23, 34)); // false
  }

    public static boolean isTeen(int teen) {
      return (teen >=13 && teen <= 19);
    }
    public static boolean hasTeen(int first, int second, int third) {
      return (isTeen(first) || isTeen(second) || isTeen(third));
    }
  }


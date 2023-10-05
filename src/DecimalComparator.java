public class DecimalComparator {
  public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756)); // false
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));  // true
    System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));      // true
    System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));  // false
  }
  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    // Multiply both numbers by 1000 to keep three decimal places
    int scaledNum1 = (int) (num1 * 1000);
    int scaledNum2 = (int) (num2 * 1000);

    // Compare the scaled numbers for equality
    return scaledNum1 == scaledNum2;
  }
}

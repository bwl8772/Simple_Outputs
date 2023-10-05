public class WhileLoopChallenge {

  public static void main(String[] args) {
    //main
    evenInRange(5, 100);

  }
  public static boolean isEvenNumber (int number) {
    return number > 0 && number % 2 == 0;
  }
  public static void evenInRange(int start, int end) {
    int evenCount = 0;
    int oddCount = 0;
    if (start > end || end < 0 || start < 0) {
      System.out.println("Invalid Range");
      return;
    }

    while (start <= end) {
      boolean isEven = isEvenNumber(start);
      if (isEven){
        evenCount++;
        if (evenCount == 5) {
          break;
        }
      }else{
        oddCount++;
      }
      System.out.println(start);
      start++;
    }
    System.out.println("Number of even numbers: " + evenCount);
    System.out.println("Number of odd numbers: " + oddCount);
  }
}


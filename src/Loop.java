public class Loop {

  public static void main(String[] args) {
    // repeat this statement 4 times

    int i = 1;

    while (i <= 5) {
      System.out.println("Hi. Outer loop is " + i);
      int j = 1;
      while (j <= 3){
        System.out.println("Inner is, " + j);
        j++;
      }
      i++;
    }
    System.out.println("Yay! you did it!");
  }
}

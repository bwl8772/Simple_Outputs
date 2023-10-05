public class simple {

  public static void main(String[] args) {
    int x = 5;
    int y = 17;
    int z = 9;


    if (x > y && x > z) {
      System.out.print(x);
      System.out.println("X is greatest");
    } else if (y > x && y > z) {
      System.out.print(y);
      System.out.println("Y is greatest");
    } else {
      System.out.println(z);
      System.out.println("Z is greatest");
    }
  }
}

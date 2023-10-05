public class Commas {
  public static void main(String[] args) throws java.io.IOException {
    //Loop until a "S" is pressed
    int i;
    System.out.println("Press 's' to stop.");

    for( i =0; (char) System.in.read() != 's'; i++)
      System.out.println("Pass #" + i);
  }
}

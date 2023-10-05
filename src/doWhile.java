public class doWhile {

  public static void main(String[] args) throws java.io.IOException {
    char ch;

    do {
      System.out.print("Press a key followed by ENTER. Enter Q to Quit: ");
      ch = (char) System.in.read(); //get a char
    } while (ch != 'q');
  }
}


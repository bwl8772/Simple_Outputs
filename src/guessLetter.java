public class guessLetter {

  public static void main(String[] args) throws java.io.IOException {
    char ch, ignore, answer = 'k';

    do {
      System.out.println("I'm thinking of a lowercase letter between A and Z");
      System.out.print("Can you guess it? ");

      //read a character

      ch = (char) System.in.read();

      //discard any other charters in the input buffer
      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');

      // if user inputs correct character

      if (ch == answer) System.out.println("**** You're Right!! ****");

      // if not correct

      else {
        System.out.print("Sorry, you're ");

        if (ch < answer) System.out.println("too low");  //too low
        else System.out.println("too high"); // too high

        System.out.println("Please try again \n");
      }
    } while (answer != ch);
  }
}

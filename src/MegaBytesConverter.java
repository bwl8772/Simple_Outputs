public class MegaBytesConverter {
  public static void main(String[] args) {
    //main
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
  }

  public static void printMegaBytesAndKiloBytes(int kilobyte) {
    if (kilobyte < 0) {
      System.out.println("Invalid Value");
    } else if (kilobyte >= 0) {
      int megaBytes = (kilobyte/1024);
      int remainingkilobytes = ( kilobyte - (megaBytes * 1024));
      System.out.println(kilobyte + " KB" + " = " + megaBytes + " MB " + "and " +remainingkilobytes + "KB");
    }
  }
}

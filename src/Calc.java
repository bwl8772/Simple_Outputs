public class Calc {
  int num1;
  int num2;
  int result;  //these are instance variables

  public Calc() {
    num1= 5;
    num2= 5;
    System.out.println("in constructor");
  }
public Calc(int n) {
    num1 = n;
    num2 = n;
}

public Calc(double d, int n) {
    num1 = (int) d;
}

}


 class ObjectDemo {

  public static void main(String[] args) {

    Calc obj = new Calc(7.5, 9);   //constructor

    System.out.println(obj.num1);
  }

}
// Watch Tutorial: https://www.youtube.com/watch?v=s7UgQ7_1KQY&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=25

public class Calculator
{
  public static int add(int num1, int num2) {
    return num1 + num2;
  }

    public static void main(String[] args)
  {
      int num1=4;
      int num2=5;

      Calculator calc = new Calculator();

      int result = calc.add(num1,num2);

      System.out.println(result);
  }
}

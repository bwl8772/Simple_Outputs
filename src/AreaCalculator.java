public class AreaCalculator {

  public static void main(String[] args) {

    double radius = 4;
    double circleArea = area(radius);
    System.out.println("The area of the circle with a radius of " + radius + " is:" + circleArea);
    System.out.println("The area of a rectangle " + (radius * radius));
  }
  public static double area (double radius) {
    if (radius < 0) {
      return -1.0;
    }

    return radius * radius * Math.PI;
  }
  public static double area (double x, double y) {
    if (x < 0 || y < 0) {
      return -1.0;
    } return x*y ;
  }
}

public class Emp {

  int eid;
  int salary;
  String ceo;


  public void show()
  {
      System.out.println(eid + " : " + salary + " : " + ceo);
  }
}

class StaticDemo {

  public static void main(String[] args) {
    Emp navin = new Emp();
    navin.eid = 8;
    navin.salary = 4000;
    navin.ceo = "Mahesh";

    Emp rahul = new Emp();
    rahul.eid = 9;
    rahul.salary = 5000;
    rahul.ceo = "Mahesh";

    navin.show();
    rahul.show();

  }
}


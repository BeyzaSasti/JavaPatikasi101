package SalaryCalculator;

public class SalaryAccount {
 public static void main(String[] args) {

     // Objects / Nesneler

      Employee e1 = new Employee("Deniz D.", 8000.0, 49, 2010);
      Employee e2 = new Employee("Beyza B.", 9000.0, 50, 2009);

      e1.toPrintString();
      e2.toPrintString();
 }
}

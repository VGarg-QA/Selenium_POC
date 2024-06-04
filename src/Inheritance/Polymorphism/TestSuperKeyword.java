package Inheritance.Polymorphism;

 class Employee {

     Employee()
     {
         System.out.println("Employee Constructor");
     }

     Employee(int a)
     {
         System.out.println("a= "+a);
         System.out.println("Employee Constructor");
     }

     Employee(String str)
     {
         System.out.println("str= "+str);
         System.out.println("Employee Constructor");
     }
     int salary = 30000;
    void empWork() {  System.out.println("Employee Work"); }
    void calculateSalary() { System.out.println("Salary Calculated based on employee attendence"); }
}
 class Programmer extends Employee {

     Programmer()
     {
         super("testet");
         System.out.println("Programmers Constructor");
     }
     int bonus = 20000;
     int salary = 5000;
     void programmerWork() { System.out.println("Programmer Work");  }
     @Override
     void calculateSalary() { System.out.println("Salary Calculated based on Programmer attendence");  }
     void testMethodCall() {

         System.out.println("salary = "+salary);
         System.out.println("salary = "+super.salary); // super used to call parent class methods or member function.
         calculateSalary();
         super.calculateSalary();
     }
 }

    public class TestSuperKeyword {

        public static void main(String[] args) {

            Programmer p = new Programmer();

            Employee e = new Programmer(); //UP casting
            e.calculateSalary(); // refer to programmers method

        }
    }


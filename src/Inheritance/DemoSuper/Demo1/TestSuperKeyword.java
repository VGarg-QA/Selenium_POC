package Inheritance.DemoSuper.Demo1;

 class Employee {

     int salary = 30000;
    void empWork() {  System.out.println("Employee Work"); }
    void calculateSalary() { System.out.println("Salary Calculated based on employee attendence"); }
}
 class Programmer extends Employee {
     int bonus = 20000;
     int salary = 5000;

     void programmerWork() { System.out.println("Programmer Work");  }

     void calculateSalary() { System.out.println("Salary Calculated based on Programmer attendence");  }

     void testMethodCall() {

         System.out.println("salary = "+salary);
         System.out.println("salary = "+super.salary); // super used to call parent class methods or member function.
         calculateSalary();
         super.calculateSalary();
     }
 }

 class Tester extends  Programmer{

     int salary = 70000;

     void testMethodCall_2(){

         System.out.println("salary = "+super.salary); // It will refer to it immediate class member
         System.out.println("salary = "+salary);
     }


 }
    public class TestSuperKeyword {

        public static void main(String[] args) {

            Programmer p = new Programmer();
            System.out.println(p.bonus);
            System.out.println(p.salary);
            p.empWork();
            p.programmerWork();
            p.calculateSalary();
            p.testMethodCall();

            Tester T = new Tester();
            T.testMethodCall_2();


        }
    }


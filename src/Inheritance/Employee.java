package Inheritance;

public class Employee { // Parent Class

    int salary = 30000;

    void empWork()
    {
        System.out.println("Employee Work");
    }

}

class Programmer extends Employee {  // Child Class, then you access parent class members.

    int bonus = 20000;

    void programmerWork()
    {
        System.out.println("Programmer Work");
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);
        p.empWork();
        p.programmerWork();

    }
}

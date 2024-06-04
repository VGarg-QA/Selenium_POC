package Inheritance;

public class Employee1    // Parent Class
{
    int salary = 30000;

    void empWork()
    {
        System.out.println("Employee Work");
    }

}

class Programmer1 extends Employee     // Child Class, then you access parent class members.
{
    int bonus = 20000;

    void programmerWork() {
        System.out.println("Programmer Work");
    }

}

class   TestInheritance                    // We can create new class for main function as sometime mains function
                                           // doesn't work inside a class.
{
    public static void main(String[] args)
    {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);
        p.empWork();
        p.programmerWork();

    }
}

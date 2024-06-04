package Inheritance;

class Animal
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("Weep");
    }
}


public class TestMultiLevelInheritance
{
    public static void main(String[] args)
    {
        Animal A = new Animal();
        A.eat();

        Dog D = new Dog();
        D.bark();
        D.eat();

        BabyDog BD = new BabyDog();
        BD.weep();
        BD.bark();
        BD.eat();

    }
}

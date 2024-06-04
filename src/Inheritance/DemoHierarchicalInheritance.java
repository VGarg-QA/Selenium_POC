package Inheritance;

class Birds{
    void Fly()    {

        System.out.println("This bird can fly");
    }
}

class Sparrow extends Birds
{
    void sparrowColour()
    {
        System.out.println("Sparrow Colour is Brown");
    }

}
class Crow extends Birds
{
    void crowColour()
    {
        System.out.println("Crow Colour is Black");
    }

}

public class DemoHierarchicalInheritance
{
    public static void main(String[] args)
    {
        Birds B = new Birds();
        B.Fly();
        Sparrow S = new Sparrow();
        S.Fly();
        S.sparrowColour();
        Crow C = new Crow();
        C.Fly();
        C.crowColour();

    }

}

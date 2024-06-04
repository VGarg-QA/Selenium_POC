package Inheritance.Polymorphism;

public class Addition {
    int a;
    int b;

    void add()
    {
        int c;
        c = a+b;
        System.out.println("c= "+c);

    }

    public static void main(String[] args) {
        Addition ob = new Addition();
        ob.a = 11;
        ob.b = 22;
        ob.add();
    }
}

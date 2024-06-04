package AbstractionDemo;

public interface MyInterface {

    void start(); //public by default

    void run();

    default void myMethod1()
    {
        System.out.println("Default method can have a body here");
    }

    static void myMethod2()
    {
        System.out.println("static is used to make method that have body public");
    }
    private void myMethod3()
    {
        System.out.println("Private method can have a body here");
    }
}

class ChildInterface implements  MyInterface  // When we use interface then implements is used instead of extends for Inheritance
{
    // default scope by default
    public void run()  // OverRidden Methods
    {
        System.out.println("run");
    }
    public void start() // OverRidden Methods
    {
        System.out.println("start");
    }
}
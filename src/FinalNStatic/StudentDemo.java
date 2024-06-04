package FinalNStatic;

public class StudentDemo {

    public int  Rno;
    public String Name;
    public static String College = "ITC";

    public void display()
    {
        System.out.println("Rno = "+ Rno);
        System.out.println("Name = "+ Name);
        System.out.println("College = "+ College);
    }

    public static void staticMethod1()
    {
       // System.out.println("Rno = "+ Rno); // Non static not allowed
        //System.out.println("Name = "+ Name); // Non static not allowed
        System.out.println("College = "+ College); // static - allowed
        System.out.println("My static Method 1");
        staticMethod2(); // static allowed
        //nonStaticMethod1(); // Non-static not allowed
        //display(); // Non-static not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("My static Method 2");
    }

    public void nonStaticMethod1() // Non static  methods can call both static and non-static
    {
        System.out.println("Rno = "+ Rno);
        System.out.println("Name = "+ Name);
        System.out.println("College = "+ College);
        System.out.println("My static Method 1");
        staticMethod2();
        nonStaticMethod1();
        display();
        System.out.println("My non static Method");
    }

    public static void main(String[] args) {

        StudentDemo sd = new StudentDemo();

        // Static Method is called using class object
        sd.staticMethod1();
        sd.staticMethod2();

        // Static Method is called using class name
        StudentDemo.staticMethod1();
        StudentDemo.staticMethod2();

    }
}

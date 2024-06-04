package ClassesNConstructors;

public class MyClass
{
    // Below are the data member
    int a;
    double d;
    char c;
    String str;

    void display() // Member function or method
    {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" + str); // You cannot access the data member and member function with the object
        // To use these you have create an object of the class
        //classname ob = new classname();
        //ob.data_member
    }

    public static void main(String[] args)
    {

        MyClass ob =new MyClass();
        ob.a= 11;
        ob.d = 11.34;
        ob.c = 'h';
        ob.str = "Vishal";
        ob.display();

    }

}

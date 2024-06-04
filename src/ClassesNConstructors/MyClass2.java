package ClassesNConstructors;

public class MyClass2
{
    // Below are the data member
    int a;
    double d;
    char c;
    String str;

    MyClass2() {

        a = 33;
        d=33.33;
        c = 'f';
        str = "Test it ";
    }

    void display() // Member function or method
    {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" + str);
        // You cannot access the data member and member function without the object
        // To use these you have created an object of the class
        //classname ob = new classname();
        //ob.data_member
    }

    public static void main(String[] args)
    {

        MyClass2 ob =new MyClass2();
        ob.a = 89;
        ob.d = 120183;
        ob.c ='f';
        ob.str = "Amol";
        ob.display();
        // This will give null values to user.
        // these values comes due to constructor.

    }

}

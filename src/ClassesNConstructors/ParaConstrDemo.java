package ClassesNConstructors;

public class ParaConstrDemo {
    // Below are the data member
    int a;
    double d;
    char c;
    String str;

    ParaConstrDemo(int a1, double d1, char c1, String str1) {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }

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

    public static void main(String[] args) {
        ParaConstrDemo ob = new ParaConstrDemo(23, 34.33, 'h', "text");
        ob.display();

    }
}




package ClassesNConstructors;

public class MyClass1 {

    int a;
    double d;
    char c;
    String str;

    void display() {

        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x=10;

        MyClass1 ob1 = new MyClass1();
        ob1.a = 89;
        ob1.d = 120183;
        ob1.c ='f';
        ob1.str = "Amol";
        ob1.display();

        MyClass1 ob2 = new MyClass1();
        ob2.a = 89;
        ob2.d = 120183;
        ob2.c ='f';
        ob2.str = "Amol";
        ob2.display();


    }
}

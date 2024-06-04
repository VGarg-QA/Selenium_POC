package ClassesNConstructors;

public class MyClass5 {
        int a;
        double d;
        char c;
        String str;

        MyClass5(int a, double d, char c, String str)
        {
            this.a = a; //data member and a=a; displays local variable.
            this.d= d;
            this.c = c;
            this.str = str;
        }

        void display() // Member function or method
        {
            System.out.println("a=" + a);
            System.out.println("d=" + d);
            System.out.println("c=" + c);
            System.out.println("str=" + str);
        }

        public static void main(String[] args)
        {

            MyClass5 ob =new MyClass5(23,34.23,'g',"TestTestTest");
            ob.display();
        }

    }

package ClassesNConstructors;

public class MyClass4 {
        int a;
        double d;
        char c;
        String str;

        MyClass4(int a1, double d1, char c1, String str1)
        {
            a = a1;
            d= d1;
            c = c1;
            str = str1;
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

            MyClass4 ob =new MyClass4(23,34.23,'g',"TestTestTest");
            ob.display();
        }

    }

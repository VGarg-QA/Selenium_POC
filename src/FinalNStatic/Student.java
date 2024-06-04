package FinalNStatic;

import io.netty.channel.unix.Socket;

public class Student {

    int  Rno;
    String Name;
    static String College = "ITC";

    void display()
    {
        System.out.println("Rno = "+ Rno);
        System.out.println("Name = "+ Name);
        System.out.println("College = "+ College);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.Rno = 1;
        s1.Name = "Dipti";


        s2.Rno = 2;
        s2.Name = "Vishnu";
        s2.College = "Pune College";

        s3.Rno = 3;
        s3.Name = "Gowari";

        Student.College = "PICT"; // you can call using class also no need of object.


        s1.display();
        s2.display();
        s3.display();

    }
}

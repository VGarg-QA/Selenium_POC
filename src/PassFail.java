import java.util.Scanner;

public class PassFail {

    public static void main(String[] Args)
    {
        float marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student marks : ");
        marks = sc.nextFloat();

        if(marks>=75 && marks<=100)
            System.out.println("Student pass with Distinction");
        else if(marks>=60 && marks<75)
            System.out.println("Student pass with First-Class");
        else if(marks>=50 && marks<60)
            System.out.println("Student pass with Second-Class");
        else if(marks>=40 && marks<50)
            System.out.println("Student is Pass");
        else if(marks<40)
            System.out.println("Student is Failed");
    }
}

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        double F, multi=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Factorial Number : ");
        F = sc.nextDouble();

        for(double i=F;i>=1;i--)
        {
            multi = multi * i;
        }
        System.out.println("Factorial = "+ multi);
    }
}

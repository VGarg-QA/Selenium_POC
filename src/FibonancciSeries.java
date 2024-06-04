import java.util.Scanner;

public class FibonancciSeries
{
    public static void main(String[] args)
    {
        int a=0, b=1, n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();

        System.out.print(a+" "+b); //remove 'ln' so that number remain in one line.

        for(int i=3;i<=n;i++)
        {
            sum = a+b;
            System.out.print(" "+ sum);
            a=b;
            b=sum;
        }
    }
}

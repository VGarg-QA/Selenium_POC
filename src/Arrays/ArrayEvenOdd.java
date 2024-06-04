package Arrays;

public class ArrayEvenOdd
{
    public static void main(String[] args)
    {
        int [] a = {22,11,33,44,55,66,77,88,99,345,87,90,14,110,94};

         //int l =d.length; // length is the instance variable


        for (int i=0; i<a.length; i++)
        {
            if(a[i] % 2 ==0)
                System.out.println(a[i]+ " Even");
            else
            System.out.println(a[i]+ " Odd");
        }

    }
}

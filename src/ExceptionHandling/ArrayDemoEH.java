package ExceptionHandling;

public class ArrayDemoEH {

    public static void main(String[] args) {

        int [] a = new int[5];

        a[0] = 11;
        a[1] = 62;
        a[2] = 23;
        a[3] = 43;
        a[4] = 91;

        try
        {
            a[5] = 31;
        }
        catch (Exception e)
        {
            System.out.println("Inside Catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace(); // function that print the error detials
        }


        for(int i=0; i< a.length; i++)
            System.out.println(a[i]);

        System.out.println("End of the Program");
    }
}

package Arrays;

public class ArrayIntDemo
{
    public static void main(String[] args)
    {
        double[] d = new double[5];
         d[0] = 12.56;
         d[1] = 42.323;
         d[2] = 11.84;
         d[3] = 50.34;
         d[4] = 34.36;

         int l =d.length; // length is the instance variable

        //normal for loop

        for (int i=0; i<d.length; i++)
            System.out.println(d[i]);

        //for each loop

        /*for (double x:d)
            System.out.println(x);*/


    }
}

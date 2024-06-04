package Arrays;

public class Array2D
{
    public static void main(String[] args) {
        int [][] a = {{0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}, {4,4,4} };

        int row = a.length;
        int col = a[0].length;
        System.out.println("row= "+row);
        System.out.println("col= "+col);

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++ )
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}

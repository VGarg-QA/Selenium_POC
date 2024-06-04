package Arrays;

public class Array2DInt {
    public static void main(String[] args) {

        int [][] a = new int [4][3];

        a[0][0] = 23;
        a[0][1] = 43;
        a[0][2] = 47;

        a[1][0] = 33;
        a[1][1] = 53;
        a[1][2] = 67;

        a[2][0] = 43;
        a[2][1] = 63;
        a[2][2] = 77;

        a[3][0] = 53;
        a[3][1] = 93;
        a[3][2] = 87;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row= " + row);
        System.out.println("col= " + col );

        for(int i=0;i<row;i++) //row
        {
            for(int j=0;j<col;j++) //col
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

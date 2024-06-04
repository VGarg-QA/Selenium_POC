package Arrays;

public class Array2DString // curly bracket array method
{

            public static void main(String[] args)
            {

            String[][] a = {
                    {"Amol", "Ankita", "Ankit"},
                    {"Amolly", "Vishal", "Nagma"},
                    {"Praveen", "Satya", "Vikash"},
                    {"Anand", "Rohit", "Rahul"},
                    {"Soham", "Arpit", "Garvit"}
            };

            int row = a.length;
            int col = a[0].length;

            System.out.println("row= " + row);
            System.out.println("col= " + col);

            for (int i = 0; i < row; i++) //row
            {
                for (int j = 0; j < col; j++) //col
                {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }


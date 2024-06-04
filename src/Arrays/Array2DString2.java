package Arrays;

public class Array2DString2 {
    public static void main(String[] args) {

         String[][] stArr = {
                 {"Amol", "Ankita", "Ankit"},
                 {"Amolly", "Vishal", "Nagma"},
                 {"Praveen", "Satya", "Vikash"},
                 {"Anand", "Rohit", "Rahul"},
                 {"Soham", "Arpit", "Garvit"}
         };

        for (int i = 0; i < stArr.length; i++) //row
        {
            for (int j = 0; j < stArr[0].length; j++)//col
            {
                System.out.print(stArr[i][j] + "\t");
            }
            System.out.println();

            }

        }
    }
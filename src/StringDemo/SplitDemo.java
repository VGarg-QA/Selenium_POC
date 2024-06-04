package StringDemo;

public class SplitDemo {
    public static void main(String[] args) {

        /*String str = "We want to go to Torranto so that i can call tom over there";

        // print only the word whose 2nd char is 'o'

        String[] stArr = str.split(" "); // split returns array

        for (int i = 0; i < stArr.length; i++) {  //length() comes when we want to find length of string not for array

            String temp = stArr[i];
            int l = temp.length();

            if (l >= 2) {
                if (temp.charAt(1) == 'o')
                    System.out.println(stArr[i]);*/

                String str ="tom why are you too late and so lazy"; //print only the word whose second char is 'o'
                String [] stArr = str.split(" ");

                for(int i=0; i < stArr.length; i++)
                {
                    String temp =stArr[i];
                    int l = temp.length();

                    if(l >=2) {
                        if(temp.charAt(1)== 'o')
                            System.out.println(stArr[i]);



                }


        /*String str = "Hey Baby you are so lovely";

        //print only words that ends with y

        String[] stArr = str.split(" ");

        for (int i=0; i< stArr.length; i++)
        {                                                 |
          -----String temp = stArr[i];                    |      if(stArr[i].endsWith("y");
            -----int l = temp.length();                   |      System.out.println(stArr[i]);
            ----if (temp.charAt(l-1)=='y')                |
            {
                    ------System.out.println(stArr[i]);*/

            }
        }
    }

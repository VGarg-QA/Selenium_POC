package StringDemo;

import java.util.Scanner;

public class StringCaseReverseRandom {

    public static void main(String[] args) {

        char ch;
        String str = "This is My NAME";
        System.out.println(str);

        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i) ==' ')
                System.out.print(" ");

            if(str.charAt(i)>=65 && str.charAt(i)<=90)// for upper to lower
            {
                int temp = str.charAt(i) + 32;
                ch = (char) temp;
                System.out.print(ch);
            }

            else if(str.charAt(i)>=97 && str.charAt(i)<=122)// for lower to upper
            {
                int temp = str.charAt(i) - 32;
                ch = (char) temp;
                System.out.print(ch);
            }


        }

    }
}

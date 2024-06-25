package Interview;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class FirstLetterUpper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.print("You have entered : " + str + "\n");

       // Check if the input string is not empty
        if (!str.isEmpty()) {
            // Get the first character and convert it to uppercase
            String firstLetterUpper = str.substring(0, 1).toUpperCase() + str.substring(1);

            System.out.println("String with first letter capitalized: " + firstLetterUpper);
        } else {
            System.out.println("Input string is empty.");
        }

        sc.close();
    }
}



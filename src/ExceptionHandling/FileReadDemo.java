package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public interface FileReadDemo {

    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            FileInputStream fis = new FileInputStream("D:\\test file1.txt");
        }
        catch(Exception e)
        {
            System.out.println("Inside Catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace(); // function that print the error detials
        }

        System.out.println("File exists and read successfully");

    }
}

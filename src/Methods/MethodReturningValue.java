package Methods;

import net.bytebuddy.TypeCache;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodReturningValue {

    int myMethod()
    {
        int x;
        x=90;
        return x;
    }

    char myCharMethod()
    {
        char x;
        x='h';
        return x;
    }

    double myDoubleMethod()
    {
        double x;
        x= 56.92;
        return x;
    }

    boolean checkResult(int marks)
    {
        if(marks<40)
            return false;
        else
            return true;
    }

    String reverseMyString (String ss)
    {
        String temp = "";

        for (int i=ss.length()-1; i>=0 ;i--)
        {
            temp = temp + ss.charAt(i);
        }
        return temp;
    }

    //Given date in string in "dd-MM-yyyy format, convert it into a string with MM/DD/YYYY format"

    String convertDateFormat(String myDateStr) throws ParseException //dd-MM-yyyy
    {
        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sd1.parse(myDateStr);

        SimpleDateFormat sd2 = new SimpleDateFormat("MM/dd/yyyy");
        String convertedDate = sd2.format(date);

        return convertedDate;
    }

    int[] getMyArray()
    {
        int [] arr = {12,23,234,11,24,26,8765,557};
        return arr;
    }

    String[][] getMYTwoDArray()
    {
        String[][] st = { {"Apple", "Banana", "Cherry", "Date", "Elderberry"},
                {"Fig", "Grape", "Honeydew", "Iced Tea", "Jackfruit"},
                {"Kiwi", "Lemon", "Mango", "Nectarine", "Orange"},
                {"Papaya", "Quince", "Raspberry", "Strawberry", "Tomato"}};

        return st;
    }


    public static void main(String[] args) {

        int a;
        a=10;
        System.out.println(a);

        int b=a;
        System.out.println(b);

        MethodReturningValue ob = new MethodReturningValue();
        System.out.println(ob.myMethod());

        int c = ob.myMethod();
        System.out.println(ob.checkResult(65));

        System.out.println(ob.reverseMyString("Vishal"));

        int[] myArr = ob.getMyArray();
        for(int i=0; i<myArr.length; i++)
        {
            System.out.println(myArr[i]);
        }


        System.out.println("below is my Two D Array");
        String [][] myStrArr = ob.getMYTwoDArray();
        for(int i=0; i<myStrArr.length; i++)
        {
            for(int j=0; j<myStrArr[0].length; j++)
            {
                System.out.print(myStrArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

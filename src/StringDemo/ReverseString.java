package StringDemo;

public class ReverseString
{
    public static void main(String[] args)
    {
            String orgStr = "global";
            String revStr = "";

            for (int i=0 ; i < orgStr.length();i++)
            {
                revStr = orgStr.charAt(i) + revStr;
            }
            System.out.println("Reversed String : " + revStr);
        }
    }




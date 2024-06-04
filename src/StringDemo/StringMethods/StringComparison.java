package StringDemo.StringMethods;

public class StringComparison
{
    public static void main(String[] args)
    {
        String str1 = "vishal";
        String str2 = "vishal";
        String str3 = "Vishal";
        String str4 = "Amol";
        String str5 = new String("vishal");

        // String is not primitive, and it can't be compared as a==b

        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));






    }
}

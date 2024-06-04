package StringDemo;

public class StringsMethods {
    public static void main(String[] args) {


        String str1 = "vishal";
        String str2 = "vishal";
        String str3 = "Vishal";
        String str4 = "Amol";
        String str5 = new String("vishal");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

    }
}
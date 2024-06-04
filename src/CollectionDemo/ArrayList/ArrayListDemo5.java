package CollectionDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

       al.add("Test name 1");
        al.add("Vishal");
        al.add("Garg");
        al.add("Soham");
        al.add("Laksh");
        al.add("Arpit");
        al.add("Garvit");
        al.add("Test name 2");
        al.add("Test name 3");
        al.add("Test name 4");

        System.out.println("al=" + al);

        ArrayList<String> al2 = new ArrayList<>();

        System.out.println("al2=" + al2);

        al2.add("Vishal");
        al2.add("Garg");
        al2.add("Soham");
        al2.add("Laksh");
        al2.add("Arpit");
        al2.add("Vaishali");
        al2.add("Akash Garg");
        al2.add("Jain");
        al2.add("Anand");
        al2.add("Gupta");
        al2.add("Yes");
        al2.add("NO");
        al2.add("ddSoham");
        al2.add("Lddaksh");
        al2.add("Arpddit");


        System.out.println("al2=" + al2);

        al2.removeAll(al); // To remove common elements between two collection.

        System.out.println("al2=" + al2);











    }
}

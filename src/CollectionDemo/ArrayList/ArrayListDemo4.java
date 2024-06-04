package CollectionDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {

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

        al2.addAll(al); // To add all the data from above to different list.

        System.out.println("al2=" + al2);







    }
}

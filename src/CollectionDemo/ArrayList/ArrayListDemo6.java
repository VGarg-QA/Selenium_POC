package CollectionDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo6 {

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

        al.remove(5); // To remove element from list in collection.
     al.remove("Test name 2");

     System.out.println("al=" + al);












    }
}

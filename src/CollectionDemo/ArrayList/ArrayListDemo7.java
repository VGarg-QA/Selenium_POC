package CollectionDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo7 {

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

        // Remove all elements having string with size = 5
        // -> predicate symbol

        al.removeIf(str -> str.length() == 5);

        System.out.println("al=" + al);







    }
}

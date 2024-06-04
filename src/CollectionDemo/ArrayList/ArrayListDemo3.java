package CollectionDemo.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

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

        System.out.println(al);

        al.set(3,"updated value"); // to update the value at any specific index

        System.out.println(al);



    }
}

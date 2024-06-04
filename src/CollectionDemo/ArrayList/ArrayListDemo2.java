package CollectionDemo.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // True as data is empty

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

        System.out.println(al.isEmpty()); // False as data is not empty

        System.out.println(al);

        al.clear(); // To clear all the inputs.

        System.out.println(al);

        //System.out.println(al.get(6)); // to print specific element at that index
        System.out.println("size= " + al.size()); // size of array = 10
        System.out.println("Using for loop.................");

        for(int i=0 ;i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using each for loop.................");

        for (String str: al)         // for each for loop.
            System.out.println(str);

        System.out.println("Using Iterator....................");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());



    }
}

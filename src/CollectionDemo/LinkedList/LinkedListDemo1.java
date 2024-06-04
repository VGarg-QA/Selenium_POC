package CollectionDemo.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Raj");
        ll.add("Anita");
        ll.add("Priya");
        ll.add("Amit");
        ll.add("Sneha");
        ll.add("Rohan");
        ll.add("Neha");
        ll.add("Kiran");
        ll.add("Ravi");
        ll.add("Pooja");
        ll.add("Manoj");
        ll.add("Deepa");
        ll.add("Suresh");
        ll.add("Rekha");
        ll.add("Vijay");
        ll.add("Sunita");
        ll.add("Arun");
        ll.add("Kavita");
        ll.add("Nikhil");
        ll.add("Divya");
        ll.add("Rahul");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);









    }
}

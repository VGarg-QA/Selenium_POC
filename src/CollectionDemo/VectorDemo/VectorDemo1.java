package CollectionDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("capacity = " + v.capacity());  // 10 default capacity
        System.out.println("Size = " + v.size()); // 0


        v.add("Raj");
        v.add("Anita");
        v.add("Priya");
        v.add("Amit");
        v.add("Sneha");
        v.add("Rohan");
        v.add("Neha");
        v.add("Kiran");
        v.add("Ravi");
        v.add("Pooja");
        v.add("Manoj");
        v.add("Deepa");
        v.add("Suresh");
        v.add("Rekha");
        v.add("Vijay");
        v.add("Sunita");
        v.add("Manoj");
        v.add("Deepa");
        v.add("Suresh");
        v.add("Rekha");
        v.add("Vijay");
        v.add("Sunita");

        System.out.println("============================================================");
        System.out.println("capacity = " + v.capacity());  // 40 default capacity
        System.out.println("Size = " + v.size()); // 22

        System.out.println(v);

        // How to print using Iterator.
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // How to print using Enmeration.
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}

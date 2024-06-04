package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();

        hs.add("Raj");
        hs.add("Anita");
        hs.add("Priya");
        hs.add("Amit");
        hs.add("Sneha");
        hs.add("Rohan");
        hs.add("Neha");
        hs.add("Kiran");
        hs.add("Ravi");
        hs.add(10);
        hs.add(null);

        System.out.println(hs.add("Raj"));
        System.out.println(hs);
                
    }
}

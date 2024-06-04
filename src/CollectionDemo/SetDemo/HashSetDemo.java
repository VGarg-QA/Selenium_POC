package CollectionDemo.SetDemo;

import java.lang.ref.SoftReference;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

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

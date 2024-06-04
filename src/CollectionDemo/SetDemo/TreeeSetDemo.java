package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeeSetDemo {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet<>();

        ts.add("Raj");
        ts.add("Anita");
        ts.add("Priya");
        ts.add("Amit");
        ts.add("Sneha");
        ts.add("Rohan");
        ts.add("Neha");
        ts.add("Kiran");
        ts.add("Ravi");
        //ts.add(10);
        //ts.add(null);

        System.out.println(ts.add("Raj"));
        System.out.println(ts);

    }
}

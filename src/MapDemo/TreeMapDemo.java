package MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>(); // TreeMap are sorted based on the keys

        tm.put(12, "lavi");
        tm.put(22, "Hari");
        tm.put(23, "lavi");
        tm.put(34, "Ramesh");
        tm.put(132, "Suresh");
        tm.put(54, "Vaishali");

        System.out.println("hm = " + tm);


    }

}

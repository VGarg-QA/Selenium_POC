package MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();


        lhm.put(12, "lavi");
        lhm.put(22, "Hari");
        lhm.put(23, "lavi");
        lhm.put(34, "Ramesh");
        lhm.put(132, "Suresh");
        lhm.put(54, "Vaishali");

        System.out.println("hm = " + lhm);


    }

}

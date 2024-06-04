package MapDemo;

import java.util.HashMap;

public class HasMapPutAll {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(12, "lavi");
        hm.put(22, "Hari");
        hm.put(23, "lavi");
        hm.put(34, "Ramesh");
        hm.put(132, "Suresh");
        hm.put(54, "Vaishali");

        System.out.println("hm = " + hm);

        HashMap<Integer, String> hm1 = new HashMap<>();

        System.out.println("hm1 = " + hm1);

        hm1.putAll(hm); // copy all value from one map to another

        System.out.println("hm1 = " + hm1);

    }

}

package MapDemo;

import java.util.HashMap;

public class HasMap3 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(12, "lavi");
        hm.put(22, "Hari");
        hm.put(23, "lavi");
        hm.put(34, "Ramesh");
        hm.put(132, "Suresh");
        hm.put(54, "Vaishali");

        System.out.println("hm = " + hm);

        System.out.println(hm.get(23));
        hm.remove(34);

        System.out.println("hm = " + hm);




    }

}

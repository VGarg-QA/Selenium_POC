package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMap5 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(12, "lavi");
        hm.put(22, "Hari");
        hm.put(23, "lavi");
        hm.put(34, "Ramesh");
        hm.put(132, "Suresh");
        hm.put(54, "Vaishali");

        System.out.println("hm = " + hm);

        Set s = hm.keySet();
        System.out.println(s);

        Collection c = hm.values();
        System.out.println(c);

        Set entrySet = hm.entrySet();
        System.out.println(entrySet);
        


    }

}

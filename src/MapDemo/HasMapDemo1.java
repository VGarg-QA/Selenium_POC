package MapDemo;

import java.util.HashMap;

public class HasMapDemo1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(12, "lavi");
        hm.put(22, "Hari");
        hm.put(23, "lavi");
        hm.put(34, "Ramesh");
        hm.put(132, "Suresh");
        hm.put(54, "Vaishali");
        hm.put(24.56, '6');
        hm.put(null, true);
        hm.put(86, null);



        System.out.println(hm);

        hm.put(24,"Vishal");

        System.out.println(hm);


    }
}

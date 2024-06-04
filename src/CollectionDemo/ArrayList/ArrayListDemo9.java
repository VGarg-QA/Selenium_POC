package CollectionDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(45);
        al.add(12);
        al.add(67);
        al.add(89);
        al.add(34);
        al.add(56);
        al.add(78);
        al.add(90);
        al.add(21);

        System.out.println("al=" + al);

        // 1. Remove all elements which are odd numbers.
        // 2. Remove all elements which are less than 50.
        // -> predicate symbol

        // 1. al.removeIf(number -> number % 2 != 0 );

        al.removeIf(number -> number < 50);
        System.out.println("al=" + al);









    }
}

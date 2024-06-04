package CollectionDemo.ArrayList;

import java.util.ArrayList;
import java.util.Set;

public class RemoveIfCharDemo {
    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');
        al.add('p');

        //remove all vowels in above list

       // al.removeIf(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' );
        // al.removeIf(ch -> "aeiou".indexOf(ch) >=0);
       // al.removeIf(ch -> Set.of('a', 'e', 'i', 'o', 'u').contains(ch));
        System.out.println("al=" + al);



    }
}

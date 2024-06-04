package CollectionDemo.QueDemo;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDQueDemo1 {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(34);
        adq.offer(10);
        adq.offer(20);
        adq.offer(15);
        adq.offer(22);
        adq.offer(11);
        adq.offer(33);
        adq.offer(93);

       // print as it is

        System.out.println(adq);
        //System.out.println(adq.poll());

        adq.addFirst(0);
        adq.addLast(100);

        System.out.println(adq);

        adq.pollFirst(); // Remove first
        adq.pollLast();  // remove last


    }
}

package CollectionDemo.QueDemo;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Iterator;

public class PriorityQueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(34);
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.offer(22);
        pq.offer(11);
        pq.offer(33);
        pq.offer(93);

        // 10, 11, 15, 20, 22, 33,34, 93

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}

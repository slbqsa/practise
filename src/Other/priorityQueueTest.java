package Other;

import java.util.PriorityQueue;

public class priorityQueueTest {
    public static void main(String[] args) {
        //优先队列
        PriorityQueue pq = new PriorityQueue();
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);
        while (pq.peek() != null) {
            System.out.print(pq.poll() + " ");
        }
    }
}

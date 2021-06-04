package chapter5;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(6);
        queue.add(-3);
        queue.add(20);
        queue.add(18);
        System.out.println(queue);
        System.out.println(queue.poll());
    }
}

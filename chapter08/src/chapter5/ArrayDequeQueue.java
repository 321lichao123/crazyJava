package chapter5;

import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();
        deque.add("abc");
        deque.add("def");
        deque.add("ghi");
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
    }
}

package chapter5;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.offer("abc");
        list.push("def");
        list.offerFirst("ghi");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*****************");
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println("*****************");
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println("*****************");
        System.out.println(list.pollLast());
        System.out.println(list);
    }
}

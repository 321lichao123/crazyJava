package chapter3;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("abc");
        linkedHashSet.add("def");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("abc");
        linkedHashSet.add("abc");
        System.out.println(linkedHashSet);
    }
}

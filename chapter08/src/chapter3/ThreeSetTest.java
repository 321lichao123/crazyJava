package chapter3;

import java.util.TreeSet;

public class ThreeSetTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(5);
        set.add(2);
        set.add(10);
        set.add(-9);
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(4));
        System.out.println(set.tailSet(4));
        System.out.println(set.subSet(-3, 4));
    }
}

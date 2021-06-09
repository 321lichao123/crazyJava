package chapter4;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>(
                new Comparator<Object>() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return hashCode() > o2.hashCode() ? 1
                                : hashCode() < o2.hashCode() ? -1 : 0;
                    }
                }
        );
        set1.add("hello");
        set1.add("abc");
        System.out.println(set1);

        TreeSet<String> set2 = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.hashCode() > o2.hashCode() ? 1
                                : o1.hashCode() < o2.hashCode() ? -1 : 0;
                    }
                }
        );
        set2.add("hello");
        set2.add("abc");
        System.out.println(set2);

    }
}

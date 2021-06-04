package chapter3;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {
    public static void main(String[] args) {
        Collection set = new HashSet();
        set.clear();
        set.add(Season.SPRING);
        set.add(Season.WINTER);
        EnumSet enumSet = EnumSet.copyOf(set);
        System.out.println(enumSet);
        set.add("abc");
        System.out.println(set);
        enumSet = EnumSet.copyOf(set); // ava.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Enum

    }
}

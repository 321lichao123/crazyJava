package chapter3;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTest2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("abc");
        set.add(new Date()); // java.lang.ClassCastException: java.lang.String cannot be cast to java.util.Date
    }
}

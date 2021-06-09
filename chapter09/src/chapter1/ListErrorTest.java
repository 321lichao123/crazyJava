package chapter1;

import java.util.ArrayList;

public class ListErrorTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("疯狂Java讲义");
        list.add("疯狂Ajax讲义");
        // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        list.add(new Integer(3));
        list.forEach(value -> System.out.println(((String) value).length()));
    }
}

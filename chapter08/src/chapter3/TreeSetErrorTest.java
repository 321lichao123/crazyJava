package chapter3;

import java.util.TreeSet;

class E{}

public class TreeSetErrorTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new E());
        treeSet.add(new E()); //java.lang.ClassCastException: chapter3.E cannot be cast to java.lang.Comparable
    }
}

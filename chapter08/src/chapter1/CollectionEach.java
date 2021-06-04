package chapter1;

import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("def");
        set.add("ghi");
        set.forEach(item -> System.out.println("迭代集合元素：" + item));
    }
}

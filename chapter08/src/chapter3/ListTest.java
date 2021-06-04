package chapter3;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new String("轻量Java EE企业应用实战"));
        list.add(new String("疯狂Java讲义"));
        list.add(new String("疯狂Android讲义"));
        System.out.println(list);
        list.add(1, new String("疯狂Ajax讲义"));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf(new String("疯狂Ajax讲义")));
        list.set(1, new String("疯狂Java讲义"));
        System.out.println(list);
        System.out.println(list.subList(1, 2));
    }
}

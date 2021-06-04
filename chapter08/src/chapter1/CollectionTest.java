package chapter1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add("孙悟空");
        list.add(6);
        System.out.println("list集合的个数：" + list.size());
        list.remove(new Integer(6));
        System.out.println("list集合的个数：" + list.size());
        System.out.println("list是否包含\"孙悟空\"字符串：" + list.contains("孙悟空"));
        list.add("abc");
        System.out.println(list);
        HashSet set = new HashSet();
        set.add("abc");
        set.add("def");
        System.out.println("list集合是否包含set集合：" + list.containsAll(set));
        // list集合减去set集合
        list.removeAll(set);
        System.out.println("list里面的集合：" + list);
        // 清空list集合
        list.clear();
        System.out.println("list里面的集合：" + list);
        // 控制set集合里只剩list集合里也包含的匀速
        set.retainAll(list);
        System.out.println("set集合的元素：" + set);
    }

    @Test
    public void test2() {

    }
}

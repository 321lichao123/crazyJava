package chapter1;

import org.junit.Test;

import java.sql.SQLOutput;
import java.time.Instant;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IteratorTest {
    @Test
    public void test1() {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("def");
        set.add("ghi");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println(next);
            if (next == "def") {
                iterator.remove();
            }
            next = "测试字符";
        }
        System.out.println(set);
    }

    @Test
    public void test2() {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("def");
        set.add("ghi");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String next = (String) it.next();
            if (next.equals("def")) {
                set.remove(next); // java.util.ConcurrentModificationException
            }
        }
    }

    @Test
    public void test3() {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("def");
        set.add("ghi");
        Iterator it = set.iterator();
        it.forEachRemaining(item -> System.out.println("迭代的元素：" + item));
    }

    @Test
    public void test4() {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("def");
        set.add("ghi");
        for (Object o : set) {
            System.out.println(o);
            if ("def".equals(o)) {
                set.remove(o); // java.util.ConcurrentModificationException
            }
        }
        System.out.println(set);
    }

    @Test
    public void test5() {
        HashSet set = new HashSet();
        set.add("轻量级Java EE企业应用实战");
        set.add("疯狂Java讲义");
        set.add("疯狂ios讲义");
        set.add("疯狂ajax讲义");
        set.add("疯狂android讲义");
        set.add("疯狂web讲义");
        set.removeIf(item -> ((String) item).length() < 10);
        System.out.println(set);
    }

    @Test
    public void test6() {
        HashSet set = new HashSet();
        set.add("轻量级Java EE企业应用实战");
        set.add("疯狂Java讲义");
        set.add("疯狂ios讲义");
        set.add("疯狂ajax讲义");
        set.add("疯狂android讲义");
        set.add("疯狂web讲义");
        System.out.println("\"疯狂\"出现的次数：" + callAll(set, item -> ((String) item).contains("疯狂")));
        System.out.println("\"Java\"出现的次数：" + callAll(set, item -> ((String) item).contains("Java")));
        System.out.println("长度超过10的次数：" + callAll(set, item -> ((String) item).length() > 10));

    }
    public int callAll(HashSet set, Predicate p) {
        int total = 0;
        for (Object o : set) {
            if (p.test(o)) {
                total ++;
            }
        }
        return total;
    }

    @Test
    public void test7() {
        IntStream is = IntStream.builder()
                .add(20)
                .add(10)
                .add(-2)
                .add(18).build();
        // 下面调用聚集方法的代码每次只能执行一次
//        System.out.println("is所有元素的最大值：" + is.max().getAsInt());
//        System.out.println("is所有元素的最小值：" + is.min().getAsInt());
//        System.out.println("is所有元素的和：" + is.sum());
//        System.out.println("is所有元素的平均值：" + is.average());
//        System.out.println("is所有元素的平方是否都大于20：" + is.allMatch(ele -> Math.sqrt(ele) > 20));
//        System.out.println("is是否包含任何元素的平方大于20：" + is.anyMatch(ele -> Math.sqrt(ele) > 20));
        // 将is生成新的Stream
        IntStream newIs = is.map(item -> item * 2 + 1);
        newIs.forEach(System.out::println);
    }

    @Test
    public void CollectionStream() {
        HashSet set = new HashSet();
        set.add("轻量级Java EE企业应用实战");
        set.add("疯狂Java讲义");
        set.add("疯狂ios讲义");
        set.add("疯狂ajax讲义");
        set.add("疯狂android讲义");
        set.add("疯狂web讲义");
        System.out.println("\"疯狂\"出现的次数：" + set.stream().filter(item ->
                ((String) item ).contains("疯狂")
        ).count());
        System.out.println("\"Java\"出现的次数：" + set.stream().filter(item ->
                ((String) item).contains("Java")
        ).count());
        System.out.println("长度超过10的次数：" + set.stream().filter(item ->
                ((String) item).length() > 10
        ).count());
    }
}

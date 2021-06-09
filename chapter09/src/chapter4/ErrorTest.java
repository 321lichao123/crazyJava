package chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ErrorTest {
    // 错误写法：
//    static <T> void test(Collection<T> from, Collection<T> to) {
//        for (T t : from) {
//            to.add(t);
//        }
//    }
    // 正确的写法：
    static <T> void test(Collection<? extends T> from, Collection<T> to) {
        for (T t : from) {
            to.add(t);
        }
    }

    public static void main(String[] args) {
        List<String> from = new ArrayList<>();
        List<Object> to = new ArrayList<>();
        test(from, to); // 这是由于from和to的类型不同
    }
}

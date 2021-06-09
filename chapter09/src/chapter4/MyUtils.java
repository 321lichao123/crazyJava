package chapter4;

import java.util.ArrayList;
import java.util.Collection;

public class MyUtils {
    public static <T> T copy(Collection<? super T> dist, Collection<T> src) {
        T last = null;
        for (T ele : src) {
            last = ele;
            dist.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        ArrayList<Number> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        copy(list1, list2);
        System.out.println(list1);
    }
}

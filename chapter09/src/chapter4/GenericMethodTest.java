package chapter4;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T t : a) {
            c.add(t);
        }
    }

    public static void main(String[] args) {
        Object[] os1 = new Object[100];
        ArrayList<Object> ao1 = new ArrayList<>();
        // 下面的代码中T代表object类型
        fromArrayToCollection(os1, ao1);

        String[] os2 = new String[100];
        Collection<String> ao2 = new ArrayList<>();
        // 下面的代码中T代表String类型
        fromArrayToCollection(os2, ao2);
        // 下面的代码中T代表object类型
        fromArrayToCollection(os2,ao1);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Double[] da = new Double[100];
        Number[] na = new Number[100];
        Collection<Number> nc = new ArrayList<>();
        // 下面的代码中T代表Number类型
        fromArrayToCollection(ia, nc);
        // 下面的代码中T代表Number类型
        fromArrayToCollection(fa, nc);
        // 下面的代码中T代表Number类型
        fromArrayToCollection(da, nc);
        // 下面的代码中T代表Number类型
        fromArrayToCollection(na, nc);
        // 下面的代码中T代表Object类型
        fromArrayToCollection(na, ao1);
        // 下面T代表的是String但是na是Number
//        fromArrayToCollection(na, ao2);

    }
}

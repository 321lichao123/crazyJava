package chapter6;

import java.util.HashMap;
import java.util.Iterator;

class A {
    int age;

    public A(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && obj.getClass() == A.class) {
            return this.age == ((A) obj).age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.age;
    }
}


public class HashMapError {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(new A(1234), "疯狂Java讲义");
        map.put(new A(5678), "疯狂Ajax讲义");
        System.out.println(map);
        Iterator iterator = map.keySet().iterator();
        A firstA = (A) iterator.next();
        firstA.age = 5678;
        System.out.println(map);
        map.remove(new A(5678));
        System.out.println(map);
        System.out.println(map.get(new A(5678)));
        System.out.println(map.get(new A(1234)));
    }
}

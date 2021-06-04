package chapter5;

import java.util.HashMap;
import java.util.Hashtable;

class A {
    int count;

    public A(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && obj.getClass() == A.class) {
            A a = (A) obj;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }

    
}

class B {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class HashTableTest {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(new A(6000), "疯狂Java讲义");
        hashtable.put(new A(1234), "轻量级Java EE企业应用实战");
        hashtable.put(new A(2345), new B());
        System.out.println(hashtable);
        System.out.println(hashtable.containsValue("abc"));
        System.out.println(hashtable.containsKey(new A(1256)));
    }
}

package chapter3;

import java.util.HashSet;
import java.util.Iterator;

class R {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[ count: " + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new R(5));
        set.add(new R(-3));
        set.add(new R(9));
        set.add(new R(-2));
        System.out.println(set);
        Iterator it = set.iterator();
        R firstR = (R) it.next();
        firstR.count =-3;
        System.out.println(set);
        set.remove(new R(-3));
        System.out.println(set);
        System.out.println("set是否包含为-3的R对象：" + set.contains(new R(-3)));
        System.out.println("set是否包含为-2的R对象：" + set.contains(new R(-2)));
    }
}

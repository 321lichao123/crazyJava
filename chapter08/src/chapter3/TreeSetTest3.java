package chapter3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.TreeSet;

class H implements Comparable {
    int count;

    public H(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "H[ count = " + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && obj.getClass() == H.class) {
            H r = (H) obj;
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        H r = (H) o;
        return count > ((H) o).count ?
                1 : count < ((H) o).count ? -1 : 0;
    }
}

public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new H(5));
        set.add(new H(-3));
        set.add(new H(9));
        set.add(new H(-2));
        System.out.println(set);

        H firstH = (H) set.first();
        firstH.count = 20;
        H lastH = (H) set.last();
        lastH.count = -2;
        System.out.println(set);
        set.remove(new H(-2));
        System.out.println(set);
        set.remove(new H(5));
        System.out.println(set);
    }
}

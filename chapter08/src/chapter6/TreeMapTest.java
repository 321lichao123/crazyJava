package chapter6;

import sun.font.TrueTypeFont;

import java.util.TreeMap;

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count: " + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && obj.getClass() == R.class) {
            return this.count == ((R) obj).count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return this.count > ((R) o).count ? 1 :
               this.count < ((R) o).count ? -1 : 0;
    }
}

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(new R(3), "abc");
        map.put(new R(-5), "bce");
        map.put(new R(9), "def");
        System.out.println(map);    // {R[count: -5]=bce, R[count: 3]=abc, R[count: 9]=def}
        System.out.println(map.firstEntry()); // R[count: -5]=bce
        System.out.println(map.lastKey());  // R[count: 9]
        System.out.println(map.higherKey(new R(2)));    // R[count: 3]
        System.out.println(map.subMap(new R(-1), new R(4))); // {R[count: 3]=abc}
    }
}

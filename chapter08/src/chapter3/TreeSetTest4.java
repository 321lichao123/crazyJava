package chapter3;

import java.util.TreeSet;

class M {
    int age;

    public M(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "M[ age = " + age + "]";
    }
}

public class TreeSetTest4 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet((o1, o2) -> {
            M m1 = (M) o1;
            M m2 = (M) o2;
            return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
        });
        set.add(new M(5));
        set.add(new M(-2));
        set.add(new M(1));
        System.out.println(set);

    }
}

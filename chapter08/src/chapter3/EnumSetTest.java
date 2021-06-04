package chapter3;

import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Season> enumSet = EnumSet.allOf(Season.class);
        System.out.println(enumSet);
        EnumSet<Season> enumSet1 = EnumSet.noneOf(Season.class);
        System.out.println(enumSet1);
        enumSet1.add(Season.SPRING);
        enumSet1.add(Season.SUMMER);
        System.out.println(enumSet1);
        EnumSet<Season> enumSet2 = EnumSet.of(Season.SPRING, Season.FALL);
        System.out.println(enumSet2);
        EnumSet<Season> enumSet3 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(enumSet3);
        EnumSet<Season> enumSet4 = EnumSet.complementOf(enumSet3);
        System.out.println(enumSet4);
    }
}

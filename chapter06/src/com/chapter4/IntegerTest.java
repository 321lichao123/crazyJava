package com.chapter4;

public class IntegerTest {
    public static void main(String[] args) {
        Integer int1 = new Integer(6);  // 创建新的Integer的对象
        Integer int2 = Integer.valueOf(6);
        Integer int3 = Integer.valueOf(6);
        System.out.println(int1 == int2);   // false
        System.out.println(int3 == int2);   // true
        Integer int6 = Integer.valueOf(70);
        Integer int7 = Integer.valueOf(70);
        System.out.println(int6 == int7);   // true
        // 由于Integer只是缓存了-128~127之间的数，因此超出这个范围就不从缓存读取
        Integer int4 = Integer.valueOf(200);
        Integer int5 = Integer.valueOf(200);
        System.out.println(int4 == int5);   // false
    }
}

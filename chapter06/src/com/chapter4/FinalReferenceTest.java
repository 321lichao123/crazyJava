package com.chapter4;

import java.util.Arrays;

class Person {
    private int age;
    public Person(int age) {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class FinalReferenceTest {
    public static void main(String[] args) {
        final int[] intArr = new int[]{87, -12, 45, -3, 67};
        System.out.println(intArr.toString());
        Arrays.sort(intArr);
        System.out.println(intArr.toString());
        intArr[3] = 13;
        System.out.println(intArr.toString());
//        intArr = null; // 非法
    }
}

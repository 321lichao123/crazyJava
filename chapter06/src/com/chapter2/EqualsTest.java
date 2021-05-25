package com.chapter2;

import org.junit.Test;

public class EqualsTest {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等：" + (it == fl)); // true

        char A = 'A';
        System.out.println("65和A是否相等：" + (it == A)); // true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等：" + (str1 == str2));  // false
        System.out.println("str1和str2是否相等：" + (str1.equals(str2)));  // true

//        System.out.println(str1 == new EqualsTest()); // 编译不通过，String跟EqualsTest没有继承关系
    }

}

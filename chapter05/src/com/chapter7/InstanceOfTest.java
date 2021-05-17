package com.chapter7;

public class InstanceOfTest {
    public static void main(String[] args) {
        Object hello = "hello";
        System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object));// true
        System.out.println("字符串是否是String类的实例：" + (hello instanceof String)); // true
        System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));    // false
        // String实现了Comparable接口
        System.out.println("字符串是否是Comparable类的实例：" + (hello instanceof Comparable)); // true
        String a = "hello";
//        System.out.println("字符串是否是Math类的实例：" + (a instanceof Math));    // false

    }
}

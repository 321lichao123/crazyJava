package com.chapter6;

public interface OutputTest {
    // 接口中的成员变量只能是常量
    int MAX_CACHE_SIZE = 10;
    // 接口中定义的普通方法只能是public的抽象方法
    void out();
    void getData(String msg);
    // 接口的默认方法，使用default修饰
    default void print(String ...msg) {
        for (String s : msg) {
            System.out.println(s);
        }
    }

    default void test() {
        System.out.println("默认方法test");
    }

    // 接口中定义类方法
    static String staticTest() {
        return "接口中static方法";
    }
}

package com.chapter4;

public class FinalVariableTest {
    // 定义成员变量指定默认值，合法
    final int a = 6;
    // 下面变量在构造器或者初始代码块中分配值
    final String str;
    final int c;
    final static double d;
    // 既没有指定默认值，有没有在初始化块、构造器中指定初始值
    // final char ch;
    {
        // 在初始化块中为实例变量指定初始值，合法
        str = "hello";
        // 已经指定了初始值不能为a重新赋值, 不合法
        // a = 8;
    }
    // 静态代码块可以对没有指定的类变量初始值
    static {
        //
        d = 5.6;
    }

    // 构造器，可以即没有指定默认值，又没有在代码块中指定默认值
    public FinalVariableTest() {
        // 如果已经在初始化代码块中初始化值就不能在构造器中初始化值了
        // d = 8.0;
        c = 3;
    }

    public void changeFile() {
        // 普通方法不能为final修饰的成员变量赋值
        // d = 1.2;
        // 不能在普通方法中为final成员变量指定初始值
        // ch = 'a';
    }

    public static void main(String[] args) {
        FinalVariableTest test = new FinalVariableTest();
        System.out.println(test.a);
        System.out.println(test.c);
        System.out.println(test.d);

    }
}

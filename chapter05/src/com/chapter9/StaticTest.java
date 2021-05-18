package com.chapter9;

class Root {
    static {
        System.out.println("Root的静态代码块");   // 1
    }
    {
        System.out.println("Root的非静态代码块");  // 4 11
    }

    public Root() {
        System.out.println("Root的无参构造器");   // 5  12
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid的静态代码块");    // 2
    }
    {
        System.out.println("Mid的非静态代码块"); // 6 13
    }

    public Mid() {
        System.out.println("Mid的无参数构造器");   // 7  14
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid的有参数构造器：" + msg); // 8  15
    }
}

class Left extends Mid {
    static {
        System.out.println("Left的静态代码块");   // 3
    }
    {
        System.out.println("Left的非静态代码块");  // 9  16
    }
    public Left() {
        super("疯狂Java");
        System.out.println("Left的无参数构造器");  // 10  17
    }
}

public class StaticTest {
    public static void main(String[] args) {
        new Left();
        System.out.println("*******************");
        new Left();
    }
}

package com.chapter5;


class Basic {
    public String name;
    public double size;

    public Basic(String name, double size) {
        this.name = name;
        this.size = size;
    }
}
public class SubTest extends Basic {
    public String color;

    public SubTest(String name, double size, String color) {
        super(name, size);
        this.color = color;
    }

    public static void main(String[] args) {
        SubTest test = new SubTest("测试对象", 5.6, "#fff");
        System.out.println(test.name + " " + test.size + " " + test.color);
    }
}

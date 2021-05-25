package com.chapter6;

public class Computer {
    private OutputFactory out;

    public Computer(OutputFactory out) {
        this.out = out;
    }
    // 定义一个获取字符串的方法
    public void keyIn(String msg) {
//        out.getData(msg);
    }
    // 打印方法
    public void print() {
        out.out();
    }
}

package com.chapter7;

import com.chapter6.PrintCommand;

import javax.sound.sampled.Line;

public class Cow {
    private double weight;

    public Cow(double weight) {
        this.weight = weight;
    }

    public Cow() {
    }

    private class CowLen {
        private double length;
        private String color;

        public CowLen(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public CowLen() {
        }

        public void info() {
            System.out.println("当前牛腿的颜色：" + color + ", 高：" + length);
            System.out.println("牛的体重是：" + weight);
        }

    }

    public void test() {
        CowLen cowLen = new CowLen(34.6, "黑色");
        cowLen.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(56.54);
        cow.test();
    }
}

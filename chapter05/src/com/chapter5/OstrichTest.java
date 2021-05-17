package com.chapter5;

public class OstrichTest extends BirdTest{
    @Override
    public void fly() {
        System.out.println("鸵鸟在奔跑");
    }

    public static void main(String[] args) {
        OstrichTest test = new OstrichTest();
        test.fly();
    }
}

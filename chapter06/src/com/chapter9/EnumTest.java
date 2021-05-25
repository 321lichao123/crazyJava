package com.chapter9;

public class EnumTest {
    public void judge(SeasonEnum s) {
        switch (s) {
            case SPRING:
                System.out.println("春暖花开");
                break;
            case SUMMER:
                System.out.println("夏日炎炎");
                break;
            case FALL:
                System.out.println("秋高气爽");
                break;
            case WINTER:
                System.out.println("冬日飘雪");
                break;
        }
    }

    public static void main(String[] args) {
        for (SeasonEnum value : SeasonEnum.values()) {
            System.out.println(value);
        }
        new EnumTest().judge(SeasonEnum.SPRING);
    }
}

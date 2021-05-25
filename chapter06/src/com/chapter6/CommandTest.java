package com.chapter6;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray array = new ProcessArray();
        int[] target = new int[]{12, 34, 23, -45, 10};
        array.process(target, new PrintCommand());
        array.process(target, new AddCommand());
    }
}

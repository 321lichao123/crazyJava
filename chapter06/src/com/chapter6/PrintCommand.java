package com.chapter6;

public class PrintCommand implements Command {
    @Override
    public void process(int[] target) {
        for (int i : target) {
            System.out.println("遍历数组的每一项：" + i);
        }
    }
}

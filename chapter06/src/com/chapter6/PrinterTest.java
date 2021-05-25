package com.chapter6;

interface Product {
    int getProductTime();
}

public class PrinterTest implements OutputTest, Product {
    public String[] printData = new String[MAX_CACHE_SIZE];
    public int dataNum = 0;

    @Override
    public void out() {
        while (dataNum > 0) {
            System.out.println("打印机打印：" + printData[0]);
            // 把作业队列整体前移一位，并将剩下的作业数减一
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum > MAX_CACHE_SIZE) {
            System.out.println("输出队列已满，添加失败");
        } else {
            printData[dataNum++] = msg;
        }
    }

    @Override
    public void print(String... msg) {

    }

    @Override
    public void test() {

    }

    @Override
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        OutputTest o = new PrinterTest();
        o.getData("轻量JavaEE企业应用实战");
        o.getData("疯狂Java");
        o.out();
        o.print("孙悟空", "猪八戒", "白骨精");
        o.test();
    }
}

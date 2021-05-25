package com.chapter7;

abstract class Device {
    private String name;
    public abstract double getPrice();

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {
    public void test(Device d) {
        System.out.println("买了一个：" + d.getName() + ", 花了：" + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner at = new AnonymousInner();
        at.test(new Device("方向盘") {
            @Override
            public double getPrice() {
                return 45.67;
            }
        });

        Device device = new Device() {
            {
                System.out.println("匿名内部类的初始化");
            }

            @Override
            public double getPrice() {
                return 78.98;
            }

            @Override
            public String getName() {
                return "车轮";
            }
        };

        at.test(device);
    }
}

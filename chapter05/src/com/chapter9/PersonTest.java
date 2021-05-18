package com.chapter9;

public class PersonTest {
    {
        int a = 6;
        if (a > 4) {
            System.out.println("Person的局部代码块：局部变量大于4");
        }
        System.out.println("person的第一个初始化代码块");
    }
    {
        System.out.println("person的第二个初始化代码块");
    }

    public PersonTest() {
        System.out.println("无参数构造器");
    }

    public static void main(String[] args) {
        new PersonTest();
    }
}

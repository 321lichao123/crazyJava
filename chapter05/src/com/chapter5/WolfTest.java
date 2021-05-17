package com.chapter5;

class Creature {
    public Creature() {
        System.out.println("Creature的无参数构造器");
    }
}

class Animal extends Creature {
    public String name;
    public int age;
    public Animal() {
        System.out.println("Animal的无参数构造器");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("Animal带两个参数构造器，其age是" + age);
    }
}

public class WolfTest extends Animal {
    public WolfTest() {
        super("灰太狼", 3);
        System.out.println("Wolf无参数构造器");
    }

    public static void main(String[] args) {
        new WolfTest();
    }
}

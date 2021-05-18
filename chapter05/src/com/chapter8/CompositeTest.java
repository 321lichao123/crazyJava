package com.chapter8;

class Animal {
    public void beat() {
        System.out.println("呼吸");
    }

    public void breath() {
        System.out.println("心跳");
    }
}

class Bird {
    private Animal a;

    public Bird(Animal a) {
        this.a = a;
    }
    public void breath() {
        a.breath();
    }
    public void fly() {
        System.out.println("鸟在飞翔");
    }
}

class Wolf {
    private Animal a;

    public Wolf(Animal a) {
        this.a = a;
    }
    public void breath() {
        a.breath();
    }
    public void run() {
        System.out.println("狼在奔跑");
    }
}

public class CompositeTest {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Bird bird = new Bird(animal);
        bird.fly();
        bird.breath();

        Wolf wolf = new Wolf(animal);
        wolf.run();
        wolf.breath();

    }
}

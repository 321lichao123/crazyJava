package com.chapter2;

class Apple {
    public String color;
    public double weight;

    public Apple() {
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple[color = " + color + ", weight = " + weight + "];";
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Apple apple = new Apple("red", 34.4);
        System.out.println(apple);
    }
}

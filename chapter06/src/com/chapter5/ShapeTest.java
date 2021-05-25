package com.chapter5;

public abstract class ShapeTest {
    {
        System.out.println("shapeTest的代码块");
    }
    public String color;

    public abstract double calPerimeter();

    public abstract String getType();

    public ShapeTest() {
    }

    public ShapeTest(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

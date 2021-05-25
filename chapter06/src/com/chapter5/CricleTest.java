package com.chapter5;

public class CricleTest extends ShapeTest {
    public double radius;

    public CricleTest() {
    }

    public CricleTest(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calPerimeter() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getType() {
        return getColor() + "圆形";
    }

    public static void main(String[] args) {
        ShapeTest triangle = new TriangleTest("黄色", 3, 4, 5);
        ShapeTest cricle = new CricleTest("黑色", 5);

        System.out.println(triangle.getType());
        System.out.println(triangle.calPerimeter());

        System.out.println(cricle.getType());
        System.out.println(cricle.calPerimeter());
    }
}

package com.chapter5;

public class TriangleTest extends ShapeTest {

    private double a;
    private double b;
    private double c;

    public TriangleTest(String color, double a, double b, double c) {
        super(color);
        this.setSides(a, b, c);
    }

    public void setSides(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("三角形两边之和需要大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b +c;
    }

    @Override
    public String getType() {
        return "三角形";
    }
}

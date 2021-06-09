package chapter3;

public class Rectangle extends Shape{
    @Override
    public void draw(Canvas c) {
        System.out.println("在画布" + c + "画一个矩形");
    }
}

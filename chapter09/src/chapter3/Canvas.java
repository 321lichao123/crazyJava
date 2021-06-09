package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    // 错误写法: 因为list<Circle>并不是Shape的子类
//    public void drawAll(List<Shape> shapes) {
//        for (Shape shape : shapes) {
//            shape.draw(this);
//        }
//    }

    // 正确写法一：缺点需要进行一次强制转换
//    public void drawAll(List<?> shapes) {
//        for (Object o : shapes) {
//            Shape s = (Shape) o;
//            s.draw(this);
//        }
//    }
    // 正确写法二：泛型通配符
    public void drawAll(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(this);
        }
    }
    public static void main(String[] args) {
        ArrayList<Circle> list = new ArrayList<>();
        Canvas canvas = new Canvas();
        canvas.drawAll(list);
    }
}

package chapter5;

class Apple<T extends Number> {
    T size;

    public Apple() {
    }

    public Apple(T size) {
        this.size = size;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }
}

public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> apple1 = new Apple<>(6);
        Integer in = apple1.getSize();
        Apple apple2 = apple1;
        Number in2 = apple2.getSize();
        System.out.println(in2);
//        Integer in3 = apple2.getSize(); // 不兼容的类型: java.lang.Number无法转换为java.lang.Integer
    }
}

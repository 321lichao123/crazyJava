package chapter2;

public class Apple<T> {
    private T info;

    public Apple() {
    }

    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Apple<String> apple = new Apple<>("abc");
        System.out.println(apple.info);
        Apple<Double> apple1 = new Apple<>(2.34);
        System.out.println(apple1.info);
    }
}

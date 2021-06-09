package chapter3;

public class Apple<T extends Number>{
    public static void main(String[] args) {
        Apple<Integer> integerApple = new Apple<>();
        Apple<Double> doubleApple = new Apple<>();
        // 下面是错误的
//        Apple<String> stringApple = new Apple<>();
    }
}

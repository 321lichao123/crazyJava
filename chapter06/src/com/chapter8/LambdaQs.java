package com.chapter8;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    public void fly(Flyable flyable) {
        System.out.println("我正在驾驶：" + flyable);
        flyable.fly("晴空万里");
    }

    public void add(Addable addable) {
        System.out.println("5和3的和：" + addable.add(3, 5));
    }
    public static void main(String[] args) {
        LambdaQs qs = new LambdaQs();
        qs.add((a, b) -> a +b);
        qs.fly(weather -> {
            System.out.println("今天天气是：" + weather);
            System.out.println("直升机飞的很平稳");
        });
        qs.eat(() -> {
            System.out.println("苹果味道不错");
        });
    }
}

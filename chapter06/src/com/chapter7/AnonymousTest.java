package com.chapter7;

interface Product {
    public double getPrice();
    public String getName();
}

public class AnonymousTest {
    public void test(Product product) {
        System.out.println("购买一个" + product.getName() + ", 花了" + product.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
        anonymousTest.test(new Product() {
            @Override
            public double getPrice() {
                return 19999.0;
            }

            @Override
            public String getName() {
                return "七彩虹3090";
            }
        });
    }
}

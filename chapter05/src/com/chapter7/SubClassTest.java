package com.chapter7;


class BaseClass {
    public int books = 6;
    public void base() {
        System.out.println("父类的普通方法");
    }
    public void test() {
        System.out.println("父类的被覆盖的方法");
    }
}

public class SubClassTest extends BaseClass {
    public String books = "轻量级Java EE企业应用";
    public void test() {
        System.out.println("子类覆盖父类的方法");
    }
    public void sub() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.books);  // 6
        baseClass.base();   // 父类的普通方法
        baseClass.test();   // 父类的被覆盖的方法

        System.out.println("****************************");

        SubClassTest subClassTest = new SubClassTest();
        System.out.println(subClassTest.books); // 轻量级Java EE企业应用
        subClassTest.test();    // 子类覆盖父类的方法
        subClassTest.sub();     // 子类的普通方法

        System.out.println("****************************");

        BaseClass basicSub = new SubClassTest();
        System.out.println(basicSub.books);  // 6
        basicSub.base();    // 父类的普通方法
        basicSub.test();    // 子类覆盖父类的方法
//        basicSub.sub();无法编译过
    }
}

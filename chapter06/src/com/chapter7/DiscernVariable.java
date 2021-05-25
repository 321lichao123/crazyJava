package com.chapter7;

public class DiscernVariable {
    private String prop = "外部类的实例变量";
    private class InClass {
        private int inPop = 5;
        private String prop = "内部类的实例变量";
        public void info() {
            String prop = "内部类的方法的局部变量";
            System.out.println("访问外部类实例变量：" + DiscernVariable.this.prop);
            System.out.println("访问内部类实例变量：" + this.prop);
            System.out.println("方法局部变量：" + prop);
        }
    }

    public void accessInnerProps() {
        System.out.println("外部类访问内部私有变量：" + new InClass().inPop);
    }

    public void test() {
        InClass inClass = new InClass();
        inClass.info();
    }

    public static void main(String[] args) {
        DiscernVariable variable = new DiscernVariable();
        variable.test();
        variable.accessInnerProps();
    }
}

package com.chapter7;

public class ConversionTest {
    public static void main(String[] args) {
        double d =12.4;
        long l = (long) d;
        System.out.println(l); // 12

        int i = 5;
        // boolean b = (boolean) i; // 不兼容的类型: int无法转换为boolean
        // System.out.println(b);

        Object obj = "hello";
        String str = (String) obj;
        System.out.println(str);

        Object integer = new Integer(5);
        String str1 = (String) integer; // java.lang.ClassCastException:因为编译是object类型但是运行是Integer类型，所以报错
    }

}

package com.chapter2;

public class StringCompareTest {
    public static void main(String[] args) {
        String str1 = "疯狂Java";
        String str2 = "疯狂";
        String str3 = "Java";
        String str4 = "疯狂" + "Java";
        System.out.println(str1 == str4);   // true
        String str5 = str2 + str3;
        System.out.println(str1 == str5);   // false
        String str6 = new String("疯狂Java");
        System.out.println(str1 == str6);   // false

    }
}

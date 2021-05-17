package com.chapter5;

class Parent {
    public String tag = "疯狂的Java讲义";
}

class SubChild extends Parent {
    private String tag = "轻量级Java EE企业应用实战";
}

public class HIdeTest {
    public static void main(String[] args) {
        SubChild s = new SubChild();
//        System.out.println(s.tag);// 权限不允许访问
        System.out.println(((Parent)s).tag);
    }
}

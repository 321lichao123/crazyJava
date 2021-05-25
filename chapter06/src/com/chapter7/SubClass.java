package com.chapter7;

public class SubClass extends Out.In {
    public SubClass(Out out) {
        out.super("hello");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(new Out());
    }
}

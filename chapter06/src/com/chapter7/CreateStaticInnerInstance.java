package com.chapter7;

class StaticOut {
    static class StaticIn {
        public StaticIn() {
            System.out.println("静态的内部类");
        }
    }
}

public class CreateStaticInnerInstance {
    public static void main(String[] args) {
        StaticOut.StaticIn in = new StaticOut.StaticIn();
    }
}
